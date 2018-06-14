package main.java.gongsa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import javax.sql.DataSource;

import main.java.gongsa.model.GongsaBean;
import main.java.common.dao.RamsJdbcDaoSupport;
import main.java.common.util.StringUtil;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.support.lob.OracleLobHandler;

public class GongsaDao extends RamsJdbcDaoSupport implements IGongsaDao {
	private OracleLobHandler oracleLobHandler = null;

	protected void initDao() throws Exception {
		super.initDao();
		oracleLobHandler = new OracleLobHandler();
	}

	// 공사대장 조회
	public List getGongsaList(GongsaBean searchBean, String currentPage,
			String countPerPage) {
		GetGongsaList getGongsaList = new GetGongsaList(getDataSource());

		Object[] values = { searchBean.getCONSTCATEG(),
				searchBean.getLINENAME(), searchBean.getFROM_STARTDATE(),
				searchBean.getTO_STARTDATE(), searchBean.getFROM_ENDDATE(),
				searchBean.getTO_ENDDATE(),currentPage,countPerPage,countPerPage};
		
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		

		return getGongsaList.execute(values);
	}

	class GetGongsaList extends MappingSqlQuery {
		protected GetGongsaList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gongsa.GongsaList"));

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

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			GongsaBean bean = new GongsaBean();

			bean.setRNUM(rs.getString("RNUM"));
			bean.setCONSTNUM(rs.getString("CONSTNUM"));
			bean.setGOSIID(rs.getString("GOSIID"));
			bean.setCONSTNAME(rs.getString("CONSTNAME"));
			bean.setANNPERMISSION(rs.getString("ANNPERMISSION"));
			bean.setLINENAME(rs.getString("LINENAME"));
			bean.setCONSTCATEG(rs.getString("CONSTCATEG"));
			bean.setSTARTSECTION(rs.getString("STARTSECTION"));
			bean.setENDSECTION(rs.getString("ENDSECTION"));
			bean.setCONSTPLACE(rs.getString("CONSTPLACE"));
			bean.setREASON(rs.getString("REASON"));
			bean.setLENGTH(String.valueOf(rs.getFloat("LENGTH")));
			bean.setSTARTDATE(StringUtil.addDash(rs.getString("STARTDATE")));
			bean.setENDDATE(StringUtil.addDash(rs.getString("ENDDATE")));
			bean.setANNOUNCEDATE(StringUtil.addDash(rs.getString("ANNOUNCEDATE")));

