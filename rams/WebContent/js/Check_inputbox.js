/*-------------------------------------------------------------------------------*/
/*
�ѱ��� ��� Ű �Է½� �ٷιٷ� �۾��� �ȵǱ� ������
onchange �� onblur �� �̺�Ʈ�� ���� ���.
*/

// �ѱ۸� �Է¹ޱ� (�ʼ�ü ����) 
// ������ ���� ���� 
function nr_han(this_s,type){ 
    /* 
    type 
    -> 'c' : �ʼ� ���� 
    -> 's' : �ʼ� ���� + ���� ���� 
    -> '' : �ʼ�, ���� ���� 
    */ 
    temp_value = this_s.value.toString(); 
    regexp = ''; 
    repexp = ''; 
    switch(type){ 
        case 'c': regexp = /[^��-����-�R]/g;break; 
        case 's': regexp = /[^��-����-�R\s]/g;break; 
        case '':    regexp = /[^��-�R]/g; break; 
        default : regexp = /[^��-����-�R\s]/g; 
    } 
    if(regexp.test(temp_value)) 
    { 
        temp_value = temp_value.replace(regexp,repexp); 
        this_s.value = temp_value; 
    } 
} 



/*-------------------------------------------------------------------------------*/

// �ѱ۸� �Է¹ޱ� (�ʼ�ü ����)
// ������ ���� ����	
function nr_han_cho(this_s){
	nr_han(this_s,'c');
}

/*-------------------------------------------------------------------------------*/

// �ѱ۸� �Է¹ޱ� (�ʼ�ü ����, ���� ����)
// ������ ���� ����
function nr_han_cho_space(this_s){
	nr_han(this_s,'s');
}


/*-------------------------------------------------------------------------------*/
function nr_numeng(this_s){
	temp_value = this_s.value.toString();
	regexp = /[^0-9a-zA-Z]/g;
	repexp = '';
	temp_value = temp_value.replace(regexp,repexp);
	this_s.value = temp_value;
}

/*-------------------------------------------------------------------------------*/
// ������ ���� ����
function nr_num(this_s,type){
	/*
	type
	-> 'int' : ���� ����
	-> 'float' : ���� �Ǽ�
	-> '-int' : ���� ���� ����
	-> '-int' : ���� �Ǽ� ����
	*/
	temp_value = this_s.value.toString();
	regexp = /[^-\.0-9]/g;
	repexp = '';
	temp_value = temp_value.replace(regexp,repexp);
	regexp = '';
	repexp = '';
	switch(type){
		case 'int':	 regexp = /[^0-9]/g; break;
		case 'float':regexp = /^(-?)([0-9]*)(\.?)([^0-9]*)([0-9]*)([^0-9]*)/; break;
		case '-int':	regexp = /^(-?)([0-9]*)([^0-9]*)([0-9]*)([^0-9]*)/;break;
		case '-float':regexp = /^(-?)([0-9]*)(\.?)([^0-9]*)([0-9]*)([^0-9]*)/; break;
		default : regexp = /[^0-9]/g; break;
	}
	switch(type){
		case 'int':repexp = '';break;
		case 'float':repexp = '$2$3$5';break;
		case '-int':	repexp = '$1$2$4';break;
		case '-float':repexp = '$1$2$3$5'; break;
		default : regexp = /[^0-9]/g; break;
	}
	temp_value = temp_value.replace(regexp,repexp);
	this_s.value = temp_value;
}
// ���� ������ �Է¹ޱ�
function nr_num_int(this_s){
	nr_num(this_s,'int');
}
// ���� �Ǽ��� �Է¹ޱ�
function nr_num_float(this_s){
	nr_num(this_s,'float');
}

/*-------------------------------------------------------------------------------*/

// ��� �Է¹ޱ�  (��ҹ���)
// ������ ���� ����
function nr_eng(this_s,type){
	temp_value = this_s.value.toString();
	regexp = '';
	repexp = '';
	switch(type){
		case 'small':regexp = /[^a-z]/g;break;
		case 'big':regexp = /[^A-Z]/g;break;
		case 'all':regexp = /[^a-z]/i;break;
		default :regexp = /[^a-z]/i;break;
	}
	temp_value = temp_value.replace(regexp,repexp);
	this_s.value = temp_value;
}

// ��� �Է¹ޱ�  (�ҹ���)
// ������ ���� ����
function nr_eng_small(this_s){
	nr_eng(this_s,'small');
}

// ��� �Է¹ޱ�  (�빮��)
// ������ ���� ����
function nr_eng_big(this_s){
	nr_eng(this_s,'big');
}

/*-------------------------------------------------------------------------------*/


// �ֹε�� ��ȣ �԰ݿ� �°� 123456-1234567  //�������� ����.
// ������ ���� ����
function nr_jumin(this_s){
	temp_value = this_s.value.toString();
	temp_value = temp_value.replace(/[^0-9]/g,'');
	temp_value = temp_value.substr(0,13);
	temp_value = temp_value.replace(/([0-9]{6})([0-9]{7}$)/,"$1-$2");
	this_s.value = temp_value;
}



