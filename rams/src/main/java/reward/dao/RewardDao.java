package main.java.reward.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import main.java.common.dao.RamsJdbcDaoSupport;
import main.java.reward.model.CompeCodeBean;
import main.java.reward.model.CompeFileBean;
import main.java.reward.model.CompeGongsaBean;
import main.java.reward.model.CompeViewBean;
import main.java.reward.model.CompeWriteBean;
import main.java.reward.model.RewardBean;
import main.java.reward.model.RewardRightViewBean;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

public class RewardDao extends RamsJdbcDaoSupport implements IRewardDao {
	protected void initDao() throws Exception {
		super.initDao();
	}

	public List geJimokList(String Code){
		GeJimokList geJimokList = new GeJimokList(getDataSource());
		 		
			Object[] values = {
					Code
			};
			
			return geJimokList.execute(values);
		} 
	    
    protected class GeJimokList extends MappingSqlQuery
    {
        protected GeJimokList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.geJimokList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	CompeCodeBean bean = new CompeCodeBean();
        	
	        bean.setSEQNUM(rs.getString("SEQNUM"));
	        bean.setCODENUM(rs.getString("CODENUM"));
	        bean.setCODENAME(rs.getString("CODENAME"));
	        bean.setCODEVALUE(rs.getString("CODEVALUE"));
	        bean.setCODEDESC(rs.getString("CODEDESC"));

