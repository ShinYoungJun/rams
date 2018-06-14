/*******************************************************************************
	*�����ۼ��� : 2006.06.20
	*�����ۼ��� : mylee
	*�ֿ�ó������ : �� üũ�� ���� �Լ�
	*������ :
	*������ :
	*�������� :	���� �ʿ��� ������ ����,����� ����Ͻø� �˴ϴ�
 ******************************************************************************/
/*
 *	global variable ����
 */
var KEY_ENTER = 13;
var HOST_URL = 'www.juso.go.kr';
var MAP_VERSION = '1,0,0,73';

/*
	�ڸ�����ŭ �ڸ���
	size : �Ҽ������� �ڸ���
*/
function isAllow(code) {
	rejectCode = new Array ("'","\"","/","\\",";",":","-","+");

	for(var i=0; i<rejectCode.length; i++) {
		element = rejectCode[i];
		if(element == code){	
			alert("������� �ʴ� ���ڸ� �Է��ϼ̽��ϴ�.");
			return false;
		}
	}
	return true;
}

function isBizArea(code) {
	
	if(code.length < 5)
		return true;
	else if(code.length>5)
		code = code.substring(0,5);
		
	areaCode = new Array( "27140",	"41281", "11680", "11740", "11305", "11500", "11620",
							"11215", "11530", "11545", "11350", "11320",
							"11230", "11590", "11440", "11410", "11650",
							"11200", "11290", "11710", "11470", "11560",
							"11170", "11380", "11110", "11140", "11260",
							"26440", "26410", "26290", "26170", "26260",
							"26230", "26320", "26530", "26380", "26140",
							"26500", "26710", "26200", "26470", "26110",
							"26350", "27200", "27290", "27710", "27410",
							"27230", "27170", "27260", "27100", "28245",
							"28170", "28200", "28140", "28237", "28260",
							"28185", "28110", "29200", "29155", "29110",
							"29170", "29140", "30230", "30110", "30170",
							"30200", "30140", "31140", "31170", "31200",
							"31110", "42150", "42170", "42210", "42130",
							"42110", "42720", "42190", "41282", "41285",
							"41287", "41290", "41210", "41610", "41310",
							"41360", "41250", "41197", "41199", "41195",
							"41135", "41131", "41133", "41113", "41117",
							"41111", "41115", "41273", "41271", "41550",
							"27110", "", "41370", "41463", "41465",
							"41461", "41430", "41150", "41500", "41480",
							"41450", "41590", "41570", "43150", "43111",
							"43113", "43130", "44150", "44710", "44230",
							"44180", "44131", "44200", "45130", "45210",
							"45190", "45730", "45140", "45111", "45113",
							"45180", "46230", "46110", "46150", "46130",
							"47130", "47150", "47170", "47210", "48310",
							"48240", "48110", "48190", "50130", "50110",
							"41173", "41171", "41410", "41390", "41630",
							"41460", "41220", "41650", "41830", "41730",
							"42230", "42830", "42810", "42770", "42730",
							"43760", "43720", "43770", "43745", "43750",
							"44210", "44250", "44730", "44760", "44810",
							"44790", "45710", "46170", "46710", "46840",
							"46870", "46830", "46880", "46860", "47290",
							"47190", "47230", "47110", "47280", "48160",
							"48270", "48330", "48170", "48220", "48870",
							"44133", "44130"); //44130_�������Ļ���
							
	for(var i=0; i<areaCode.length; i++) {
		element = areaCode[i];
		if(element == code){			
			return true;
		}
	}
	
	return false;
}

function isExceptArea(code){
	//areaCode = new Array("41280", "41190", "41130", "41110", "41270", "41170", "41460", "47110", "45110", "43110", "43130");
	areaCode = new Array("����", "��õ��", "������", "������", "�Ȼ��", "�Ⱦ��", "���ν�", "���׽�", "���ֽ�", "û�ֽ�","õ�Ƚ�");
	for(var i=0; i<areaCode.length; i++){
		element = areaCode[i];
		if(element == code){
			return true;
		}
	}
	return false;
}

function isEngExceptArea(code){
	//areaCode = new Array("41280", "41190", "41130", "41110", "41270", "41170", "41460", "47110", "45110", "43110", "43130");
	areaCode = new Array("Goyang-si", "Bucheon-si", "Seongnam-si", "Suwon-si", "Ansan-si", "Anyang-si", "Yongin-si", "Pohang-si", "Jeonju-si", "Cheongju-si", "Cheonan-si");
	for(var i=0; i<areaCode.length; i++){
		element = areaCode[i];
		if(element == code){
			return true;
		}
	}
	return false;
}

