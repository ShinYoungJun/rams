<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>���� ����</title>
<link href="/rams/css/doro.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.box777 {
	background-color:#ffffff;
	border: 1px #d3e2ea solid;
	color: #9a9a9a;
	}
	
.style1 {color: #FFFFFF}
.style2 {
	color: #FFFF00;
	font-weight: bold;
}

</style>

<script language="javascript">


//ajax
function getXMLHTTPRequest()
{
	var xRequest = null;
	xRequest = new ActiveXObject("Microsoft.XMLHTTP");

	return xRequest;
}

var req;
var	call;

function sendRequest(url, params, HttpMethod, callback)
{
	req = getXMLHTTPRequest();

	call	= callback;
	if(req){
		req.onreadystatechange = onReadyStateChange;
		req.open(HttpMethod, url, true);
		req.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=UTF-8");
		req.send(params);
	}
}

function onReadyStateChange()
{
	var ready = req.readyState;
	var data = null;
	if(ready == 4){
		if(this.call	!= null)
			this.call(req.responseText);
	}
}

function getValueSelectTag(target){
	var obj = document.getElementById(target).options;

	for(var i = 0 ; i < obj.length ; i++){
		if(obj[i].selected == true){
			return obj[i].value;
		} 
	}
}

//ajax ��

function changeGuCode(){
	var _guCode = getValueSelectTag("selectGu");
	alert("gu : "+_guCode);
	var param = "&GU_CD="+_guCode;
	sendRequest("/rams/map/get_dong_list.do", param, "GET", ResultChangeGuCode);
}

function	ResultChangeGuCode(obj)
{
	
	fncSelectBoxSetting(obj, "selectDong", "", "������");
}

function fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)
{
    var xmldoc = new ActiveXObject("Microsoft.XMLDOM");
    var selectBoxLabel;
    var root;
    var selectBoxValue;
    var opt 	= document.getElementById(selectBoxId);
    var tags	= "";
    var	text	= "";

    for(var i = opt.options.length - 1 ; i > -1 ; i--)
    {
    	opt.options[i]	= null;
    }

    xmldoc.async	= false;

	xmldoc.loadXML(strParam);


	root = xmldoc.getElementsByTagName("option").length;


    if(root <= 0)
    {
        tags 	= document.createElement("option");
        text	= document.createTextNode("");
        tags.setAttribute("label", "");
        tags.appendChild(text);
        tags.value = 0;
        opt.appendChild(tags);
        return;
    }

    if(topLabel != null && topLabel != "")
	{
        tags 	= document.createElement("option");
        text	= document.createTextNode(topLabel);
        tags.setAttribute("label", topLabel);
        tags.appendChild(text);
        tags.value = '';
        opt.appendChild(tags);
    }
	
    for(var i = 0; i < root; i++)
    {
    	
    	selectBoxValue = xmldoc.getElementsByTagName("option/@value").item(i).text;
    	selectBoxLabel = xmldoc.getElementsByTagName("option/@label").item(i).text;

        tags 	= document.createElement("option");
   		text	= document.createTextNode(selectBoxLabel);

        tags.setAttribute("label", selectBoxLabel);

        tags.value = selectBoxValue;
        tags.appendChild(text);
        opt.appendChild(tags);
    }   
}

function goLand(){

	
    var cw=screen.availWidth; // ȭ�� �ʺ�
	var ch=screen.availHeight; // ȭ�� ����

	var name = 'http://land.seoul.go.kr/land/jsp/ginfo/GeneralInfo.jsp?_landCd=${PNU}';
	var sw=800;// ��� â�� �ʺ�
	var sh=600;// ��� â�� ����

	var ml=(cw-sw)/2;// ��� �������� â�� x��ġ
	var mt=(ch-sh)/2;// ��� �������� â�� y��ġ
	

	 window.open(name,'newWin','width='+sw+',height='+sh+',top='+mt+',left='+ml+',toobar=no,scrollbars=yes,menubar=no,status=no ,directories=no,');

	 
}



