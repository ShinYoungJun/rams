//	2009		Kim Yun Seo

package main.java.common.service;

import java.util.List;

import main.java.common.dao.CommonCodeDao;
import main.java.common.model.CommonCodeBean;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class CommonCodeService	extends MultiActionController {

	private	CommonCodeDao	commonCode	= null;
	
	public void setCommonCodeDao(CommonCodeDao commonCode) {
	    this.commonCode = commonCode;
	}
	
	public List	executeCommonCode(String codeNum, String codeName, String codeValue)
	{

		return commonCode.executeCommonCode(codeNum, codeName, codeValue);
	}
	
	
	//	구 리스트 불러오기
	public List	getGuList(String SI_CD,String GU_CD)
	{
		List	list	= commonCode.getGuList(SI_CD,GU_CD);
		return list;
	}
	
	
	//	법정동 리스트 불러오기
	public List	getBJDongList(String GU_CD,String BJ_CD)
	{
		List	list	= commonCode.getBJDongList(GU_CD,BJ_CD);
		return list;
	}
	
}
