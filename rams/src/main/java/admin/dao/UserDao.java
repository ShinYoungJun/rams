package main.java.admin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import main.java.admin.model.LoginNoticeBean;
import main.java.admin.model.UserBean;
import main.java.board.model.BoardBean;
import main.java.common.dao.RamsJdbcDaoSupport;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

public class UserDao extends RamsJdbcDaoSupport implements IUserDao {
	
	// 공지사항 조회
	public List getRamsNoticeList(String SEQNUM) {
		GetRamsNoticeList getRamsNoticeList = new GetRamsNoticeList(getDataSource());
		Object[] values = {SEQNUM};

		return getRamsNoticeList.execute(values);
	}

	class GetRamsNoticeList extends MappingSqlQuery {
		protected GetRamsNoticeList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.admin.user.GetRamsNoticeList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			LoginNoticeBean bean = new LoginNoticeBean();
			bean.setCONTENT(rs.getString("CONTENT"));
			bean.setREGISTDATE(rs.getString("REGISTDATE"));
			bean.setREGISTNAME(rs.getString("REGISTNAME"));
			bean.setSEQNUM(rs.getString("SEQNUM"));
			bean.setTITLE(rs.getString("TITLE"));
			bean.setUSERID(rs.getString("USERID"));
			bean.setVIEWCNT(rs.getString("VIEWCNT"));
			return bean;
		}
	}
	
	public List getRoadsNoticeList(String PUBLIC){
		GetRoadsNoticeList getRoadsNoticeList = new GetRoadsNoticeList(getDataSource());
		Object[] values = {PUBLIC};

		return getRoadsNoticeList.execute(values);
	}

	class GetRoadsNoticeList extends MappingSqlQuery {
		protected GetRoadsNoticeList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.admin.user.GetRoadsNoticeList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			LoginNoticeBean bean = new LoginNoticeBean();
			bean.setTITLE(rs.getString("TITLE"));
			bean.setUSER_ID(rs.getString("USER_ID"));
			bean.setPUBLIC_YN(rs.getString("PUBLIC_YN"));
			bean.setCONTENT(rs.getString("CONTENT"));
			bean.setREGDATE(rs.getString("REGDATE"));
			bean.setFILE_NAME(rs.getString("FILE_NAME"));
			bean.setBOARD_ID(rs.getString("BOARD_ID"));
			bean.setNOTICE_FROMDATE(rs.getString("NOTICE_FROMDATE"));
			bean.setNOTICE_TODATE(rs.getString("NOTICE_TODATE"));

			return bean;
		}
	}
	
	public List getUserList(UserBean bean, String currentPage, String countPerPage){
		GetUserList getUserList = new GetUserList(getDataSource());
		Object[] values = {
				bean.getUSERID(),bean.getUSERNAME(),bean.getADMINIST(),bean.getISAPPROVE(),
				currentPage,countPerPage,countPerPage
				};
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		return getUserList.execute(values);
	}

	class GetUserList extends MappingSqlQuery {
		protected GetUserList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.admin.user.GetUserList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			UserBean bean = new UserBean();
			
			bean.setUSERID(rs.getString("USERID"));
			bean.setAUTHURNAME(rs.getString("AUTHURNAME"));
			bean.setPASS(rs.getString("PASS"));
			bean.setGU_NM(rs.getString("GU_NM"));
			bean.setUSERNAME(rs.getString("USERNAME"));
			bean.setADMINIST(rs.getString("ADMINIST"));
			bean.setPART(rs.getString("PART"));
			bean.setINLINENUM(rs.getString("INLINENUM"));
			bean.setTEL1(rs.getString("TEL1"));
			bean.setTEL2(rs.getString("TEL2"));
			bean.setTEL3(rs.getString("TEL3"));
			bean.setMTEL1(rs.getString("MTEL1"));
			bean.setMTEL2(rs.getString("MTEL2"));
			bean.setMTEL3(rs.getString("MTEL3"));
			bean.setEMAIL(rs.getString("EMAIL"));
			bean.setASSIGNWORK(rs.getString("ASSIGNWORK"));
			bean.setISAPPROVE(rs.getString("ISAPPROVE"));
			bean.setJUMINNUM(rs.getString("JUMINNUM"));
			bean.setREGISTDATE(rs.getString("REGISTDATE"));


			return bean;
		}
	}
	
	public int GetUserCount(UserBean bean) {
		Object[] values = {bean.getUSERID(),bean.getUSERNAME(),bean.getADMINIST(),bean.getISAPPROVE()};

		String sql = getMessageSourceAccessor().getMessage("Querys.admin.user.GetUserCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		
		return returnNum;
	}
	
	public void setUserApprove(String approve, String userId) {
		SetUserApprove setUserApprove = new SetUserApprove(getDataSource());
		Object[] values = {approve,userId};
		setUserApprove.update(values);

	}

	class SetUserApprove extends SqlUpdate {
		public SetUserApprove(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.admin.user.SetUserApprove"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	//사용자 삭제
	public void setUserDelete(String userId) {
		SetUserDelete setUserDelete = new SetUserDelete(getDataSource());
		Object[] values = {userId};
		setUserDelete.update(values);

	}

	class SetUserDelete extends SqlUpdate {
		public SetUserDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.admin.user.SetUserDelete"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	//사용자 수정
	public void setUserUpdate(UserBean bean) {
		SetUserUpdate setUserUpdate = new SetUserUpdate(getDataSource());
		Object[] values = {
				bean.getAUTHURNAME(),
				bean.getUSERNAME(),
				bean.getPASS(),
				bean.getJUMINNUM(),
				bean.getTEL1(),
				bean.getTEL2(),
				
				bean.getTEL3(),
				bean.getINLINENUM(),
				bean.getMTEL1(),
				bean.getMTEL2(),
				bean.getMTEL3(),
				
				bean.getEMAIL(),
				bean.getUSERID()
		};
		
		for (int i = 0; i < values.length; i++) {
			System.out.println("::"+values[i]);
		}
		
		setUserUpdate.update(values);

	}

	class SetUserUpdate extends SqlUpdate {
		public SetUserUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.admin.user.SetUserUpdate"));
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