			return bean;
		}
	}

	// 공사대장 총 개수
	public int getGongsaListCount(GongsaBean searchBean) {

		Object[] values = { searchBean.getCONSTCATEG(),
				searchBean.getLINENAME(), searchBean.getFROM_STARTDATE(),
				searchBean.getTO_STARTDATE(), searchBean.getFROM_ENDDATE(),
				searchBean.getTO_ENDDATE()};
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gongsa.GongsaListCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}

	// 공사대장 detail
	public List getGongsaDetail(String CONSTNUM) {
		GetGongsaDetail getGongsaDetail = new GetGongsaDetail(getDataSource());

		Object[] values = {CONSTNUM};

		return getGongsaDetail.execute(values);
	}

	class GetGongsaDetail extends MappingSqlQuery {
		protected GetGongsaDetail(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gongsa.GongsaDetail"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			GongsaBean bean = new GongsaBean();

			bean.setCONSTNUM(rs.getString("CONSTNUM"));
			bean.setGOSIID(rs.getString("GOSIID"));
			bean.setCONSTNAME(rs.getString("CONSTNAME"));
			bean.setANNPERMISSION(rs.getString("ANNPERMISSION"));
			bean.setLINENAME(rs.getString("LINENAME"));
			bean.setCONSTCATEG(rs.getString("CONSTCATEG"));
			bean.setCONSTCATEG_NM(rs.getString("CONSTCATEG_NM"));
			bean.setSTARTSECTION(rs.getString("STARTSECTION"));
			bean.setENDSECTION(rs.getString("ENDSECTION"));
			bean.setCONSTPLACE(rs.getString("CONSTPLACE"));
			bean.setSTARTDATE(StringUtil.addDash(rs.getString("STARTDATE")));
			bean.setENDDATE(StringUtil.addDash(rs.getString("ENDDATE")));
			bean.setREASON(rs.getString("REASON"));
			bean.setANNOUNCEDATE(StringUtil.addDash(rs.getString("ANNOUNCEDATE")));
			bean.setLENGTH(String.valueOf(rs.getFloat("LENGTH")));
			bean.setNAME(rs.getString("NAME"));
			bean.setJUMINNUM(rs.getString("JUMINNUM"));
			bean.setTEL(rs.getString("TEL"));
			bean.setPOSTNUM(rs.getString("POSTNUM"));
			bean.setADDR(rs.getString("ADDR"));
			bean.setPLAN_FILE(rs.getString("PLAN_FILE"));
			bean.setNOTICE_FILE(rs.getString("NOTICE_FILE"));
			bean.setPRINT_FILE(rs.getString("PRINT_FILE"));
			bean.setETC_FILE(rs.getString("ETC_FILE"));
			bean.setFILELOC(rs.getString("FILELOC"));

			return bean;
		}
	}


	
	
	// 삭제
	// 공사대장 삭제
	public void setGongsaDelete(String CONSTNUM) {
		SetGongsaDelete setGongsaDelete = new SetGongsaDelete(getDataSource());
		Object[] values = {CONSTNUM};
		System.out.println(":::공사대장 삭제:::"+CONSTNUM);
		setGongsaDelete.update(values);
	}
	
	

	class SetGongsaDelete extends SqlUpdate {
		public SetGongsaDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gongsa.SetGongsaDelete"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 시행자삭제
	public void setGongsaCarryDelete(String CONSTNUM) {
		SetGongsaCarryDelete setGongsaCarryDelete = new SetGongsaCarryDelete(getDataSource());
		Object[] values = {CONSTNUM};
		System.out.println(":::시행자삭제:::"+CONSTNUM);
		setGongsaCarryDelete.update(values);
	}

	class SetGongsaCarryDelete extends SqlUpdate {
		public SetGongsaCarryDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gongsa.SetGongsaCarryDelete"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 파일 삭제
	public void setGongsaFileDelete(String CONSTNUM) {
		SetGongsaFileDelete setGongsaFileDelete = new SetGongsaFileDelete(getDataSource());
		Object[] values = {CONSTNUM};
		System.out.println(":::파일 삭제:::"+CONSTNUM);
		setGongsaFileDelete.update(values);
	}

	class SetGongsaFileDelete extends SqlUpdate {
		public SetGongsaFileDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gongsa.SetGongsaFileDelete"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	// PNU삭제
	public void setGongsaPnuDelete(String CONSTNUM) {
		SetGongsaPnuDelete setGongsaPnuDelete = new SetGongsaPnuDelete(getDataSource());
		Object[] values = {CONSTNUM};
		System.out.println(":::PNU삭제:::"+CONSTNUM);
		setGongsaPnuDelete.update(values);
	}

	class SetGongsaPnuDelete extends SqlUpdate {
		public SetGongsaPnuDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gongsa.SetGongsaPnuDelete"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	
	//수정 시리즈
	// 공사수정
	public void setGongsaUpdate(GongsaBean gongsaBean){
		SetGongsaUpdate setGongsaUpdate = new SetGongsaUpdate(getDataSource());
		Object[] values = { 
				gongsaBean.getGOSIID(),
				gongsaBean.getANNPERMISSION(),
				gongsaBean.getLINENAME(),
				gongsaBean.getCONSTCATEG(),
				gongsaBean.getSTARTSECTION(),
				
				gongsaBean.getENDSECTION(),
				gongsaBean.getCONSTPLACE(),
				gongsaBean.getSTARTDATE(),
				gongsaBean.getENDDATE(),
				gongsaBean.getREASON(),
				
				gongsaBean.getCONSTNUM()
				};

		for (int i = 0; i < values.length; i++) {
			System.out.println("공사대장수정 : : " + values[i]);
		}

		setGongsaUpdate.update(values);

	}

	class SetGongsaUpdate extends SqlUpdate {
		public SetGongsaUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gongsa.SetGongsaUpdate"));
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
	
	
	// 시행자수정
	public void setGongsaCarryUpdate(GongsaBean gongsaBean){
		SetGongsaCarryUpdate setGongsaCarryUpdate = new SetGongsaCarryUpdate(getDataSource());
		Object[] values = { 
				gongsaBean.getNAME(),
				gongsaBean.getJUMINNUM(),
				gongsaBean.getTEL(),
				gongsaBean.getPOSTNUM(),
				gongsaBean.getADDR(),
				
				gongsaBean.getCONSTNUM()
				};

		for (int i = 0; i < values.length; i++) {
			System.out.println("공사대장수정 : : " + values[i]);
		}

		setGongsaCarryUpdate.update(values);

	}

	class SetGongsaCarryUpdate extends SqlUpdate {
		public SetGongsaCarryUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gongsa.SetGongsaCarryUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	// 파일수정
	public void setGongsaFileUpdate(GongsaBean gongsaBean){
		SetGongsaFileUpdate setGongsaFileUpdate = new SetGongsaFileUpdate(getDataSource());
		Object[] values = { 
				gongsaBean.getFILELOC(),
				gongsaBean.getPLAN_FILE(),
				gongsaBean.getNOTICE_FILE(),
				gongsaBean.getPRINT_FILE(),
				gongsaBean.getETC_FILE(),
				
				gongsaBean.getCONSTNUM()
				};

		for (int i = 0; i < values.length; i++) {
			System.out.println("공사대장수정 : : " + values[i]);
		}

		setGongsaFileUpdate.update(values);

	}

	class SetGongsaFileUpdate extends SqlUpdate {
		public SetGongsaFileUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gongsa.SetGongsaFileUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	

}
