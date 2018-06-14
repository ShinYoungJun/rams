package main.java.map.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import main.java.common.dao.RamsJdbcDaoSupport;
import main.java.map.model.ConstBean;
import main.java.map.model.GosiBean;
import main.java.map.model.LayerBean;
import main.java.map.model.SiGuBean;
import main.java.map.model.SuitBean;
import main.java.map.model.T_PNUBean;
import main.java.map.model.UQ160_Bean;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

public class MapDao extends RamsJdbcDaoSupport implements IMapDao {
	protected void initDao() throws Exception {
		super.initDao();
	}
	
	//Querys.map.juckji_gucodepublic
	public List getGuCodeList() {
		
		 GetGuCodeList getGuCodeList= new GetGuCodeList(getDataSource());
		
		return getGuCodeList.execute();
		
	}
	
    protected class GetGuCodeList extends MappingSqlQuery
    {
        protected GetGuCodeList (DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.map.juckji_gucode"));
		
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SiGuBean bean = new SiGuBean ();
        	
        	bean.setGU_CD(rs.getString("GU_CD"));
        	bean.setGU_NM(rs.getString("GU_NM"));
        	
        	return	bean;
        }
    }
    
	public List getOwnGubunList() {
		
		GetOwnGubunList getOwnGubunList = new GetOwnGubunList(getDataSource());
		
		return getOwnGubunList .execute();
		
	}
	
    protected class GetOwnGubunList extends MappingSqlQuery
    {
        protected GetOwnGubunList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.map.juckji_owngubunlist"));
		
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	T_PNUBean bean = new T_PNUBean();
        	
        	bean.setOWNGUBUN(rs.getString("CODEVALUE"));
        	bean.setCODEDESC(rs.getString("CODEDESC"));
              	
        	System.out.println(bean.getCODEDESC());
        	return	bean;
        }
    }
    
	public List getJimokList() {
		
		GetJimokList getJimokList = new GetJimokList(getDataSource());
		
		return getJimokList.execute();
		
	}
	
    protected class GetJimokList extends MappingSqlQuery
    {
        protected GetJimokList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.map.juckji_jimoklist"));
		
          	
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	T_PNUBean bean = new T_PNUBean();
        	
        	bean.setJIMOK(rs.getString("CODEVALUE"));
        	bean.setCODEDESC(rs.getString("CODEDESC"));
        	
        	return	bean;
        }
    }
    
    public List getBJDongList(String GU_CD){
    
    Object[] values = {
    	GU_CD
    };
    	GetBJDongList getBJDongList = new GetBJDongList(getDataSource());
    	
    	return getBJDongList.execute(values);
    	
    }
    
    protected class GetBJDongList extends MappingSqlQuery
    {
        protected GetBJDongList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.map.getBJDongList"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
		
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SiGuBean bean = new SiGuBean();
        	
        	bean.setBJ_CD(rs.getString("BJ_CD"));
        	bean.setBJ_NM(rs.getString("BJ_NM"));
        	
        	return	bean;
        }
    }
    