function trunc(num,size){
	
	var str = num+'';
	var idx = str.indexOf('.');
	var positiveNum = '';
	var decimalNum = '';

	if(idx != -1){
		positiveNum = str.substring(0,idx);
		decimalNum = str.substring(idx+1,(idx+1)+size);
		
		if(decimalNum != '00')
			return positiveNum+'.'+decimalNum;
		else
			return positiveNum;
	}
	else
		return str;
}

/*
	��� : status bar�� ��ũ ǥ�� ���ְ� title����
*/
//function setHideStatus()
//{
//    window.status="::: ���ٽ��� �������� �ȳ��ص帳�ϴ�. - �˱⽬�� ���ּ� :::";
//    return true;
//}

//if (document.layers)
//document.captureEvents(Event.mouseover | Event.mouseout);
//document.onmouseover=setHideStatus;
//document.onmouseout=setHideStatus;

/*
	��� : �Էµ����Ͱ� �ùٸ� ��ȭ��ȣ���� Ȯ�� (-����)
	----------------------------------------------
	���� : theField �Էµ�����
	��ȯ�� : boolean
*/
function isTelNum(theField){
	 var str = theField.value;
	 var isNum = /^[0-9-]+$/;
     if( !isNum.test(str) ) {
     	  alert('��ȭ��ȣ�� Ȯ�����ּ���!');
     	  theField.focus();
          return false; 
     }else {
		 return true;
	 }
}


/*
	��� : �Է¹��� �̸����� ���Ŀ� �´��� Ȯ��
	--------------------------------------
	���� : theField �Է¹��ڿ�
	��ȯ�� : boolean
*/
function isEmail(theField)
{
  var s = theField.value;
  if(s != ''){
	  if(s.search(/^\s*[\w\~\-\.]+\@[\w\~\-]+(\.[\w\~\-]+)+\s*$/g)>=0) {
		  return true;
	  }
	  else {
		  alert('�̸����ּҸ� Ȯ�����ּ���!');
		  theField.select();
		  theField.focus();
		  return false;
	  }
  }
  else
   	return true;
}

/*
���ڿ� trim�Լ�
*/
function trim(strSource) {
 
	return strSource.replace(/(^\s*)|(\s*$)/g, ""); 

}

/*
All ����ġȯ
*/
String.prototype.replaceAll = function( searchStr, replaceStr )
{
	var temp = this;

	while( temp.indexOf( searchStr ) != -1 )
	{
		temp = temp.replace( searchStr, replaceStr );
	}

	return temp;
}

/*
�� ��Ʈ�� üũ  
*/
function checkStrNVMsg(form_nm,ele_nm) {	
	if (trim(form_nm.value)=="") {
		alert(ele_nm+'��(��) �Է����ּ���!     ');
		
//		var msg = '<fmt:message key="errors.required">	<fmt:param value="'+ele_nm+'"/></fmt:message>';
//		alert(msg);
		
		form_nm.value="";
		
		form_nm.focus();
		return false;
		
	}
	return true;
}

function isCheckPW(form_nm,ele_nm) {
	
	if (trim(form_nm.value)=="") {
		alert(ele_nm+'��(��) �Է����ּ���!     ');
				
		form_nm.value="";
		
		form_nm.focus();
		return false;
	}
	if (form_nm.value.length<8)
	{
		alert("��й�ȣ�� 8�ڸ� �̻��̾�� �մϴ�.");
		form_nm.focus();
		return false;
	}
	
	return true;
	
}

/*
	�Է�ĭ�� ���ڸ� �Է¹ޱ�
	target	: 	html object(text,textarea)
*/
function isNum(form_nm, ele_nm){
	var inText = form_nm.value;
	var ret;

		for (var i = 0; i < inText.length; i++) {
			ret = inText.charCodeAt(i);
				if (!((ret > 47) && (ret < 58))) {
					alert(ele_nm+'������ ���ڸ� �Է��ϼ���');
					form_nm.value = "";
					form_nm.focus();
					return false;
				}
		}
		return true;
}

