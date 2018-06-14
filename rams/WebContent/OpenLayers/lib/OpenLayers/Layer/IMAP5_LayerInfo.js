function IMap_LayerList()
{
	var LayerList;
	
	this.Init = function()
	{
		LayerList = new Array();
	};
	
	this.GetLayerCount = function()
	{
		return LayerList.length;
	};
	
	this.AddLayer = function( obj )
	{
		LayerList.push(obj);
	};
	
	this.GetLayer = function( index )
	{
		if( index < 0 || index >= LayerList.length )
		{
			return null;
		}
		
		return LayerList[ index ];
	};
	
	this.GetLayerId = function( layerName )
	{
		var i;
		for( i = 0; i < LayerList.length; i++ )
		{
			if( layerName == LayerList[i].GetLayerName() )
			{
				return LayerList[i].GetLayerId();
			}
		}
		
		return -1;		
	};
	
	this.GetMapId = function( layerName )
	{
		var i;
		for( i = 0; i < LayerList.length; i++ )
		{
			if( layerName == LayerList[i].GetLayerName() )
			{
				return LayerList[i].GetMapId();
			}
		}
		
		return -1;		
	};
	
	
	this.GetLayerVisible = function( layerName )
	{
		var i;
		for( i = 0; i < LayerList.length; i++ )
		{
			if( layerName == LayerList[i].GetLayerName() )
			{
				return LayerList[i].GetVisible();
			}
		}
		
		return 1;		
	};
}

function IMap_LayerInfo()
{
	var mapId;
	var layerId;
	var layerName;
	var visible;
	
	this.Init = function(mId, lId, lName, lVisible)
	{
		mapId = mId;
		layerId = lId;
		layerName = lName;
		visible = lVisible;
	};
	
	this.SetVisible = function( b )
	{
		visible = v;
	};
	
	this.GetVisible = function()
	{
		return visible;
	};
	
	this.SetMapId = function( id )
	{
		mapId = id;
	};
	
	this.GetMapId = function()
	{
		return mapId;
	};
	
	this.SetLayerId = function( id )
	{
		layerId = id;
	};
	
	this.GetLayerId = function()
	{
		return layerId;
	};
	
	this.SetLayerName = function( name )
	{
		layerName = name;
	};
	
	this.GetLayerName = function()
	{
		return layerName;
	};
}