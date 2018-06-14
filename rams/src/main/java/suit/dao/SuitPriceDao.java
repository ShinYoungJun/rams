package main.java.suit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import main.java.common.dao.RamsJdbcDaoSupport;
import main.java.common.util.StringUtil;
import main.java.suit.model.SuitPriceBean;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

public class SuitPriceDao extends  RamsJdbcDaoSupport implements ISuitPriceDao  {
	
	protected void initDao() throws Exception {
		super.initDao();
	}
	
	public List getSuitPriceList(SuitPriceBean searchBean,String currentPage,String countPerPage) {
		GetSuitPriceList getSuitPriceList = new GetSuitPriceList(getDataSource());
	    		    		
		Object[] values = {
				searchBean.getNAME(),
				searchBean.getAFFAIRNUM(),
				currentPage,
				countPerPage,
				countPerPage
		};
		
		for(int i = 0 ; i < values.length ; i ++){
			System.out.println("getSuitPriceList::"+values[i]);
		}
		
		
		return getSuitPriceList.execute(values);
	} 
    
    protected class GetSuitPriceList extends MappingSqlQuery
    {
        protected GetSuitPriceList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.getSuitPriceList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SuitPriceBean bean = new SuitPriceBean();
        	
        	bean.setAFFAIRNUM(rs.getString("AFFAIRNUM"));
        	bean.setLAWSUITPRICE(StringUtil.insertComma2(rs.getString("LAWSUITPRICE")));
        	bean.setPNU(rs.getString("PNU"));
        	bean.setSUM(StringUtil.insertComma2(rs.getString("SUM")));
        	bean.setCHGDATE(StringUtil.addDash(rs.getString("CHGDATE")));
        	bean.setREGISTDATE(StringUtil.addDash(rs.getString("REGISTDATE")));
        	bean.setNAME(rs.getString("NAME"));
        	bean.setSUITLAND(rs.getString("SUITLAND"));
        	