/*
	��¥�Է¹ޱ�
	target	: 	html object(text,textarea)
*/
function isDate(form_nm, ele_nm){
	var inText = form_nm.value;
	var ret;

	if(inText == "")
		return true;
		
	for (var i = 0; i < inText.length; i++) {
		ret = inText.charCodeAt(i);
			if (!((ret > 47) && (ret < 58))) {
				alert(ele_nm+'������ ���ڸ� �Է��ϼ���');
				form_nm.value = "";
				form_nm.focus();
				return false;
			}
	}

	if(inText.length != 8 ){
		
		alert('yyyymmdd ���·� �Է��ϼ���');
		form_nm.focus();
		return false;
	}

	var yyyy	= inText.substring(0,4);
	var mm 		= inText.substring(4,6);
	var dd 		= inText.substring(6,8);

	if(yyyy < 1900){
		alert('��¥�� Ȯ���ϼ���');
		form_nm.focus();
		return false;
	}
	else if(mm > 12){
		
		alert('��¥�� Ȯ���ϼ���');
		form_nm.focus();
		return false;
	}
	else if(dd < 1){
		alert('��¥�� Ȯ���ϼ���');
		form_nm.focus();
		return false;
	}
	else{
	
		var endDay = new Array(31,28,31,30,31,30,31,31,30,31,30,31);
		//����
    	if ((yyyy % 4 == 0 && yyyy % 100 != 0) || yyyy % 400 == 0) {
        	endDay[1] = 29;
  		}

    	if(dd > endDay[mm-1]){
    		alert('��¥�� Ȯ���ϼ���');
			form_nm.focus();
			return false;
    	}
    	else
    		return true;
    }
}

/*
	�Է�ĭ�� ����&������ �Է¹ޱ�
	target	: 	html object(text,textarea)
*/
function isNumOrEngChar(form_nm, ele_nm){
	var inText = form_nm.value;
	var ret;

		for (var i = 0; i < inText.length; i++) {
			ret = inText.charCodeAt(i);

				if (!((ret>47 && ret<58) || (ret>64 && ret<91) || (ret>96&&ret<123)))
				{
					alert(ele_nm+'������ ���ڿ� ������ �Է��ϼ���');
					form_nm.value = "";
					form_nm.focus();
					return false;
				}
		}
		return true;
}

function Check_AlphaNumericSpecial(checkStr, value) {
	var checkOK = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	var checkNUM = "0123456789";
	var result = 0;
	var resultOK = 0;
	
	for (i = 0;  i < checkStr.value.length;  i++) {
		var ch = checkStr.value.charAt(i);
		
		for (j = 0;  j < checkOK.length;  j++){
			//alert(ch+","+checkOK.charAt(j));
			if (ch == checkOK.charAt(j)){
				//alert(ch+","+checkOK.charAt(j)+"|");
				result = 1;
			}
		}
		
	}
	if (result==1)
	{
		for (k = 0;  k < checkStr.value.length;  k++) {
			var ch = checkStr.value.charAt(k);
			
			for (n = 0;  n < checkNUM.length;  n++){				
				if (ch == checkNUM.charAt(n)){
					result = 2;					
				}				
					//return true;
			}			
		}
		if (result==2)
		{
			return true;
		}
		else 
		{
			alert(value+"�� ����/���� ȥ���̿��� �մϴ�.");
			return false;
		}
	}
	else{	
		alert(value+"�� ����/���� ȥ���̿��� �մϴ�.");
		return false;
	}
}

function AlphaNumericSpecial(checkStr, value) {
	var checkOK = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	var checkNUM = "0123456789";
	var result = 0;
	var resultOK = 0;
	
	for (i = 0;  i < checkStr.value.length;  i++) {
		var ch = checkStr.value.charAt(i);
		
		for (j = 0;  j < checkOK.length;  j++){
			//alert(ch+","+checkOK.charAt(j));
			if (ch == checkOK.charAt(j)){
				//alert(ch+","+checkOK.charAt(j)+"|");
				result = 1;
			}
		}
		
	}
	if (result==1)
	{
		for (k = 0;  k < checkStr.value.length;  k++) {
			var ch = checkStr.value.charAt(k);
			
			for (n = 0;  n < checkNUM.length;  n++){				
				if (ch == checkNUM.charAt(n)){
					//alert(ch+","+checkNUM.charAt(n)+"|");
					return true;
				}
					//return true;
			}
			
		}
	}
	else{	
		alert(value+"�� ����/���� ȥ���̿��� �մϴ�.");
		return false;
	}
}

//üũ�ڽ� ��ü����, ��������
function checkAll(formname,checkname,thestate){
	var el_collection=eval("document.forms."+formname+"."+checkname)

	if(el_collection != null)	{
		if(el_collection.length){
			for (c=0;c<el_collection.length;c++)
				el_collection[c].checked=thestate
		}
		else{
			el_collection.checked=thestate;
		}
	}
}

