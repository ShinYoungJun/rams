package main.java.admin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import main.java.admin.model.UserBean;
import main.java.common.dao.RamsJdbcDaoSupport;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

public class UserRegDao extends RamsJdbcDaoSupport implements IUserRegDao {

	
	protected void initDao() throws Exception {
		super.initDao();
		

	}


	public UserBean getUserDetail(String userId) {
		
		RetrieveUserDetailQuery retrieveUserDetailQuery = new RetrieveUserDetailQuery(getDataSource());

		UserBean objUserBean = null;
		Object[] values = {userId};
		
		objUserBean = (UserBean)retrieveUserDetailQuery.findObject(values);
		
		return objUserBean;
	}

	protected class RetrieveUserDetailQuery extends MappingSqlQuery {
		protected RetrieveUserDetailQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.admin.user.selectbyUserId"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
		
		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			UserBean objUserBean = new UserBean();
			
			objUserBean.setUSERID(rs.getString("USERID"));		
			objUserBean.setAUTHURNAME(rs.getString("AUTHURNAME"));		
			objUserBean.setPASS(rs.getString("PASS"));
			objUserBean.setUSERNAME(rs.getString("USERNAME"));
			objUserBean.setADMINIST(rs.getString("ADMINIST"));
			objUserBean.setPART(rs.getString("PART"));
			objUserBean.setINLINENUM(rs.getString("INLINENUM"));
			objUserBean.setTEL1(rs.getString("TEL1"));
			objUserBean.setTEL2(rs.getString("TEL2"));
			objUserBean.setTEL3(rs.getString("TEL3"));
			objUserBean.setMTEL1(rs.getString("MTEL1"));
			objUserBean.setMTEL2(rs.getString("MTEL2"));
			objUserBean.setMTEL3(rs.getString("MTEL3"));
			objUserBean.setEMAIL(rs.getString("EMAIL"));	
			objUserBean.setASSIGNWORK(rs.getString("ASSIGNWORK"));
			objUserBean.setISAPPROVE(rs.getString("ISAPPROVE"));
			
			return objUserBean;
		}
	}
    
    protected	String	NullCheck(String str){
    	if(str	==	null)
    		str	= "";
    	
    	return	str;
    }

    //사용자ID 중복체크
	public int checkUserId(String userId) {

		Object[] values = {userId}; 
        String sql = getMessageSourceAccessor().getMessage("Querys.admin.user.checkUserId");
 
        return getJdbcTemplate().queryForInt(sql,values);	
	}     
	
	public List getGuCodeList() {
		
		 GetGuCodeList getGuCodeList= new GetGuCodeList(getDataSource());
		
		return getGuCodeList.execute();
		
	}
	
	//구코드 가져오는 함수
   protected class GetGuCodeList extends MappingSqlQuery
   {
       protected GetGuCodeList (DataSource ds)
       {
         	super(ds, getMessageSourceAccessor().getMessage("Querys.map.juckji_gucode"));
		
       }
       
       protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
       {
       	UserBean bean = new UserBean ();
       	
       	bean.setGU_CD(rs.getString("GU_CD"));
       	bean.setGU_NM(rs.getString("GU_NM"));
       	
       	return	bean;
       }
   }
   
   //회원가입 인서트
   public boolean insertMember(UserBean bean) {
	   InsertMember  insertMember  = new InsertMember (getDataSource());
		Object[] values = { 
				bean.getUSERID(),
				bean.getAUTHURNAME(),
				bean.getPASS(),
				bean.getUSERNAME(),
				bean.getADMINIST(),
				bean.getPART(),
				bean.getINLINENUM(),
				bean.getTEL1(),
				bean.getTEL2(),
				bean.getTEL3(),
				
				bean.getMTEL1(),				                
				bean.getMTEL2(),
				bean.getMTEL3(),
				bean.getEMAIL(),
				bean.getASSIGNWORK(),
				bean.getISAPPROVE(),
				bean.getJUMINNUM()						
		};

		for (int i = 0; i < values.length; i++) {
			System.out.println("회원가입 : : " + values[i]);
		}

		int returnVal = insertMember .update(values);

		if (returnVal == 1)
			return true;
		else
			return false;
	}

	class InsertMember extends SqlUpdate {
		public InsertMember (DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.admin.user.InsertMember"));
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
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
}