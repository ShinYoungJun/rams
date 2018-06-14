package main.java.suit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import main.java.common.dao.RamsJdbcDaoSupport;
import main.java.suit.model.SuitAnalBean;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

public class SuitAnalDao extends RamsJdbcDaoSupport implements ISuitAnalDao {
	protected void initDao() throws Exception {
		super.initDao();
	}
	
	public List getSuitAnalGuList(String fromDate, String toDate) {
		GetSuitAnalGuList getSuitAnalGuList = new GetSuitAnalGuList(getDataSource());
			Object[] values = {fromDate,toDate};
			
			return getSuitAnalGuList.execute(values);
	} 
	    
    protected class GetSuitAnalGuList extends MappingSqlQuery
    {
        protected GetSuitAnalGuList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.getSuitAnalGuList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SuitAnalBean bean = new SuitAnalBean();
        	
	        bean.setTYPE_DATA(rs.getString("TYPE_DATA"));
	        bean.setTOTAL_COUNT(rs.getString("TOTAL_COUNT"));
	        bean.setCLOSE_COUNT(rs.getString("CLOSE_COUNT"));
	        bean.setCONTINUE_COUNT(rs.getString("CONTINUE_COUNT"));
	        bean.setCOUNT_R1(rs.getString("COUNT_R1"));
	        bean.setCOUNT_R2(rs.getString("COUNT_R2"));
	        bean.setCOUNT_R3(rs.getString("COUNT_R3"));
	        bean.setCOUNT_R4(rs.getString("COUNT_R4"));
	        bean.setCOUNT_R5(rs.getString("COUNT_R5"));
	        bean.setCOUNT_R6(rs.getString("COUNT_R6"));
	        
        	return	bean;
        }
    }
    
    
    
	public List getSuitAnalLineList(String fromDate, String toDate) {
		GetSuitAnalLineList getSuitAnalLineList = new GetSuitAnalLineList(getDataSource());
			Object[] values = {fromDate,toDate};
			
			return getSuitAnalLineList.execute(values);
	} 
	    
    protected class GetSuitAnalLineList extends MappingSqlQuery
    {
        protected GetSuitAnalLineList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.getSuitAnalLineList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SuitAnalBean bean = new SuitAnalBean();
        	
	        bean.setTYPE_DATA(rs.getString("TYPE_DATA"));
	        bean.setTOTAL_COUNT(rs.getString("TOTAL_COUNT"));
	        bean.setCLOSE_COUNT(rs.getString("CLOSE_COUNT"));
	        bean.setCONTINUE_COUNT(rs.getString("CONTINUE_COUNT"));
	        bean.setCOUNT_R1(rs.getString("COUNT_R1"));
	        bean.setCOUNT_R2(rs.getString("COUNT_R2"));
	        bean.setCOUNT_R3(rs.getString("COUNT_R3"));
	        bean.setCOUNT_R4(rs.getString("COUNT_R4"));
	        bean.setCOUNT_R5(rs.getString("COUNT_R5"));
	        bean.setCOUNT_R6(rs.getString("COUNT_R6"));
	        
        	return	bean;
        }
    }
    
    
    

}