/**
* �Է��ʵ��� ��ȿ�� �˻縦 ���ش�
* @param obj     : input ��ü
* @param objname : �ʵ�� (ex) ����
* @param astr    : �Է°��� ������ �д�(STRING_DEF_ALPHA,STRING_DEF_NUMBER,STRING_DEF_TELDIGIT�� �̿��ϸ� ���մϴ�)
*                  ������ �� ���� ����ϴ� ���̴�
* @param lmin    : �ּ� �Է±���(byte ��)
* @param lmax    : �ִ� �Է±���(byte ��)
* @param showmsg : true�̰ų� �ƿ� �ѱ��� ������ alert�� �Ѵ�
*                   false �̸� check�ϰ� ����� true,false�� return �Ѵ�
*/
function isString( obj , objname, astr, lmin, lmax , showmsg ){
	var i
	var t = obj.value;
	var lng = GetByteLength(obj);

	if (lng < lmin || lng > lmax) {
		if(showmsg!=null && showmsg) {
			if (lmin == lmax) alert(objname + '�� ' + lmin + ' �� �̾�� �մϴ�');
			else alert(objname + '�� ' + lmin + ' ~ ' + lmax + ' �� �̳��� �Է��ϼž� �մϴ�');
			obj.focus()
		}
		return false
	}
	if (astr.length > 1) {
		for (i=0; i < lng; i++){
			if(astr.indexOf(t.substring(i,i+1))<0) {
				if(showmsg!=null && showmsg) {
					alert(objname + '�� ����� �� ���� ���ڰ� �ԷµǾ����ϴ�');
					obj.focus()
				}
				return false
			}
		}
	}
	return true
}

/**
* ��Ʈ���� ����Ʈ ���� ����(length�� �ϸ� �ѱ۵� ����1�� �����µ� ����Ʈ ���� 2�� �ȴ�)
* @param obj   : textfield ,textarea objec
* @return ����Ʈ ��
*/
function getByteLength( obj ){
	var msg = obj.value;
	var str = new String(msg);
	var len = str.length;
	var count = 0;
	for (k=0 ; k<len ; k++){
		temp = str.charAt(k);

		if (escape(temp).length > 4) {
			count += 2;
		}
		else if (temp == '\r' && str.charAt(k+1) == '\n') { // \r\n�� ���
			count += 2;
		}
		else if (temp != '\n') {
			count++;
		}
        else {
            count++;
        }
    }
	return count;	
}

/**
* �Է��ʵ忡 ���鸸 �ԷµǾ����� �˻縦 ���ش�
* @param obj     : input ��ü
* @param objname : �ʵ�� (ex) ����
* @param showmsg : true�̰ų� �ƿ� �ѱ��� ������ alert�� �Ѵ�
*                   false �̸� check�ϰ� ����� true,false�� return �Ѵ�
*/
function isBlank( obj , objname , showmsg){
	if(obj.value.replace(/ /ig,"")==""){
		if(showmsg!=null && showmsg) {
			alert(objname + "��(��) �Է��ϼ���!");
			obj.focus();
		}
		return false;
	}
	return true;
}

/**
* ��Ʈ���� ����Ʈ ���� ����(length�� �ϸ� �ѱ۵� ����1�� �����µ� ����Ʈ ���� 2�� �ȴ�)
* @param obj   : textfield ,textarea objec
* @return ����Ʈ ��
*/
function getBytes( str ){
	var str = new String(str);
	var len = str.length;
	var count = 0;

	for (k=0 ; k<len ; k++){
		temp = str.charAt(k);
		
		if (escape(temp).length > 4) {
			count += 2;
		}
		else if (temp == '\r' && str.charAt(k+1) == '\n') { // \r\n�� ���
			count += 2;
		}
		else if (temp == '\r') { // \r�� ���
			count++;
		}
		else if (temp != '\n') {
			count++;
		} else {
			count++;
		}	
	}
	return count;	
}

/**
* ��Ʈ���� ����Ʈ ����ŭ �ڸ���. ���� �ѱ��� ������ �ʰ� �߶��ش�(�ѱ��� ©����� ������ ���Ѵ�)
* maxlength��ŭ �ڸ� �� obj�� ���� �ڸ� ����� setting�Ѵ�
* @param obj       : textfield ,textarea objec
* @param mexlength : �ִ����
*/
function cutBytesString( str, maxlength) {
	var len=0;
	var temp;
	var count;
	count = 0;
		
	len = str.length;

	for(k=0 ; k<len ; k++) {
		temp = str.charAt(k);

		if (escape(temp).length > 4) {
			count += 2;
		}
		else if (temp == '\r' && str.charAt(k+1) == '\n') { // \r\n�� ���
			count += 2;
		}
		else if (temp == '\r') { // \r�� ���
			count++;
		}
		else if (temp != '\n') {
			count++;
		} else {
			count++;
		}	
		if(count > maxlength) {
			str = str.substring(0,k);
			break;
		}
	}
	return str;
}

