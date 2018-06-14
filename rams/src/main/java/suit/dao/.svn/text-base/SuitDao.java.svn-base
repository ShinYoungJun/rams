package main.java.suit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import main.java.common.dao.RamsJdbcDaoSupport;
import main.java.common.util.StringUtil;
import main.java.suit.model.SuitBean;
import main.java.suit.model.SuitFileBean;
import main.java.suit.model.SuitRegBean;
import main.java.suit.model.SuitViewBean;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

public class SuitDao extends RamsJdbcDaoSupport implements ISuitDao {
	protected void initDao() throws Exception {
		super.initDao();
	}
	
	
	//소송정보 수정 LawSuitProxy
	public void setLawSuitProxyModify(SuitBean bean){
		//원고
		if(getLawSuitProxyCount(bean.getAFFAIRNUM(),"1") > 0){
			//존재 update
			SetLawSuitProxyUpdate setLawSuitProxyUpdate = new SetLawSuitProxyUpdate(getDataSource());
			Object[] values = {
				bean.getLP1_NAME(),
				bean.getLP1_JUMINNUM(),
				bean.getLP1_ADDR(),
				bean.getLP1_TEL(),
				bean.getAFFAIRNUM(),
				"1"
			};
			
			setLawSuitProxyUpdate.update(values);
			
		}else{
			//없을때 insert
			SetLawSuitProxyInsert setLawSuitProxyInsert = new SetLawSuitProxyInsert(getDataSource());
			Object[] values = {
				bean.getAFFAIRNUM(),
				bean.getLP1_NAME(),
				bean.getLP1_JUMINNUM(),
				bean.getLP1_ADDR(),
				bean.getLP1_TEL(),
				"1"
			};
			setLawSuitProxyInsert.update(values);
		}
		
		//피고
		if(getLawSuitProxyCount(bean.getAFFAIRNUM(),"2") > 0){
			//존재 update
			SetLawSuitProxyUpdate setLawSuitProxyUpdate = new SetLawSuitProxyUpdate(getDataSource());
			Object[] values = {
				bean.getLP2_NAME(),
				bean.getLP2_JUMINNUM(),
				bean.getLP2_ADDR(),
				bean.getLP2_TEL(),
				bean.getAFFAIRNUM(),
				"2"
			};
			
			setLawSuitProxyUpdate.update(values);
			
		}else{
			//없을때 insert
			SetLawSuitProxyInsert setLawSuitProxyInsert = new SetLawSuitProxyInsert(getDataSource());
			Object[] values = {
				bean.getAFFAIRNUM(),
				bean.getLP2_NAME(),
				bean.getLP2_JUMINNUM(),
				bean.getLP2_ADDR(),
				bean.getLP2_TEL(),
				"2"
			};
			setLawSuitProxyInsert.update(values);
		}
	}
	
	class SetLawSuitProxyUpdate extends SqlUpdate {
		public SetLawSuitProxyUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetLawSuitProxyUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	// LawSuitProxy 존재여부 조사
    public int getLawSuitProxyCount(String affairNum,String gubun){
		Object[] values = {affairNum,gubun};
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.suit.GetLawSuitProxyCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}
	
	
	
	

