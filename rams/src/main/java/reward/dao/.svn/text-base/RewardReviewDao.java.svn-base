package main.java.reward.dao;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import main.java.board.model.BoardBean;
import main.java.common.dao.RamsJdbcDaoSupport;
import main.java.reward.dao.RewardDao.SetComepePersonUpdate;
import main.java.reward.model.CompeCodeBean;
import main.java.reward.model.CompeFileBean;
import main.java.reward.model.CompeGongsaBean;
import main.java.reward.model.CompeViewBean;
import main.java.reward.model.CompeWriteBean;
import main.java.reward.model.RewardFileBean;
import main.java.reward.model.RewardReviewBean;
import main.java.reward.model.RewardBean;
import main.java.reward.model.RewardReviewViewBean;
import main.java.reward.model.RewardReviewWriteBean;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

public class RewardReviewDao extends RamsJdbcDaoSupport implements IRewardReviewDao {
	protected void initDao() throws Exception {
		super.initDao();
	}

	public List getRewardReviewList(RewardReviewBean searchBean, String currentPage, String countPerPage) {
		GetRewardReviewList getRewardReviewList = new GetRewardReviewList(getDataSource());

		Object[] values = {
				searchBean.getSEARCH_VALUE(),
				searchBean.getSEARCH_VALUE(),
				searchBean.getSEARCH_VALUE(),
				searchBean.getSEARCH_VALUE(),
				searchBean.getSEARCH_VALUE(),
				searchBean.getSEARCH_VALUE(),
				searchBean.getSEARCH_VALUE(),
				searchBean.getSEARCH_VALUE(),
				currentPage,
				countPerPage,
				countPerPage
		};
		
		return getRewardReviewList.execute(values);
	} 
    
    protected class GetRewardReviewList extends MappingSqlQuery
    {
        protected GetRewardReviewList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getRewardReviewList"));
          	
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
        	RewardReviewBean bean = new RewardReviewBean();
        	