function goRewardDet(compeid){


	
	var pnu = '${PNU}';
	
    var cw=screen.availWidth; // ȭ�� �ʺ�
	var ch=screen.availHeight; // ȭ�� ����

	var name = '/rams/reward/reward_view.do?COMPEID='+compeid+'&PNU='+pnu;
	var sw=950;// ��� â�� �ʺ�
	var sh=700;// ��� â�� ����

	var ml=(cw-sw)/2;// ��� �������� â�� x��ġ
	var mt=(ch-sh)/2;// ��� �������� â�� y��ġ

	 window.open(name,'newWin','width='+sw+',height='+sh+',top='+mt+',left='+ml+',toobar=no,scrollbars=yes,menubar=no,status=no ,directories=no,');
	
}


function goSuitDet(affairnum){
	
	var pnu = '${PNU}';
	
    var cw=screen.availWidth; // ȭ�� �ʺ�
	var ch=screen.availHeight; // ȭ�� ����

	var name = '/rams/map/gosuitview.do?PNU='+pnu+"&AFFAIRNUM="+affairnum;
	
	var sw=950;// ��� â�� �ʺ�
	var sh=800;// ��� â�� ����

	var ml=(cw-sw)/2;// ��� �������� â�� x��ġ
	var mt=(ch-sh)/2;// ��� �������� â�� y��ġ

	 window.open(name,'newWin','width='+sw+',height='+sh+',top='+mt+',left='+ml+',toobar=no,scrollbars=yes,menubar=no,status=no ,directories=no,');
	
}
		


function goDetailView(GOSIID){

    var cw=screen.availWidth; // ȭ�� �ʺ�
	var ch=screen.availHeight; // ȭ�� ����

	var name = '/rams/map/juckjianalysisdetailview.do?GOSIID='+GOSIID;
	var sw=850;// ��� â�� �ʺ�
	var sh=680;// ��� â�� ����

	var ml=(cw-sw)/2;// ��� �������� â�� x��ġ
	var mt=(ch-sh)/2;// ��� �������� â�� y��ġ

	 window.open(name,'newWin','width='+sw+',height='+sh+',top='+mt+',left='+ml+',toobar=no,scrollbars=yes,menubar=no,status=no ,directories=no,')
	
}

function goList(){


	parent.document.getElementById('searchResult').style.visibility = "hidden";
	parent.document.getElementById('unrewardDiv').style.display = "block";
	parent.document.getElementById('unrewardDiv').style.zIndex = "10";
}

function changeNextColor(obj){

	
	//alert(obj);
	document.getElementById(obj).style.backgroundColor = '#dddddd';
}

function changePrevColor(obj){

	//alert(obj);
	document.getElementById(obj).style.backgroundColor = '#ffffff';
	
}