	//소송정보 수정 Suitor
	public void setSuitorModify(SuitBean bean){
		//원고
		if(getSuitorCount(bean.getAFFAIRNUM(),"1") > 0){
			//존재 update
			SetSuitorUpdate setSuitorUpdate = new SetSuitorUpdate(getDataSource());
			Object[] values = {
				bean.getST1_NAME(),
				bean.getST1_ADMINSTNAME(),
				bean.getST1_JUMINNUM(),
				bean.getST1_ADDR(),
				bean.getST1_TEL(),
				bean.getAFFAIRNUM(),
				"1"
			};
			
			setSuitorUpdate.update(values);
			
		}else{
			//없을때 insert
			SetSuitorInsert setSuitorInsert = new SetSuitorInsert(getDataSource());
			Object[] values = {
				bean.getAFFAIRNUM(),
				bean.getST1_NAME(),
				bean.getST1_ADMINSTNAME(),
				bean.getST1_JUMINNUM(),
				bean.getST1_ADDR(),
				bean.getST1_TEL(),
				"1"
			};
			setSuitorInsert.update(values);
		}
		
		//피고
		if(getSuitorCount(bean.getAFFAIRNUM(),"2") > 0){
			//존재 update
			SetSuitorUpdate setSuitorUpdate = new SetSuitorUpdate(getDataSource());
			Object[] values = {
				bean.getST2_NAME(),
				bean.getST2_ADMINSTNAME(),
				bean.getST2_JUMINNUM(),
				bean.getST2_ADDR(),
				bean.getST2_TEL(),
				bean.getAFFAIRNUM(),
				"2"
			};
			
			setSuitorUpdate.update(values);
			
		}else{
			//없을때 insert
			SetSuitorInsert setSuitorInsert = new SetSuitorInsert(getDataSource());
			Object[] values = {
				bean.getAFFAIRNUM(),
				bean.getST2_NAME(),
				bean.getST2_ADMINSTNAME(),
				bean.getST2_JUMINNUM(),
				bean.getST2_ADDR(),
				bean.getST2_TEL(),
				"2"
			};
			setSuitorInsert.update(values);
		}
	}
	
	class SetSuitorUpdate extends SqlUpdate {
		public SetSuitorUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetSuitorUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	
	
