package main.java.map.dao;

import java.util.List;

import main.java.admin.model.UserBean;
import main.java.map.model.LayerBean;
import main.java.suit.model.SuitBean;

public interface IMapDao {

	public List getJimokList();
	public List getOwnGubunList();
	public List getGuCodeList();
	public List getBJDongList(String GU_CD);
	public List getRoadNameList();
	public int getJuckJiSearchListCnt(String selectGu,String  selectDong,String  decodeRoad,String  selectOwn, String selectJi,
				String prevJiga,String  nextJiga, String cityPlan, String useArea, String useZone, String useRegion);
	public List getJuckJiSearchList(String selectGu,String  selectDong,String  decodeRoad,String  selectOwn, String selectJi,
			String prevJiga,String  nextJiga, String startNum, String endNum, String cityPlan, String useArea, String useZone, String useRegion);
	public List getJuckJiSearchView(String pnu);
	public int getJuckJiGosiListCnt(String pnu);
	public List getJuckJiGosiList(String pnu);
	public int getJuckJiPlanListCnt(String pnu);
	public List getJuckJiPlanList(String pnu);
	public List getJuckJiSearchPopView(String pnu);
	public List getJuckJiSearchDetailFrame1(String pnu);
	public List getJuckJiSearchDetailFrame2(String pnu);
	public List getJuckJiSearchDetailFrame3(String pnu);
	
	public List getSuitBizSearchList(String selectGu,String  selectDong,String  san,String  jibun,
			String startNum, String endNum);
	public int getSuitBizSearchListCnt(String selectGu,String  selectDong,String  san,String  jibun);
	public List getUnRewardReturnList(String pnu, String ownGubun);
	public List getRewardReturnList(String pnu);
	
	public List getSuitBizConstList1(String pnu);  
	public List getSuitBizConstList2(String pnu);
	public List getSuitBizConstList3(String constnum);
	public List getSuitBizConstList4(String pnu);
	public List  getCompeid(String pnu);
	public List  getAffairNum(String pnu);
}

