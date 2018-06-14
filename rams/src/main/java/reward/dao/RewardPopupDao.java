package main.java.reward.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import main.java.common.dao.RamsJdbcDaoSupport;
import main.java.reward.model.RewardBean;
import main.java.reward.model.RewardLandBean;
import main.java.reward.model.RewardOwnBean;
import main.java.reward.model.RewardReviewBean;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

public class RewardPopupDao extends RamsJdbcDaoSupport implements IRewardPopupDao {
	protected void initDao() throws Exception {
		super.initDao();
	}
	
	//팝업삭제
	public void setPopLandRewardDel(String compeId, String pnu) {
		
		SetPopLandRewardDel setPopLandRewardDel = new SetPopLandRewardDel(getDataSource());
		
		Object[] values = {compeId,pnu};
		
		setPopLandRewardDel.update(values);
	}
	
	class SetPopLandRewardDel extends SqlUpdate {
		public SetPopLandRewardDel(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.setPopLandRewardDel"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	
	//팝업 landReward 입력
	public void setPopLandRewardInsert(RewardLandBean bean) {
		SetPopLandRewardInsert setPopLandRewardInsert = new SetPopLandRewardInsert(getDataSource());
		Object[] values = {
				bean.getPNU(),
				bean.getCOMPEID(),
				"2",					//대표여부
				bean.getTOTAREA(),
				bean.getAFFAIRAREA(),
				bean.getJIMOK(),
				bean.getTOTPRICE(),
				bean.getREGIID(),
		};
		
		for (int i = 0; i < values.length; i++) {
			System.out.println("setPopLandRewardInsert:::"+values[i]);
		};
		
		setPopLandRewardInsert.update(values);
	}
	
	class SetPopLandRewardInsert extends SqlUpdate {
		public SetPopLandRewardInsert(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.setPopLandRewardInsert"));
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
	
	//팝업 landReward 조회
	public List getPopLandRewardList(String compeId, String pnu) {
		GetPopLandSuitList getPopLandSuitList = new GetPopLandSuitList(getDataSource());
    		    		
		Object[] values = {
				compeId,
				pnu
				};
		
		return getPopLandSuitList.execute(values);
	} 
	    
    protected class GetPopLandSuitList extends MappingSqlQuery
    {
        protected GetPopLandSuitList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getPopLandRewardList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RewardLandBean bean = new RewardLandBean();

	        bean.setPNU(rs.getString("PNU"));
	        bean.setCOMPEID(rs.getString("COMPEID"));
	        bean.setISREPRESENT(rs.getString("ISREPRESENT"));
	        bean.setTOTAREA(rs.getString("TOTAREA"));
	        bean.setAFFAIRAREA(rs.getString("AFFAIRAREA"));
	        bean.setJIMOK(rs.getString("JIMOK"));
	        bean.setISFIXED(rs.getString("ISFIXED"));
	        bean.setUNITPRICE(rs.getString("UNITPRICE"));
	        bean.setISTARGET(rs.getString("ISTARGET"));
	        bean.setISCOMPENSATE(rs.getString("ISCOMPENSATE"));
	        bean.setREASON(rs.getString("REASON"));
	        bean.setETC(rs.getString("ETC"));
	        bean.setLANDGUBUN(rs.getString("LANDGUBUN"));
	        bean.setLANDDETAIL(rs.getString("LANDDETAIL"));
	        bean.setREGISTDATE(rs.getString("REGISTDATE"));
	        bean.setREGISTID(rs.getString("REGISTID"));
	        bean.setTOTPRICE(rs.getString("TOTPRICE"));
	        bean.setTOTJIBUN(rs.getString("TOTJIBUN"));
	        bean.setREQJIBUN(rs.getString("REQJIBUN"));
	        bean.setLAND_ADDR(rs.getString("LAND_ADDR"));
	        
        	return	bean;
        }
    }

	// 토지소유현황 조회
    public List getRewardOwnPopList(RewardBean searchBean, String currentPage, String countPerPage, String ownGubun) {
    	
	 	String srh = "시흥~중림선";
    	
    	if("TOTAL".equals(ownGubun)){
    		
    		GetRewardOwnPopTotList getRewardOwnPopTotList = new GetRewardOwnPopTotList(getDataSource());
    		Object[] values = {
					srh,
					srh,
    				currentPage,
    				countPerPage,
    				countPerPage,
    		};
    		return getRewardOwnPopTotList.execute(values);
    		
    	}else if("ETC".equals(ownGubun)){
		
	    	GetRewardOwnPopEtcList getRewardOwnPopEtcList = new GetRewardOwnPopEtcList(getDataSource());
			Object[] values = {
					srh,
					srh,
					currentPage,
					countPerPage,
					countPerPage,
			};		
			return getRewardOwnPopEtcList.execute(values);
		
    	}else{
    		
        	GetRewardOwnPopList getRewardOwnPopList = new GetRewardOwnPopList(getDataSource());
    		Object[] values = {
    				ownGubun,		//구분
    				srh,
    				ownGubun,		//구분
    				srh,
    				currentPage,
    				countPerPage,
    				countPerPage,
    		};
    		
    		for (int i = 0; i < values.length; i++) {
    			System.out.println("토지소유현황 - 토지소유현황 조회 일반 :" + values[i]);
    		}
    		
    		return getRewardOwnPopList.execute(values);
    	}
	} 
    
    protected class GetRewardOwnPopList extends MappingSqlQuery
    {
        protected GetRewardOwnPopList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getRewardOwnPopList"));
          	
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
        	RewardOwnBean bean = new RewardOwnBean();
        	
        	bean.setCNT(rs.getString("CNT"));
        	bean.setPNU(rs.getString("PNU"));
        	bean.setSI_NM(rs.getString("SI_NM"));
        	bean.setGU_NM(rs.getString("GU_NM"));
        	bean.setBJ_NM(rs.getString("BJ_NM"));
        	bean.setBONBUN(rs.getString("BONBUN"));
        	bean.setBUBUN(rs.getString("BUBUN"));
        	bean.setROADNAME(rs.getString("ROADNAME"));
        	bean.setOWN(rs.getString("OWN"));
        	bean.setREPORT(rs.getString("REPORT"));

        	return	bean;
        }
	}

    protected class GetRewardOwnPopTotList extends MappingSqlQuery
    {
        protected GetRewardOwnPopTotList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getRewardOwnPopTotList"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));				
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RewardOwnBean bean = new RewardOwnBean();

        	bean.setCNT(rs.getString("CNT"));
        	bean.setPNU(rs.getString("PNU"));
        	bean.setSI_NM(rs.getString("SI_NM"));
        	bean.setGU_NM(rs.getString("GU_NM"));
        	bean.setBJ_NM(rs.getString("BJ_NM"));
        	bean.setBONBUN(rs.getString("BONBUN"));
        	bean.setBUBUN(rs.getString("BUBUN"));
        	bean.setROADNAME(rs.getString("ROADNAME"));
        	bean.setOWN(rs.getString("OWN"));
        	bean.setREPORT(rs.getString("REPORT"));

        	return	bean;
        }
	}
    
    protected class GetRewardOwnPopEtcList extends MappingSqlQuery
    {
        protected GetRewardOwnPopEtcList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getRewardOwnPopEtcList"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));				
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RewardOwnBean bean = new RewardOwnBean();
        	
        	bean.setCNT(rs.getString("CNT"));
        	bean.setPNU(rs.getString("PNU"));
        	bean.setSI_NM(rs.getString("SI_NM"));
        	bean.setGU_NM(rs.getString("GU_NM"));
        	bean.setBJ_NM(rs.getString("BJ_NM"));
        	bean.setBONBUN(rs.getString("BONBUN"));
        	bean.setBUBUN(rs.getString("BUBUN"));
        	bean.setROADNAME(rs.getString("ROADNAME"));
        	bean.setOWN(rs.getString("OWN"));
        	bean.setREPORT(rs.getString("REPORT"));

        	return	bean;
        }
	}
}