        	bean.setCOMPEID(rs.getString("COMPEID"));
        	bean.setRNUM(rs.getString("RNUM"));
        	bean.setTOTNUM(rs.getString("TOTNUM"));
        	bean.setPNU(rs.getString("PNU"));
        	bean.setISCOMPENSATE(rs.getString("ISCOMPENSATE"));
        	bean.setREASON(rs.getString("REASON"));
        	bean.setETC(rs.getString("ETC"));
        	bean.setREGISTDATE(rs.getString("REGISTDATE"));
        	bean.setGU_NM(rs.getString("GU_NM"));
        	bean.setBJ_NM(rs.getString("BJ_NM"));
        	bean.setBONBUN(rs.getString("BONBUN"));
        	bean.setBUBUN(rs.getString("BUBUN"));
        	bean.setINVESTDATE(rs.getString("INVESTDATE"));
        	bean.setINVESTPLACE(rs.getString("INVESTPLACE"));
        	bean.setINVESTID(rs.getString("INVESTID"));
        	return	bean;
        }
	}

    
    //보상심의 
    public List getRewardReviewDiscussView(String INVESTID, String COMPEID) {
    	GetRewardReviewDiscussView getRewardReviewDiscussView = new GetRewardReviewDiscussView(getDataSource());

		Object[] values = {
				INVESTID,
				COMPEID
		};
		
		return getRewardReviewDiscussView.execute(values);
	} 
    
    protected class GetRewardReviewDiscussView extends MappingSqlQuery
    {
        protected GetRewardReviewDiscussView(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getRewardReviewDiscussView"));
          	
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));		
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RewardReviewViewBean bean = new RewardReviewViewBean();

        	bean.setREQDATE(rs.getString("REQDATE"));
        	bean.setINVESTDATE(rs.getString("INVESTDATE"));

        	return	bean;
        }
	}
    
    //보상신청자
	public List getRewardReviewPersonView(String PNU) {
		GetRewardReviewPersonView getRewardReviewPersonView = new GetRewardReviewPersonView(getDataSource());

		Object[] values = {
				PNU
		};
		
		return getRewardReviewPersonView.execute(values);
	} 
    
    protected class GetRewardReviewPersonView extends MappingSqlQuery
    {
        protected GetRewardReviewPersonView(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getRewardReviewPersonView"));
          	
			declareParameter(new SqlParameter(Types.VARCHAR));
		
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RewardReviewViewBean bean = new RewardReviewViewBean();

        	bean.setCP_NAME(rs.getString("NAME"));
        	bean.setCP_TEL(rs.getString("TEL"));
        	bean.setCP_ADDRESS(rs.getString("ADDRESS"));
        	
        	return	bean;
        }
	}
    
    
    //토지
	public List getRewardReviewAreaView(String PNU) {
		GetRewardReviewAreaView getRewardReviewAreaView = new GetRewardReviewAreaView(getDataSource());

		Object[] values = {
				PNU
		};
		
		return getRewardReviewAreaView.execute(values);
	} 
    
    protected class GetRewardReviewAreaView extends MappingSqlQuery
    {
        protected GetRewardReviewAreaView(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getRewardReviewAreaView"));
          	
			declareParameter(new SqlParameter(Types.VARCHAR));		
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	CompeViewBean bean = new CompeViewBean();
        	
        	bean.setPNU(rs.getString("PNU"));
        	bean.setCOMPEID(rs.getString("COMPEID"));
        	bean.setAFFAIRAREA(rs.getString("AFFAIRAREA"));
        	bean.setISFIXED(rs.getString("ISFIXED"));
        	bean.setETC(rs.getString("ETC"));
        	bean.setTOTPRICE(rs.getString("TOTPRICE"));
        	bean.setGU_NM(rs.getString("GU_NM"));
        	bean.setGU_CD(rs.getString("GU_CD"));
        	bean.setBJ_NM(rs.getString("BJ_NM"));
        	bean.setBJ_CD(rs.getString("BJ_CD"));
        	bean.setBONBUN(rs.getString("BONBUN"));
        	bean.setBUBUN(rs.getString("BUBUN"));
        	bean.setJIMOK(rs.getString("JIMOK"));
        	
        	return	bean;
        }
	}
    
    
    //심의결과
	public List getRewardReviewResultView(String INVESTID, String PNU) {
		GetRewardReviewResultView getRewardReviewResultView = new GetRewardReviewResultView(getDataSource());

		Object[] values = {
				INVESTID,
				PNU
		};
		
		return getRewardReviewResultView.execute(values);
	} 
    
    protected class GetRewardReviewResultView extends MappingSqlQuery
    {
        protected GetRewardReviewResultView(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getRewardReviewResultView"));
          	
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));	
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RewardReviewViewBean bean = new RewardReviewViewBean();

        	bean.setCOMPEYN(rs.getString("COMPEYN"));
        	bean.setREASON(rs.getString("REASON"));

        	return	bean;
        }
	}


	//보상신청물건지 수정
	public void setComepensationUpdate(RewardReviewBean writeBean) {
		SetComepensationUpdate setComepensationUpdate = new SetComepensationUpdate(getDataSource());
		
		Object[] values = { 
				writeBean.getISCOMPENSATE(),	//보상여부
				writeBean.getREASON(),			//보상사유
				writeBean.getCOMPEID(),			//보상ID
				writeBean.getPNU()				//대상PNU
				};

		for (int i = 0; i < values.length; i++) {
			System.out.println("보상심의1 - 보상신청물건지_update :" + values[i]);
		}

		setComepensationUpdate.update(values);

	}

	class SetComepensationUpdate extends SqlUpdate {
		public SetComepensationUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.setComepensationUpdate"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	//심의결과 수정
	public void setComperesultUpdate(RewardReviewBean writeBean) {
		SetComperesultUpdate setComperesultUpdate = new SetComperesultUpdate(getDataSource());
		
		Object[] values = { 
				writeBean.getCOMPEYN(),	//보상여부
				writeBean.getREASON(),	//보상사유
				writeBean.getINVESTID(),//보상ID
				writeBean.getPNU()		//대상PNU
				};

		for (int i = 0; i < values.length; i++) {
			System.out.println("보상심의2 - 심의결과_update :" + values[i]);
		}

		setComperesultUpdate.update(values);

	}

	class SetComperesultUpdate extends SqlUpdate {
		public SetComperesultUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.setComperesultUpdate"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	//심의일자 수정
	public void setCompeDiscussUpdate(RewardReviewBean writeBean) {
		SetCompeDiscussUpdate setCompeDiscussUpdate = new SetCompeDiscussUpdate(getDataSource());
		
		Object[] values = { 
				writeBean.getINVESTDATE(),	//심의일자
				writeBean.getINVESTID(),//보상ID
				};

		for (int i = 0; i < values.length; i++) {
			System.out.println("보상심의3 - 심의일자_update :" + values[i]);
		}

		setCompeDiscussUpdate.update(values);

	}

	class SetCompeDiscussUpdate extends SqlUpdate {
		public SetCompeDiscussUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.setCompeDiscussUpdate"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
		}
	}

	//심의파일 조회
    public List getRewardReviewFileList(String INVESTID) {
    	GetRewardReviewFileList getRewardReviewFileList = new GetRewardReviewFileList(getDataSource());

		Object[] values = {
				INVESTID,
		};
		
		for (int i = 0; i < values.length; i++) {
			System.out.println("보상심의3 - 심의일자_update :" + values[i]);
		}
		
		return getRewardReviewFileList.execute(values);
	} 
    
    protected class GetRewardReviewFileList extends MappingSqlQuery
    {
        protected GetRewardReviewFileList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getRewardReviewFileList"));
          	
			declareParameter(new SqlParameter(Types.VARCHAR));	
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RewardFileBean bean = new RewardFileBean();

        	bean.setFILEID(rs.getString("FILEID"));
        	bean.setINVESTID(rs.getString("INVESTID"));
        	bean.setFILENAME(rs.getString("FILENAME"));
        	bean.setPATH(rs.getString("PATH"));
        	bean.setREGISTDATE(rs.getString("REGISTDATE"));
        	bean.setETC(rs.getString("ETC"));
        	
        	return	bean;
        }
	}
    
    //심의자료 추가
	public void setRewardDiscussFileInsert(RewardReviewBean writeBean) {
    	SetRewardDiscussFileInsert setRewardDiscussFileInsert = new SetRewardDiscussFileInsert(getDataSource());
		
		Object[] values = { 
				writeBean.getINVESTID(),//보상ID
				writeBean.getFILENAME(),
				writeBean.getPATH()
				};

		setRewardDiscussFileInsert.update(values);

	}

	class SetRewardDiscussFileInsert extends SqlUpdate {
		public SetRewardDiscussFileInsert(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.SetRewardDiscussFileInsert"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	//심의자료 삭제
	public void setRewardDiscussFileDel(RewardReviewBean writeBean) {
		SetRewardDiscussFileDel setRewardDiscussFileDel = new SetRewardDiscussFileDel(getDataSource());
		
		Object[] values = { 
				writeBean.getFILEID(),
				writeBean.getINVESTID()
				};

		setRewardDiscussFileDel.update(values);

	}

	class SetRewardDiscussFileDel extends SqlUpdate {
		public SetRewardDiscussFileDel(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.SetRewardDiscussFileDel"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
    
    
}