/*-------------------------------------------------------------------------------*/

// ����� ��� ��ȣ �԰ݿ� �°� 123-12-12345  //�������� ����.
// ������ ���� ����
function nr_company_num(this_s){
	temp_value = this_s.value.toString();
	temp_value = temp_value.replace(/[^0-9]/g,'');
	temp_value = temp_value.substr(0,10);
	temp_value = temp_value.replace(/([0-9]{3})([0-9]{2})([0-9]{5}$)/,"$1-$2-$3");
	this_s.value = temp_value;
}

/*-------------------------------------------------------------------------------*/

/*
 * ���ڿ� - �� ��밡��
 */
function 	nr_hyphen_num(this_s){
	temp_value = this_s.value.toString();
	temp_value = temp_value.replace(/[^0-9^-]/g,'');
	this_s.value = temp_value;
}

function 	nr_tel_num(this_s){
	temp_value = this_s.value.toString();
	temp_value = temp_value.replace(/[^0-9^-]/g,'');
	this_s.value = temp_value;
}
/*
//	������ ��ȣ �տ� 9�ڸ� ����
function	nr_Adminno_Cut(adminno)
{
	if(adminno.length != 19)
		return	adminno

	adminno	= adminno.substr(9, 10);
	
	return	adminno;
}
*/

//	������ ��ȣ �տ� 9�ڸ� ����
function	nr_Adminno_Cut(adminno)
{
	if(adminno.length != 20)
		return	adminno;

	adminno	= adminno.substr(9, 11);
	
	return	adminno;
}

/*
//	��¥�� - �߰�
function	nr_Date_Paste(date)
{
	if(date.length != 8)
		return	date;

	date	= date.substr(0, 4) + "-" + date.substr(4, 2) + "-" + date.substr(6, 2);
	
	return	date;
}
*/

//	��¥�� - ����
function	nr_Date_Cut(date)
{
	if(adminno.length != 8)
		return	date

	date	= date.substr(0, 4) + "-" + date.substr(5, 2) + "-" + date.substr(7, 2);
	
	return	date;
}


//	��¥�� - ����
function	nr_Date_Cut(date)
{
	if(date.length != 10)
		return	date;

	date	= date.substr(0, 4) + date.substr(5, 2) + date.substr(8, 2);
	
	return	date;
}


//	,�߰�
function comma_paste(this_s)
{
	fvalue = this_s.value.toString();
	
    fvaluenum	= fvalue.length; 
    
    if(fvaluenum>3){
        comma=Math.ceil(fvaluenum/3)-1;
        substart = 0;

        for(x=comma; x>=0; x--){
            sublast = fvaluenum-(x*3);
  
            val=fvalue.substring(substart, sublast);
            substart = sublast;

            if(x==comma) vall = val + ',';
            else if(x==0) vall = vall + val;
            else vall = vall + val + ',';
        }
        
        this_s.value = vall;
    }
    else 
    {
        this_s.value = fvalue;
    }
}

//	, �����Լ�
function comma_cut(this_s)
{
	restring = this_s.value.toString();
	
    if(restring.search(',')){
        exp=restring.split(',');
        for(t=0 ; ; t++){
            if(!exp[t]) break;


            if(t==0){
                restring = exp[t];
            } else {
                restring = restring + exp[t];
            }
        }
    }
    
    this_s.value = restring;
}

//- �����Լ�
function pipe_cut(this_s)
{
	restring = this_s.value.toString();
	

    if(restring.search('-')){
        exp=restring.split('-');
        for(t=0 ; ; t++){
            if(!exp[t]) break;


            if(t==0){
                restring = exp[t];
            } else {
                restring = restring + exp[t];
            }
        }
    }
    
    return restring;
}

//	������ ���� ���̸� �ѱ�� ������Ŀ���� �̵�
function	count_check(this_s, this_e, cnt)
{
	nr_num_int(this_s);
	
	restring = this_s.value.toString();
	
	if(restring.length >= cnt)
	{
		this_e.focus();
	}
}


//	textarea ���ڼ� üũ 
// ��뿹) <textarea id="REFERENCE" onkeyup="displayBytes(500, 'REFERENCE');" type="text"></textarea>
	function displayBytes(sz, id){
		var obj = document.getElementById(id);
		
		if(obj.value.bytes()> sz){
			if(event.keyCode!='8'){
				alert(sz+"����Ʈ���� �Է��� �����մϴ�.\n ���� ����ũ��:"+obj.value.bytes());
			}
			obj.value = obj.value.substring(0, obj.value.length-1);
		}
	}
	
	String.prototype.bytes = function(){
		var str = this;
		var l=0;
		for(var i=0;i<str.length;i++) l +=(str.charCodeAt(i)>128)? 2:1;
		return l;
	}