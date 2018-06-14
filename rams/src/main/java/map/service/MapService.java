package main.java.map.service;

import java.util.List;

import main.java.map.dao.IMapDao;
import main.java.map.model.LayerBean;

public class MapService implements IMapService {

	private IMapDao objMapDao = null;

	public void setMapDao(IMapDao newMapDao) {
		this.objMapDao = newMapDao;
	}
	
	
	public List getJimokList() {
		
		return objMapDao.getJimokList();
	}
	
	public List getOwnGubunList() {
		return objMapDao.getOwnGubunList();
	}
	
	public List getGuCodeList(){
		return objMapDao.getGuCodeList();
	}
	
	public List getBJDongList(String GU_CD){
	  
		return objMapDao.getBJDongList(GU_CD);
	}
	
	public List getRoadNameList() {
	
		return objMapDao.getRoadNameList();
	}
	
	public List getJuckJiSearchList(String selectGu,String  selectDong,String  decodeRoad,String  selectOwn, String selectJi,
			String prevJiga,String  nextJiga, String startNum, String endNum, String cityPlan, String useArea, String useZone, String useRegion ){
		return objMapDao.getJuckJiSearchList(selectGu, selectDong, decodeRoad,selectOwn,selectJi,
				prevJiga,nextJiga,startNum, endNum,cityPlan,useArea,useZone,useRegion);
	}
	
	public List getJuckJiSearchView(String pnu){
		return objMapDao.getJuckJiSearchView(pnu);
	}
	 public int getJuckJiSearchListCnt(String selectGu,String  selectDong,String  decodeRoad,String  selectOwn, String selectJi,
				String prevJiga,String  nextJiga, String cityPlan, String useArea, String useZone, String useRegion ){
		 return objMapDao.getJuckJiSearchListCnt(selectGu, selectDong, decodeRoad, selectOwn, selectJi, prevJiga, nextJiga,cityPlan,useArea,useZone,useRegion);
	 }
	 
	 public int getJuckJiGosiListCnt(String pnu){
		 return objMapDao.getJuckJiGosiListCnt(pnu);
	 }
	 
	 public List getJuckJiGosiList(String pnu){
		 return objMapDao.getJuckJiGosiList(pnu);
	 }
	 
	 public int getJuckJiPlanListCnt(String pnu){
		 return objMapDao.getJuckJiPlanListCnt(pnu);
	 }
	
	 public List getJuckJiPlanList(String pnu){
		return objMapDao.getJuckJiPlanList(pnu);
	}
	 
	 public List getJuckJiSearchPopView(String pnu){
		 return objMapDao.getJuckJiSearchPopView(pnu);
	 }
		
	 public List getJuckJiSearchDetailFrame1(String pnu){
		 return objMapDao.getJuckJiSearchDetailFrame1(pnu);
	 }
	 
	 public List getJuckJiSearchDetailFrame2(String pnu){
		return objMapDao.getJuckJiSearchDetailFrame2(pnu); 
	 }
	 
	 public List getJuckJiSearchDetailFrame3(String pnu){
			return objMapDao.getJuckJiSearchDetailFrame3(pnu); 
		 }
	 
	 public List getSuitBizSearchList(String selectGu,String  selectDong,String  san,String  jibun,
				String startNum, String endNum){
		 return objMapDao.getSuitBizSearchList(selectGu, selectDong, san, jibun, startNum, endNum);
	 }
	 
	 public int getSuitBizSearchListCnt(String selectGu,String  selectDong,String  san,String  jibun){
		 return objMapDao.getSuitBizSearchListCnt(selectGu, selectDong, san, jibun);
	 }
	 
	 public List getUnRewardReturnList(String pnu, String ownGubun){
		 return objMapDao.getUnRewardReturnList(pnu,ownGubun);
	 }
	 
	 public List getRewardReturnList(String pnu){
		 return objMapDao.getRewardReturnList(pnu);
	 }
	 
	 public List getSuitBizConstList1(String pnu){
		 return objMapDao.getSuitBizConstList1(pnu);
	 }
		public List getSuitBizConstList2(String pnu){
			return objMapDao.getSuitBizConstList2(pnu);
		}
		public List getSuitBizConstList3(String constnum){
			return objMapDao.getSuitBizConstList3(constnum);
		}
		public List getSuitBizConstList4(String pnu){
			return objMapDao.getSuitBizConstList4(pnu);
		}
		
		public List  getCompeid(String pnu){
			return objMapDao.getCompeid(pnu);
		}
		public List  getAffairNum(String pnu){
			return objMapDao.getAffairNum(pnu);
		}
}