        	return	bean;
        }
    }
    
	public int getSuitPriceCount(SuitPriceBean searchBean){
		Object[] values = {
				searchBean.getNAME(),
				searchBean.getAFFAIRNUM()
		};
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.suit.getSuitPriceCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}
	
	public List getSuitPriceView(String affairNum,String pnu){
		GetSuitPriceView getSuitPriceView = new GetSuitPriceView(getDataSource());
		
		Object[] values = {affairNum,pnu};
		
		return getSuitPriceView.execute(values);
	} 
    
    protected class GetSuitPriceView extends MappingSqlQuery
    {
        protected GetSuitPriceView(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.getSuitPriceView"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SuitPriceBean bean = new SuitPriceBean();
        	
	        bean.setAFFAIRNUM(rs.getString("AFFAIRNUM"));
	        bean.setAFFAIRNAME(rs.getString("AFFAIRNAME"));
	        bean.setLAWSUITAREA(rs.getString("LAWSUITAREA"));
	        bean.setPNU(rs.getString("PNU"));
	        bean.setLAWSUITPRICE(StringUtil.insertComma2(rs.getString("LAWSUITPRICE")));
	        bean.setUNITCOST(StringUtil.insertComma2(rs.getString("UNITCOST")));
	        bean.setSUM(StringUtil.insertComma2(rs.getString("SUM")));
	        bean.setSUITLAND(rs.getString("SUITLAND"));
	        bean.setUNFAIRPROFIT(StringUtil.insertComma2(rs.getString("UNFAIRPROFIT")));

        	
        	return	bean;
        }
    }
	
	public List getSuitPriceViewList(String affairNum,String pnu){
		GetSuitPriceViewList getSuitPriceViewList = new GetSuitPriceViewList(getDataSource());
		
		Object[] values = {affairNum,pnu};
		
		return getSuitPriceViewList.execute(values);
	} 
    
    protected class GetSuitPriceViewList extends MappingSqlQuery
    {
        protected GetSuitPriceViewList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.suit.getSuitPriceViewList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SuitPriceBean bean = new SuitPriceBean();
        	
	        bean.setAFFAIRNUM(rs.getString("AFFAIRNUM"));
	        bean.setLAWSUITSEQ(rs.getString("LAWSUITSEQ"));
	        bean.setPNU(rs.getString("PNU"));
	        bean.setSOURCE(rs.getString("SOURCE"));
	        bean.setUNFAIRPROFIT(StringUtil.insertComma2(rs.getString("UNFAIRPROFIT")));
	        bean.setSTARTDAY(StringUtil.addDash(rs.getString("STARTDAY")));
	        bean.setENDDAY(StringUtil.addDash(rs.getString("ENDDAY")));
	        bean.setRATE(rs.getString("RATE"));
	        bean.setDAYCNT(rs.getString("DAYCNT"));
	        bean.setSUM(StringUtil.insertComma2(rs.getString("SUM")));
	        bean.setCHGDATE(StringUtil.addDash(rs.getString("CHGDATE")));
	        bean.setREGISTDATE(StringUtil.addDash(rs.getString("REGISTDATE")));
	        bean.setISFINAL(rs.getString("ISFINAL"));
	        bean.setUNFAIRNUM(rs.getString("UNFAIRNUM"));
	        bean.setGUBUN(rs.getString("GUBUN"));
	        bean.setMONTHFARE(rs.getString("MONTHFARE"));
	        bean.setMONTHCNT(rs.getString("MONTHCNT"));

        	
        	return	bean;
        }
    }
    
    
	// 소가 및 부당이득금 수정
	public void setSuitPriceViewModify(String lawsuitPrice,String unfairProfit,String affairNum) {
		SetSuitPriceViewModify setSuitPriceViewModify = new SetSuitPriceViewModify(getDataSource());
		Object[] values = {lawsuitPrice,unfairProfit,affairNum};
		setSuitPriceViewModify.update(values);
	}
	
	

	class SetSuitPriceViewModify extends SqlUpdate {
		public SetSuitPriceViewModify(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.setSuitPriceViewModify"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	// 부당이득금 이윤 리스트 수정
	public void setSuitPriceViewListReCal(String unfairProfit,String affairNum,String pnu) {
		SetSuitPriceViewListReCal setSuitPriceViewListReCal = new SetSuitPriceViewListReCal(getDataSource());
		Object[] values = {unfairProfit,unfairProfit,affairNum,pnu};
		setSuitPriceViewListReCal.update(values);
	}
	
	

	class SetSuitPriceViewListReCal extends SqlUpdate {
		public SetSuitPriceViewListReCal(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.setSuitPriceViewListReCal"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	
	// 부당이득금 이윤 수정
	public void setSuitPriceViewListModify(SuitPriceBean bean) {
		SetSuitPriceViewListModify setSuitPriceViewListModify = new SetSuitPriceViewListModify(getDataSource());
		Object[] values = {
				bean.getSTARTDAY(),
				bean.getENDDAY(),
				bean.getRATE(),
				bean.getDAYCNT(),
				bean.getSUM(),
				bean.getAFFAIRNUM(),
				bean.getPNU(),
				bean.getLAWSUITSEQ()
		};
		setSuitPriceViewListModify.update(values);
	}
	
	class SetSuitPriceViewListModify extends SqlUpdate {
		public SetSuitPriceViewListModify(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.setSuitPriceViewListModify"));
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
	
	// 부당이득금 이윤 추가
	public void setSuitPriceViewListAdd(SuitPriceBean bean) {
		SetSuitPriceViewListAdd setSuitPriceViewListAdd = new SetSuitPriceViewListAdd(getDataSource());
		Object[] values = {
				bean.getAFFAIRNUM(),
				bean.getPNU(),
				bean.getUNFAIRPROFIT(),
				bean.getSTARTDAY(),
				bean.getENDDAY(),
				bean.getRATE(),
				bean.getDAYCNT(),
				bean.getSUM()
		};
		setSuitPriceViewListAdd.update(values);
	}
	
	class SetSuitPriceViewListAdd extends SqlUpdate {
		public SetSuitPriceViewListAdd(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.setSuitPriceViewListAdd"));
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
	
	
	// 부당이득금 이윤 삭제
	public void setSuitPriceViewListRemove(String affairNum, String pnu, String lawsuitSeq) {
		SetSuitPriceViewListRemove setSuitPriceViewListRemove = new SetSuitPriceViewListRemove(getDataSource());
		Object[] values = {affairNum,pnu,lawsuitSeq};
		setSuitPriceViewListRemove.update(values);
	}
	
	class SetSuitPriceViewListRemove extends SqlUpdate {
		public SetSuitPriceViewListRemove(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.suit.setSuitPriceViewListRemove"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

}