	        return	bean;
        }
    }
    
	public List getCompeId(){
		GetCompeId getCompeId = new GetCompeId(getDataSource());
		 		
			Object[] values = {
			};
			
			return getCompeId.execute(values);
		} 
	    
    protected class GetCompeId extends MappingSqlQuery
    {
        protected GetCompeId(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getComepeId"));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	CompeViewBean bean = new CompeViewBean();
        	
	        bean.setCOMPEID(rs.getString("COMPEID"));
	        
	        return	bean;
        }
    }	    
    
	public List getRewardList(RewardBean searchBean,String currentPage,	String countPerPage) {
		GetRewardList getRewardList = new GetRewardList(getDataSource());
		
	    		    		
			Object[] values = {
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE(),
					currentPage,
					countPerPage,
					countPerPage
			};
			
			return getRewardList.execute(values);
		} 
	    
	    protected class GetRewardList extends MappingSqlQuery
	    {
	        protected GetRewardList(DataSource ds)
	        {
	          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getRewardList"));
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
	        	RewardBean bean = new RewardBean();
	        	
	        	bean.setCOMPEID(rs.getString("COMPEID"));
	        	bean.setPNU(rs.getString("PNU"));
	        	bean.setLINENAME(rs.getString("LINENAME"));
	        	bean.setGU_NM(rs.getString("GU_NM"));
	        	bean.setBJ_NM(rs.getString("BJ_NM"));
	        	bean.setBONBUN(rs.getString("BONBUN"));
	        	bean.setBUBUN(rs.getString("BUBUN"));
	        	bean.setCONSTNAME(rs.getString("CONSTNAME"));
	        	bean.setJIMOK(rs.getString("JIMOK"));
	        	bean.setTOTAREA(rs.getString("TOTAREA"));
	        	bean.setAFFAIRAREA(rs.getString("AFFAIRAREA"));
	        	bean.setISCOMPENSATE(rs.getString("ISCOMPENSATE"));
	        	bean.setREASON(rs.getString("REASON"));
	        	bean.setREGISTDATE(rs.getString("REGISTDATE"));
	        	bean.setETC(rs.getString("ETC"));

	        	
	        	return	bean;
	        }
	    }
	    
	    
		public int getRewardCount(RewardBean searchBean){
			Object[] values = {
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE()
					
			};
			String sql = getMessageSourceAccessor().getMessage(
					"Querys.reward.getRewardCount");
			int returnNum = getJdbcTemplate().queryForInt(sql, values);
			return returnNum;
		}
		
		
		public int getRewardCompenCount(RewardBean searchBean){
			Object[] values = {
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE(),
					searchBean.getSEARCH_VALUE()
					
			};
			String sql = getMessageSourceAccessor().getMessage("Querys.reward.getRewardCompenCount");
			int returnNum = getJdbcTemplate().queryForInt(sql, values);
			return returnNum;
		}
		

	    
		public List getComepeFileList(String compeId){
			GetComepeFileList getComepeFileList = new GetComepeFileList(getDataSource());
			
		    		    		
				Object[] values = {
						compeId
				};
				
				return getComepeFileList.execute(values);
			} 
		    
	    protected class GetComepeFileList extends MappingSqlQuery
	    {
	        protected GetComepeFileList(DataSource ds)
	        {
	          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getComepeFileList"));
				declareParameter(new SqlParameter(Types.VARCHAR));
				
				
	        }
	        
	        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
	        {
	        	CompeFileBean bean = new CompeFileBean();
	        	
			        bean.setFILEID(rs.getString("FILEID"));
			        bean.setCOMPEID(rs.getString("COMPEID"));
			        bean.setFILENAME(rs.getString("FILENAME"));
			        bean.setPATH(rs.getString("PATH"));
			        bean.setREGISTDATE(rs.getString("REGISTDATE"));


	        	
	        	return	bean;
	        }
	    }
	    
		public List getComepeView(String compeId,String pnu){
			GetComepeView getComepeView = new GetComepeView(getDataSource());
			
		    		    		
				Object[] values = {
						compeId,
						pnu
				};
				
				return getComepeView.execute(values);
			} 
		    
	    protected class GetComepeView extends MappingSqlQuery
	    {
	        protected GetComepeView(DataSource ds)
	        {
	          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getComepeView"));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				
				
	        }
	        
	        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
	        {
	        	CompeViewBean bean = new CompeViewBean();
	        	
		        bean.setCOMPEID(rs.getString("COMPEID"));
		        bean.setPNU(rs.getString("PNU"));
		        bean.setGOSIID(rs.getString("GOSIID"));
		        bean.setCONSTNUM(rs.getString("CONSTNUM"));
		        bean.setLANDGUBUN(rs.getString("LANDGUBUN"));
		        bean.setLANDDETAIL(rs.getString("LANDDETAIL"));
		        bean.setGU_NM(rs.getString("GU_NM"));
		        bean.setGU_CD(rs.getString("GU_CD"));
		        bean.setBJ_NM(rs.getString("BJ_NM"));
		        bean.setBJ_CD(rs.getString("BJ_CD"));
		        bean.setBONBUN(rs.getString("BONBUN"));
		        bean.setBUBUN(rs.getString("BUBUN"));
		        bean.setJIMOK(rs.getString("JIMOK"));
		        bean.setTOTAREA(rs.getString("TOTAREA"));
		        bean.setAFFAIRAREA(rs.getString("AFFAIRAREA"));
		        bean.setREASON(rs.getString("REASON"));
		        bean.setUNITPRICE(rs.getString("UNITPRICE"));
		        bean.setTOTPRICE(rs.getString("TOTPRICE"));
		        bean.setNAME(rs.getString("NAME"));
		        bean.setJUMINNUM(rs.getString("JUMINNUM"));
		        bean.setADDRESS(rs.getString("ADDRESS"));
		        bean.setOFFICENAME_1(rs.getString("OFFICENAME_1"));
		        bean.setDANGA_1(rs.getString("DANGA_1"));
		        bean.setJUDGEPRICE_1(rs.getString("JUDGEPRICE_1"));
		        bean.setPOINTDATE_1(rs.getString("POINTDATE_1"));
		        bean.setOFFICENAME_2(rs.getString("OFFICENAME_2"));
		        bean.setDANGA_2(rs.getString("DANGA_2"));
		        bean.setJUDGEPRICE_2(rs.getString("JUDGEPRICE_2"));
		        bean.setPOINTDATE_2(rs.getString("POINTDATE_2"));
		        bean.setREQDATE(rs.getString("REQDATE"));
		        bean.setRECEIPT(rs.getString("RECEIPT"));
		        bean.setJIMOK_CODE(rs.getString("JIMOK_CODE"));
		        return	bean;
	        }
	    }
	    
	    
		public List getComepeAreaView(String compeId){
			GetComepeAreaView getComepeAreaView = new GetComepeAreaView(getDataSource());
			
		    		    		
				Object[] values = {
						compeId,
				};
				
				return getComepeAreaView.execute(values);
			} 
		    
	    protected class GetComepeAreaView extends MappingSqlQuery
	    {
	        protected GetComepeAreaView(DataSource ds)
	        {
	          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getComepeAreaView"));

	          	declareParameter(new SqlParameter(Types.VARCHAR));

	        }
	        
	        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
	        {
	        	CompeViewBean bean = new CompeViewBean();
	        	
		        bean.setCOMPEID(rs.getString("COMPEID"));
		        bean.setPNU(rs.getString("PNU"));
		        bean.setLANDGUBUN(rs.getString("LANDGUBUN"));
		        bean.setLANDDETAIL(rs.getString("LANDDETAIL"));
		        bean.setGU_NM(rs.getString("GU_NM"));
		        bean.setGU_CD(rs.getString("GU_CD"));
		        bean.setBJ_NM(rs.getString("BJ_NM"));
		        bean.setBJ_CD(rs.getString("BJ_CD"));
		        bean.setBONBUN(rs.getString("BONBUN"));
		        bean.setBUBUN(rs.getString("BUBUN"));
		        bean.setJIMOK(rs.getString("JIMOK"));
		        bean.setTOTAREA(rs.getString("TOTAREA"));
		        bean.setAFFAIRAREA(rs.getString("AFFAIRAREA"));
		        bean.setREASON(rs.getString("REASON"));
		        bean.setUNITPRICE(rs.getString("UNITPRICE"));
		        bean.setTOTPRICE(rs.getString("TOTPRICE"));
		        return	bean;
	        }
	    }	    
	    
		//보상 수정 seoyes update ============================================================================================	    
		public List getRewardRightView(String compeId){
			GetRewardRightView getRewardRightView = new GetRewardRightView(getDataSource());
			
		    		    		
				Object[] values = {
						compeId,
						"주"
				};
				
				return getRewardRightView.execute(values);
			} 
		    
	    protected class GetRewardRightView extends MappingSqlQuery
	    {
	        protected GetRewardRightView(DataSource ds)
	        {
	          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getRewardRightView"));
	          	
	          	declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
	        }
	        
	        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
	        {
	        	RewardRightViewBean bean = new RewardRightViewBean();
	        	
		        bean.setSEQNUM(rs.getString("SEQNUM"));
		        bean.setCOMPEID(rs.getString("COMPEID"));
		        bean.setGUBUN(rs.getString("GUBUN"));
		        bean.setJUMINNUM(rs.getString("JUMINNUM"));
		        bean.setNAME(rs.getString("NAME"));
		        bean.setTEL(rs.getString("TEL"));
		        bean.setADDRESS(rs.getString("ADDRESS"));
		        bean.setETC(rs.getString("ETC"));
		        return	bean;
	        }
	    }
	    
	    
	    
	    //보상 수정 (신청자 수정)
		public void setComepePersonUpdate(CompeWriteBean writeBean){ 
			SetComepePersonUpdate setComepePersonUpdate = new SetComepePersonUpdate(getDataSource());
			
			Object[] values = { 
					"",							//구분
					writeBean.getCP_JUMIN(),	//주민번호
					writeBean.getCP_NAME(),		//이름
					"",							//연락처
					writeBean.getCP_ADDRESS(),	//거주지
					"",							//비고
					writeBean.getCOMPEID()		//보상ID
					};

			for (int i = 0; i < values.length; i++) {
				System.out.println("보상수정 1: : " + values[i]);
			}

			setComepePersonUpdate.update(values);

		}

		class SetComepePersonUpdate extends SqlUpdate {
			public SetComepePersonUpdate(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.setComepePersonUpdate"));
				
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));

			}
		}
		
	    //보상 수정 (보상신청 수정)
		public void setComepeReQUpdate(CompeWriteBean writeBean){ 
			SetComepeReQUpdate setComepeReQUpdate = new SetComepeReQUpdate(getDataSource());
			
			Object[] values = { 
					writeBean.getREQDATE(),		//신청일자
					writeBean.getANNOUNCENUM(),	//고시번호
					writeBean.getCONSTNUM(),	//공사번호
					writeBean.getAFFAIRNUM(),	//사건번호
					writeBean.getRECEIPT(),		//수신처
					writeBean.getUSERID(),		//등록자ID
					writeBean.getCOMPEID()		//보상ID
					};

			for (int i = 0; i < values.length; i++) {
				System.out.println("보상수정 2: : " + values[i]);
			}

			setComepeReQUpdate.update(values);

		}

		class SetComepeReQUpdate extends SqlUpdate {
			public SetComepeReQUpdate(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.setComepeReQUpdate"));
				
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));

			}
		}
		
		//보상 수정 (보상신청물건지)
		public void setComepensationUpdate(CompeWriteBean writeBean){ 
			SetComepensationUpdate setComepensationUpdate = new SetComepensationUpdate(getDataSource());
			
			Object[] values = { 
					writeBean.getPNU(),			//대상PNU					
					"1",						//대표여부
					"",							//총면적
					writeBean.getAFFAIRNUM(),	//지적(신청면적)
					writeBean.getJIMOK(),		//지목
					"",							//근저당여부
					"",							//단가평균
					"",							//보상대상결정여부
					"",							//보상여부
					writeBean.getREASON(),		//보상부결사유
					"",							//비고
					writeBean.getLANDGUBUN(),	//토지현황구분
					writeBean.getLANDDETAIL(),	//토지현황상세
					writeBean.getUSERID(),		//등록자ID
					"",							//금액 총액
					"",							//총지분
					"",							//신청지분
					writeBean.getPNU_before(),	//대상PNU
					writeBean.getCOMPEID(),		//보상ID					
					};

			for (int i = 0; i < values.length; i++) {
				System.out.println("보상수정 3 : : " + values[i]);
			}

			setComepensationUpdate.update(values);

		}

		class SetComepensationUpdate extends SqlUpdate {
			public SetComepensationUpdate(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.setComepensationUpdate"));
				
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
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
			}
		}
		
		//보상 수정 (보상신청물건지)
		public void setComepeJudge1Update(CompeWriteBean writeBean){ 
			SetComepeJudge1Update setComepeJudge1Update = new SetComepeJudge1Update(getDataSource());
			
			Object[] values = { 
					writeBean.getPNU(),			//대상PNU					
					writeBean.getOFFICENAME_1(),//평가기관명
					"",							//평가기관연락처
					"",							//평가기관주소
					writeBean.getJIMOK(),		//지목
					writeBean.getDANGA_1(),		//단가
					"",							//면적
					writeBean.getPOINTDATE_1(),	//가격시점
					writeBean.getJUDGEPRICE_1(),//감정액
					"",							//감정지분
					"",							//총지분
					writeBean.getPNU_before(),			//대상PNU
					writeBean.getCOMPEID(),		//보상ID
					"1",						//1차,2차 구분 코드
					};

			for (int i = 0; i < values.length; i++) {
				System.out.println("보상수정 4 : : " + values[i]);
			}

			setComepeJudge1Update.update(values);

		}

		class SetComepeJudge1Update extends SqlUpdate {
			public SetComepeJudge1Update(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.setComepeJudgeUpdate"));
				
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
		
		public void setComepeJudge2Update(CompeWriteBean writeBean){ 
			SetComepeJudge2Update setComepeJudge2Update = new SetComepeJudge2Update(getDataSource());
			
			Object[] values = { 
					writeBean.getPNU(),			//대상PNU
					writeBean.getOFFICENAME_2(),//평가기관명
					"",							//평가기관연락처
					"",							//평가기관주소
					writeBean.getJIMOK(),		//지목
					writeBean.getDANGA_2(),		//단가
					"",							//면적
					writeBean.getPOINTDATE_2(),	//가격시점
					writeBean.getJUDGEPRICE_2(),//감정액
					"",							//감정지분
					"",							//총지분
					writeBean.getPNU_before(),	//대상PNU 이전
					writeBean.getCOMPEID(),		//보상ID
					"2",						//1차,2차 구분 코드
					};

			for (int i = 0; i < values.length; i++) {
				System.out.println("보상수정5 : : " + values[i]);
			}

			setComepeJudge2Update.update(values);

		}

		class SetComepeJudge2Update extends SqlUpdate {
			public SetComepeJudge2Update(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.setComepeJudgeUpdate"));
				
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

		//보상 입력 (신청자 입력)
		public void setComepePersonInsert(CompeWriteBean writeBean) {
			SetComepePersonInsert setComepePersonInsert = new SetComepePersonInsert(getDataSource());

			Object[] values = { 
					writeBean.getCOMPEID(),		//보상ID
					"주",							//구분
					writeBean.getCP_JUMIN(),	//주민번호
					writeBean.getCP_NAME(),		//이름
					"",							//연락처
					writeBean.getCP_ADDRESS(),	//거주지
					""							//비고
					};

			for (int i = 0; i < values.length; i++) {
				System.out.println("보상 신청자 입력 1: : " + values[i]);
			}

			setComepePersonInsert.update(values);

		}

		class SetComepePersonInsert extends SqlUpdate {
			public SetComepePersonInsert(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.setComepePersonInsert"));

				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));

			}
		}

		
		//보상 입력 (보상신청 입력)
		public void setComepeReQInsert(CompeWriteBean writeBean) {
			SetComepeReQInsert setComepeReQInsert = new SetComepeReQInsert(getDataSource());
			
			Object[] values = { 
					writeBean.getCOMPEID(),		//보상ID
					writeBean.getREQDATE(),		//신청일자
					writeBean.getANNOUNCENUM(),	//고시번호
					writeBean.getCONSTNUM(),	//공사번호
					writeBean.getAFFAIRNUM(),	//사건번호
					writeBean.getRECEIPT(),		//수신처
					writeBean.getUSERID(),		//등록자ID
					};

			for (int i = 0; i < values.length; i++) {
				System.out.println("보상신청 입력 2: : " + values[i]);
			}

			setComepeReQInsert.update(values);

		}

		class SetComepeReQInsert extends SqlUpdate {
			public SetComepeReQInsert(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.setComepeReQInsert"));

				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));

			}
		}

		
		//보상 입력 (보상신청물건지 입력)
		public void setComepensationInsert(CompeWriteBean writeBean) {
			SetComepensationInsert setComepensationInsert = new SetComepensationInsert(getDataSource());

			Object[] values = { 
					writeBean.getPNU(),			//대상PNU
					writeBean.getCOMPEID(),		//보상ID
					"",							//대표여부
					"",							//총면적
					writeBean.getAFFAIRNUM(),	//지적(사건면적)
					writeBean.getJIMOK(),		//지목
					"",							//근저당여부
					"",							//단가평균
					"",							//보상대상결정여부
					"",							//보상여부
					writeBean.getREASON(),		//보상부결사유
					"",							//비고
					writeBean.getLANDGUBUN(),	//토지현황구분
					writeBean.getLANDDETAIL(),	//토지현황상세
					writeBean.getUSERID(),		//등록자ID
					"",							//금액 총액
					"",							//총지분
					"",							//신청지분
					};

			for (int i = 0; i < values.length; i++) {
				System.out.println("보상신청물건지 입력 3 : : " + values[i]);
			}

			setComepensationInsert.update(values);

		}

		class SetComepensationInsert extends SqlUpdate {
			public SetComepensationInsert(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.setComepensationInsert"));
				
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
				declareParameter(new SqlParameter(Types.VARCHAR));
				
			}
		}
		
		//보상 입력 (보상감정평가 입력)
		public void setComepeJudge1Insert(CompeWriteBean writeBean) {
			SetComepeJudge1Insert setComepeJudge1Insert = new SetComepeJudge1Insert(getDataSource());
			
			Object[] values = { 
					writeBean.getPNU(),			//대상PNU
					writeBean.getCOMPEID(),		//보상ID
					writeBean.getOFFICENAME_1(),//평가기관명
					"",							//평가기관연락처
					"",							//평가기관주소
					writeBean.getJIMOK(),		//지목
					writeBean.getDANGA_1(),		//단가
					"",							//면적
					writeBean.getPOINTDATE_1(),	//가격시점
					writeBean.getJUDGEPRICE_1(),//감정액
					"",							//감정지분
					"",							//총지분
					"1"							//1차,2차 구분 코드
					};

			for (int i = 0; i < values.length; i++) {
				System.out.println("보상감정평가1 입력 4: : " + values[i]);
			}

			setComepeJudge1Insert.update(values);

		}

		class SetComepeJudge1Insert extends SqlUpdate {
			public SetComepeJudge1Insert(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.setComepeJudgeInsert"));
				
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
		
		//보상 입력 (보상감정평가 입력)
		public void setComepeJudge2Insert(CompeWriteBean writeBean) {
			SetComepeJudge2Insert setComepeJudge2Insert = new SetComepeJudge2Insert(getDataSource());
			
			Object[] values = { 
					writeBean.getPNU(),			//대상PNU
					writeBean.getCOMPEID(),		//보상ID
					writeBean.getOFFICENAME_2(),//평가기관명
					"",							//평가기관연락처
					"",							//평가기관주소
					writeBean.getJIMOK(),		//지목
					writeBean.getDANGA_2(),		//단가
					"",							//면적
					writeBean.getPOINTDATE_2(),	//가격시점
					writeBean.getJUDGEPRICE_2(),//감정액
					"",							//감정지분
					"",							//총지분
					"2"							//1차,2차 구분 코드
					};

			for (int i = 0; i < values.length; i++) {
				System.out.println("보상감정평가2 입력 4: : " + values[i]);
			}

			setComepeJudge2Insert.update(values);

		}

		class SetComepeJudge2Insert extends SqlUpdate {
			public SetComepeJudge2Insert(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.setComepeJudgeInsert"));
				
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
		
		//공시 팝업 조회	
		public List getGongsiList(RewardBean searchBean,String currentPage,	String countPerPage){
			GetGongsiList getGongsiList = new GetGongsiList(getDataSource());
			
		    		    		
				Object[] values = {
						currentPage,
						countPerPage,
						countPerPage
				};
				
				return getGongsiList.execute(values);
			} 
		    
	    protected class GetGongsiList extends MappingSqlQuery
	    {
	        protected GetGongsiList(DataSource ds)
	        {
	          	super(ds, getMessageSourceAccessor().getMessage("Querys.reward.getGongsiList"));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
	        }
	        
	        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
	        {
	        	CompeGongsaBean gonsaView = new CompeGongsaBean();

	        	gonsaView.setTOTNUM(rs.getString("TOTNUM"));
	        	gonsaView.setRNUM(rs.getString("RNUM"));
	        	gonsaView.setCOMPEID(rs.getString("COMPEID"));
	        	gonsaView.setCONSTNUM(rs.getString("CONSTNUM"));
	        	gonsaView.setGOSIID(rs.getString("GOSIID"));
	        	gonsaView.setCONSTNAME(rs.getString("CONSTNAME"));
	        	gonsaView.setANNPERMISSION(rs.getString("ANNPERMISSION"));
	        	gonsaView.setCONSTCATEG(rs.getString("LINENAME"));
	        	gonsaView.setCONSTCATEG(rs.getString("CONSTCATEG"));
	        	gonsaView.setSTARTSECTION(rs.getString("STARTSECTION"));
	        	gonsaView.setENDSECTION(rs.getString("ENDSECTION"));
	        	gonsaView.setCONSTPLACE(rs.getString("CONSTPLACE"));
	        	gonsaView.setSTARTDATE(rs.getString("STARTDATE"));
	        	gonsaView.setENDDATE(rs.getString("ENDDATE"));
	        	gonsaView.setREASON(rs.getString("REASON"));
	        	gonsaView.setANNOUNCEDATE(rs.getString("ANNOUNCEDATE"));
	        	gonsaView.setLENGTH(rs.getString("LENGTH"));
		        
		        return	gonsaView;
	        }
	    }
	    
	    
	    //관련자료 추가
		public void setRewardCompeFileInsert(CompeFileBean bean) {
			SetRewardCompeFileInsert setRewardCompeFileInsert = new SetRewardCompeFileInsert(getDataSource());
			
			Object[] values = { 
					bean.getCOMPEID(),//보상ID
					bean.getFILENAME(),
					bean.getPATH()
					};

			setRewardCompeFileInsert.update(values);

		}

		class SetRewardCompeFileInsert extends SqlUpdate {
			public SetRewardCompeFileInsert(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.SetRewardCompeFileInsert"));
				
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
			}
		}
		
		//관련자료 삭제
		public void setRewardCompeFileDel(CompeFileBean bean) {
			SetRewardCompeFileDel setRewardCompeFileDel = new SetRewardCompeFileDel(getDataSource());
			
			Object[] values = { 
					bean.getFILEID(),
					bean.getCOMPEID()
					};

			setRewardCompeFileDel.update(values);

		}

		class SetRewardCompeFileDel extends SqlUpdate {
			public SetRewardCompeFileDel(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage("Querys.reward.SetRewardCompeFileDel"));
				
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
			}
		}
	    
}