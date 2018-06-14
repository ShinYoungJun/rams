package main.java.reward.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import main.java.common.dao.RamsJdbcDaoSupport;
import main.java.reward.model.RewardStatusBean;
import main.java.reward.model.RewardStatusViewBean;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

public class RewardStatusDao extends RamsJdbcDaoSupport implements IRewardStatusDao {
	protected void initDao() throws Exception {
		super.initDao();
	}
	
	public List getRewardStatusView(String compeId,String pnu,String juminNum){
		GetRewardStatusView getRewardStatusView = new GetRewardStatusView(getDataSource());
		Object[] values = {
				compeId,
				pnu,
				juminNum+"%"
				};
		for(int i = 0 ; i < values.length ; i++)
			System.out.println(values[i]);
		
		return getRewardStatusView.execute(values);
	} 
	
    protected class GetRewardStatusView extends MappingSqlQuery
    {
        protected GetRewardStatusView(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getRewardStatusView"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RewardStatusViewBean bean = new RewardStatusViewBean();
        bean.setJUMINNUM(rs.getString("JUMINNUM"));
        bean.setPNU(rs.getString("PNU"));
        bean.setCOMPEID(rs.getString("COMPEID"));
        bean.setGUBUN(rs.getString("GUBUN"));
        bean.setASSIGNDATE(rs.getString("ASSIGNDATE"));
        bean.setETC(rs.getString("ETC"));
        bean.setISACQUIRE(rs.getString("ISACQUIRE"));
        bean.setGU_NM(rs.getString("GU_NM"));
        bean.setBJ_NM(rs.getString("BJ_NM"));
        bean.setBONBUN(rs.getString("BONBUN"));
        bean.setBUBUN(rs.getString("BUBUN"));
        bean.setJIMOK(rs.getString("JIMOK"));
        bean.setAFFAIRAREA(rs.getString("AFFAIRAREA"));
        bean.setREASON(rs.getString("REASON"));
        bean.setGOSIID(rs.getString("GOSIID"));
        bean.setCONSTNAME(rs.getString("CONSTNAME"));
        bean.setOFFICENAME_1(rs.getString("OFFICENAME_1"));
        bean.setDANGA_1(rs.getString("DANGA_1"));
        bean.setJUDGEPRICE_1(rs.getString("JUDGEPRICE_1"));
        bean.setPOINTDATE_1(rs.getString("POINTDATE_1"));
        bean.setOFFICENAME_2(rs.getString("OFFICENAME_2"));
        bean.setDANGA_2(rs.getString("DANGA_2"));
        bean.setJUDGEPRICE_2(rs.getString("JUDGEPRICE_2"));
        bean.setPOINTDATE_2(rs.getString("POINTDATE_2"));

        	
        	return	bean;
        }
    }
	
	public List getRewardStatusList(RewardStatusBean searchBean,String currentPage,	String countPerPage) {
		GetRewardStatusList getRewardStatusList = new GetRewardStatusList(getDataSource());
		
	    		    		
			Object[] values = {
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE(),
					searchBean.getFROMDATE(),
					searchBean.getTODATE(),
					currentPage,
					countPerPage,
					countPerPage
			};
			
			return getRewardStatusList.execute(values);
		} 
	    
    protected class GetRewardStatusList extends MappingSqlQuery
    {
        protected GetRewardStatusList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getRewardStatusList"));
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
        	RewardStatusBean bean = new RewardStatusBean();	        	

        	bean.setRNUM(rs.getString("RNUM"));
        	bean.setCOMPEID(rs.getString("COMPEID"));
        	bean.setPNU(rs.getString("PNU"));
        	bean.setGUBUN(rs.getString("GUBUN"));
        	bean.setGU_NM(rs.getString("GU_NM"));
        	bean.setBJ_NM(rs.getString("BJ_NM"));
        	bean.setBONBUN(rs.getString("BONBUN"));
        	bean.setBUBUN(rs.getString("BUBUN"));
        	bean.setAFFAIRAREA(rs.getString("AFFAIRAREA"));
        	bean.setJUMINNUM(rs.getString("JUMINNUM"));
        	bean.setASSIGNDATE(rs.getString("ASSIGNDATE"));
        	bean.setISACQUIRE(rs.getString("ISACQUIRE"));
        	bean.setETC(rs.getString("ETC"));
        	bean.setREGISTDATE(rs.getString("REGISTDATE"));

        	
        	return	bean;
        }
    }
	    
	    
	public int getRewardStatusCount(RewardStatusBean searchBean){
		Object[] values = {
				searchBean.getSEARCH_VALUE(),
				searchBean.getSEARCH_VALUE(),
				searchBean.getSEARCH_VALUE(),
				searchBean.getFROMDATE(),
				searchBean.getTODATE()
		};
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.reward.getRewardStatusCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}
	
	
    public boolean setRewardStatusUpdate(RewardStatusViewBean searchBean){
    	SetRewardStatusUpdate setRewardStatusUpdate = new SetRewardStatusUpdate(getDataSource());
		Object[] values = {
				searchBean.getASSIGNDATE(),
				searchBean.getISACQUIRE(),
				searchBean.getETC(),
				searchBean.getCOMPEID(),
				searchBean.getPNU(),
				searchBean.getJUMINNUM()+"%"
				};

		int returnVal = setRewardStatusUpdate.update(values);

		if (returnVal == 1)
			return true;
		else
			return false;
	}
    
	class SetRewardStatusUpdate extends SqlUpdate {
		public SetRewardStatusUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.reward.setRewardStatusUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

		
}