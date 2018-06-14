package main.java.common.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import main.java.common.model.RefDongBean;
import main.java.common.service.CommonCodeService;
import main.java.common.util.StringUtil;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class CommonCodeControl extends MultiActionController {

	private	CommonCodeService	commonCode		= null;		

	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	// 동코드 AJAX
	public ModelAndView		GetDongList(HttpServletRequest request,HttpServletResponse response, String SHOP_IMG_NAME) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String 		GU_CD 	= ServletRequestUtils.getStringParameter(request, "GU_CD");
		
		List 		list		= null;
		
		if(userId != null)
		{
			
			//String	Xml	= "";
			
			
			String	Xml	= "<?xml version='1.0' encoding='utf-8'?>";
			Xml	+= "<ROOT>";
			
			if(GU_CD == null || GU_CD.equals("")){
				Xml	+= StringUtil.XmlNodeMake("", "동선택");
			}else{
				list = commonCode.getBJDongList(GU_CD,"");
				RefDongBean Bean = new RefDongBean();
			
				for(int	i = 0	;	i < list.size()	;	i++)
				{
					Bean	= (RefDongBean)list.get(i);
					Xml	+= StringUtil.XmlNodeMake(Bean.getBJ_NM(),Bean.getBJ_CD());
				}
			}
			Xml	+= "</ROOT>";

	        response.setContentType("text/html;charset=EUC-KR");
	        response.setHeader("Cache-Control", "no-cache");
	        response.getWriter().write(Xml);
	        
	        System.out.println("Get_GU_CD :::::::::"+Xml);

		}
		return null;
	}
	
}