/**
* �˾������츦 ����
* @param pop       : url
* @param winName   : �˾� ������ �̸�
* @param width, height : �ʺ�, ����
* @param scroll	: scroll����(yes/no)
* @param resize	: ���콺 �巡�׷� ������ ũ�� ���� ���� ����(yes/no)
*/
function popWindow(pop,winName,width,height,scroll,resize)
{
	var url = pop;  
	var openWin;
	if (scroll == "" || scroll == null) {
		scroll = "no";
	} else{
		scroll = scroll;
	}
	if (resize == "" || resize == null) {
		resize = "no";
	} else{
		resize = resize;
	}
	window.open(url,winName,'menubar=no,scrollbars='+scroll+',resizable='+resize+',width='+width+',height='+height+',left=100,top=100');
	
	if(openWin && !openWin.closed)
	{
		openWin.focus();
	}
}	

/**
* select�� ���õ� ���� ����
* @param obj       : select��ü
*/
function getSelectedValue(obj)
{
	return obj.options[obj.selectedIndex].value;

}

/**
* select�� option�� ���õ� ������ ����
* @param obj       : select��ü
* @param val       : ���ý�ų option�� value
*/
function setSelectedOption(obj, val)
{

	for(i = 0 ; i < obj.options.length ; i++){
		if(obj.options[i].value == val){

			obj.options[i].selected = true;
			return;
		}
	}
}

/**
* select�� option�� ���õ� ������ ���� (name����)
* @param obj       : select��ü
* @param val       : ���ý�ų option�� value
*/
function setSelectedOptionByName(obj, val)
{

	for(i = 0 ; i < obj.options.length ; i++){
		if(obj.options[i].name == val){

			obj.options[i].selected = true;
			return;
		}
	}
}

/**
* ���� ���� üũ
* @param form       : �Է�����ü
*/
	function checkFileCount(form, cnt){

		var w = form;
		
		if(document.all("ch_file") != null){
		
			// ���� ÷�ε� ���ϰ��� üũ
			// uncheck�� üũ�ڽ� ����+������ǲ���� <= 3
			var chObj = w.ch_file;
			var chCount = chObj.length;
			var fileCount = 0 ;			// ���� ����
			
			// ���������� �Ѱ��� ���
			if(chCount == undefined ){
				if(chObj.checked == false)
					fileCount = fileCount + 1;
			} 
			// ���������� �ΰ� �̻��� ���
			else if (chCount > 1){
				for(i = 0 ; i < chCount ; i++){
					if(chObj[i].checked == false)
						fileCount = fileCount + 1;	// �������ϰ��� �ջ�
				}
			}
		}

		// ���� ÷�ε� ���ϰ��� üũ
		fileCount = fileCount+parseInt(w.total_file_index.value);

		if(fileCount > cnt){
			alert("������ "+cnt+"������ ���ε��� �� �ֽ��ϴ�");
			return false;
		}	
		
		return true;

	}
	

/**
* checkbox array ���õ� ���� �ִ��� Ȯ��
*/
		function isCheckboxChecked(obj, ele_nm)
		{ 
			var chCount = obj.length;
			
			if(chCount == undefined ){
				return true;
			} 
			else if (chCount > 1){
				for(i = 0 ; i < chCount ; i++){
					if(obj[i].checked == true)
						return true;
				}
				alert(ele_nm+'��(��) �������ּ���!     ');
				//obj.focus();
				return false;
			}
			return true;
		} 
		
/**
* select ���õ� ���� �ִ��� Ȯ��
*/
		function isSelectSelected(obj, ele_nm)
		{ 
			if(getSelectedValue(obj) == ''){
				alert(ele_nm+'��(��) �������ּ���!     ');
				obj.focus();
				return false;
			}
			return true;			
		} 
		
/**
* radio array ���õ� ���� �ִ��� Ȯ��
*/
		function isRadioChecked(obj, ele_nm)
		{ 
			var chCount = obj.length;
			
			if(chCount == undefined ){
				return true;
			} 
			else if (chCount > 1){
				for(i = 0 ; i < chCount ; i++){
					if(obj[i].checked == true)
						return true;
				}
				alert(ele_nm+'��(��) �������ּ���!     ');
				return false;
			}
			return true;
		} 

