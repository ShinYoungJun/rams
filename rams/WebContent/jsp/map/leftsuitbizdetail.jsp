<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>무제 문서</title>
<link href="../css/doro.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.box777 {
	background-color:#ffffff;
	border: 1px #d3e2ea solid;
	color: #9a9a9a;
	}
.style1 {
	color: #0083cc;
	font-weight: bold;
	padding:8px 0 0 5px;
	height:18px;
	margin:0;
}

</style>
<script src="/rams/js/common.js"></script>
<script language="javascript">

function goDetail(gubun,pnu){

		
	if(gubun == '1'){
		document.getElementById('goFrame').src ='/rams/map/suitbizdetail1.do?PNU='+pnu;
		
		document.getElementById('Image7').src = '/rams/images/map/if_tab1_on.gif';
		document.getElementById('Image8').src = '/rams/images/map/if_tab2_off.gif';
		document.getElementById('Image9').src = '/rams/images/map/if_tab3_off.gif';

		document.getElementById('Image7').onmouseout = function() { this.src = "/rams/images/map/if_tab1_on.gif"; };		
		document.getElementById('Image8').onmouseout = function() { this.src = "/rams/images/map/if_tab2_off.gif"; };
		document.getElementById('Image9').onmouseout = function() { this.src = "/rams/images/map/if_tab3_off.gif"; };
		
		
	}else if(gubun =='2'){
		document.getElementById('goFrame').src ='/rams/map/suitbizdetail2.do?PNU='+pnu;

		document.getElementById('Image8').src = '/rams/images/map/if_tab2_on.gif';
		document.getElementById('Image7').src = '/rams/images/map/if_tab1_off.gif';
		document.getElementById('Image9').src = '/rams/images/map/if_tab3_off.gif';
		
		document.getElementById('Image7').onmouseout = function() { this.src = "/rams/images/map/if_tab1_off.gif"; };		
		document.getElementById('Image8').onmouseout = function() { this.src = "/rams/images/map/if_tab2_on.gif"; };
		document.getElementById('Image9').onmouseout = function() { this.src = "/rams/images/map/if_tab3_off.gif"; };
		
		
	}else if(gubun == '3'){
		document.getElementById('goFrame').src ='/rams/map/suitbizdetail3.do?PNU='+pnu;
		
		document.getElementById('Image9').src = '/rams/images/map/if_tab3_on.gif';
		document.getElementById('Image7').src = '/rams/images/map/if_tab1_off.gif';
		document.getElementById('Image8').src = '/rams/images/map/if_tab2_off.gif';
		
		document.getElementById('Image7').onmouseout = function() { this.src = "/rams/images/map/if_tab1_off.gif"; };		
		document.getElementById('Image8').onmouseout = function() { this.src = "/rams/images/map/if_tab2_off.gif"; };
		document.getElementById('Image9').onmouseout = function() { this.src = "/rams/images/map/if_tab3_on.gif"; };
		
	} 

}

</script>

</head>

<body onload="goDetail(1,'${PNU}')">
<div>
  <table width="250" border="0" cellspacing="0" cellpadding="0">		 
		  
		  <tr>
			<td>
				<table width="250" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<th height="35" valign="bottom" scope="row"><img src="../images/map/l_st_info.gif" alt="검색결과"/></th>
				  </tr>
				  <tr>
				  	<td align='center'>
						<table width="250" border="0" cellspacing="0" cellpadding="0">
						  <tr>
							<td><img src="/rams/images/map/if_tab1_off.gif" onClick="goDetail('1','${PNU}');" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image7','','/rams/images/map/if_tab1_on.gif',1)" alt="기본정보" name="Image7" width="84" height="25" border="0" id="Image7" style='cursor:hand;'/></td>
							<td><img src="/rams/images/map/if_tab2_off.gif" onClick="goDetail('2','${PNU}');" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image8','','/rams/images/map/if_tab2_on.gif',1)" alt="공사대장" name="Image8" width="84" height="25" border="0" id="Image8" style='cursor:hand;' /></td>
							<td><img src="/rams/images/map/if_tab3_off.gif" onClick="goDetail('3','${PNU}');" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image9','','/rams/images/map/if_tab3_on.gif',1)" alt="도시계획" name="Image9" width="84" height="25" border="0" id="Image9" style='cursor:hand;' /></td>
						  </tr>
						</table>
					</td>
				  </tr>
				  <tr>
				  <td align='left' valign='top'>
				  
				  	<iframe src="${selectTab}" id="goFrame" frameborder='0' width='260' height='800' style="overflow-x:hidden;overflow-y:hidden;left:0px;"></iframe>
				  	</td>				  
				  </tr>
				 
				</table>
			</td>
		  </tr>
		</table>
</div>
</body>
</html>