public List getRoadNameList() {
		
	GetRoadNameList getRoadNameList = new GetRoadNameList(getDataSource());
		
		return getRoadNameList.execute();
		
	}
	
    protected class GetRoadNameList extends MappingSqlQuery
    {
        protected GetRoadNameList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.map.getRoadnameList"));
		
          	
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	T_PNUBean bean = new T_PNUBean();
        	
        	bean.setROADNAME(rs.getString("ROADNAME"));
        	bean.setPNU(rs.getString("PNU"));        	
        	

        	return	bean;
        }
    }
   
    
    public int getJuckJiSearchListCnt(String selectGu,String  selectDong,String  decodeRoad,String  selectOwn, String selectJi,    		
			String prevJiga,String  nextJiga, String cityPlan, String useArea, String useZone, String useRegion ){
    	
    	// cityPlan 도시계획시설
		// useArea용도구역
		//useZone 용도지역
		//useRegion 용도지구
    	
    	String result1 = "";
    	String result2 = "";
    	String result3 = "";
    	String result4 = "";
    	
    	LayerBean bean = new LayerBean();
    	
    	bean.setCOUNT_("0");
      	bean.setCOUNT_1("0");
		bean.setCOUNT_2("0");
		bean.setCOUNT_3("0");
		bean.setCOUNT_4("0");
		bean.setCOUNT_5("0");
		bean.setCOUNT_6("0");
		bean.setCOUNT_7("0");
      	bean.setCOUNT_8("0");
		bean.setCOUNT_9("0");
		bean.setCOUNT_10("0");
		bean.setCOUNT_11("0");
		bean.setCOUNT_12("0");
		bean.setCOUNT_13("0");
		bean.setCOUNT_14("0");
      	bean.setCOUNT_15("0");
		bean.setCOUNT_16("0");
		bean.setCOUNT_17("0");
		bean.setCOUNT_18("0");
		bean.setCOUNT_19("0");
		bean.setCOUNT_20("0");
		bean.setCOUNT_21("0");
		
    	
    	if(prevJiga == null || prevJiga.equals("")) prevJiga = "0";
    	if(nextJiga == null || nextJiga.equals("")) nextJiga = "9999999999";
    	if(selectGu == null || selectGu.equals("")) selectGu = "999";
    	if(selectDong == null || selectDong.equals("")) selectDong = "%";    	
    	if(selectOwn == null || selectOwn.equals("")) selectOwn = "%";
    	if(selectJi == null || selectJi.equals("")) selectJi = "%";
    	
    	
    	if(cityPlan.equals("all") || cityPlan.equals("")){
    			result4 = "%";
    	}else{
    		 if(cityPlan.equals("count_15")){
    			bean.setCOUNT_15("1");
    		}else if(cityPlan.equals("count_16")){
    			bean.setCOUNT_16("1");
    		}else if(cityPlan.equals("count_17")){
    			bean.setCOUNT_17("1");
    		}else if(cityPlan.equals("count_18")){
    			bean.setCOUNT_18("1");
    		}else if(cityPlan.equals("count_19")){
    			bean.setCOUNT_19("1");
    		}else if(cityPlan.equals("count_20")){
    			bean.setCOUNT_20("1");
    		}else if(cityPlan.equals("count_21")){
    			bean.setCOUNT_21("1");
    		}
    		 
    		 result4 = bean.getCOUNT_15()+bean.getCOUNT_16()+bean.getCOUNT_17()+bean.getCOUNT_18()+bean.getCOUNT_19()+bean.getCOUNT_20()+bean.getCOUNT_21();
    	}
    		 
    	if(useArea.equals("all") || useArea.equals("")){
    			result1 = "%";
    	}else{
    			
    		if(useArea.equals("count_")){
    			bean.setCOUNT_("1");
    		}
    	}
    	
    	 if(useZone.equals("all") || useZone.equals("")){
    			result2 = "%";
    		}else {
    			if(useZone.equals("count_1")){    		
    			bean.setCOUNT_1("1");
    		}else if(useZone.equals("count_2")){
    			bean.setCOUNT_2("1");
    		}else if(useZone.equals("count_3")){
    			bean.setCOUNT_3("1");
    		}else if(useZone.equals("count_4")){
    			bean.setCOUNT_4("1");
    		}
    			result2 = bean.getCOUNT_1()+bean.getCOUNT_2()+bean.getCOUNT_3()+bean.getCOUNT_4();
    	}
    	 
    	 
    		 if(useRegion.equals("all") || useRegion.equals("")){
    			 result3 = "%";
    		}else{ 
	    			if(useRegion.equals("count_5")){
	    			bean.setCOUNT_5("1");
		    		}else if(useRegion.equals("count_6")){
		    			bean.setCOUNT_6("1");
		    		}else if(useRegion.equals("count_7")){
		    			bean.setCOUNT_7("1");
		    		}else if(useRegion.equals("count_8")){
		    			bean.setCOUNT_8("1");
		    		}else if(useRegion.equals("count_9")){
		    			bean.setCOUNT_9("1");
		    		}else if(useRegion.equals("count_10")){
		    			bean.setCOUNT_10("1");
		    		}else if(useRegion.equals("count_11")){
		    			bean.setCOUNT_11("1");
		    		}else if(useRegion.equals("count_12")){
		    			bean.setCOUNT_12("1");
		    		}else if(useRegion.equals("count_13")){
		    			bean.setCOUNT_13("1");
		    		}else if(useRegion.equals("count_14")){
		    			bean.setCOUNT_14("1");
		    		}
	    			result3 = bean.getCOUNT_5()+bean.getCOUNT_6()+bean.getCOUNT_7()+bean.getCOUNT_8()+bean.getCOUNT_9()+bean.getCOUNT_10()+bean.getCOUNT_11()
	    			+bean.getCOUNT_12()+bean.getCOUNT_13()+bean.getCOUNT_14();
    		}
    	
    System.out.println("reslut1 : "+result1);
    System.out.println("reslut2 : "+result2);
    System.out.println("reslut3 : "+result3);
    System.out.println("reslut4 : "+result4);
    	
    	
    	Object[] values = {
    			decodeRoad,
    			"11"+selectGu, //서울시코드 + 구코드
    			selectDong,    			
    			selectOwn,
    			selectJi,
    			result1,
    			result2,
    			result3,
    			result4,    			
    			prevJiga,
    			nextJiga  			
    	};
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.map.JuckJiSearchListCnt");
    	
    	int returnNum = getJdbcTemplate().queryForInt(sql, values);
    	return returnNum;
    		
    	}
    	
       
    
    
    //JuckJiSearchList
    
    public List getJuckJiSearchList(String selectGu,String  selectDong,String  decodeRoad,String  selectOwn, String selectJi,
			String prevJiga,String  nextJiga,String startNum, String endNum, String cityPlan, String useArea, String useZone, String useRegion){
		
    	// cityPlan 도시계획시설
		// useArea용도구역
		//useZone 용도지역
		//useRegion 용도지구
    	
    	String result1 = "";
    	String result2 = "";
    	String result3 = "";
    	String result4 = "";
    	
    	LayerBean bean = new LayerBean();
    	
    	bean.setCOUNT_("0");
      	bean.setCOUNT_1("0");
		bean.setCOUNT_2("0");
		bean.setCOUNT_3("0");
		bean.setCOUNT_4("0");
		bean.setCOUNT_5("0");
		bean.setCOUNT_6("0");
		bean.setCOUNT_7("0");
      	bean.setCOUNT_8("0");
		bean.setCOUNT_9("0");
		bean.setCOUNT_10("0");
		bean.setCOUNT_11("0");
		bean.setCOUNT_12("0");
		bean.setCOUNT_13("0");
		bean.setCOUNT_14("0");
      	bean.setCOUNT_15("0");
		bean.setCOUNT_16("0");
		bean.setCOUNT_17("0");
		bean.setCOUNT_18("0");
		bean.setCOUNT_19("0");
		bean.setCOUNT_20("0");
		bean.setCOUNT_21("0");
    	
    	if(prevJiga == null || prevJiga.equals("")) prevJiga = "0";
    	if(nextJiga == null || nextJiga.equals("")) nextJiga = "9999999999";
    	if(selectGu == null || selectGu.equals("")) selectGu = "999";
    	if(selectDong == null || selectDong.equals("")) selectDong = "%";    	
    	if(selectOwn == null || selectOwn.equals("")) selectOwn = "%";
    	if(selectJi == null || selectJi.equals("")) selectJi = "%";
    	
  
    	if(cityPlan.equals("all") || cityPlan.equals("")){
			result4 = "%";
	}else{
		 if(cityPlan.equals("count_15")){
			bean.setCOUNT_15("1");
		}else if(cityPlan.equals("count_16")){
			bean.setCOUNT_16("1");
		}else if(cityPlan.equals("count_17")){
			bean.setCOUNT_17("1");
		}else if(cityPlan.equals("count_18")){
			bean.setCOUNT_18("1");
		}else if(cityPlan.equals("count_19")){
			bean.setCOUNT_19("1");
		}else if(cityPlan.equals("count_20")){
			bean.setCOUNT_20("1");
		}else if(cityPlan.equals("count_21")){
			bean.setCOUNT_21("1");
		}
		 
		 result4 = bean.getCOUNT_15()+bean.getCOUNT_16()+bean.getCOUNT_17()+bean.getCOUNT_18()+bean.getCOUNT_19()+bean.getCOUNT_20()+bean.getCOUNT_21();
	}
		 
	if(useArea.equals("all") || useArea.equals("")){
			result1 = "%";
	}else{
			
		if(useArea.equals("count_")){
			bean.setCOUNT_("1");
		}
	}
	
	 if(useZone.equals("all") || useZone.equals("")){
			result2 = "%";
		}else {
			if(useZone.equals("count_1")){    		
			bean.setCOUNT_1("1");
		}else if(useZone.equals("count_2")){
			bean.setCOUNT_2("1");
		}else if(useZone.equals("count_3")){
			bean.setCOUNT_3("1");
		}else if(useZone.equals("count_4")){
			bean.setCOUNT_4("1");
		}
			result2 = bean.getCOUNT_1()+bean.getCOUNT_2()+bean.getCOUNT_3()+bean.getCOUNT_4();
	}
	 
	 
		 if(useRegion.equals("all") || useRegion.equals("")){
			 result3 = "%";
		}else{ 
    			if(useRegion.equals("count_5")){
    			bean.setCOUNT_5("1");
	    		}else if(useRegion.equals("count_6")){
	    			bean.setCOUNT_6("1");
	    		}else if(useRegion.equals("count_7")){
	    			bean.setCOUNT_7("1");
	    		}else if(useRegion.equals("count_8")){
	    			bean.setCOUNT_8("1");
	    		}else if(useRegion.equals("count_9")){
	    			bean.setCOUNT_9("1");
	    		}else if(useRegion.equals("count_10")){
	    			bean.setCOUNT_10("1");
	    		}else if(useRegion.equals("count_11")){
	    			bean.setCOUNT_11("1");
	    		}else if(useRegion.equals("count_12")){
	    			bean.setCOUNT_12("1");
	    		}else if(useRegion.equals("count_13")){
	    			bean.setCOUNT_13("1");
	    		}else if(useRegion.equals("count_14")){
	    			bean.setCOUNT_14("1");
	    		}
    			result3 = bean.getCOUNT_5()+bean.getCOUNT_6()+bean.getCOUNT_7()+bean.getCOUNT_8()+bean.getCOUNT_9()+bean.getCOUNT_10()+bean.getCOUNT_11()
    			+bean.getCOUNT_12()+bean.getCOUNT_13()+bean.getCOUNT_14();
		}
    	
		 	System.out.println("reslut1 : "+result1);
		    System.out.println("reslut2 : "+result2);
		    System.out.println("reslut3 : "+result3);
		    System.out.println("reslut4 : "+result4);
    	
    	Object[] values = {
    			decodeRoad,
    			"11"+selectGu, //서울시코드 + 구코드
    			selectDong,    			
    			selectOwn,
    			selectJi,
    			result1,
    			result2,
    			result3,
    			result4,
    			prevJiga,
    			nextJiga,
    			startNum,
    			endNum
    			
    	};
    	
    	GetJuckJiSearchList getJuckJiSearchList = new GetJuckJiSearchList (getDataSource());
    		
    		return getJuckJiSearchList.execute(values);
    		
    	}
    	
        protected class GetJuckJiSearchList extends MappingSqlQuery
        {
            protected GetJuckJiSearchList(DataSource ds)
            {
              	super(ds, getMessageSourceAccessor().getMessage("Querys.map.JuckJiSearchList"));
              	
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
            
            protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
            {
            	T_PNUBean bean = new T_PNUBean();
            	
            	bean.setDONGCODE(rs.getString("BJ_NM"));
            	bean.setSGGCODE(rs.getString("GU_NM"));
            	bean.setXID(rs.getString("XID"));
            	bean.setJIBUN(rs.getString("JIBUN"));
            	bean.setJIMOK(rs.getString("JIMOK"));          
            	bean.setCODEDESC(rs.getString("CODEDESC"));
            	bean.setPNU(rs.getString("PNU"));
            	            	
            	return	bean;
            }
        }
        
        public int getJuckJiGosiListCnt(String pnu){   		       	
        	
        	
        	Object[] values = {
        			pnu
        			 			
        	};
        	
        	String sql = getMessageSourceAccessor().getMessage("Querys.map.JuckJiGosiListCnt");
        	
        	int returnNum = getJdbcTemplate().queryForInt(sql, values);
        	return returnNum;
        		
        	}
        
        //
        
        public List getJuckJiGosiList(String pnu){
    		
        	
        	
        	
        	Object[] values = {
        			pnu
        	};
        	
        	GetJuckJiGosiList getJuckJiGosiList = new GetJuckJiGosiList (getDataSource());
        		
        		return getJuckJiGosiList.execute(values);
        		
        	}
        	
            protected class GetJuckJiGosiList extends MappingSqlQuery
            {
                protected GetJuckJiGosiList(DataSource ds)
                {
                  	super(ds, getMessageSourceAccessor().getMessage("Querys.map.JuckJiGosiList"));
                  	
                  	declareParameter(new SqlParameter(Types.VARCHAR));
                 
        		
                  	
                }
                
                protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
                {
                	GosiBean bean = new GosiBean();
                	bean.setGOSIID(rs.getString("GOSIID"));
                	bean.setNUM(rs.getString("NUM"));
                	bean.setORG(rs.getString("ORG"));
                	bean.setPNU(rs.getString("PNU"));
                	bean.setSUBJECT(rs.getString("SUBJECT"));
                	bean.setGOSI_DATE(rs.getString("GOSI_DATE"));
                	
                	            	
                	return	bean;
                }
            }
    
            
            
            public int getJuckJiPlanListCnt(String pnu){   		       	
            	
            	
            	Object[] values = {
            			pnu
            			 			
            	};
            	
            	String sql = getMessageSourceAccessor().getMessage("Querys.map.JuckJiPlanListCnt");
            	
            	int returnNum = getJdbcTemplate().queryForInt(sql, values);
            	return returnNum;
            		
            	}
            
            public List getJuckJiPlanList(String pnu){
        		
            	
            	
            	
            	Object[] values = {
            			pnu
            	};
            	
            	GetJuckJiPlanList getJuckJiPlanList = new GetJuckJiPlanList (getDataSource());
            		
            		return getJuckJiPlanList.execute(values);
            		
            	}
            	
                protected class GetJuckJiPlanList extends MappingSqlQuery
                {
                    protected GetJuckJiPlanList(DataSource ds)
                    {
                      	super(ds, getMessageSourceAccessor().getMessage("Querys.map.JuckJiPlanList"));
                      	
                      	declareParameter(new SqlParameter(Types.VARCHAR));
                     
            		
                      	
                    }
                    
                    protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
                    {
                    	GosiBean bean = new GosiBean();
                    	bean.setGOSIID(rs.getString("SAUPNAME"));
                    	bean.setNUM(rs.getString("NUM"));
                    	bean.setORG(rs.getString("ORG"));
                    	bean.setPNU(rs.getString("PNU"));
                    	bean.setSUBJECT(rs.getString("SUBJECT"));
                    	bean.setGOSI_DATE(rs.getString("GOSI_DATE"));
                    	
                    	            	
                    	return	bean;
                    }
                }
            
        public List getJuckJiSearchView(String pnu){
        
        Object[] values = {        		
        		pnu   	
        };
        
        GetJuckJiSearchView getJuckJiSearchView = new GetJuckJiSearchView (getDataSource());
		
		return getJuckJiSearchView.execute(values);
		
	}
	
    protected class GetJuckJiSearchView extends MappingSqlQuery
    {
        protected GetJuckJiSearchView(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.map.JuckJiSearchView"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
           	
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	T_PNUBean bean = new T_PNUBean();
        	
        	bean.setAREA(rs.getString("AREA"));
        	bean.setJIGA(rs.getString("JIGA"));
        	bean.setDONGCODE(rs.getString("ADDRESS"));
        	bean.setJIBUN(rs.getString("JIBUN"));
        	bean.setCODEDESC(rs.getString("CODEDESC"));
      	
        	return	bean;
        }
    }
    
    
 public List getJuckJiSearchPopView(String pnu){
        
        Object[] values = {        		
        		pnu   	
        };
        
        GetJuckJiSearchPopView getJuckJiSearchPopView = new GetJuckJiSearchPopView  (getDataSource());
		
		return getJuckJiSearchPopView.execute(values);
		
	}
	
    protected class GetJuckJiSearchPopView  extends MappingSqlQuery
    {
        protected GetJuckJiSearchPopView (DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.map.JuckJiSearchPopView"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
           	
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	GosiBean bean = new GosiBean();
        	
        	bean.setGOSIID(rs.getString("GOSIID"));
        	bean.setORG(rs.getString("ORG"));        	
        	bean.setSUBJECT(rs.getString("SUBJECT"));
        	bean.setGOSI_DATE(rs.getString("GOSI_DATE"));
        	bean.setGUBUN(rs.getString("GUBUN"));
        	bean.setGUBUN_NM(rs.getString("CODEDESC"));
        	bean.setOTHER(rs.getString("OTHER"));
        	bean.setGOSIFILE(rs.getString("GOSIFILE"));
        	
      	
        	return	bean;
        }
    }    
    
    //
public List getJuckJiSearchDetailFrame1(String pnu){
        
        Object[] values = {        		
        		pnu   	
        };
        
        GetJuckJiSearchDetailFrame1 getJuckJiSearchDetailFrame1 = new GetJuckJiSearchDetailFrame1  (getDataSource());
		
		return getJuckJiSearchDetailFrame1.execute(values);
		
	}
	
    protected class GetJuckJiSearchDetailFrame1  extends MappingSqlQuery
    {
        protected GetJuckJiSearchDetailFrame1 (DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.map.JuckJiSearchDetailFrame1"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
           	
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	UQ160_Bean bean = new UQ160_Bean();
        	
        	bean.setGOSIID(rs.getString("GOSIID"));
        	bean.setSTATE(rs.getString("STATE"));
        	bean.setCODETEXT(rs.getString("CODETEXT"));
        	bean.setRDNUM(rs.getString("RDNUM"));
        	bean.setWIDTH(rs.getString("WIDTH"));
        	bean.setRDUSE(rs.getString("RDUSE"));
        	bean.setLEN(rs.getString("LEN"));
        	bean.setLNSTART(rs.getString("LNSTART"));
        	bean.setLNEND(rs.getString("LNEND"));
        	bean.setRDTYPE(rs.getString("RDTYPE"));
        	
        	bean.setCODETEXT(rs.getString("LNVIA"));
        	bean.setCODETEXT(rs.getString("FIRSTDATE"));
        	bean.setCODETEXT(rs.getString("OTHER"));
        	
      	
        	return	bean;
        }
    } 
    
public List getJuckJiSearchDetailFrame2(String pnu){
        
        Object[] values = {        		
        		pnu   	
        };
        
        GetJuckJiSearchDetailFrame2 getJuckJiSearchDetailFrame2 = new GetJuckJiSearchDetailFrame2  (getDataSource());
		
		return getJuckJiSearchDetailFrame2.execute(values);
		
	}
	
    protected class GetJuckJiSearchDetailFrame2 extends MappingSqlQuery
    {
        protected GetJuckJiSearchDetailFrame2 (DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.map.JuckJiSearchDetailFrame2"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
           	
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SuitBean bean = new SuitBean();
        	
        	bean.setGOSIID(rs.getString("GOSIID"));
        	bean.setLOCPNU(rs.getString("LOCPNU"));
        	bean.setOWNNAME(rs.getString("OWNNAME"));
        	bean.setOWNADDR(rs.getString("OWNADDR"));
        	bean.setRELNAME(rs.getString("RELNAME"));
        	bean.setRELADDR(rs.getString("RELADDR"));
        	bean.setGU_NM(rs.getString("GU_NM"));
        	bean.setBJ_NM(rs.getString("BJ_NM"));
        	bean.setJIBUN(rs.getString("JIBUN"));

      	
        	return	bean;
        }
    } 
    
public List getJuckJiSearchDetailFrame3(String pnu){
        
        Object[] values = {        		
        		pnu   	
        };
        
        GetJuckJiSearchDetailFrame3 getJuckJiSearchDetailFrame3 = new GetJuckJiSearchDetailFrame3(getDataSource());
		
		return getJuckJiSearchDetailFrame3.execute(values);
		
	}
	
    protected class GetJuckJiSearchDetailFrame3 extends MappingSqlQuery
    {
        protected GetJuckJiSearchDetailFrame3(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.map.JuckJiSearchDetailFrame3"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
           	
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SuitBean bean = new SuitBean();
        	
        	bean.setGOSIID(rs.getString("GOSIID"));
        	bean.setLOCPNU(rs.getString("LOCPNU"));
        	bean.setOWNNAME(rs.getString("OWNNAME"));
        	bean.setOWNADDR(rs.getString("OWNADDR"));
        	bean.setRELNAME(rs.getString("RELNAME"));
        	bean.setRELADDR(rs.getString("RELADDR"));
        	bean.setGU_NM(rs.getString("GU_NM"));
        	bean.setBJ_NM(rs.getString("BJ_NM"));
        	bean.setJIBUN(rs.getString("JIBUN"));

      	
        	return	bean;
        }
    } 
    
    
    //의사결정지원 - 소송업무지원 리스트
    
    public List getSuitBizSearchList(String selectGu,String  selectDong,String  san,String  jibun,
			String startNum, String endNum){
	 	
    	if(selectGu == null || selectGu.equals("")) selectGu = "999";
    	if(selectDong == null || selectDong.equals("")) selectDong = "%";
    	if(jibun == null || jibun.equals("")) jibun = "%";
    	    
    	Object[] values = {
    			"11"+selectGu, //서울시코드 + 구코드
    			selectDong,
    			san,   	
    			"%"+jibun+"%",    			
    			startNum,
    			endNum
    	};
    	
    	GetSuitBizSearchList getSuitBizSearchList = new GetSuitBizSearchList(getDataSource());
    		
    		return getSuitBizSearchList.execute(values);
    		
    	}
    	
        protected class GetSuitBizSearchList extends MappingSqlQuery
        {
            protected GetSuitBizSearchList(DataSource ds)
            {
              	super(ds, getMessageSourceAccessor().getMessage("Querys.map.SuitBizSearchList"));
              	
              	declareParameter(new SqlParameter(Types.VARCHAR));
              	declareParameter(new SqlParameter(Types.VARCHAR));
              	declareParameter(new SqlParameter(Types.VARCHAR));
              	declareParameter(new SqlParameter(Types.VARCHAR)); 		
              	declareParameter(new SqlParameter(Types.VARCHAR)); 		
              	declareParameter(new SqlParameter(Types.VARCHAR)); 		
              	
              	
            }
            
            protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
            {
            	T_PNUBean bean = new T_PNUBean();
            	//xid, pnu, jibun, sggcode, dongcode, jimok, gubun, gu_nm, bj_nm 
            	            	
            	bean.setDONGCODE(rs.getString("BJ_NM"));
            	bean.setSGGCODE(rs.getString("GU_NM"));
            	bean.setXID(rs.getString("XID"));
            	bean.setJIBUN(rs.getString("JIBUN"));
            	bean.setJIMOK(rs.getString("JIMOK"));          
            	bean.setCODEDESC(rs.getString("CODEDESC"));
            	bean.setPNU(rs.getString("PNU"));
            	            	
            	return	bean;
            }
        }
    

        //의사결정지원 - 소송업무지원 리스트 Count 
        
        public int getSuitBizSearchListCnt(String selectGu,String  selectDong,String  san,String  jibun){ 		       	
          	
        	if(selectGu == null || selectGu.equals("")) selectGu = "999";
        	if(selectDong == null || selectDong.equals("")) selectDong = "%";
        	if(jibun == null || jibun.equals("")) jibun = "%";
        	
        	Object[] values = {
        			"11"+selectGu,
        			selectDong,
        			san,
        			"%"+jibun+"%",    			 			
        	};
        	
        	String sql = getMessageSourceAccessor().getMessage("Querys.map.SuitBizSearchListCnt");
        	
        	int returnNum = getJdbcTemplate().queryForInt(sql, values);
        	return returnNum;
        		
        	}
        
        //Querys.map.GetUnRewardList
        //미불 보상용지분석 리스트

        public List getUnRewardReturnList(String pnu, String ownGubun){
    	 	
        	System.out.println("pnu : "+pnu);
        	System.out.println("ownGubun : "+ownGubun);
        	
        	if(ownGubun.equals("all")){
        		ownGubun = "%";
        	}
        	    
        	Object[] values = {
        			pnu,
        			ownGubun
        	};
        	
        	GetUnRewardReturnList getUnRewardReturnList = new GetUnRewardReturnList(getDataSource());
        		
        		return getUnRewardReturnList.execute(values);
        		
        	}
        	
            protected class GetUnRewardReturnList  extends MappingSqlQuery
            {
                protected GetUnRewardReturnList (DataSource ds)
                {
                  	super(ds, getMessageSourceAccessor().getMessage("Querys.map.GetUnRewardList"));
                  	
                  	declareParameter(new SqlParameter(Types.VARCHAR));
                  	declareParameter(new SqlParameter(Types.VARCHAR));
          
                  	
                  	
                }
                
                protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
                {
                	T_PNUBean bean = new T_PNUBean();
                	//xid, pnu, jibun, gu_nm, bj_nm, jimok
                	bean.setDONGCODE(rs.getString("BJ_NM"));
                	bean.setSGGCODE(rs.getString("GU_NM"));
                	bean.setXID(rs.getString("XID"));
                	bean.setJIBUN(rs.getString("JIBUN"));
                	bean.setJIMOK(rs.getString("JIMOK"));          
                	bean.setCODEDESC(rs.getString("CODEDESC"));
                	bean.setPNU(rs.getString("PNU"));
                	            	
                	return	bean;
                	
                }
            }
            
            
         
            
            //Querys.map.GetRewardList 
            //보상용지분석 리스트

            public List getRewardReturnList(String pnu){
        	 	
            	System.out.println("pnu : "+pnu);

            	Object[] values = {
            			pnu            
            	};
            	
            	GetRewardReturnList getRewardReturnList = new GetRewardReturnList(getDataSource());
            		
            		return getRewardReturnList.execute(values);
            		
            	}
            	
                protected class GetRewardReturnList  extends MappingSqlQuery
                {
                    protected GetRewardReturnList (DataSource ds)
                    {
                      	super(ds, getMessageSourceAccessor().getMessage("Querys.map.GetRewardList"));
                      	
                      	declareParameter(new SqlParameter(Types.VARCHAR));      
              
                    }
                    
                    protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
                    {
                    	T_PNUBean bean = new T_PNUBean();

                    	String jiga = rs.getString("JIGA");
                    	String area = rs.getString("AREA");
                    	
                    	if(jiga == null || jiga.equals("")) jiga = "0";
                    	if(area == null || area.equals("")) area = "0";
                    	
                    	bean.setJIGA(jiga);
                    	bean.setAREA(area);
                    	
                    	
                    	bean.setDONGCODE(rs.getString("BJ_NM"));
                    	bean.setSGGCODE(rs.getString("GU_NM"));                    	
                    	bean.setJIBUN(rs.getString("JIBUN"));
                    	bean.setJIMOK(rs.getString("JIMOK"));          
                    	bean.setCODEDESC(rs.getString("CODEDESC"));
                    	bean.setPNU(rs.getString("PNU"));
                    	
                    	bean.setOWNGUBUN(rs.getString("OWNGUBUN"));
                    		
                    	return	bean;
                    	
                    }
                }
                
                //소송정보 공사세부페이지1
                public List getSuitBizConstList1(String pnu){
            	 	
                	System.out.println("pnu : "+pnu);

                	Object[] values = {
                			pnu,
                			pnu
                	};
                	
                	GetSuitBizConstList1 getSuitBizConstList1 = new GetSuitBizConstList1 (getDataSource());
                		
                		return getSuitBizConstList1.execute(values);
                		
                	}
                	
                    protected class GetSuitBizConstList1  extends MappingSqlQuery
                    {
                        protected GetSuitBizConstList1  (DataSource ds)
                        {
                          	super(ds, getMessageSourceAccessor().getMessage("Querys.map.SuitBizConstList1"));
                          	
                          	declareParameter(new SqlParameter(Types.VARCHAR));
                          	declareParameter(new SqlParameter(Types.VARCHAR));      
                  
                        }
                        
                        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
                        {
                        	T_PNUBean bean = new T_PNUBean();

                        	String jiga = rs.getString("JIGA");
                        	String area = rs.getString("AREA");
                        	
                        	if(jiga == null || jiga.equals("")) jiga = "0";
                        	if(area == null || area.equals("")) area = "0";
            	
                        	bean.setPNU(rs.getString("PNU"));
                        	bean.setAREA(area);
                        	bean.setJIBUN(rs.getString("JIBUN"));
                        	bean.setJIMOK(rs.getString("JIMOK"));
                        	bean.setOWNGUBUN(rs.getString("OWNGUBUN"));
                        	bean.setJIGA(jiga);
                        	bean.setDONGCODE(rs.getString("ADDRESS"));
                        	
	
                        	return	bean;
                        	
                        }
                    }
                    
                    //소송정보 공사세부페이지2
                    public List getSuitBizConstList2(String pnu){
                	 	
                    	System.out.println("pnu : "+pnu);

                    	Object[] values = {
                    			pnu                    			
                    	};
                    	
                    	GetSuitBizConstList2 getSuitBizConstList2 = new GetSuitBizConstList2 (getDataSource());
                    	
                    		
                    		return getSuitBizConstList2.execute(values);
                    		
                    	}
                    	
                        protected class GetSuitBizConstList2 extends MappingSqlQuery
                        {
                            protected GetSuitBizConstList2 (DataSource ds)
                            {
                              	super(ds, getMessageSourceAccessor().getMessage("Querys.map.SuitBizConstList2"));
                              	
                              	declareParameter(new SqlParameter(Types.VARCHAR));                              	
                      
                            }
                            
                            protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
                            {
                            	ConstBean bean = new ConstBean();
                    	
                            	bean.setCONSTNUM(rs.getString("CONSTNUM"));
                            	bean.setCONSTPLACE(rs.getString("CONSTPLACE"));
                            	bean.setCONSTNAME(rs.getString("CONSTNAME"));
                            	bean.setCONSTDATE(rs.getString("CONSTDATE"));
        
                            	return	bean;
                            	
                            }
                        }
        
                        //소송정보 공사세부페이지3
                        public List getSuitBizConstList3(String constnum){
                    	 	
                        	System.out.println("CONSTNUM : "+constnum);

                        	Object[] values = {
                        			constnum
                        	};
                        	
                        	GetSuitBizConstList3 getSuitBizConstList3 = new GetSuitBizConstList3 (getDataSource());
                        	
                        		
                        		return getSuitBizConstList3.execute(values);
                        		
                        	}
                        	
                            protected class GetSuitBizConstList3 extends MappingSqlQuery
                            {
                                protected GetSuitBizConstList3 (DataSource ds)
                                {
                                  	super(ds, getMessageSourceAccessor().getMessage("Querys.map.SuitBizConstList3"));
                                  	
                                  	declareParameter(new SqlParameter(Types.VARCHAR));                              	
                          
                                }
                                
                                protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
                                {
                                	ConstBean bean = new ConstBean();
                        	
                                	
                                	bean.setCOMPANY(rs.getString("NAME"));
                                	
            
                                	return	bean;
                                	
                                }
                            }
                            
                            //소송정보 공사세부페이지4
                            
                            public List getSuitBizConstList4(String pnu){
                        	 	
                            	System.out.println("pnu: "+pnu);

                            	Object[] values = {
                            			pnu
                            	};
                            	
                            	GetSuitBizConstList4 getSuitBizConstList4 = new GetSuitBizConstList4 (getDataSource());
                            	
                            		
                            		return getSuitBizConstList4.execute(values);
                            		
                            	}
                            	
                                protected class GetSuitBizConstList4 extends MappingSqlQuery
                                {
                                    protected GetSuitBizConstList4 (DataSource ds)
                                    {
                                      	super(ds, getMessageSourceAccessor().getMessage("Querys.map.SuitBizConstList4"));
                                      	
                                      	declareParameter(new SqlParameter(Types.VARCHAR));                              	
                              
                                    }
                                    
                                    protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
                                    {
                                    	LayerBean bean = new LayerBean ();
                                    	
                                    	bean.setCOUNT_(rs.getString("COUNT_"));
                                    	bean.setCOUNT_1(rs.getString("COUNT_1"));
                                    	bean.setCOUNT_2(rs.getString("COUNT_2"));
                                    	bean.setCOUNT_3(rs.getString("COUNT_3"));
                                    	bean.setCOUNT_4(rs.getString("COUNT_4"));
                                    	bean.setCOUNT_5(rs.getString("COUNT_5"));
                                    	bean.setCOUNT_6(rs.getString("COUNT_6"));
                                    	bean.setCOUNT_7(rs.getString("COUNT_7"));
                                    	bean.setCOUNT_8(rs.getString("COUNT_8"));
                                    	bean.setCOUNT_9(rs.getString("COUNT_9"));
                                    	bean.setCOUNT_10(rs.getString("COUNT_10"));
                                    	bean.setCOUNT_11(rs.getString("COUNT_11"));
                                    	bean.setCOUNT_12(rs.getString("COUNT_12"));
                                    	bean.setCOUNT_13(rs.getString("COUNT_13"));
                                    	bean.setCOUNT_14(rs.getString("COUNT_14"));
                                    	bean.setCOUNT_15(rs.getString("COUNT_15"));
                                    	bean.setCOUNT_16(rs.getString("COUNT_16"));
                                    	bean.setCOUNT_17(rs.getString("COUNT_17"));
                                    	bean.setCOUNT_18(rs.getString("COUNT_18"));
                                    	bean.setCOUNT_19(rs.getString("COUNT_19"));
                                    	bean.setCOUNT_20(rs.getString("COUNT_20"));
                                    	bean.setCOUNT_21(rs.getString("COUNT_21"));
                                    	bean.setCOUNT_22(rs.getString("COUNT_22"));
      
                                    	return	bean;
                                    	
                                    }
                                }
                                
                                public List  getCompeid(String pnu){
                            	 	
                                	System.out.println("pnu: "+pnu);

                                	Object[] values = {
                                			pnu
                                	};
                                	
                                	GetCompeid getCompeid = new GetCompeid (getDataSource());
                                	
                                		
                                		return getCompeid.execute(values);
                                		
                                	}
                                	
                                    protected class GetCompeid extends MappingSqlQuery
                                    {
                                        protected GetCompeid (DataSource ds)
                                        {
                                          	super(ds, getMessageSourceAccessor().getMessage("Querys.map.GetCompeid"));
                                          	
                                          	declareParameter(new SqlParameter(Types.VARCHAR));                              	
                                  
                                        }
                                        
                                        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
                                        {
                                        	GosiBean bean = new GosiBean ();
                                        	
                                        	bean.setCOMPEID(rs.getString("COMPEID"));
                                        	bean.setREQDATE(rs.getString("REQDATE"));
 
                                        	return	bean;
                                        	
                                        }
                                    }
                                    
                                    public List  getAffairNum(String pnu){
                                	 	
                                    	System.out.println("pnu: "+pnu);

                                    	Object[] values = {
                                    			pnu
                                    	};
                                    	
                                    	GetAffairNum getAffairNum = new GetAffairNum (getDataSource());
                                    	
                                    		
                                    		return getAffairNum.execute(values);
                                    		
                                    	}
                                    	
                                        protected class GetAffairNum extends MappingSqlQuery
                                        {
                                            protected GetAffairNum (DataSource ds)
                                            {
                                              	super(ds, getMessageSourceAccessor().getMessage("Querys.map.GetAffairNum"));
                                              	
                                              	declareParameter(new SqlParameter(Types.VARCHAR));                              	
                                      
                                            }
                                            
                                            protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
                                            {
                                            	GosiBean bean = new GosiBean ();
                                            	
                                            	bean.setAFFAIRNUM(rs.getString("AFFAIRNUM"));
                                            	bean.setAFFAIRNAME(rs.getString("AFFAIRNAME"));
                                            	
     
                                            	return	bean;
                                            	
                                            }
                                        }
}