/**
* ���ι�ȣ Ȯ��
*/
function isValidCorpNum(obj1, obj2, ele_nm){

	var corpNum = obj1.value+''+obj2.value;
	
	if(corpNum.length != 13){
		alert('���ε�Ϲ�ȣ�� Ȯ�����ּ���');
		obj1.focus();
		return false;
	}
	else if(!isNum(obj1, ele_nm)){
		
		return false;
	}
	else if(!isNum(obj2, ele_nm)){
		
		return false;
	}
	else if(Math.abs((10-(corpNum.charAt(0)*1+corpNum.charAt(1)*2+corpNum.charAt(2)*1+
                               corpNum.charAt(3)*2+corpNum.charAt(4)*1+
                               corpNum.charAt(5)*2+corpNum.charAt(6)*1+
                               corpNum.charAt(7)*2+corpNum.charAt(8)*1+
                               corpNum.charAt(9)*2+corpNum.charAt(10)*1+
                               corpNum.charAt(11)*2)%10)%10) == corpNum.charAt(12)){
		return true;
	}
	else{
		alert('���ε�Ϲ�ȣ�� ��ȿ���� �ʽ��ϴ�');
		obj1.focus();
		return false;
	}
}

/**
* radio array ���õ� �� ����
*/
		function getRadioChecked(obj)
		{ 
			var chCount = obj.length;

			if(chCount == undefined ){
				return null;
			} 
			else if (chCount > 1){
				for(i = 0 ; i < chCount ; i++){
					if(obj[i].checked == true)
						return obj[i].value;
				}
				return null;
			}
			return null;
		} 
		
/**
*checkbox, radiobutton disabled�� ��ȯ
*/
		function setRadioDisabled(obj, flag)
		{ 
			var chCount = obj.length;
			
			if(chCount == undefined ){
				return ;
			} 
			else if (chCount > 1){
				for(i = 0 ; i < chCount ; i++){
					obj[i].disabled = flag;
				}
			}
		} 

/**
*������ �� ��Ʈ�� Ȱ��ȭ 
*/
function ObjectLoad(objTag)
{
	document.write(objTag);
}

function isValidSsn(obj1, obj2){
	
	var chk =0;
	
	for (var i = 0; i <=5 ; i++){
		chk = chk + ((i%8+2) * parseInt(obj1.value.substring(i,i+1)))
		}
		
		for (var i = 6; i <=11 ; i++){
		chk = chk + ((i%8+2) * parseInt(obj2.value.substring(i-6,i-5)))
		}
		
		chk = 11 - (chk %11)
		chk = chk % 10
		
		if (chk != obj2.value.substring(6,7))
		{
			alert ("�ֹε�Ϲ�ȣ�� ��ȿ���� �ʽ��ϴ�.");
			obj1.focus();
			return false;
		}
		return true;
}

/**
* ����ڹ�ȣ ��ȿ�� üũ
*/
function isValidBusNum(obj1,obj2,obj3) {
	if(obj1.value+''+obj2.value+''+obj3.value != ''){
		if (obj1.value+''+obj2.value+''+obj3.value == '0000000000')
		{
			alert("����ڵ�Ϲ�ȣ�� ��ȿ���� �ʽ��ϴ�.");
			obj1.focus(); 
			return false; 
		}

		if (BizCheck(obj1,obj2,obj3) == false) { 
			alert( "����ڵ�Ϲ�ȣ�� ��ȿ���� �ʽ��ϴ�." ); 
			obj1.focus(); 
			return false; 
		} else { 
			return true; 
		} 
	}
	else
		return true;
}

