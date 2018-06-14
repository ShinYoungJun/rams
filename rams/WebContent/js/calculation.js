

            function junggi_calDate()
            {

                var fromDate = removeDash(document.getElementById("FROMDATE").value);
                var toDate = removeDash(document.getElementById("TODATE").value);


                var period = junggi_getDiffMon(fromDate,toDate)  ;

                document.getElementById("period").value = period;

                var fromDay1 = new Date(fromDate.substr(0,4),fromDate.substr(4,2),fromDate.substr(6,2));

                var toDay1 = new Date(toDate.substr(0,4),toDate.substr(4,2),toDate.substr(6,2));

            }



	function calDate()
	{
		var fromDate = removeDash(document.getElementById("FROMDATE").value);
		var toDate = removeDash(document.getElementById("TODATE").value);
		
		if(document.getElementById("date_type").value=="month"){		
			var period = getDiffMon(fromDate,toDate);
		}else if(document.getElementById("date_type").value=="day"){
			var period = getDiffDay(fromDate,toDate);
		}else{
			var period = getDiffMon(fromDate,toDate);
		}
		document.getElementById("period").value = period;
	}	
	
	////////////////////////////////////////////////////////////////
	// ��¥������ �ϼ� ��� �Լ�(pkh 2009.10.15)
	
	// Check how many days there are on the inputted year and month
	// ��� ���� �Է��ϸ�, �Ѵ޿� ������ �ִ��� Ȯ���ϴ� �Լ��Դϴ�.
	function f_dayofmonth(yy,mm)
	{
		switch (mm){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				return 28 + f_leapyear(yy);
		}
	}


	function day_cal(yy, mm, dd){	//�ش�⵵���� �ϼ� ���

		var tot = 0;
		for(var i=1;i<mm;i++){
			tot += f_dayofmonth(yy,i);
		}
		return tot+dd;
	}
	
	function f_leapyear(yy)		//���� ���ϴ� �Լ�
	{
		if (yy%4==0 && yy%100!=0 || yy%400==0)
		return 1;
		else
		return 0;
	}
	
	
	function getDiffDay(val1, val2){	//��¥ �ϼ� ���
		var sdate_year = Number(val1.substr(0,4));
		var sdate_month = Number(val1.substr(4,2));
		var sdate_day = Number(val1.substr(6,2));
		var edate_year = Number(val2.substr(0,4));
		var edate_month = Number(val2.substr(4,2));
		var edate_day = Number(val2.substr(6,2));

		var year_result = edate_year-sdate_year;
		
		var tot = 0;
		
		tot += year_result*365;		//�⵵ ���� �ϼ� ���
		
		tot += -day_cal(sdate_year, sdate_month, sdate_day)+1;		//���� ��¥ �ϼ� ���
		tot += day_cal(edate_year, edate_month, edate_day);			//���� ��¥ �ϼ� ���
		
		return tot;
	}

	/////////////////////////////////////////////////////////////////////////////////////
	
    //�� ���� ���
    function junggi_getDiffMon(val1,val2)
    {

        var sdate = new Date(Number(val1.substr(0,4)),Number(val1.substr(4,2))-1,Number(val1.substr(6,2)));
        var edate = new Date(Number(val2.substr(0,4)),Number(val2.substr(4,2))-1,Number(val2.substr(6,2)));

        var sDate  = sdate.getDate();
        var count=0;

        edate.setDate(edate.getDate()+1);

        while (Date.parse(edate)>=Date.parse(sdate)) {
            if(sdate.getDate() == sDate){ //�ش� ���ϰ� ���ٸ�...
                count++;
            }
            sdate.setDate(sdate.getDate()+1); //������ ��� ����
        }
        return count-1;
    }
	
	//�� ���� ���
	function getDiffMon(val1,val2)
	{   
		// ��¥ �Է� ���� : yyyy-mm-dd
	    var sdate_year = Number(val1.substr(0,4));
	    var sdate_month = Number(val1.substr(4,2));
	    var sdate_day = Number(val1.substr(6,2));
	    var edate_year = Number(val2.substr(0,4));
	    var edate_month = Number(val2.substr(4,2));
	    var edate_day = Number(val2.substr(6,2));
	    
	    var year = edate_year - sdate_year;			//�����̸� ����ϰ�
	    var month = edate_month - sdate_month -1;	//�����̸� ����ϰ�  

	    var month_count = 0;
	    
	    if(sdate_day <= edate_day){					
	    	if(sdate_day>=30 && edate_day>=30 && sdate_month!=edate_month){		// ����) 8��31�� ���� 9�� 30�� ���� �϶� �޼� +1 ����
	    		month_count++;
	    	}else{		//�������ڰ� �������ں��� ������ �޼� +1 ����
	    		month_count++;
	    	}
	    	
	    }
	    
	    if(sdate_month==2 && edate_month==2 && sdate_day<edate_day && sdate_day==1){	// 2���� �� Ư���� ����� 2��1�Ϻ��� 2�� ���� �϶� �ް��
	    																				// �������ڰ� 1�̰� 
	    	if ((edate_year % 4 == 0 && edate_year % 100 != 0) || edate_year % 400 == 0){	//���� ���ο� �����ؼ� 
	    		if(edate_day==29)		//�����̸� ������ ��¥�� 29���϶� �޼� +1 ����
	    			month_count++;
	    	}else{
	    		if(edate_day==28)		//������ �ƴϸ� ������ ��¥�� 28�϶� +1����
	    			month_count++;
	    	}		
	    }
	    
	    if(sdate_month==edate_month && sdate_day==1 && edate_day>=30){	// ������ 1�Ϻ��� ���� �϶� �޼� +1 ����
	    	month_count++;
	    }
	    
	    if(sdate_day==1 && edate_day>=30 && sdate_month!=edate_month){		// �������ڰ� 1���̰� ������ ��¥�� 30�� �̻��̸� �޼� +1 ����
	    	month_count++;
	    }
	    
	    month_count = month_count + (year*12) + month;	//���������� �޼� ���
	    
	    return month_count;
	}
	
	//xml js�κ�
	function getXMLRequest()
	{	
	    if(window.ActiveXObject)	
	    {	
	       try	
	       {	
	           return new ActiveXObject("MSXML2.XMLHttp");	
	       }	
	       catch(e)	
	       {
	           try{
	              return new ActiveXObject("Microsoft.XMLHttp");	
	            }
	           catch(e)
	           {
	              return null;
	           }
	       }
	    }
	    else if(window.XMLHttpRequest)	
	    {	
	       return new XMLHttpRequest();	
	    }	
	    else	
	    {	
	       return null;	
	    }	
	}	 
	
	var httpRequest = null;	 
	
	//�Ű�����: ������ ������, ������ ������, �������� ������ �ڷḦ �޴� �Լ�, ���۹��
	
	function sendRequest(url, params, callback, method)	
	{	
	   httpRequest = getXMLRequest();
	
	    //������ ���޹���� ������ �Ǿ����� Ȯ���Ѵ�. ���� ������ �ȵǾ��ٸ�	
	    //GET������� �����ϵ��� �Ѵ�.
	
	    var httpMethod =  method ? method:"GET";
	
	    if(httpMethod != "GET" && httpMethod !="POST")	
	    {
	       httpMethod = "GET";
	    }

	    //���� ������ ������ �ּҸ� �޴´�.	
	    var httpParams = (params==null || params =="")?null:params;	
	    var httpUrl = url;	
	    if(httpMethod =="GET" && params !=null)	
	    {	
	       httpUrl =httpUrl +"?"+httpParams;
	    }
	    httpRequest.open(httpMethod,httpUrl,true);
	    httpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	
	    //onreadystatechange�� ������ Ŭ����Ʈ�� ���¸� �����Ͽ� ��ȭ�� ������
	
	    httpRequest.onreadystatechange = callback;
	
	    httpRequest.send(httpMethod=="POST" ? httpParams:null);   	
	}	
	
	
	
	//ajax js ��
	
		
	//[ , ] ����
	function removeComma2(numValue)
	{	
		num = document.getElementById(numValue).value;		
		document.getElementById(numValue).value = Number(num.split(',').join(""));
	}
	
	
	function removeComma(numValue)
	{
		return Number(numValue.split(',').join(""));
	}
	
	
	function fn_addComma(chknum){
        num = chknum.value;
        num = num.split(',').join('');
        var arr = num.split('.');
        var num = new Array();
        for (i = 0; i <= arr[0].length-1; i++) {
            num[i] = arr[0].substr(arr[0].length-1-i,1);
        if(i%3 == 0 && i != 0) num[i] += ',';
        }
        num = num.reverse().join('');
        if (!arr[1]) chknum.value = num; else chknum.value = num+'.'+arr[1];

	} 
	
	function onlyNumberInput()
	{

		
	 var code = window.event.keyCode;
	 
	 if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110 || code == 189 || code == 109   )
	 {
	  	window.event.returnValue = true;
		return;
	 }else 
	 {	 
	 	window.event.returnValue = false;
	 	return;
 	 }
	}
	
	// �޸� ����
	function insertComma(val1)
	{
	
		value1 = document.getElementById(val1).value;
		
		

		
		var length1 = value1.length;		
		var divideNum = length1%3;
		var returnValue2 ="";
		
		if(divideNum != 0)
		{
			returnValue2 = value1.substr(0,divideNum)+",";
		}
		
		if(length1 >3)
		{
			while(true)
			{
				returnValue2 = returnValue2 + value1.substr(divideNum,3)+",";
				
				divideNum = divideNum+3;
				if(length1 <= divideNum)
					break;
			}
		}
		
		if(returnValue2 == "")
			returnValue2 = value1;
		else
			returnValue2 = returnValue2.substr(0,returnValue2.length - 1);

		document.getElementById(val1).value = returnValue2;
	}
	
	
	
		// �޸� ���� - ��ȯ
	function insertComma2(value1)
	{	
		value1 = value1+"";
		
		var length1 = value1.length;
		
		if(Number(value1) < 0)
			length1 = length1 - 1;
		
				
		var divideNum = length1%3;
		var returnValue2 ="";
		
		if(divideNum != 0)
		{
			returnValue2 = value1.substr(0,divideNum)+",";
		}
		
		if(length1 >3)
		{
			while(true)
			{
				returnValue2 = returnValue2 + value1.substr(divideNum,3)+",";
				
				divideNum = divideNum+3;
				if(length1 <= divideNum)
					break;
			}
		}
		
		if(returnValue2 == "")
			returnValue2 = value1;
		else
			returnValue2 = returnValue2.substr(0,returnValue2.length - 1);

		return returnValue2;
	}
	
	
	

	
	
	// �뽬 ����
	function removeDash(numValue)
	{
		return numValue.split('-').join("");
	}
	
	
	//��¥�� dash(-) ����
	function addDash2(num1)
	{
		num = document.getElementById(num1).value;
		document.getElementById(num1).value =  (num.substr(0,4)+"-"+num.substr(4,2)+"-"+num.substr(6,2));
	}
	
	function setParentYear(yearVal)
	{
		parent.document.getElementById("year").value = yearVal;
	}
	
	function fixFloatCal(val){
		return  Math.round( parseFloat(val) *1000) /1000;
		
	}
	
    function calJojung(addSum){

    	var ret;
        if(addSum >= 10 && addSum < 20){
		
            ret = (1.1+((addSum/100-10/100)*3/10));
        }else if(addSum >= 20 && addSum < 50){
        	ret = 1.13+((addSum/100-20/100)*1/10);
        }else if(addSum >= 50 && addSum < 100){
        	ret = 1.16+((addSum/100-50/100)*6/100);
        }else if(addSum >= 100 && addSum < 200){
        	ret = 1.19+((addSum/100-100/100)*3/100);
        }else if(addSum >= 200 && addSum < 500){
        	ret = 1.22+((addSum/100-200/100)*1/100);
        }else if(addSum >= 500){
        	ret = 1.25+((addSum/100-500/100)*5/1000);
        }

		ret = Math.round( parseFloat(ret) *10000) /10000;

		return ret;
		
    }
    
    function setFROMTO(num,ifnum,tonum){
    	if(num == ifnum){
    		return tonum;
    	}else{
    		return num;
    	}
    }
    
    
    
    function inquiryVatYN(section,type,purposecd,sum){

		var retVal =String(section)+String(type)+String(purposecd);
		
    	// �����϶� 
    	if(retVal.substring(0,1) == "3"){
    		return 0;
    	// ���� �ƴҶ�
    	}else{
    		// ���� �ƴϸ鼭 Ư�� �����ϋ�
    		if(
    				retVal.substring(1,5) == "1010" ||
    				retVal.substring(1,5) == "1030" ||
    				retVal.substring(1,5) == "1040" ||
    				retVal.substring(1,5) == "1921" ||
    				retVal.substring(1,5) == "1922" ||
    				retVal.substring(1,5) == "2011" ||
    				retVal.substring(1,5) == "2013" ||
    				retVal.substring(1,5) == "2014" ||
    				retVal.substring(1,5) == "2021" ||
    				retVal.substring(1,5) == "2127" ||
        			retVal.substring(1,5) == "2227" ||
        			retVal.substring(1,5) == "2327" ||
        			retVal.substring(1,5) == "2427" ||
        			retVal.substring(1,5) == "2121" ||
        			retVal.substring(1,5) == "2221" ||
        			retVal.substring(1,5) == "2321" ||
        			retVal.substring(1,5) == "2421" ||
        			retVal.substring(1,5) == "3011" ||
        			retVal.substring(1,5) == "3013" ||
        			retVal.substring(1,5) == "3014" ||
        			retVal.substring(1,5) == "3021" ||
        			retVal.substring(1,5) == "3128"){
    			
    			return 0;
    		// vat �״��
    		}else{
    			return Math.floor(parseFloat(sum)/100)*10;
    		}
    	}
    }
	