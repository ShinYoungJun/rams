function IMap_MapInfo()
{
	var mapList;
	
	this.Init = function()
	{
		mapList = [];		// 여기에 추가되는 객체는 native형이 아닌 GetAllMapInfoXML에서 'MapInfo'Element
							// 추후에 무슨 값이 추가될지 모르니깐...
	};
	
	
	/**
	 *  AddMap		: 지도(xmap)의 정보를 추가한다.
	 *  return      : 없음
	 *  파라미터    : objMap - GetAllMapInfoXML에서 'MapInfo'Element 
	 **/
	this.AddMap = function( objMap )
	{
		mapList.push( objMap );
	};
	
	/**
	 *  GetLayerCount		: XMap에 포함되어있는 레이어의 갯수를 리턴한다.
	 *  return     			: XMap에 포함되어있는 레이어의 갯수
	 *  파라미터    		: mapIndex -> XMap의 인덱스
	 **/
	 this.GetLayerCount = function( mapIndex ) 
	 {
		if( mapIndex < 0 || mapIndex >= mapList.length )
			return -1;
		
		var retCnt = 0;
		var i;
		var lcc = mapList[mapIndex].getElementsByTagName('LayerControlCount')[0].firstChild.nodeValue;		//<LayerControlCount>
		var arrLci = mapList[mapIndex].getElementsByTagName('LayerControlInfo');							//<LayerControlInfo>의  배열
		for( i = 0; i < lcc; i++ )
		{
			retCnt += parseInt(arrLci[i].getElementsByTagName('LayerCount')[0].firstChild.nodeValue);
		}
		
		return retCnt;
	 };
	 
	/**
	 *  GetLayerName		: XMap에 포함되어있는 레이어중 특정 인덱스의 레이어명을 리턴한다.
	 *  return     			: 해당 레이어의 LayerName
	 *  파라미터    		: mapIndex -> XMap의 인덱스
	 *						: layerIndex -> 레이어명을 가져올 XMap에 속한 레이어의 인덱스
	 **/
	this.GetLayerName = function( mapIndex, layerIndex ) 
	{
		var layerName = "";
		
		if( mapIndex < 0 || mapIndex >= mapList.length )
			return "";
			
		var layerCnt = this.GetLayerCount( mapIndex );
		if( layerIndex < 0 || layerIndex >= layerCnt )
			return "";
			
		var i;
		var layerArr = mapList[mapIndex].getElementsByTagName('LayerInfo');
		for( i = 0; i < layerCnt; i++) {
			if( i == layerIndex ) {
				layerName = layerArr[i].getElementsByTagName('LayerName')[0].firstChild.nodeValue;
				break;
			}
		}
		return layerName;
	}
	
	/**
	 *  GetLayerIndex		: XMap에 포함되어있는 레이어중 특정 레이어명의 레이어인덱스를 리턴한다.
	 *  return     			: 해당 레이어명을 갖는 레이어 인덱스를 포함하는 배열
	 *  파라미터    		: destMapIndex -> XMap의 인덱스
	 *						: destLayerName -> 레이어인덱스를 가져올 XMap에 속한 레이어명
	 **/
	 this.GetLayerIndex = function( destMapIndex, destLayerName )
	 {
		if( destMapIndex < 0 || destMapIndex >= mapList.length)
			return [-1];
		
		var ret = [];
		var layerCnt = this.GetLayerCount( destMapIndex );
		if( destLayerName == "" )
			return [-1];
			
		var i;
		var layerArr = mapList[destMapIndex].getElementsByTagName('LayerInfo');
		var layerName = "";
		for( i = 0; i < layerCnt; i++ )
		{
			layerName = layerArr[i].getElementsByTagName('LayerName')[0].firstChild.nodeValue;
			if( layerName == destLayerName )
			{
				ret.push( i );
			}
		}
		
		return ret;
	 }
	
	
	/**
	 *  GetLayerIndexFullSearch		: 레이어명을 파라미터로 받아 해당 이름을 갖는 mapIndex, layerIndex를 갖는 객체를 반환한다.
	 *  return     					: mapIndex, layerIndex를 속성으로 갖는 Object의 배열
	 *						  		사용예) 
	 *									var retObj = GetLayerIndex("레이어명");
	 *									alert("맵 인덱스 : " + retObj[0].mapIndex;
	 *									alert("레이어 인덱스 : " + retObj[0].layerIndex;
	 *  파라미터    				: destLayerName -> 레이어인덱스를 가져올 XMap에 속한 레이어명
	 **/
	 this.GetLayerIndexFullSearch = function( destLayerName )
	 {
		if( !destLayerName ) 
			return null;
		
		var layerCnt = 0;
		var mapCnt = mapList.length;
		var i, j;
		var foundMapIndex = -1, foundLayerIndex = -1;
		var ret = [];
		var obj = {};
		var layerName = "";
		var layerArr;
		for( i = 0; i < mapCnt; i++ )
		{
			layerCnt = this.GetLayerCount( i );
			layerArr = mapList[i].getElementsByTagName('LayerInfo');
			for( j = 0; j < layerCnt; j++ )
			{
				layerName = layerArr[j].getElementsByTagName('LayerName')[0].firstChild.nodeValue;
				if( layerName == destLayerName )
				{
					obj.mapIndex = i;
					obj.layerIndex = j;
					ret.push( obj );
				}
			}
		}
		return ret;
	 }
	
	
	/**
	 * GetLayerVisibleString 	: XMap 하나에 속한 레이어들의 Visible Elements값을 연결한 문자열을 리턴한다.
	 * ruturn 					: XMap 하나에 속한 레이어들의 Visible Elements값을 연결한 문자열
	 * 파라미터					: index -> XMap의 인덱스
	 */
	this.GetLayerVisibleString = function( index )
	{
		if( index < 0 || index >= mapList.length )
			return null;
			
		var str = "";
		var i;
		var layerArr = mapList[index].getElementsByTagName('LayerInfo');
		var layerCnt = layerArr.length;
		for( i = 0; i < layerCnt; i++ )
		{
			str += (layerArr[i].getElementsByTagName('Visible')[0].firstChild.nodeValue + "");
		}
		
		return str;
	}
	
	
	/**
	 *  GetLoadFlag : 인트라맵웹5.0에 지도요청하는 파라미터 중 LoadFlag값.
	 *  return      : 지도 엔진에 로드된 지도(XMap)의 맵별 visible, 레이어별 visible값들을 연결한 문자열       
	 *				  예) 1|111000$1|11111111111100$
	 *  파라미터    : 없음.
	 **/
	this.GetLoadFlag = function()
	{
		var i, j;
		var mapLen = mapList.length;
		if( mapLen == 0 )
			return '';
		
		var ret = [];
		
		var mapVisible;
		var layerCnt;
		var layerArr;	//레이어들의 정보를 가질거임. LayerName이랑 Visible값.
		var layerStr;	//레이어 on/off여부를 가리키는 string.
		for( i = 0; i < mapLen; i++ )
		{
			mapVisible = mapList[i].getElementsByTagName('Visible')[0].firstChild.nodeValue;
			ret.push(mapVisible + '|');
			
			layerStr = this.GetLayerVisibleString( i );
			/*
			layerArr = mapList[i].getElementsByTagName('LayerInfo');
			layerCnt = layerArr.length;
			for( j = 0; j < layerCnt; j++ )
			{
				layerStr += (layerArr[j].getElementsByTagName('Visible')[0].firstChild.nodeValue + "");
			}
			*/
			ret.push( layerStr );
			ret.push('$');	//XMap별 구분자.
		}
		//alert(ret.join(''));
		return ret.join('');
	};
	
	
	
	/**
	 *  GetChangedLoadFlag  : 지도 on/off를 요청할 수정된 LoadFlag 문자열.
	 *  return      		: 지도 엔진에 로드된 지도(XMap)의 맵별 visible, 레이어별 visible값들을 연결한 문자열       
	 *				 		  예) 1|111000$1|11111111111100$
	 *  파라미터    		: mapIndex = [0 ~ mapCount-1], mapVisible = 0 or 1
	 *						: arrLayerToChange -> 해당 xmap에서 변경하고자하는 레이어의 layerIndex와 visible 값을 갖는 객체를 포함하는 배열
	 **/
	this.GetChangedLoadFlag = function( mapIndex, mapVisible, arrLayerToChange )
	{
		var mapCnt = mapList.length;
		
		
		if( mapIndex < 0) 			return null;
		if( mapIndex >= mapCnt ) 	return null;
		if( mapVisible < 0 ) 		return null; 
		if( mapVisible > 1 ) 		return null;
		
		var i;
		for( i = 0; i < arrLayerToChange.length; i++ )
		{
			if( arrLayerToChange[i].layerIndex < 0 ) return null;
			if( arrLayerToChange[i].layerIndex >= mapList[mapIndex].getElementsByTagName('LayerInfo').length ) return null;
		}
		
		if( typeof arrLayerToChange != "object" ) return null;
		
		
		var ret = [];
		//var newObj = {};
		
		var layerArr;
		var layerCnt;
		var j, k;
		var layerStr = "";
		var srcLayerVisible;
		for( i = 0; i < mapCnt; i++)
		{
			if( i != mapIndex ) {
				
				ret.push(mapList[i].getElementsByTagName('Visible')[0].firstChild.nodeValue + "|");
				ret.push(this.GetLayerVisibleString( i ));
				ret.push('$');
				//ret.push(mapList[i].visible + '|$');
			}
			else {
				ret.push(mapVisible + '|' );
				mapList[i].getElementsByTagName('Visible')[0].firstChild.nodeValue = mapVisible;
				
				layerArr = mapList[i].getElementsByTagName('LayerInfo');
				layerCnt = layerArr.length;
				
				for( j = 0; j < layerCnt; j++ )
				{
					srcLayerVisible = layerArr[j].getElementsByTagName('Visible')[0].firstChild.nodeValue;
					for( k = 0; k < arrLayerToChange.length; k++ ) 
					{
						//레이어 인덱스가 바꿀려는 레이어 인덱스와 같으면!
						if( j == arrLayerToChange[k].layerIndex ) {
							srcLayerVisible = arrLayerToChange[k].visible;
							layerArr[j].getElementsByTagName('Visible')[0].firstChild.nodeValue = arrLayerToChange[k].visible;
						}
					}
					
					layerStr += (srcLayerVisible + "");
				}
				
				ret.push( layerStr );
				ret.push('$');
				
				//newObj.visible = mapVisible;
				//mapList[i] = newObj;
			}
			
		}
		
		//alert(ret.join(''));
		return ret.join('');
		
	};
	
	/**
	 *  GetShow3D : 인트라맵웹5.0에 지도요청하는 파라미터 중 Show3D값.
	 *  return    : 지도 엔진에 로드된 지도 갯수만큼 '1$' 또는 '0$'가 이어진 문자열
	 *				1$ : 3D 보기, 0$ : 3D 끄기.
	 *  파라미터  :	1 또는 0
	 **/
	this.GetShow3D = function( val )
	{
		var ret = [];
		var i;
		var mapLen = mapList.length;
		if( mapLen == 0 )
			return '';
			
		for( i = 0; i < mapLen; i++ )
		{
			ret.push( val + '$');
		}
		return ret.join('');
	};
	
	/**
	 *  GetLoadFlag : 인트라맵웹5.0에 지도요청하는 파라미터 중 LayerControl값.
	 *  return      : 지도 엔진에 로드된 지도 갯수만큼 '0$'가 이어진 문자열            
	 *				
	 *  파라미터    : 없음
	 **/
	this.GetLayerControl = function()
	{
		var ret = [];
		var i;
		var mapLen = mapList.length;
		if( mapLen == 0 )
			return '';
			
		for( i = 0; i < mapLen; i++ )
		{
			ret.push('0$');
		}
		return ret.join('');
	};
}