//����� ��Ϲ�ȣ üũ 
function BizCheck(obj1, obj2, obj3) 
{ 
	biz_value = new Array(10); 
	
	var objstring = obj1.value +"-"+ obj2.value +"-"+ obj3.value; 
	var li_temp, li_lastid; 
	
	if ( objstring.length == 12 ) { 
	biz_value[0] = ( parseFloat(objstring.substring(0 ,1)) * 1 ) % 10; 
	biz_value[1] = ( parseFloat(objstring.substring(1 ,2)) * 3 ) % 10; 
	biz_value[2] = ( parseFloat(objstring.substring(2 ,3)) * 7 ) % 10; 
	biz_value[3] = ( parseFloat(objstring.substring(4 ,5)) * 1 ) % 10; 
	biz_value[4] = ( parseFloat(objstring.substring(5 ,6)) * 3 ) % 10; 
	biz_value[5] = ( parseFloat(objstring.substring(7 ,8)) * 7 ) % 10; 
	biz_value[6] = ( parseFloat(objstring.substring(8 ,9)) * 1 ) % 10; 
	biz_value[7] = ( parseFloat(objstring.substring(9,10)) * 3 ) % 10; 
	li_temp = parseFloat(objstring.substring(10,11)) * 5 + "0"; 
	biz_value[8] = parseFloat(li_temp.substring(0,1)) + parseFloat(li_temp.substring(1,2)); 
	biz_value[9] = parseFloat(objstring.substring(11,12)); 
	li_lastid = (10 - ( ( biz_value[0] + biz_value[1] + biz_value[2] + biz_value[3] + biz_value[4] + biz_value[5] + biz_value[6] + biz_value[7] + biz_value[8] ) % 10 ) ) % 10; 
	if (biz_value[9] != li_lastid) { 
	obj1.focus(); 
	obj1.select(); 
	return false; 
	} 
	else 
	return true; 
	} 
	else { 
	obj1.focus(); 
	obj1.select(); 
	return false; 
	} 
} 

function isNullPoint(obj){
	if(obj == 'null' || obj == ""){
		obj = "-";
	}
	return obj;
}

// �õ�MAP �ڵ�,���̾� ����

function getLayerID(cd){
	
	var retValue;

	if(cd.substring(0,2) == '42')	retValue = 1;	//������
	if(cd.substring(0,2) == '43')	retValue = 3;	//��û�ϵ�
	if(cd.substring(0,2) == '30')	retValue = 4;	//����
	if(cd.substring(0,2) == '11')	retValue = 2;	//����
	if(cd.substring(0,2) == '27')	retValue = 5;	//�뱸
	if(cd.substring(0,2) == '31')	retValue = 6;	//���
	if(cd.substring(0,2) == '29')	retValue = 7;	//����
	if(cd.substring(0,2) == '41')	retValue = 8;	//��⵵
	if(cd.substring(0,2) == '44')	retValue = 9;	//�泲
	if(cd.substring(0,2) == '50')	retValue = 10;	//����
	if(cd.substring(0,2) == '45')	retValue = 11;	//����
	if(cd.substring(0,2) == '46')	retValue = 12;	//����
	if(cd.substring(0,2) == '28')	retValue = 13;	//��õ
	if(cd.substring(0,2) == '26')	retValue = 14;	//�λ�
	if(cd.substring(0,2) == '47')	retValue = 15;	//���
	if(cd.substring(0,2) == '48')	retValue = 16;	//�泲
	
	retValue = ( 2 + ( (retValue - 1) * 4) ) + 1;
	
	return retValue;
		
	
}

// �õ�MAP �ڵ�,���̾� ����

function getLayerIDByEngName(engName){

	if(engName == 'busan')			return 14;
	if(engName == 'chungbuk')		return 3;
	if(engName == 'chungnam')		return 9;
	if(engName == 'daegu')			return 5;
	if(engName == 'dagjeon')		return 4;
	if(engName == 'gangwon')		return 1;
	if(engName == 'gyeonggi')		return 8;
	if(engName == 'gyeongnam')		return 16;
	if(engName == 'gyungbuk')		return 15;
	if(engName == 'incheon')		return 13;
	if(engName == 'jeju')			return 10;
	if(engName == 'jeonbuk')		return 11;
	if(engName == 'jeonnam')		return 12;
	if(engName == 'kwangju')		return 7;
	if(engName == 'seoul')			return 2;
	if(engName == 'ulsan')			return 6;
}

//�ʾȳ� ���� ��Ű�̿�
function setCookie(name, value) 
{ 
	var todayDate = new Date(); 
	todayDate.setDate( todayDate.getDate() + 365 ); 
	document.cookie = name + "=" + escape( value ) + "; path=/; expires=" + todayDate.toGMTString() + ";" 
} 

//�ʾȳ� ���� ��Ű�̿�
function setCookies(name, value, days) 
{ 
	var todayDate = new Date(); 
	todayDate.setDate( todayDate.getDate() + days ); 
	document.cookie = name + "=" + escape( value ) + "; path=/; expires=" + todayDate.toGMTString() + ";" 
} 

