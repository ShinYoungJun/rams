package main.java.cityland.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import main.java.cityland.model.CodeBean;
import main.java.cityland.model.CitylandBean;
import main.java.common.dao.RamsJdbcDaoSupport;
import main.java.common.util.StringUtil;

public class CitylandDao extends RamsJdbcDaoSupport implements ICitylandDao {
	protected void initDao() throws Exception {
		super.initDao();
	}
	
	
	//대부사용허가 리스트 조회
	public List getPermissList(CitylandBean searchBean) {
		GetPermissList getPermissList = new GetPermissList(getDataSource());

		Object[] values = { searchBean.getPP_CLASS(), searchBean.getGU_CD(),
				searchBean.getDONG_CD(), searchBean.getBUNJI(),
				searchBean.getUSE(),

				searchBean.getADMI(), searchBean.getACCOUNT(),
				searchBean.getMAIN_MANA(), searchBean.getSTART_P_AMT(),
				searchBean.getEND_P_AMT(),

				searchBean.getPER_START_DAY(), searchBean.getPER_END_DAY(),
				searchBean.getSTART_P_AREA(), searchBean.getEND_P_AREA() };

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		return getPermissList.execute(values);
	}

	protected class GetPermissList extends MappingSqlQuery {
		protected GetPermissList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.cityland.getPermissList"));
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

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			CitylandBean bean = new CitylandBean();
			bean.setRN(String.valueOf(rownum + 1));
			bean.setPP_SN(rs.getString("PP_SN"));
			bean.setPP_CLASS_N(rs.getString("PP_CLASS_N"));
			bean.setUSE_N(rs.getString("USE_N"));
			bean.setADMI_N(rs.getString("ADMI_N"));
			bean.setACCOUNT_N(rs.getString("ACCOUNT_N"));
			bean.setMAIN_MANA_N(rs.getString("MAIN_MANA_N"));
			bean.setAMT(StringUtil.insertComma2(rs.getString("P_AMT")));
			bean.setPER_START_DAY(StringUtil.addDash(rs.getString("PER_START_DAY")));
			bean.setPER_END_DAY(StringUtil.addDash(rs.getString("PER_END_DAY")));
			bean.setPER_AREA(String.valueOf(rs.getFloat("PER_AREA")));
			bean.setPER_AMT(StringUtil.insertComma2(rs.getString("PER_AMT")));
			bean.setRATE1(rs.getString("RATE1"));
			bean.setPAY_N(rs.getString("PAY_N"));
			bean.setPRE_PER_AMT(StringUtil.insertComma2(rs.getString("PRE_PER_AMT")));
			bean.setLAND_ADDR(rs.getString("LAND_ADDR"));

