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
import main.java.suit.model.SuitLandBean;
import main.java.suit.model.SuitRegBean;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

public class SuitPopupDao extends RamsJdbcDaoSupport implements ISuitPopupDao {
	protected void initDao() throws Exception {
		super.initDao();
	}
	
	//지분률 변경
	public void setOwnerFixedModify(String ownRate,String affairNum,String ownerNum) {
		SetOwnerFixedModify setOwnerFixedModify = new SetOwnerFixedModify(getDataSource());
		Object[] values = {ownRate,affairNum,ownerNum};
		setOwnerFixedModify.update(values);
	}
	
	class SetOwnerFixedModify extends SqlUpdate {
		public SetOwnerFixedModify(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetOwnerFixedModify"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	
	//제출자료 추가
	public void setFilePopAdd(SuitFileBean bean) {
		SetFilePopAdd setFilePopAdd = new SetFilePopAdd(getDataSource());
		Object[] values = {
			bean.getAFFAIRNUM(),
			bean.getPRESENTDAY(),
			bean.getCONTENT(),
			bean.getFILENAME(),
			bean.getFILELOC(),
			bean.getFILECATEG()
		};
		
		setFilePopAdd.update(values);
	}
	
	class SetFilePopAdd extends SqlUpdate {
		public SetFilePopAdd(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetFilePopAdd"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	//제출자료 삭제
	public void setFilePopDel(String affairNum, String fileId) {
		SetFilePopDel setFilePopDel = new SetFilePopDel(getDataSource());
		Object[] values = {affairNum,fileId};
		setFilePopDel.update(values);
	}
	
	class SetFilePopDel extends SqlUpdate {
		public SetFilePopDel(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetFilePopDel"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	//제출자료
	public List getFilePopList(String affairNum) {
		 GetFilePopList getFilePopList = new GetFilePopList(getDataSource());
    		    		
		Object[] values = {affairNum};
		
		return getFilePopList.execute(values);
	} 
	    
    protected class GetFilePopList extends MappingSqlQuery
    {
        protected GetFilePopList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.GetFilePopList"));
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
	
	//소유자 삭제
	public void setOwnerPopDel(SuitBean bean) {
		SetOwnerPopDel setOwnerPopDel = new SetOwnerPopDel(getDataSource());
		Object[] values = {
			bean.getAFFAIRNUM(),
			bean.getOWNERNUM(),
			bean.getPNU()
		};
		
		setOwnerPopDel.update(values);
	}
	
	class SetOwnerPopDel extends SqlUpdate {
		public SetOwnerPopDel(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetOwnerPopDel"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	
	//소유자 추가
	public void setOwnerPopAdd(SuitBean bean) {
		SetOwnerPopAdd setOwnerPopAdd = new SetOwnerPopAdd(getDataSource());
		Object[] values = {
			bean.getAFFAIRNUM(),
			bean.getPNU(),
			bean.getNAME(),
			bean.getJUMINNUM(),
			bean.getADDR(),
			bean.getTEL(),
			bean.getISFIXED(),
			bean.getOWNRATE(),
			bean.getETC()
		};
		
		setOwnerPopAdd.update(values);
	}
	
	class SetOwnerPopAdd extends SqlUpdate {
		public SetOwnerPopAdd(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetOwnerPopAdd"));
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
	
	
	
	//소유자 목록 조회
	public List getOwnerPopList(String affairNum,String pnu,String isFixed) {
		GetOwnerPopList getOwnerPopList = new GetOwnerPopList(getDataSource());
    		    		
		Object[] values = {affairNum,pnu,isFixed};
		
		return getOwnerPopList.execute(values);
	} 
	    
    protected class GetOwnerPopList extends MappingSqlQuery
    {
        protected GetOwnerPopList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.GetOwnerPopList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SuitBean bean = new SuitBean();
        	
	        bean.setOWNERNUM(rs.getString("OWNERNUM"));
	        bean.setAFFAIRNUM(rs.getString("AFFAIRNUM"));
	        bean.setPNU(rs.getString("PNU"));
	        bean.setJUMINNUM(StringUtil.addSSNDash(rs.getString("JUMINNUM")));
	        bean.setNAME(rs.getString("NAME"));
	        bean.setADDR(rs.getString("ADDR"));
	        bean.setTEL(rs.getString("TEL"));
	        bean.setOWNRATE(rs.getString("OWNRATE"));
	        bean.setISFIXED(rs.getString("ISFIXED"));
	        bean.setETC(rs.getString("ETC"));
	        bean.setREGISTDATE(rs.getString("REGISTDATE"));
	        bean.setUNFAIRNUM(rs.getString("UNFAIRNUM"));

        	return	bean;
        }
    }
	
	//원고피고 삭제
	public void setSuitorPopDel(SuitBean bean) {
		SetSuitorPopDel setSuitorPopDel = new SetSuitorPopDel(getDataSource());
		Object[] values = {
			bean.getAFFAIRNUM(),
			bean.getSUITORNUM(),
			bean.getGUBUN()
		};
		
		setSuitorPopDel.update(values);
	}
	
	class SetSuitorPopDel extends SqlUpdate {
		public SetSuitorPopDel(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetSuitorPopDel"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	
	//원고피고 추가
	public void setSuitorPopAdd(SuitBean bean) {
		SetSuitorPopAdd setSuitorPopAdd = new SetSuitorPopAdd(getDataSource());
		Object[] values = {
			bean.getAFFAIRNUM(),
			bean.getNAME(),
			bean.getADMINSTNAME(),
			bean.getJUMINNUM(),
			bean.getADDR(),
			bean.getTEL(),
			bean.getETC(),
			bean.getGUBUN()
		};
		
		setSuitorPopAdd.update(values);
	}
	
	class SetSuitorPopAdd extends SqlUpdate {
		public SetSuitorPopAdd(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetSuitorPopAdd"));
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
	
	
	//원고 피고 조회
	public List getPopSuitorList(String affairNum,String gubun) {
		GetPopSuitorList getPopSuitorList = new GetPopSuitorList(getDataSource());
    		    		
		Object[] values = {affairNum,gubun};
		
		return getPopSuitorList.execute(values);
	} 
	    
    protected class GetPopSuitorList extends MappingSqlQuery
    {
        protected GetPopSuitorList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.GetPopSuitorList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SuitBean bean = new SuitBean();
        	
	        bean.setSUITORNUM(rs.getString("SUITORNUM"));
	        bean.setAFFAIRNUM(rs.getString("AFFAIRNUM"));
	        bean.setNAME(rs.getString("NAME"));
	        bean.setADMINSTNUM(rs.getString("ADMINSTNUM"));
	        bean.setADMINSTNAME(rs.getString("ADMINSTNAME"));
	        bean.setJUMINNUM(StringUtil.addSSNDash(rs.getString("JUMINNUM")));
	        bean.setADDR(rs.getString("ADDR"));
	        bean.setTEL(rs.getString("TEL"));
	        bean.setETC(rs.getString("ETC"));
	        bean.setISMAIN(rs.getString("ISMAIN"));
	        bean.setISDEL(rs.getString("ISDEL"));
	        bean.setREGISTDATE(rs.getString("REGISTDATE"));
	        bean.setGUBUN(rs.getString("GUBUN"));

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
	
	// 사건번호 변경
	public void setSuitNumChangePrc(SuitRegBean bean) {
		
		SetProxyNumChange setProxyNumChange = new SetProxyNumChange(getDataSource());
		SetSuitorNumChange setSuitorNumChange = new SetSuitorNumChange(getDataSource());
		SetFileNumChange setFileNumChange = new SetFileNumChange(getDataSource());
		SetLawsuitNumChange setLawsuitNumChange = new SetLawsuitNumChange(getDataSource());
		SetPriceNumChange setPriceNumChange = new SetPriceNumChange(getDataSource());
		SetLandNumChange setLandNumChange = new SetLandNumChange(getDataSource());
		SetOwnerNumChange setOwnerNumChange = new SetOwnerNumChange(getDataSource());
		SetRelPersonNumChange setRelPersonNumChange = new SetRelPersonNumChange(getDataSource());
		SetLawJudgeNumChange setLawJudgeNumChange = new SetLawJudgeNumChange(getDataSource());
		
		Object[] values = {bean.getAFFAIRNUM(),bean.getPRE_AFFAIRNUM()};
		
		setProxyNumChange.update(values);
		setSuitorNumChange.update(values);
		setFileNumChange.update(values);
		setLawsuitNumChange.update(values);
		setPriceNumChange.update(values);
		setLandNumChange.update(values);
		setOwnerNumChange.update(values);
		setRelPersonNumChange.update(values);
		setLawJudgeNumChange.update(values);
	}
	
	class SetProxyNumChange extends SqlUpdate {
		public SetProxyNumChange(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetProxyNumChange"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetSuitorNumChange extends SqlUpdate {
		public SetSuitorNumChange(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetSuitorNumChange"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetFileNumChange extends SqlUpdate {
		public SetFileNumChange(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetFileNumChange"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetLawsuitNumChange extends SqlUpdate {
		public SetLawsuitNumChange(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetLawsuitNumChange"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetPriceNumChange extends SqlUpdate {
		public SetPriceNumChange(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetPriceNumChange"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetLandNumChange extends SqlUpdate {
		public SetLandNumChange(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetLandNumChange"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetOwnerNumChange extends SqlUpdate {
		public SetOwnerNumChange(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetOwnerNumChange"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetRelPersonNumChange extends SqlUpdate {
		public SetRelPersonNumChange(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetRelPersonNumChange"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetLawJudgeNumChange extends SqlUpdate {
		public SetLawJudgeNumChange(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetLawJudgeNumChange"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
			
	
	//팝업 승패 변경
	public void setPopLawsuitResult(SuitBean bean) {
		SetPopLawsuitResult setPopLawsuitResult = new SetPopLawsuitResult(getDataSource());
		Object[] values = {
			bean.getANNOUNCEDATE(),
			bean.getOUTCOME(),
			bean.getRESULT(),
			bean.getAFFAIRNUM()
		};
		
		setPopLawsuitResult.update(values);
	}
	
	class SetPopLawsuitResult extends SqlUpdate {
		public SetPopLawsuitResult(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetPopLawsuitResult"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	
	//팝업 승패 조회
	public List getPopLawsuitResult(String affairNum) {
		GetPopLawsuitResult getPopLawsuitResult = new GetPopLawsuitResult(getDataSource());
    		    		
		Object[] values = {affairNum};
		
		return getPopLawsuitResult.execute(values);
	} 
	    
    protected class GetPopLawsuitResult extends MappingSqlQuery
    {
        protected GetPopLawsuitResult(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.GetPopLawsuitResult"));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SuitBean bean = new SuitBean();
	        bean.setAFFAIRNUM(rs.getString("AFFAIRNUM"));
	        bean.setANNOUNCEDATE(rs.getString("ANNOUNCEDATE"));
	        bean.setOUTCOME(rs.getString("OUTCOME"));
	        bean.setRESULT(rs.getString("RESULT"));
        	return	bean;
        }
    }
	
	
	
	
	//팝업삭제
	public void setPopLandSuitDel(String affairNum, String pnu) {
		
		SetPopLawsuitPriceDel setPopLawsuitPriceDel = new SetPopLawsuitPriceDel(getDataSource());
		SetPopRelPersonDel setPopRelPersonDel = new SetPopRelPersonDel(getDataSource());
		SetPopLawJudgeDel setPopLawJudgeDel = new SetPopLawJudgeDel(getDataSource());
		SetPopOwnerDel setPopOwnerDel = new SetPopOwnerDel(getDataSource());
		SetPopLandSuitDel setPopLandSuitDel = new SetPopLandSuitDel(getDataSource());
		
		Object[] values = {affairNum,pnu};
		
		setPopLawsuitPriceDel.update(values);
		setPopRelPersonDel.update(values);
		setPopLawJudgeDel.update(values);
		setPopOwnerDel.update(values);
		setPopLandSuitDel.update(values);
	}
	
	class SetPopLawsuitPriceDel extends SqlUpdate {
		public SetPopLawsuitPriceDel(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetPopLawsuitPriceDel"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetPopRelPersonDel extends SqlUpdate {
		public SetPopRelPersonDel(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetPopRelPersonDel"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetPopLawJudgeDel extends SqlUpdate {
		public SetPopLawJudgeDel(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetPopLawJudgeDel"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetPopOwnerDel extends SqlUpdate {
		public SetPopOwnerDel(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetPopOwnerDel"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	class SetPopLandSuitDel extends SqlUpdate {
		public SetPopLandSuitDel(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetPopLandSuitDel"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	//팝업 landsuit 입력
	public void setPopLandSuitInsert(SuitLandBean bean) {
		SetPopLandSuitInsert setPopLandSuitInsert = new SetPopLandSuitInsert(getDataSource());
		Object[] values = {
			bean.getAFFAIRNUM(),
			bean.getPNU(),
			bean.getTOTALAREA(),
			bean.getLAWSUITAREA(),
			bean.getCATEG(),
			bean.getTOTAL_PRICE()
		};
		
		for (int i = 0; i < values.length; i++) {
			System.out.println("setPopLandSuitInsert:::"+values[i]);
		};
		
		setPopLandSuitInsert.update(values);
	}
	
	class SetPopLandSuitInsert extends SqlUpdate {
		public SetPopLandSuitInsert(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.SetPopLandSuitInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	//팝업 landlawsuit 조회
	public List getPopLandSuitList(String affairNum,String pnu) {
		GetPopLandSuitList getPopLandSuitList = new GetPopLandSuitList(getDataSource());
    		    		
		Object[] values = {affairNum,pnu};
		
		return getPopLandSuitList.execute(values);
	} 
	    
    protected class GetPopLandSuitList extends MappingSqlQuery
    {
        protected GetPopLandSuitList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.GetPopLandSuitList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SuitLandBean bean = new SuitLandBean();
	        bean.setAFFAIRNUM(rs.getString("AFFAIRNUM"));
	        bean.setPNU(rs.getString("PNU"));
	        bean.setTOTALAREA(rs.getString("TOTALAREA"));
	        bean.setLAWSUITAREA(rs.getString("LAWSUITAREA"));
	        bean.setCATEG(rs.getString("CATEG"));
	        bean.setTOTAL_PRICE(rs.getString("TOTAL_PRICE"));
	        bean.setREGISTDATE(rs.getString("REGISTDATE"));
	        bean.setUSE_PRICE(rs.getString("USE_PRICE"));
	        bean.setUNFAIRPRICE(rs.getString("UNFAIRPRICE"));
	        bean.setPROFITPRICE(rs.getString("PROFITPRICE"));
	        bean.setLAND_ADDR(rs.getString("LAND_ADDR"));
        	return	bean;
        }
    }

}