function openDoor(category){

	
	if(category == "suit"){
				if(document.getElementById("suit").height=='1'){

					//div�ȿ� ������ ������ ���̿� ������� ������ �� ��µ�
					document.getElementById("suit").height= 2;	
					
					var a =	"<table>";
				  	a+="		<tr bgcolor='yellow'>                     ";
				  	a+="			<td>�����ȣ</td>                      ";
				  	a+="			<td>�������</td>                      ";				  	
				  	a+="		</tr>                                     ";
				  		<c:forEach items='${AffairList}' var='suit' varStatus='count'> 
				  	a+="		<tr id='gosiTable${count.index}' onclick=javascript:goSuitDet('${suit.AFFAIRNUM }') onmouseout=changePrevColor('gosiTable${count.index}') onmouseover=changeNextColor('gosiTable${count.index}') style='cursor:hand;'> ";
			  		a+="		<td>${suit.AFFAIRNUM }</td>                     ";
			  		a+="		<td width='150'>${suit.AFFAIRNAME}</td>      ";			  		
				  	a+="		</tr>                                     ";

						</c:forEach>                                  
				  	
				  	a+="	</table>                                      ";

					document.getElementById('suitDiv').innerHTML = a;
					
				}else{
					
					document.getElementById('suitDiv').innerHTML = '';
					document.getElementById("suit").height= 1;
				}
		document.getElementById("gosi").height= 1;
		document.getElementById("plan").height= 1;
		document.getElementById("reward").height= 1;
	}else if(category =="gosi"){
			if(document.getElementById("gosi").height=='1'){

				//div�ȿ� ������ ������ ���̿� ������� ������ �� ��µ�
				document.getElementById("gosi").height= 2;	

			var a =	"<table>";
			  	a+="		<tr bgcolor='yellow'>                     ";
			  	a+="			<td>�����ȣ</td>                      ";
			  	a+="			<td>�������</td>                      ";
			  	a+="			<td>������</td>                      ";
			  	a+="		</tr>                                     ";
			  		<c:forEach items='${gosiList}' var='gosi' varStatus='count'> 
			  	a+="		<tr id='gosiTable${count.index}' onclick=javascript:goDetailView('${gosi.GOSIID}') onmouseout=changePrevColor('gosiTable${count.index}') onmouseover=changeNextColor('gosiTable${count.index}') style='cursor:hand;'> ";
		  		a+="		<td>${gosi.NUM }</td>                     ";
		  		a+="		<td width='150'>${gosi.SUBJECT}</td>      ";
		  		a+="		<td>${gosi.ORG}</td>                      ";
			  	a+="		</tr>                                     ";

					</c:forEach>                                  
			  	
			  	a+="	</table>                                      ";

				document.getElementById('gosiDiv').innerHTML = a;
				
			}else{
				
				document.getElementById('gosiDiv').innerHTML = '';
				document.getElementById("gosi").height= 1;
			}
		document.getElementById("suit").height= 1;		
		document.getElementById("plan").height= 1;
		document.getElementById("reward").height= 1;
	}else if(category =="plan"){
			if(document.getElementById("plan").height=='1'){

				
				
				document.getElementById("plan").height= 2;

				var a =	"<table>";
			  	a+="		<tr bgcolor='yellow'>                     ";
			  	a+="			<td>�����ȣ</td>                      ";
			  	a+="			<td>�������</td>                      ";
			  	a+="			<td>������</td>                      ";
			  	a+="		</tr>                                     ";
			  		<c:forEach items='${planList}' var='plan' varStatus='count1'> 			  	
			  	a+=" <tr id='gosiTable${count1.index}' onclick=javascript:goDetailView('${plan.GOSIID}') onmouseout=changePrevColor('gosiTable${count1.index}') onmouseover=changeNextColor('gosiTable${count1.index}') style='cursor:hand;'> ";			  	
		  		a+="		<td>${plan.NUM }</td>                     ";
		  		a+="		<td width='150'>${plan.SUBJECT}</td>      ";
		  		a+="		<td>${plan.ORG}</td>                      ";
			  	a+="		</tr>                                     ";
					</c:forEach>                             
			  	
			  	a+="	</table>                                      ";

				document.getElementById('planDiv').innerHTML = a;

				
			}else{
				document.getElementById('planDiv').innerHTML = '';				
				document.getElementById("plan").height= 1;
			}
		document.getElementById("suit").height= 1;
		document.getElementById("gosi").height= 1;		
		document.getElementById("reward").height= 1;
	}else if(category =="reward"){
				if(document.getElementById("reward").height=='1'){
					document.getElementById("reward").height= 2;

					var a =	"<table>";
				  	a+="		<tr bgcolor='yellow'>                     ";
				  	a+="			<td>����ID</td>                      ";
				  	a+="			<td>��û����</td>                      ";				  	
				  	a+="		</tr>                                     ";
				  		<c:forEach items='${compeList}' var='comp' varStatus='count1'> 			  	
				  	a+=" <tr id='gosiTable${count1.index}' onclick=javascript:goRewardDet('${comp.COMPEID}') onmouseout=changePrevColor('gosiTable${count1.index}') onmouseover=changeNextColor('gosiTable${count1.index}') style='cursor:hand;'> ";			  	
			  		a+="		<td height='18'>${comp.COMPEID}</td>                     ";
			  		a+="		<td width='100'>${comp.REQDATE}</td>      ";			  		
				  	a+="		</tr>                                     ";
						</c:forEach>                             
				  	
				  	a+="	</table>                                      ";

					document.getElementById('rewardDiv').innerHTML = a;

				}else{
					document.getElementById('rewardDiv').innerHTML = '';	
					document.getElementById("reward").height= 1;
				}
		document.getElementById("suit").height= 1;
		document.getElementById("gosi").height= 1;
		document.getElementById("plan").height= 1;		
	}
}





</script>

</head>