			return bean;
		}
	}

	
	
	// 처분재산 리스트 조회
	public List getDisList(CitylandBean searchBean) {
		GetDisList getDisList = new GetDisList(getDataSource());

		Object[] values = { searchBean.getPP_CLASS(), searchBean.getGU_CD(),
				searchBean.getDONG_CD(), searchBean.getBUNJI(),
				searchBean.getSTART_DIS_JUD_AMT(), searchBean.getEND_DIS_JUD_AMT()};

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		return getDisList.execute(values);
	}

	protected class GetDisList extends MappingSqlQuery {
		protected GetDisList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.cityland.getDisList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			CitylandBean bean = new CitylandBean();
			bean.setRN(String.valueOf(rownum + 1));
			bean.setPP_SN(rs.getString("PP_SN"));
			bean.setDIS_DAY(StringUtil.addDash(rs.getString("DIS_DAY")));
			bean.setDIS_ACC_YN(rs.getString("DIS_ACC_YN"));
			bean.setLAND_ADDR(rs.getString("LAND_ADDR"));
			bean.setPP_CLASS_N(rs.getString("PP_CLASS_N"));
			bean.setDIS_JUD_AMT(StringUtil.insertComma2(rs.getString("DIS_JUD_AMT")));
			bean.setDIS_AMT(StringUtil.insertComma2(rs.getString("DIS_AMT")));
			bean.setDIS_WAY_N(rs.getString("DIS_WAY_N"));
			bean.setDIS_REASON(rs.getString("DIS_REASON"));
			bean.setDIS_CONTRACT_N(rs.getString("DIS_CONTRACT_N"));
			bean.setOWNER_N(rs.getString("OWNER_N"));
			bean.setOWN_CITY_N(rs.getString("OWN_CITY_N"));

			return bean;
		}
	}
	
	
	//무단점용 리스트 조회
	public List getMoodanList(CitylandBean searchBean) {
		GetMoodanList getMoodanList = new GetMoodanList(getDataSource());

		Object[] values = { searchBean.getPP_CLASS(), searchBean.getGU_CD(),
				searchBean.getDONG_CD(), searchBean.getBUNJI(),
				searchBean.getUSE(),

				searchBean.getADMI(), searchBean.getACCOUNT(),
				searchBean.getMAIN_MANA(), searchBean.getSTART_P_AMT(),
				searchBean.getEND_P_AMT(),

				searchBean.getWRONG_START_DAY(), searchBean.getWRONG_END_DAY(),
				searchBean.getSTART_WRONG_AREA(), searchBean.getEND_WRONG_AREA()};

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		return getMoodanList.execute(values);
	}

	protected class GetMoodanList extends MappingSqlQuery {
		protected GetMoodanList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.cityland.getMoodanList"));
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

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			CitylandBean bean = new CitylandBean();
			
			bean.setRN(String.valueOf(rownum + 1));
			bean.setPP_SN(rs.getString("PP_SN"));
			bean.setPP_CLASS_N(rs.getString("PP_CLASS_N"));
			bean.setUSE_N(rs.getString("USE_N"));
			bean.setADMI_N(rs.getString("ADMI_N"));
			bean.setACCOUNT_N(rs.getString("ACCOUNT_N"));
			bean.setMAIN_MANA_N(rs.getString("MAIN_MANA_N"));
			bean.setAMT(StringUtil.insertComma2(rs.getString("P_AMT")));
			bean.setWRONG_START_DAY(StringUtil.addDash(rs.getString("WRONG_START_DAY")));
			bean.setWRONG_END_DAY(StringUtil.addDash(rs.getString("WRONG_END_DAY")));
			bean.setWRONG_AREA(String.valueOf(rs.getFloat("WRONG_AREA")));
			bean.setLAND_ADDR(rs.getString("LAND_ADDR"));
			bean.setRATE1(rs.getString("RATE1"));
			bean.setCOMPEN_ALL_AMT(StringUtil.insertComma2(rs.getString("COMPEN_ALL_AMT")));
			bean.setWRONG_AIM_N(rs.getString("WRONG_AIM_N"));
			bean.setWMAN_ADDRESS(rs.getString("WMAN_ADDRESS"));

			return bean;
		}
	}
	
	// 재산정보 리스트 조회
	public List getBaseList(CitylandBean searchBean) {
		GetBaseList getBaseList = new GetBaseList(getDataSource());

		Object[] values = { searchBean.getPP_CLASS(), searchBean.getGU_CD(),
				searchBean.getDONG_CD(), searchBean.getBUNJI(),
				searchBean.getSTART_P_AMT(), searchBean.getEND_P_AMT()};

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		return getBaseList.execute(values);
	}

	protected class GetBaseList extends MappingSqlQuery {
		protected GetBaseList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.cityland.getBaseList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			CitylandBean bean = new CitylandBean();
			bean.setRN(String.valueOf(rownum + 1));
			bean.setPP_SN(rs.getString("PP_SN"));
			bean.setACCOUNT_N(rs.getString("ACCOUNT_N"));
			bean.setACQ_DAY(StringUtil.addDash(rs.getString("ACQ_DAY")));
			bean.setLAND_ADDR(rs.getString("LAND_ADDR"));
			bean.setPP_CLASS_N(rs.getString("PP_CLASS_N"));
			bean.setPP_CNT(rs.getString("PP_CNT"));
			bean.setAMT(StringUtil.insertComma2(rs.getString("P_AMT")));
			bean.setPP_NAME(rs.getString("P_NAME"));
			bean.setOWNER_N(rs.getString("OWNER_N"));
			bean.setUSE_N(rs.getString("USE_N"));
			bean.setADMI_N(rs.getString("ADMI_N"));
			bean.setPP_AREA(String.valueOf(rs.getFloat("PP_AREA")));
			bean.setOWN_CITY_N(rs.getString("OWN_CITY_N"));

			return bean;
		}
	}
	
	// 재산이력 리스트 조회
	public List getHistoryList(CitylandBean searchBean) {
		GetHistoryList getHistoryList = new GetHistoryList(getDataSource());

		Object[] values = { searchBean.getPP_CLASS(), searchBean.getGU_CD(),
				searchBean.getDONG_CD(), searchBean.getBUNJI(),
				searchBean.getSTART_P_AMT(), searchBean.getEND_P_AMT()};

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		return getHistoryList.execute(values);
	}

	protected class GetHistoryList extends MappingSqlQuery {
		protected GetHistoryList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.cityland.getHistoryList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			CitylandBean bean = new CitylandBean();
			bean.setRN(String.valueOf(rownum + 1));
			bean.setPP_SN(rs.getString("PP_SN"));
			bean.setACQ_DAY(StringUtil.addDash(rs.getString("ACQ_DAY")));
			bean.setLAND_ADDR(rs.getString("LAND_ADDR"));
			bean.setPP_CLASS_N(rs.getString("PP_CLASS_N"));
			bean.setPP_CNT(rs.getString("PP_CNT"));
			bean.setAMT(StringUtil.insertComma2(rs.getString("P_AMT")));
			
			return bean;
		}
	}
	
	
	//재산이력 상세 리스트 조회
	public List getHistoryDetailList(String PP_SN){
		GetHistoryDetailList getHistoryDetailList = new GetHistoryDetailList(getDataSource());

		Object[] values = {PP_SN};

		return getHistoryDetailList.execute(values);
	}

	protected class GetHistoryDetailList extends MappingSqlQuery {
		protected GetHistoryDetailList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.cityland.getHistoryDetailList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			CitylandBean bean = new CitylandBean();
			
			bean.setPP_SN(rs.getString("PP_SN"));
			bean.setAPPLY_DAY(StringUtil.addDash(rs.getString("APPLY_DAY")));
			bean.setHISTORY_SN(rs.getString("HISTORY_SN"));
			bean.setTTL_YEAR(rs.getString("TTL_YEAR"));
			bean.setHISTORY_N(rs.getString("HISTORY_N"));
			bean.setBEFOR_VALUE(rs.getString("BEFOR_VALUE"));
			bean.setAFTER_VALUE(rs.getString("AFTER_VALUE"));
			bean.setHISTORY_NOTE(rs.getString("HISTORY_NOTE"));
			
			return bean;
		}
	}
	
	
	
	// 재산구분코드
	public List getPermissCode() {
		GetPermissCode getPermissCode = new GetPermissCode(getDataSource());
		return getPermissCode.execute();
	}

	protected class GetPermissCode extends MappingSqlQuery {
		protected GetPermissCode(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.cityland.getPermissCode"));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			CodeBean bean = new CodeBean();
			bean.setCD(rs.getString("CD"));
			bean.setNM(rs.getString("NM"));

			return bean;
		}
	}

	// 재산용도구분코드
	public List getUseCode() {
		GetUseCode getUseCode = new GetUseCode(getDataSource());
		return getUseCode.execute();
	}

	protected class GetUseCode extends MappingSqlQuery {
		protected GetUseCode(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.cityland.getUseCode"));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			CodeBean bean = new CodeBean();
			bean.setCD(rs.getString("CD"));
			bean.setNM(rs.getString("NM"));

			return bean;
		}
	}

	// 행정재산용도구분코드
	public List getAdmiCode() {
		GetAdmiCode getAdmiCode = new GetAdmiCode(getDataSource());
		return getAdmiCode.execute();
	}

	protected class GetAdmiCode extends MappingSqlQuery {
		protected GetAdmiCode(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.cityland.getAdmiCode"));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			CodeBean bean = new CodeBean();
			bean.setCD(rs.getString("CD"));
			bean.setNM(rs.getString("NM"));

			return bean;
		}
	}

	// 회계구분코드
	public List getAccountCode() {
		GetAccountCode getAccountCode = new GetAccountCode(getDataSource());
		return getAccountCode.execute();
	}

	protected class GetAccountCode extends MappingSqlQuery {
		protected GetAccountCode(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.cityland.getAccountCode"));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			CodeBean bean = new CodeBean();
			bean.setCD(rs.getString("CD"));
			bean.setNM(rs.getString("NM"));

			return bean;
		}
	}

	// 관리자구분코드
	public List getMainManaCode() {
		GetMainManaCode getMainManaCode = new GetMainManaCode(getDataSource());
		return getMainManaCode.execute();
	}

	protected class GetMainManaCode extends MappingSqlQuery {
		protected GetMainManaCode(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.cityland.getMainManaCode"));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			CodeBean bean = new CodeBean();
			bean.setCD(rs.getString("CD"));
			bean.setNM(rs.getString("NM"));

			return bean;
		}
	}
}
