function IMap_MapInfo()
{
	var mapList;
	
	this.Init = function()
	{
		mapList = [];		// 여기에 추가되는 객체는 native형이 아닌 visible 속성을 가진 Object형.
							// 추후에 무슨 값이 추가될지 모르니깐...
	};
	
	
	/**
	 *  AddMap		: 지도(xmap)의 정보를 추가한다.
	 *  return      : 없음
	 *  파라미터    : objMap - GetAllMapInfoXML에서 'MapInfo'Element        //visible 속성을 가지는 Object.
	 **/
	this.AddMap = function( objMap )
	{
		mapList.push( objMap );
	};
	
	/**
	 *  GetLoadFlag : 인트라맵웹5.0에 지도요청하는 파라미터 중 LoadFlag값.
	 *  return      : 지도 엔진에 로드된 지도 갯수만큼 '1|$' 또는 '0|$' 가 이어진 문자열.        
	 *				  지도의 visible 값이 1이면 '1|$', 0이면 '0|$'
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
			
			layerStr = "";
			layerArr = mapList[i].getElementsByTagName('LayerInfo');
			layerCnt = layerArr.length;
			for( j = 0; j < layerCnt; j++ )
			{
				layerStr += (layerArr[j].getElementsByTagName('Visible')[0].firstChild.nodeValue + "");
			}
			ret.push( layerStr );
			ret.push('$');	//XMap별 구분자.
		}
		//alert(ret.join(''));
		return ret.join('');
	};
	
	/**
	 *  GetChangedLoadFlag  : 지도 on/off를 요청할 수정된 LoadFlag 문자열.
	 *  return      		: 지도 엔진에 로드된 지도 갯수만큼 '1|$' 또는 '0|$' 가 이어진 문자열.        
	 *				  		  지도의 visible 값이 1이면 '1|$', 0이면 '0|$'
	 *  파라미터    		: mapIndex = [0 ~ mapCount-1], mapVisible = 0 or 1
	 **/
	this.GetChangedLoadFlag = function( mapIndex, mapVisible )
	{
		var mapCnt = mapList.length;
		if( mapIndex < 0 || mapIndex >= mapCnt )
			return null;
		
		if( mapVisible < 0 || mapVisible > 1 )
			return null;
		
		var ret = [];
		var newObj = {};
		for( var i = 0; i < mapCnt; i++)
		{
			if( i != mapIndex )
				ret.push(mapList[i].visible + '|$');
			else {
				ret.push(mapVisible + '|$' );
				newObj.visible = mapVisible;
				mapList[i] = newObj;
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