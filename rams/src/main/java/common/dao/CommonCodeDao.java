//	2010		Kim Kwon Tae

package main.java.common.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import main.java.admin.model.UserBean;
import main.java.common.model.CommonCodeBean;
import main.java.common.model.RefDongBean;
import main.java.common.util.StringUtil;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;


//	공통코드
public class CommonCodeDao	extends RamsJdbcDaoSupport{

	private HttpServletRequest request = null;
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
    }
    // 공통코드 가져오기
    public	List	executeCommonCode(String codeNum, String codeName, String codeValue)
	{
    	CommonCode	commonCode	= new CommonCode(getDataSource());
    	
    	codeNum = StringUtil.replaceNulltoPer(codeNum);
    	codeName = StringUtil.replaceNulltoPer(codeName);
    	codeValue = StringUtil.replaceNulltoPer(codeValue);
    	
    	Object[] values = {codeNum, codeName, codeValue};
    	
    	System.out.println(codeNum+":"+codeName+":"+codeValue);
    	
    	return commonCode.execute(values);
	}
    
    protected	class	CommonCode	extends	MappingSqlQuery
    {
        protected 	CommonCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.common.common.getCommonCode"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	CommonCodeBean	Bean	= new CommonCodeBean();

        	Bean.setCODEDESC(rs.getString("CODEDESC"));
        	Bean.setCODENAME(rs.getString("CODENAME"));
        	Bean.setCODENUM(rs.getString("CODENUM"));
        	Bean.setCODEVALUE(rs.getString("CODEVALUE"));

        	return	Bean;
        }
    }
    
	//	구 리스트 불러오기
	public List	getGuList(String SI_CD,String GU_CD)
	{
		GetGuList	getGuList	= new GetGuList(getDataSource());
		
		GU_CD = StringUtil.replaceNulltoPer(GU_CD);
    	
    	Object[] values = {SI_CD,GU_CD};
    	
    	return getGuList.execute(values);
	}
	
    protected	class	GetGuList	extends	MappingSqlQuery
    {
        protected 	GetGuList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.common.common.getGuList"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RefDongBean	bean	= new RefDongBean();

        	bean.setGU_CD(rs.getString("GU_CD"));
        	bean.setGU_NM(rs.getString("GU_NM"));
        	
        	return	bean;
        }
    }
    
	//	법정동 리스트 불러오기
	public List	getBJDongList(String GU_CD,String BJ_CD)
	{
		GetBJDongList	getBJDongList	= new GetBJDongList(getDataSource());

		BJ_CD = StringUtil.replaceNulltoPer(BJ_CD);
		
    	Object[] values = {GU_CD,BJ_CD};
    	
    	return getBJDongList.execute(values);
	}
	
    protected	class	GetBJDongList	extends	MappingSqlQuery
    {
        protected 	GetBJDongList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.common.common.getBJDongList"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RefDongBean	bean	= new RefDongBean();

        	bean.setBJ_CD(rs.getString("BJ_CD"));
        	bean.setBJ_NM(rs.getString("BJ_NM"));
        	
        	return	bean;
        }
    }
    
    
     
}