	//원고피고 존재여부 조사
    public int getSuitorCount(String affairNum,String gubun){
		Object[] values = {affairNum,gubun};
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.suit.GetSuitorCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}
	
	
	//소송정보 수정 lawsuit
	public void setLawSuitModify(SuitBean bean){
		SetLawSuitModify setLawSuitModify = new SetLawSuitModify(getDataSource());
		Object[] values = {
			bean.getCALSS(),
			bean.getAFFAIRNAME(),
			bean.getJUDGMENT(),
			bean.getCOURT(),
			bean.getCLOSEDAY(),
			bean.getCONSTNUM(),
			bean.getACCEPTDATE(),
			bean.getAFFAIRNUM()
		};
		
		setLawSuitModify.update(values);
			
	}
	class SetLawSuitModify extends SqlUpdate {
		public SetLawSuitModify(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetLawSuitModify"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	//소송정보 수정 landsuit
	public void setLandSuitModify(SuitBean bean){
		SetLandSuitModify setLandSuitModify = new SetLandSuitModify(getDataSource());
		Object[] values = {
			bean.getCATEG(),
			bean.getTOTALAREA(),
			bean.getLAWSUITAREA(),
			bean.getAFFAIRNUM(),
			bean.getPNU()

		};
		
		setLandSuitModify.update(values);
			
	}
	class SetLandSuitModify extends SqlUpdate {
		public SetLandSuitModify(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetLandSuitModify"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}		
			

	
	//소송 수정화면 조회
	public List GetLawSuitModify(String affairNum,String pnu){
		GetLawSuitModify getLawSuitModify = new GetLawSuitModify(getDataSource());
			Object[] values = {affairNum,pnu};
			
			return getLawSuitModify.execute(values);
		} 
		    
	    protected class GetLawSuitModify extends MappingSqlQuery
	    {
	        protected GetLawSuitModify(DataSource ds)
	        {
	          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.GetLawSuitModify"));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
	        }
	        
	        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
	        {
	        	SuitBean bean = new SuitBean();
	        	
		        bean.setOW_NAME(rs.getString("OW_NAME"));
		        bean.setOW_JUMINNUM(rs.getString("OW_JUMINNUM"));
		        bean.setOW_ADDR(rs.getString("OW_ADDR"));
		        bean.setOW_TEL(rs.getString("OW_TEL"));
		        bean.setCALSS(rs.getString("CALSS"));
		        bean.setAFFAIRNUM(rs.getString("AFFAIRNUM"));
		        bean.setAFFAIRNAME(rs.getString("AFFAIRNAME"));
		        bean.setSUITLAND(rs.getString("SUITLAND"));
		        bean.setTOTALAREA(rs.getString("TOTALAREA"));
		        bean.setLAWSUITAREA(rs.getString("LAWSUITAREA"));
		        bean.setCATEG(rs.getString("CATEG"));
		        bean.setPNU(rs.getString("PNU"));
		        bean.setJUDGMENT(rs.getString("JUDGMENT"));
		        bean.setCOURT(rs.getString("COURT"));
		        bean.setCLOSEDAY(rs.getString("CLOSEDAY"));
		        bean.setCONSTNUM(rs.getString("CONSTNUM"));
		        bean.setACCEPTDATE(rs.getString("ACCEPTDATE"));
		        bean.setOUTCOME(rs.getString("OUTCOME"));
		        bean.setST1_NAME(rs.getString("ST1_NAME"));
		        bean.setST1_JUMINNUM(rs.getString("ST1_JUMINNUM"));
		        bean.setST1_TEL(rs.getString("ST1_TEL"));
		        bean.setST1_ADDR(rs.getString("ST1_ADDR"));
		        bean.setST1_ADMINSTNAME(rs.getString("ST1_ADMINSTNAME"));
		        bean.setST2_NAME(rs.getString("ST2_NAME"));
		        bean.setST2_JUMINNUM(rs.getString("ST2_JUMINNUM"));
		        bean.setST2_TEL(rs.getString("ST2_TEL"));
		        bean.setST2_ADDR(rs.getString("ST2_ADDR"));
		        bean.setST2_ADMINSTNAME(rs.getString("ST2_ADMINSTNAME"));
		        bean.setLP1_NAME(rs.getString("LP1_NAME"));
		        bean.setLP1_TEL(rs.getString("LP1_TEL"));
		        bean.setLP1_JUMINNUM(rs.getString("LP1_JUMINNUM"));
		        bean.setLP1_ADDR(rs.getString("LP1_ADDR"));
		        bean.setLP1_ETC(rs.getString("LP1_ETC"));
		        bean.setLP2_NAME(rs.getString("LP2_NAME"));
		        bean.setLP2_TEL(rs.getString("LP2_TEL"));
		        bean.setLP2_JUMINNUM(rs.getString("LP2_JUMINNUM"));
		        bean.setLP2_ADDR(rs.getString("LP2_ADDR"));
		        bean.setLP2_ETC(rs.getString("LP2_ETC"));
	        	
	        	return	bean;
	        }
	    }
	
	public void setLawSuitCopy(SuitRegBean bean){
		SetLawSuitCopy setLawSuitCopy = new SetLawSuitCopy(getDataSource());
		Object[] values = {
			bean.getAFFAIRNUM(),
			bean.getAFFAIRNAME(),
			bean.getCALSS(),
			bean.getJUDGMENT(),
			bean.getCOURT(),
			bean.getACCEPTDATE(),
			bean.getCLOSEDAY(),
			bean.getPRE_AFFAIRNUM(),
			bean.getUSER_ID(),
			bean.getAFFAIRNUM_2(),
			bean.getPRE_AFFAIRNUM()
		};
		
		setLawSuitCopy.update(values);
			
	}
	
	
	
	class SetLawSuitCopy extends SqlUpdate {
		public SetLawSuitCopy(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetLawSuitCopy"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	
	
	public void setLawSuitRelationCopy(SuitRegBean bean){
		SetSuitorCopy setSuitorCopy = new SetSuitorCopy(getDataSource());
		SetLawSuitFileCopy setLawSuitFileCopy = new SetLawSuitFileCopy(getDataSource());
		SetLawSuitProxyCopy setLawSuitProxyCopy = new SetLawSuitProxyCopy(getDataSource());
		SetLandLawSuitCopy setLandLawSuitCopy = new SetLandLawSuitCopy(getDataSource());
		SetLawSuitPriceCopy setLawSuitPriceCopy = new SetLawSuitPriceCopy(getDataSource());
		SetOwnerCopy setOwnerCopy = new SetOwnerCopy(getDataSource());
		SetRelPersonCopy setRelPersonCopy = new SetRelPersonCopy(getDataSource());
		SetLawJudgeCopy setLawJudgeCopy = new SetLawJudgeCopy(getDataSource());
	
		
			Object[] values = {bean.getAFFAIRNUM(),bean.getPRE_AFFAIRNUM()};
			
			setSuitorCopy.update(values);
			setLawSuitFileCopy.update(values);
			setLawSuitProxyCopy.update(values);
			setLandLawSuitCopy.update(values);
			setLawSuitPriceCopy.update(values);
			setOwnerCopy.update(values);
			setRelPersonCopy.update(values);
			setLawJudgeCopy.update(values);
			
	} 
	
	
	class SetSuitorCopy extends SqlUpdate {
		public SetSuitorCopy(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetSuitorCopy"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetLawSuitFileCopy extends SqlUpdate {
		public SetLawSuitFileCopy(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetLawSuitFileCopy"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetLawSuitProxyCopy extends SqlUpdate {
		public SetLawSuitProxyCopy(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetLawSuitProxyCopy"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetLandLawSuitCopy extends SqlUpdate {
		public SetLandLawSuitCopy(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetLandLawSuitCopy"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetLawSuitPriceCopy extends SqlUpdate {
		public SetLawSuitPriceCopy(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetLawSuitPriceCopy"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetOwnerCopy extends SqlUpdate {
		public SetOwnerCopy(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetOwnerCopy"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetRelPersonCopy extends SqlUpdate {
		public SetRelPersonCopy(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetRelPersonCopy"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetLawJudgeCopy extends SqlUpdate {
		public SetLawJudgeCopy(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetLawJudgeCopy"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	
	//소송 첨부자료 얻기
	public List getSuitFileList(String affairNum){
	GetSuitFileList getSuitFileList = new GetSuitFileList(getDataSource());
		Object[] values = {affairNum};
		
		return getSuitFileList.execute(values);
	} 
	    
    protected class GetSuitFileList extends MappingSqlQuery
    {
        protected GetSuitFileList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.getSuitFileList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SuitFileBean bean = new SuitFileBean();
        	
	        bean.setFILEID(rs.getString("FILEID"));
	        bean.setAFFAIRNUM(rs.getString("AFFAIRNUM"));
	        bean.setPRESENTDAY(rs.getString("PRESENTDAY"));
	        bean.setCONTENT(rs.getString("CONTENT"));
	        bean.setFILENAME(rs.getString("FILENAME"));
	        bean.setFILELOC(rs.getString("FILELOC"));
	        bean.setREQNAME(rs.getString("REQNAME"));
	        bean.setREQDAY(rs.getString("REQDAY"));
	        bean.setREGISTDATE(rs.getString("REGISTDATE"));
	        bean.setFILECATEG(rs.getString("FILECATEG"));
        	
        	return	bean;
        }
    }
	
	
	//소송번호 체크
    public int getAffairNumCount(String affairNum){
		Object[] values = {affairNum};
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.suit.GetAffairNumCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}
	
	
	// 소송정보 입력
	public void setLawSuitInsert(SuitRegBean bean) {
		SetLawSuitInsert setLawSuitInsert = new SetLawSuitInsert(getDataSource());
		Object[] values = {
			bean.getAFFAIRNUM(),
			bean.getAFFAIRNAME(),
			bean.getCALSS(),
			bean.getJUDGMENT(),
			bean.getCOURT(),
			bean.getACCEPTDATE(),
			bean.getCLOSEDAY(),
			bean.getUSER_ID(),
			bean.getAFFAIRNUM_2(),
			bean.getGU_CD()
		};
		setLawSuitInsert.update(values);
	}
	
	class SetLawSuitInsert extends SqlUpdate {
		public SetLawSuitInsert(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetLawSuitInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	// 소송토지정보 입력
	public void setLandLawSuitInsert(SuitRegBean bean) {
		SetLandLawSuitInsert setLandLawSuitInsert = new SetLandLawSuitInsert(getDataSource());
		Object[] values = {
			bean.getAFFAIRNUM(),
			bean.getPNU(),
			bean.getTOTALAREA(),
			bean.getLAWSUITAREA(),
			bean.getCATEG()
		};
		setLandLawSuitInsert.update(values);
	}
	
	class SetLandLawSuitInsert extends SqlUpdate {
		public SetLandLawSuitInsert(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetLandLawSuitInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	// 원고인 피고인 입력
	public void setSuitorInsert(SuitRegBean bean) {
		SetSuitorInsert setSuitorInsert = new SetSuitorInsert(getDataSource());
		Object[] values = {
			bean.getAFFAIRNUM(),
			bean.getST1_NAME(),
			bean.getST1_ADMINSTNAME(),
			bean.getST1_JUMINNUM_1()+bean.getST1_JUMINNUM_2(),
			bean.getST1_ADDR(),
			bean.getST1_TEL(),
			"1"
		};
		setSuitorInsert.update(values);
		
		Object[] values2 = {
				bean.getAFFAIRNUM(),
				bean.getST2_NAME(),
				bean.getST2_ADMINSTNAME(),
				bean.getST2_JUMINNUM_1()+bean.getST2_JUMINNUM_2(),
				bean.getST2_ADDR(),
				bean.getST2_TEL(),
				"2"
			};
		setSuitorInsert.update(values2);
			
	}
	
	class SetSuitorInsert extends SqlUpdate {
		public SetSuitorInsert(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetSuitorInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	// 소송 대리 원고 피고 입력
	public void setLawSuitProxyInsert(SuitRegBean bean) {
		SetLawSuitProxyInsert setLawSuitProxyInsert = new SetLawSuitProxyInsert(getDataSource());
		if(!bean.getST1_NAME().equals("")){
			Object[] values = {
				bean.getAFFAIRNUM(),
				bean.getLP1_NAME(),
				bean.getLP1_JUMINNUM_1()+bean.getLP1_JUMINNUM_2(),
				bean.getLP1_ADDR(),
				bean.getLP1_TEL(),
				"1"
			};
			setLawSuitProxyInsert.update(values);
		}
		
		if(!bean.getST2_NAME().equals("")){
			Object[] values2 = {
				bean.getAFFAIRNUM(),
				bean.getLP2_NAME(),
				bean.getLP2_JUMINNUM_1()+bean.getLP2_JUMINNUM_2(),
				bean.getLP2_ADDR(),
				bean.getLP2_TEL(),
				"2"
			};
			setLawSuitProxyInsert.update(values2);
		}
			
	}
	
	class SetLawSuitProxyInsert extends SqlUpdate {
		public SetLawSuitProxyInsert(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetLawSuitProxyInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	
	// 토지 소유자 등록
	public void setOwnerInsert(SuitRegBean bean) {
		SetOwnerInsert setOwnerInsert = new SetOwnerInsert(getDataSource());
		Object[] values = {
			bean.getAFFAIRNUM(),
			bean.getPNU(),
			bean.getOW_NAME(),
			bean.getOW_JUMINNUM_1()+bean.getOW_JUMINNUM_2(),
			bean.getOW_ADDR(),
			bean.getOW_TEL()
		};
		setOwnerInsert.update(values);
	}
	
	class SetOwnerInsert extends SqlUpdate {
		public SetOwnerInsert(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetOwnerInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	
	public List getSuitRegList(SuitRegBean searchBean,String currentPage,String countPerPage){
		
	GetSuitRegList getSuitRegList = new GetSuitRegList(getDataSource());
	
		Object[] values = {
				searchBean.getGU_CD(),
				searchBean.getDONG_CD(),
				searchBean.getBUNJI(),
				currentPage,
				countPerPage,
				countPerPage
		};
		
		
		return getSuitRegList.execute(values);
	} 
    
    protected class GetSuitRegList extends MappingSqlQuery
    {
        protected GetSuitRegList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.getSuitRegList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SuitRegBean bean = new SuitRegBean();
        	bean.setPNU(rs.getString("PNU"));
	        bean.setAFFAIRNUM(rs.getString("AFFAIRNUM"));
	        bean.setAFFAIRNAME(rs.getString("AFFAIRNAME"));
	        bean.setLAND_ADDR(rs.getString("LAND_ADDR"));
	        bean.setANNOUNCEDATE(StringUtil.addDash(rs.getString("ANNOUNCEDATE")));
	        bean.setOUTCOME(rs.getString("OUTCOME"));
	        bean.setPRE_AFFAIRNUM(rs.getString("PRE_AFFAIRNUM"));
	        bean.setPRE_COURT(rs.getString("PRE_COURT"));
	        bean.setPRE_OUTCOME(rs.getString("PRE_OUTCOME"));
        	
        	return	bean;
        }
    }
    
    public int getSuitRegListCount(SuitRegBean searchBean){
		Object[] values = {
				searchBean.getGU_CD(),
				searchBean.getDONG_CD(),
				searchBean.getBUNJI()
		};
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.suit.getSuitRegListCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}
	
	public List getSuitList(SuitBean searchBean,String currentPage,String countPerPage) {
		 GetSuitList getSuitList = new GetSuitList(getDataSource());
	    		    		
			Object[] values = {
					searchBean.getNAME(),
					searchBean.getAFFAIRNUM(),
					searchBean.getUSERNAME(),
					searchBean.getLAND_GU(),
					searchBean.getLAND_DONG(),
					searchBean.getLAND_BONBUN(),
					searchBean.getLAND_BUBUN(),
					searchBean.getFROMDATE(),
					searchBean.getTODATE(),
					currentPage,
					countPerPage,
					countPerPage
			};
			
			for(int i = 0 ; i < values.length ; i ++){
				System.out.println("getSuitList::"+values[i]);
			}
			
			
			return getSuitList.execute(values);
		} 
	    
	    protected class GetSuitList extends MappingSqlQuery
	    {
	        protected GetSuitList(DataSource ds)
	        {
	          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.getSuitList"));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
	        }
	        
	        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
	        {
	        	SuitBean bean = new SuitBean();
	        	
	        	bean.setAFFAIRNUM(rs.getString("AFFAIRNUM"));
	        	bean.setAFFAIRNAME(rs.getString("AFFAIRNAME"));
	        	bean.setUNITCOST(rs.getString("UNITCOST"));
	        	bean.setLAWSUITPRICE(rs.getString("LAWSUITPRICE"));
	        	bean.setCALSS(rs.getString("CALSS"));
	        	bean.setJUDGMENT(rs.getString("JUDGMENT"));
	        	bean.setCOURT(rs.getString("COURT"));
	        	bean.setACCEPTDATE(rs.getString("ACCEPTDATE"));
	        	bean.setCLOSEDAY(rs.getString("CLOSEDAY"));
	        	bean.setANNOUNCEDATE(rs.getString("ANNOUNCEDATE"));
	        	bean.setOUTCOME(rs.getString("OUTCOME"));
	        	bean.setRESULT(rs.getString("RESULT"));
	        	bean.setCONSTNUM(rs.getString("CONSTNUM"));
	        	bean.setPRELAWSUITNUM(rs.getString("PRELAWSUITNUM"));
	        	bean.setREGISTDATE(rs.getString("REGISTDATE"));
	        	bean.setUSERID(rs.getString("USERID"));
	        	bean.setLAWGUBUN(rs.getString("LAWGUBUN"));
	        	bean.setSUITORPRICE(rs.getString("SUITORPRICE"));
	        	bean.setDEFENDENTPRICE(rs.getString("DEFENDENTPRICE"));
	        	bean.setGUCODE(rs.getString("GUCODE"));
	        	bean.setLINENAME(rs.getString("LINENAME"));
	        	bean.setPNU(rs.getString("PNU"));
	        	bean.setTOTALAREA(rs.getString("TOTALAREA"));
	        	bean.setLAWSUITAREA(rs.getString("LAWSUITAREA"));
	        	bean.setCATEG(rs.getString("CATEG"));
	        	bean.setTOTAL_PRICE(rs.getString("TOTAL_PRICE"));
	        	bean.setUSE_PRICE(rs.getString("USE_PRICE"));
	        	bean.setUNFAIRPRICE(rs.getString("UNFAIRPRICE"));
	        	bean.setPROFITPRICE(rs.getString("PROFITPRICE"));
	        	bean.setUSERNAME(rs.getString("USERNAME"));
	        	bean.setNAME(rs.getString("NAME"));
	        	bean.setANNOUNCE_YN(rs.getString("ANNOUNCE_YN"));
	        	bean.setSUITLAND(rs.getString("SUITLAND"));
	        	
	        	return	bean;
	        }
	    }
	    
	    public List getSuitListExcel(SuitBean searchBean) {
			 GetSuitListExcel getSuitListExcel = new GetSuitListExcel(getDataSource());
		    		    		
				Object[] values = {
						searchBean.getNAME(),
						searchBean.getAFFAIRNUM(),
						searchBean.getUSERNAME(),
						searchBean.getLAND_GU(),
						searchBean.getLAND_DONG(),
						searchBean.getLAND_BONBUN(),
						searchBean.getLAND_BUBUN(),
						searchBean.getFROMDATE(),
						searchBean.getTODATE()
				};
				
				
				return getSuitListExcel.execute(values);
			} 
		    
		    protected class GetSuitListExcel extends MappingSqlQuery
		    {
		        protected GetSuitListExcel(DataSource ds)
		        {
		          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.getSuitListExcel"));
					declareParameter(new SqlParameter(Types.VARCHAR));
					declareParameter(new SqlParameter(Types.VARCHAR));
					declareParameter(new SqlParameter(Types.VARCHAR));
					declareParameter(new SqlParameter(Types.VARCHAR));
					declareParameter(new SqlParameter(Types.VARCHAR));
					declareParameter(new SqlParameter(Types.VARCHAR));
					declareParameter(new SqlParameter(Types.VARCHAR));
					declareParameter(new SqlParameter(Types.VARCHAR));
					declareParameter(new SqlParameter(Types.VARCHAR));
		        }
		        
		        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
		        {
		        	SuitBean bean = new SuitBean();
		        	
		        	bean.setAFFAIRNUM(rs.getString("AFFAIRNUM"));
		        	bean.setAFFAIRNAME(rs.getString("AFFAIRNAME"));
		        	bean.setUNITCOST(rs.getString("UNITCOST"));
		        	bean.setLAWSUITPRICE(rs.getString("LAWSUITPRICE"));
		        	bean.setCALSS(rs.getString("CALSS"));
		        	bean.setJUDGMENT(rs.getString("JUDGMENT"));
		        	bean.setCOURT(rs.getString("COURT"));
		        	bean.setACCEPTDATE(rs.getString("ACCEPTDATE"));
		        	bean.setCLOSEDAY(rs.getString("CLOSEDAY"));
		        	bean.setANNOUNCEDATE(rs.getString("ANNOUNCEDATE"));
		        	bean.setOUTCOME(rs.getString("OUTCOME"));
		        	bean.setRESULT(rs.getString("RESULT"));
		        	bean.setCONSTNUM(rs.getString("CONSTNUM"));
		        	bean.setPRELAWSUITNUM(rs.getString("PRELAWSUITNUM"));
		        	bean.setREGISTDATE(rs.getString("REGISTDATE"));
		        	bean.setUSERID(rs.getString("USERID"));
		        	bean.setLAWGUBUN(rs.getString("LAWGUBUN"));
		        	bean.setSUITORPRICE(rs.getString("SUITORPRICE"));
		        	bean.setDEFENDENTPRICE(rs.getString("DEFENDENTPRICE"));
		        	bean.setGUCODE(rs.getString("GUCODE"));
		        	bean.setLINENAME(rs.getString("LINENAME"));
		        	bean.setPNU(rs.getString("PNU"));
		        	bean.setTOTALAREA(rs.getString("TOTALAREA"));
		        	bean.setLAWSUITAREA(rs.getString("LAWSUITAREA"));
		        	bean.setCATEG(rs.getString("CATEG"));
		        	bean.setTOTAL_PRICE(rs.getString("TOTAL_PRICE"));
		        	bean.setUSE_PRICE(rs.getString("USE_PRICE"));
		        	bean.setUNFAIRPRICE(rs.getString("UNFAIRPRICE"));
		        	bean.setPROFITPRICE(rs.getString("PROFITPRICE"));
		        	bean.setUSERNAME(rs.getString("USERNAME"));
		        	bean.setNAME(rs.getString("NAME"));
		        	bean.setANNOUNCE_YN(rs.getString("ANNOUNCE_YN"));
		        	bean.setSUITLAND(rs.getString("SUITLAND"));
		        	
		        	return	bean;
		        }
		    }
	    
	    
	    
	    
		public int getSuitCount(SuitBean searchBean){
			Object[] values = {
					searchBean.getNAME(),
					searchBean.getAFFAIRNUM(),
					searchBean.getUSERNAME(),
					searchBean.getLAND_GU(),
					searchBean.getLAND_DONG(),
					searchBean.getLAND_BONBUN(),
					searchBean.getLAND_BUBUN(),
					searchBean.getFROMDATE(),
					searchBean.getTODATE()
			};
			String sql = getMessageSourceAccessor().getMessage(
					"Querys.suit.getSuitCount");
			int returnNum = getJdbcTemplate().queryForInt(sql, values);
			return returnNum;
		}
		
		
		public List getSuitView(String affairNum, String pnu) {
			GetSuitView getSuitView = new GetSuitView(getDataSource());
		    		    		
				Object[] values = {
						affairNum,
						pnu
				};
				
				return getSuitView.execute(values);
			} 
		    
		    protected class GetSuitView extends MappingSqlQuery
		    {
		        protected GetSuitView(DataSource ds)
		        {
		          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.getSuitView"));
					declareParameter(new SqlParameter(Types.VARCHAR));
					declareParameter(new SqlParameter(Types.VARCHAR));
		        }
		        
		        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
		        {
		        	SuitViewBean bean = new SuitViewBean();
		        	
		        	bean.setCALSS(rs.getString("CALSS"));
		        	bean.setAFFAIRNUM(rs.getString("AFFAIRNUM"));
		        	bean.setPNU(rs.getString("PNU"));
		        	bean.setAFFAIRNAME(rs.getString("AFFAIRNAME"));
		        	bean.setSUITLAND(rs.getString("SUITLAND"));
		        	bean.setCONSTNUM(rs.getString("CONSTNUM"));
		        	bean.setCONSTNAME(rs.getString("CONSTNAME"));
		        	bean.setJUDGMENT(rs.getString("JUDGMENT"));
		        	bean.setCOURT(rs.getString("COURT"));
		        	bean.setCLOSEDAY(rs.getString("CLOSEDAY"));
		        	bean.setACCEPTDATE(rs.getString("ACCEPTDATE"));
		        	bean.setST1_NAME(rs.getString("ST1_NAME"));
		        	bean.setST1_JUMINNUM(StringUtil.addSSNDash(rs.getString("ST1_JUMINNUM")));
		        	bean.setST1_TEL(rs.getString("ST1_TEL"));
		        	bean.setST1_ADDR(rs.getString("ST1_ADDR"));
		        	bean.setST2_NAME(rs.getString("ST2_NAME"));
		        	bean.setST2_JUMINNUM(StringUtil.addSSNDash(rs.getString("ST2_JUMINNUM")));
		        	bean.setST2_TEL(rs.getString("ST2_TEL"));
		        	bean.setST2_ADDR(rs.getString("ST2_ADDR"));
		        	bean.setLP1_NAME(rs.getString("LP1_NAME"));
		        	bean.setLP1_TEL(rs.getString("LP1_TEL"));
		        	bean.setLP2_NAME(rs.getString("LP2_NAME"));
		        	bean.setLP2_TEL(rs.getString("LP2_TEL"));
		        	bean.setON_NAME(rs.getString("ON_NAME"));
		        	bean.setON_JUMINNUM(StringUtil.addSSNDash(rs.getString("ON_JUMINNUM")));
		        	bean.setOUTCOME(rs.getString("OUTCOME"));
		        	bean.setPRE_OUTCOME(rs.getString("PRE_OUTCOME"));
		        	bean.setON_TEL(rs.getString("ON_TEL"));
		        	bean.setON_ADDR(rs.getString("ON_ADDR"));
		        	bean.setPRE_COURT(rs.getString("PRE_COURT"));
		        	bean.setPRE_AFFAIRNUM(rs.getString("PRE_AFFAIRNUM"));
		        	bean.setPRE_RESULT(rs.getString("PRE_RESULT"));
		        	bean.setPRE_ANNOUNCEDATE(rs.getString("PRE_ANNOUNCEDATE"));

		        	
		        	return	bean;
		        }
		    }
}