package main.java.reward.dao;

import java.net.URLEncoder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import main.java.common.dao.RamsJdbcDaoSupport;
import main.java.common.util.StringUtil;
import main.java.reward.model.RewardAnalBean;
import main.java.reward.model.RewardOwnBean;


public class RewardAnalDao extends RamsJdbcDaoSupport implements IRewardAnalDao {
	protected void initDao() throws Exception {
		super.initDao();
	}
	
	public List getRewardAnalList(String fromReqDate, String toReqDate,String fromRegistDate, String toRegistDate) {
		GetRewardAnalList getRewardAnalList = new GetRewardAnalList(getDataSource());
			Object[] values = {fromReqDate,toReqDate,fromRegistDate,toRegistDate};
			
			return getRewardAnalList.execute(values);
	} 
	    
    protected class GetRewardAnalList extends MappingSqlQuery
    {
        protected GetRewardAnalList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.GetRewardAnalList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RewardAnalBean bean = new RewardAnalBean();
        	
	        bean.setGU_CD(rs.getString("GU_CD"));
	        bean.setGU_NM(rs.getString("GU_NM"));
	        bean.setTOTAL_COMPE(rs.getString("TOTAL_COMPE"));
	        bean.setCOMPE(rs.getString("COMPE"));
	        bean.setUN_COMPE(rs.getString("UN_COMPE"));
	        bean.setAREA(rs.getString("AREA"));
	        bean.setPRICE(StringUtil.insertComma2(rs.getString("PRICE")));

	        
        	return	bean;
        }
    }
	    
    
	public List getRewardOwnList(String fromReqDate, String toReqDate,String fromRegistDate, String toRegistDate) {
		GetRewardOwnList getRewardOwnList = new GetRewardOwnList(getDataSource());
		
		 	String srh = "Ω√»Ô~¡ﬂ∏≤º±";
		
			Object[] values = {
					srh,
					srh,
					srh,
					srh
			};
			
			return getRewardOwnList.execute(values);
	} 
	    
    protected class GetRewardOwnList extends MappingSqlQuery
    {
        protected GetRewardOwnList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.GetRewardOwnList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RewardOwnBean bean = new RewardOwnBean();
        	
	        bean.setOWNGUBUN(rs.getString("OWNGUBUN"));
	        bean.setCNT(rs.getString("CNT"));
	        bean.setAREA(rs.getString("AREA"));
	        bean.setJIGA(StringUtil.insertComma2(rs.getString("JIGA")));
	        
        	return	bean;
        }
    }
}