//��Ű �Ҹ� �Լ� 
function clearCookie(name) { 
    var today = new Date() 
    //���� ��¥�� ��Ű �Ҹ� ��¥�� �����Ѵ�. 
    var expire_date = new Date(today.getTime() - 60*60*24*1000) 
    document.cookie = name + "= " + "; expires=" + expire_date.toGMTString() 
} 

function getCookieVal(name)
{
	var nameOfCookie = name + "=";
	var x = 0;
	while ( x <= document.cookie.length )
	{
			var y = (x+nameOfCookie.length);
			if ( document.cookie.substring( x, y ) == nameOfCookie ) {
					if ( (endOfCookie=document.cookie.indexOf( ";", y )) == -1 )
							endOfCookie = document.cookie.length;
					return unescape( document.cookie.substring( y, endOfCookie ) );
			}
			x = document.cookie.indexOf( " ", x ) + 1;
			if ( x == 0 )
					break;
	}
	return "";
}

function setCenterLayer(name){
	var xMax = document.body.clientWidth, yMax = document.body.clientHeight;

	var xOffset = (xMax-210)/2, yOffset = (yMax-150)/2+50; 
	//�߽ɿ��� ���������� 20, �Ʒ��� 40�ȼ��� �׻� ��ġ�ϴ� ���̾�
	
	return xOffset+"^"+yOffset;

}

function getByteLength(input) {
    var byteLength = 0;
    for (var inx = 0; inx < input.value.length; inx++) {
        var oneChar = escape(input.value.charAt(inx));
        if ( oneChar.length == 1 ) {
            byteLength ++;
        } else if (oneChar.indexOf("%u") != -1) {
            byteLength += 2;
        } else if (oneChar.indexOf("%") != -1) {
            byteLength += oneChar.length/3;
        }
    }
    return byteLength;
}

//��ø� ��ٸ����� �����~

var ie = document.all;
var moz = document.getElementById && !document.all;
var intr;

function Message_UpdatePos(msg,dy){
 var el = document.getElementById(msg);
	   if(ie){
		el.style.pixelTop = document.body.scrollTop+dy;

	   }
	   else if(moz){
		el.style.top = window.pageYOffset + dy + 'px';


	   }
 }

// �޼��� ���̱�

function Message_Display(msg,msgMain,vis){
	var _msg = document.getElementById(msg);
	
	var dx = parseInt(document.body.clientWidth/2)+parseInt(document.getElementById(msgMain).width/2);
	var dy = parseInt(document.body.clientHeight/2)-parseInt(document.getElementById(msgMain).height/2);
		
	if(ie){
		_msg.style.pixelTop = document.body.scrollTop + dy;
		_msg.style.pixelLeft = document.body.clientWidth - dx;
	}
	else if(moz){
		_msg.style.top = window.pageYOffset + dy + 'px';
		_msg.style.left = window.innerWidth - dx + 'px';
	}


	if(vis){
		_msg.style.visibility = "visible";
		intr = setInterval("Message_UpdatePos('" + msg + "', " + dy + ")",1);
	}else{
		_msg.style.visibility = "hidden";
		if(intr)
			clearInterval(intr);
	}
}

// ���ڸ��� 0 ���̱�
function addZero(txt,count){
    var temp = '';
    for(var i = 0; i < count-txt.length;i++){
        temp = '0'+temp;
    }
    return temp+txt;
}

function addSSNDash(txt){
	
	if(txt.indexOf('-') == '-1' && txt.length > 0)
	{
		txt = txt.substring(0,6)+'-'+txt.substring(6,13);
	}
	
	return txt;
}

function changeSelectTag(target,value){
	var obj = document.getElementById(target).options;

	for(var i = 0 ; i < obj.length ; i++){
		if(obj[i].value == value){
			obj[i].selected = true;
		} 
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

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
	var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
	var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
		d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
	if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
	for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
	if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
	var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
	if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}

function MM_showHideLayers() { //v6.0
	  var i,p,v,obj,args=MM_showHideLayers.arguments;
	  for (i=0; i<(args.length-2); i+=3) if ((obj=MM_findObj(args[i]))!=null) { v=args[i+2];
	    if (obj.style) { obj=obj.style; v=(v=='show')?'visible':(v=='hide')?'hidden':v; }
	    obj.visibility=v; }
}

function trMoouseOver(obj){
	for(var i = 0; i < obj.cells.length ; i++){
		obj.cells[i].style.backgroundColor='#f6f6f6';
	}
	
}

function trMoouseOut(obj){
	for(var i = 0; i < obj.cells.length ; i++){
		obj.cells[i].style.backgroundColor='#ffffff';
	}
}