<body>
<div id="left" align="center">
  <table width="260" height="700" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="5" ><img src="/rams/images/map/l_bg1.gif" alt="."/></td>
    </tr>
    <tr>
      <td height="100%" class="cont">
	  	<table width="250" border="0" cellspacing="0" cellpadding="0">		 
		  <tr>
			<td>
				<table width="250" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<th height="35" valign="bottom" scope="row">
					 
					<img src="/rams/images/map/l_st_info2_1.gif" alt="������" width="250" height="29" border="0" usemap="#Map" style='cursor:hand;' /></th>
				  </tr>
				  <tr>
					<th scope="row" class="cont3">
							<table width="250" border="1" cellspacing="0" cellpadding="0" bordercolor="#bed6e1" id="iRst">
									  <tr onclick="javascript:parent.modifyHeight();">
										<th width="125" height="25" scope="col" class="title">����</th>
										<th class="title" scope="col">${view.JIBUN }</th>
									  </tr>
									  <tr>
										<td height="25" class="col">��������</td>
										<td class="col">${view.JIGA }</td>
									  </tr>
									  <tr>
										<td height="25" class="col">����(m2)</td>
										<td class="col">${view.AREA }</td>
									  </tr>
									  <tr>
										<td height="25" class="col">�ּ�</td>
										<td class="col">${view.DONGCODE }</td>
									  </tr>
									  <tr>
										<td height="25" class="col">����</td>
										<td class="col">${view.CODEDESC }</td>
									  </tr>
  							</table>
					
					</th>
				  </tr>
				</table>
			</td>
		  </tr>
		  <tr>
			<td height="10"></td>
		  </tr>
	    </table>
	    <br>
		 <table width="250"  border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td class="stitle">
				<table width="213" border="0" cellspacing="0" cellpadding="0">
				  <tr onClick="openDoor('gosi');" style='cursor:hand;'>
					<th align="left" scope="row"><span class="style1">�ü��������</span></th>
					<td width="50" align="right"><span class="style2">[${gosiCount}] �� </span></td>
				  </tr>
				</table>
			</td>
		  </tr>
		  <tr>
		  
		  	<td id="gosi" height="1" background="/rams/images/map/l_bg3.gif">
		  		<div id='gosiDiv'></div>	
		  	
		  	</td>
		  </tr>
		  <tr>
			<td class="stitle">
				<table width="213" border="0" cellspacing="0" cellpadding="0">
				  <tr onClick="openDoor('plan');" style='cursor:hand;'>
					<th align="left" scope="row" ><span class="style1" >�ǽð�ȹ�ΰ�</span></th>
					<td width="50" align="right"><span class="style2">[${planCount}] �� </span></td>
				  </tr>
				</table>			</td>
		  </tr>
		  <tr>
		  	<td id="plan" height="1" background="/rams/images/map/l_bg3.gif">
		  		<div id='planDiv'></div>
		  		
		  	</td>
		  </tr>
		   <tr onClick="openDoor('suit');" style='cursor:hand;'>
			<td class="stitle">
				<table width="213" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<th align="left" scope="row"><span class="style1">�Ҽ�����</span></th>
					<td width="50" align="right"><span class="style2">[${AffairCount}]��</span></td>
				  </tr>
				</table>			</td>
		  </tr>
		  <tr>
		  	<td id="suit" height="1" background="../images/map/l_bg3.gif">
		  		<div id='suitDiv'></div>
		  	</td>
		  </tr>
		  <tr>
			<td class="stitle">
				<table width="213" border="0" cellspacing="0" cellpadding="0">
				  <tr onClick="openDoor('reward');" style='cursor:hand;'>
					<th align="left" scope="row"><span class="style1">�����������</span></th>
					<td width="50" align="right"><span class="style2">[${compeCount}]��</span></td>
				  </tr>
				</table>			</td>
		  </tr>
		  <tr>
		  	<td id="reward"  height="1" background="../images/map/l_bg3.gif">
		  		<div id='rewardDiv'></div>
		  	</td>
		  </tr>
		</table>
	  </td>
    </tr>
  </table>
</div>
<map name="Map" id="Map">
<area shape="rect" coords="160,6,247,25" onClick="goLand();"/>
<area shape="rect" coords="115,8,156,25" onClick="goList();"/>
</map>
</body>
</html>
