function IMapNodeLinkList()
{
	var nList;
	var lList;
	
	this.Init = function()
	{
		nList = new Array();	// array of IMapNode
		lList = new Array();	// array of IMapLink
	};
	
	this.AddNode = function( node )
	{
		nList.push( node );
	};
	
	this.GetNode = function( index )
	{
		if( index < 0 || index >= nList.length )
			return null;
		
		return nList[ index ];
	};
	
	this.AddLink = function ( link )
	{
		lList.push( link );
	};
	
	this.GetLink = function( index )
	{
		if( index < 0 || index >= lList.length )
			return null;
		
		return lList[index];
	};
	
	this.GetLinkNum = function()
	{
		return lList.length;
	};
	
	this.NodeToWKT = function( index )
	{
		if( index < 0 || index >= nList.length )
			return null;
		
		return nList[index].ToWKT();
	};
	
	this.LinkToWKT = function( index ) 
	{
		if( index < 0 || index >= lList.length )
			return null;
		
		var rStr = "LINESTRING(";
		
		for(var i = 0; i < lList[ index ].GetLinkCount(); i++)
		{
			rStr += (lList[index].GetPos(i).x + " " + lList[index].GetPos(i).y);
			if( i < lList[ index ].GetLinkCount()-1)
				rStr += ", ";
		}
		
		rStr += ")";
		return rStr;
	};
	
	this.AllToWKT = function()
	{
		var rStr = "GEOMETRYCOLLECTION(";
		//node
		/*
		for(var j = 0; j < nList.length; j++)
		{
			rStr += (nList[j].ToWKT() + ", ");
		}
		*/
		
		//link
		for(var k = 0; k < lList.length; k++)
		{
			rStr += (this.LinkToWKT( k ));
			if( k < lList.length-1)
				rStr += ", ";
		}
		
		rStr += ")";
		
		return rStr;
	};	
	
	// 링크 id 배열에 담아서 리턴
	this.GetArrLinkId = function()
	{
		var arr = [];
		
		for( var i = 0; i < lList.length; i++)
		{
			arr.push(lList[i].GetLinkId());
		}
		
		return arr;
	}
	
	this.GetArrLinkName = function()
	{
		var arr = [];
		
		for( var i = 0; i < lList.length; i++)
		{
			arr.push(lList[i].GetLinkName());
		}
		
		return arr;
	};
	
	this.GetArrLinkDist = function()
	{
		var arr = [];
		
		for( var i = 0; i < lList.length; i++)
		{
			arr.push(lList[i].GetDist());
		}
		
		return arr;	
	};
	
	this.GetTotalLinkDist = function()
	{
		var dist = 0;
		
		for( var i = 0; i < lList.length; i++)
		{
			dist += (lList[i].GetDist());
		}
		
		return dist;
	};
}

function IMapNode() 
{
	var NodeName;
	var NodePos;
	
	this.Init = function()
	{
		NodeName = null;
		NodePos = new OpenLayers.Geometry.Point(-1, -1);
	};
	
	this.SetPos = function(x, y) 
	{
		NodePos.x = x;
		NodePos.y = y;
	};
	
	this.ToWKT = function()
	{
		return ("POINT(" + NodePos.x + " " + NodePos.y + ")");
	};
	
	this.SetNodeName = function(name)
	{
		NodeName = name;
	};
}

function IMapLink()
{ 
	var LinkName;
	var LinkId;
	var PointList;
	
	
	this.Init = function()
	{
		LinkName = null;
		PointList = new Array();
	};
	
	this.AddPos = function(pos)
	{
		//PointList.push(new OpenLayers.Geometry,Point(x , y));
		PointList.push( pos );
	};
	
	this.GetPos = function( index )
	{
		if( index < 0 || index >= PointList.length )
			return null;
			
		return PointList[ index ];
	};
	
	this.SetLinkName = function( name )
	{
		LinkName = name;
	};
	
	this.GetLinkCount = function()
	{
		return PointList.length;
	};
	
	this.SetLinkId = function( id )
	{
		LinkId = id;
	};
	
	this.GetLinkId = function()
	{
		return LinkId;
	};
	
	this.GetDist = function()
	{
		var dist = 0;
		for( var i = 0; i < PointList.length-1; i++)
		{
			dist += (Math.sqrt(Math.pow(PointList[i].x - PointList[i+1].x, 2) + Math.pow(PointList[i].y - PointList[i+1].y, 2)));
		}
		return dist;
	}
}



