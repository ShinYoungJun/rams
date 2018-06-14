/*
	XCoordinate.js
*/

XCoordinate = function() {
	
	this.eEllipsoidTypes = {
		etBessel1841 : 0,
		etWGS84 : 1,
		etGRS80 : 2
	};
	
	
	this.eProjectionTypes = {
		epNone : 0,
		epTM_E : 1,
		epTM_M : 2,
		epTM_W : 3,
		epUTM_51 : 4,
		epUTM_52 : 5,
		epUTM_k : 6,
		epKatec : 7
	};
	
	var PI = 3.14159265358979;
	var EPSLN = 0.0000000001;
	
	var r_major = null;
	var r_minor = null;
	var scale_factor = null;
	var lon_center = null;
	var lat_origin = null;
	var false_northing = null;
	var false_easting = null;
	var e0 = null;
	var e1 = null;
	var e2 = null;
	var e3 = null;
	var e = null;
	var es = null;
	var esp = null;
	var ml0 = null;
	var ind = null;
	
	var m_dblFromFactor = null;
	var m_dblFromLONG_CEN = null;
	var m_dblFromLAT_CEN = null;
	var m_dblFromFALSE_N = null;
	var m_dblFromFALSE_E = null;
	var m_dblToFactor = null;
	
	var m_dblToLONG_CEN = null;
	var m_dblToLAT_CEN = null;
	var m_dblToFALSE_N = null;
	var m_dblToFALSE_E = null;
	
	var m_dblFromEllipsoidMajor = null;
	var m_dblFromEllipsoidMinor = null;
	var m_dblToEllipsoidMajor = null;
	var m_dblToEllipsoidMinor = null;
	
	var m_eFromEllipsoid = null;
	var m_eToEllipsoid = null;
	var m_eFromProjection = null;
	var m_eToProjection = null;
	
	
	this.toX = 0.0;
	this.toY = 0.0;
	
	var out_lat = null;
	var out_lon = null;
	var out_h = null;
	this.lat_temp = null;
	this.lon_temp = null;
	var h = null;
	
	this.ConvertCoord = function(fromX, fromY) {
		if (m_eFromProjection == this.eProjectionTypes.epNone){
			this.lon_temp = fromX * PI / 180;
			this.lat_temp = fromY * PI / 180;
		} else {
			this.lon_temp = fromX;
			this.lat_temp = fromY;
		}
		//console.log(this.lon_temp + ", " + this.lat_temp);
/*		
		console.log(m_dblFromFactor);
		console.log(m_dblFromLONG_CEN);
		console.log(m_dblFromLAT_CEN);
		console.log(m_dblFromFALSE_N);
		console.log(m_dblFromFALSE_E);
		
		console.log("to : " + m_dblToFactor);
		console.log("to : " + m_dblToLONG_CEN);
		console.log("to : " + m_dblToLAT_CEN);
		console.log("to : " + m_dblToFALSE_N);
		console.log("to : " + m_dblToFALSE_E);
	*/	
		var dX_W2B, dY_W2B, dZ_W2B;
	
		out_lon = fromX;
		out_lat = fromY;
	
		//Ellipsoid
		if (m_eFromEllipsoid != m_eToEllipsoid)
		{
			switch(m_eFromEllipsoid)
			{					
				case this.eEllipsoidTypes.etBessel1841:					
					if (m_eFromProjection != this.eProjectionTypes.epNone)
					{
						this.TMInit(m_dblFromEllipsoidMajor, m_dblFromEllipsoidMinor, m_dblFromFactor, m_dblFromLONG_CEN, m_dblFromLAT_CEN, m_dblFromFALSE_E, m_dblFromFALSE_N);
						this.TMInv(fromX, fromY);
					}
					
					dX_W2B = -128;
					dY_W2B = 481;
					dZ_W2B = 664;					
	
					this.DatumTrans(m_dblFromEllipsoidMajor, m_dblFromEllipsoidMinor, this.lat_temp, this.lon_temp, h, m_dblToEllipsoidMajor, m_dblToEllipsoidMinor, dX_W2B, dY_W2B, dZ_W2B);
					
					if (m_eToProjection == this.eProjectionTypes.epNone){
						this.toX = out_lon  * 180 / PI;
						this.toY = out_lat  * 180 / PI;
						return;
					}
	
					if (m_eToProjection != this.eProjectionTypes.epNone){
						this.TMInit(m_dblToEllipsoidMajor, m_dblToEllipsoidMinor, m_dblToFactor, m_dblToLONG_CEN, m_dblToLAT_CEN, m_dblToFALSE_E, m_dblToFALSE_N);
						this.tmfor(this.lon_temp, this.lat_temp);
					}							
	
					break;
				case this.eEllipsoidTypes.etWGS84: 
				case this.eEllipsoidTypes.etGRS80:
					if (m_eToEllipsoid == this.eEllipsoidTypes.etBessel1841){
						if (m_eFromProjection != this.eProjectionTypes.epNone){
							this.TMInit(m_dblFromEllipsoidMajor, m_dblFromEllipsoidMinor, m_dblFromFactor, m_dblFromLONG_CEN, m_dblFromLAT_CEN, m_dblFromFALSE_E, m_dblFromFALSE_N);
							this.TMInv(fromX, fromY);
						}
	
						dX_W2B = 128;
						dY_W2B = -481;
						dZ_W2B = -664;					
						
						this.DatumTrans(m_dblFromEllipsoidMajor, m_dblFromEllipsoidMinor, this.lat_temp, this.lon_temp, h, m_dblToEllipsoidMajor, m_dblToEllipsoidMinor, dX_W2B, dY_W2B,dZ_W2B);
	
						if (m_eToProjection == this.eProjectionTypes.epNone){
							this.toX = out_lon * 180 / PI;
							this.toY = out_lat * 180 / PI;
							return;
						}
	
						if (m_eToProjection != this.eProjectionTypes.epNone){
							this.TMInit(m_dblToEllipsoidMajor, m_dblToEllipsoidMinor, m_dblToFactor, m_dblToLONG_CEN, m_dblToLAT_CEN, m_dblToFALSE_E, m_dblToFALSE_N);
							this.tmfor(out_lon, out_lat);			
						}
					} else{
						this.TMInit(m_dblFromEllipsoidMajor, m_dblFromEllipsoidMinor, m_dblFromFactor, m_dblFromLONG_CEN, m_dblFromLAT_CEN, m_dblFromFALSE_E, m_dblFromFALSE_N);
						this.TMInv(fromX, fromY);
						this.TMInit(m_dblToEllipsoidMajor, m_dblToEllipsoidMinor, m_dblToFactor, m_dblToLONG_CEN, m_dblToLAT_CEN, m_dblToFALSE_E, m_dblToFALSE_N);
						this.tmfor(this.lon_temp, this.lat_temp);
						/*
						// 20091210 for geographic projection
						this.toX=this.lon_temp;
						this.toY=this.lat_temp;
						this.toX=this.toX*(180/PI);
						this.toY=this.toY*(180/PI);
						
						//
						*/
						
						//20091210 for geographic projection
						if (m_eToProjection == this.eProjectionTypes.epNone){
							this.toX = this.lon_temp * 180 / PI;
							this.toY = this.lat_temp * 180 / PI;
						}
						return;
					}
					break;
			}
		} else{
			this.TMInit(m_dblFromEllipsoidMajor, m_dblFromEllipsoidMinor, m_dblFromFactor, m_dblFromLONG_CEN, m_dblFromLAT_CEN, m_dblFromFALSE_E, m_dblFromFALSE_N);
			this.TMInv(fromX, fromY);
			this.TMInit(m_dblToEllipsoidMajor, m_dblToEllipsoidMinor, m_dblToFactor, m_dblToLONG_CEN, m_dblToLAT_CEN, m_dblToFALSE_E, m_dblToFALSE_N);
			this.tmfor(this.lon_temp, this.lat_temp);
			
			//20091210 for geographic projection
			if (m_eToProjection == this.eProjectionTypes.epNone){
				this.toX = this.lon_temp * 180 / PI;
				this.toY = this.lat_temp * 180 / PI;
			}
			return;
		}
	}
	
	this.SetProjection = function(fromEllip, fromProjection, toEllip, toProgection) {
		m_eFromEllipsoid = fromEllip;
		m_eToEllipsoid = toEllip;
	
		m_eFromProjection = fromProjection;
		m_eToProjection = toProgection;
		switch (fromEllip)
		{					
		case this.eEllipsoidTypes.etBessel1841:
			m_dblFromEllipsoidMajor = 6377397.15500000;
			m_dblFromEllipsoidMinor = 6356078.96325000;
			break;
		case this.eEllipsoidTypes.etWGS84: 
			m_dblFromEllipsoidMajor = 6378137.00000000;
			m_dblFromEllipsoidMinor = 6356752.31420000;
			break;
		case this.eEllipsoidTypes.etGRS80: 
			m_dblFromEllipsoidMajor = 6378137.00000000;
			m_dblFromEllipsoidMinor = 6356752.31420000;
			break;
		}
		switch (toEllip)
		{					
		case this.eEllipsoidTypes.etBessel1841:
			m_dblToEllipsoidMajor = 6377397.155000000;
			m_dblToEllipsoidMinor = 6356078.963250000;
			break;
		case this.eEllipsoidTypes.etWGS84: 
			m_dblToEllipsoidMajor = 6378137.000000000;
			m_dblToEllipsoidMinor = 6356752.314200000;
			break;
		case this.eEllipsoidTypes.etGRS80:
			m_dblToEllipsoidMajor = 6378137.000000000;
			m_dblToEllipsoidMinor = 6356752.314200000;
			break;
		}
	
		switch (fromProjection)
		{					
			case this.eProjectionTypes.epNone:
				m_dblFromFactor = 1;
				m_dblFromLONG_CEN = 0;
				m_dblFromLAT_CEN = 0;
				m_dblFromFALSE_N = 0;
				m_dblFromFALSE_E = 0;
	
				break;
			case this.eProjectionTypes.epTM_E:
				m_dblFromFactor = 1;
				m_dblFromLONG_CEN = 2.18171200985643;
				m_dblFromLAT_CEN = 0.663225115757845;
				m_dblFromFALSE_N = 500000;
				m_dblFromFALSE_E = 200000;
	
				break;
			case this.eProjectionTypes.epTM_M:
				m_dblFromFactor = 1;
				m_dblFromLONG_CEN = 2.21661859489632;
				m_dblFromLAT_CEN = 0.663225115757845;
				m_dblFromFALSE_N = 500000;
				m_dblFromFALSE_E = 200000;
	
				break;
			case this.eProjectionTypes.epTM_W:
				m_dblFromFactor = 1;
				m_dblFromLONG_CEN = 2.2515251799362;
				m_dblFromLAT_CEN = 0.663225115757845;
				m_dblFromFALSE_N = 500000;
				m_dblFromFALSE_E = 200000;
	
				break;
			case this.eProjectionTypes.epUTM_51:
				m_dblFromFactor = 0.9996;
				m_dblFromLONG_CEN = 2.14675497995303;
				m_dblFromLAT_CEN = 0;
				m_dblFromFALSE_N = 0;
				m_dblFromFALSE_E = 500000;
	
				break;
			case this.eProjectionTypes.epUTM_52:
				m_dblFromFactor = 0.9996;
				m_dblFromLONG_CEN = 2.25147473507269;
				m_dblFromLAT_CEN = 0;
				m_dblFromFALSE_N = 0;
				m_dblFromFALSE_E = 500000;
	
				break;
			case this.eProjectionTypes.epUTM_K:
				m_dblFromFactor = 0.9996;
				m_dblFromLONG_CEN = 2.22534524115629;
				m_dblFromLAT_CEN = 0.663225115757845;
				m_dblFromFALSE_N = 2000000;
				m_dblFromFALSE_E = 1000000;
	
				break;
			case this.eProjectionTypes.epKatec:
				m_dblFromFactor = 0.9999;
				m_dblFromLONG_CEN = 2.23402144255274;
				m_dblFromLAT_CEN = 0.663225115757845;
				m_dblFromFALSE_N = 600000;
				m_dblFromFALSE_E = 400000;
	
				break;
		}
	
		switch(toProgection)
		{					
			case this.eProjectionTypes.epNone:
				m_dblToFactor = 1;
				m_dblToLONG_CEN = 0;
				m_dblToLAT_CEN = 0;
				m_dblToFALSE_N = 0;
				m_dblToFALSE_E = 0;
	
				break;
			case this.eProjectionTypes.epTM_E:
				m_dblToFactor = 1;
				//m_dblToLONG_CEN = 2.18171200985643;
				m_dblToLONG_CEN = 2.2515251799362;
				m_dblToLAT_CEN = 0.663225115757845;
				m_dblToFALSE_N = 500000;
				m_dblToFALSE_E = 200000;
	
				break;
			case this.eProjectionTypes.epTM_M:
				m_dblToFactor = 1;
				m_dblToLONG_CEN = 2.21661859489632;
				m_dblToLAT_CEN = 0.663225115757845;
				m_dblToFALSE_N = 500000;
				m_dblToFALSE_E = 200000;
	
				break;
			case this.eProjectionTypes.epTM_W:
				m_dblToFactor = 1;
				//m_dblToLONG_CEN = 2.2515251799362;
				m_dblToLONG_CEN = 2.18171200985643;
				m_dblToLAT_CEN = 0.663225115757845;
				m_dblToFALSE_N = 500000;
				m_dblToFALSE_E = 200000;
	
				break;
			case this.eProjectionTypes.epUTM_51:
				m_dblToFactor = 0.9996000000000;
				m_dblToLONG_CEN = 2.14675497995303;
				m_dblToLAT_CEN = 0;
				m_dblToFALSE_N = 0;
				m_dblToFALSE_E = 500000;
	
				break;
			case this.eProjectionTypes.epUTM_52:
				m_dblToFactor = 0.9996000000000;
				m_dblToLONG_CEN = 2.25147473507269;
				m_dblToLAT_CEN = 0;
				m_dblToFALSE_N = 0;
				m_dblToFALSE_E = 500000;
	
				break;
			case this.eProjectionTypes.epUTM_K:
				m_dblToFactor = 0.99960000000000;
				m_dblToLONG_CEN = 2.22534524115629;
				m_dblToLAT_CEN = 0.663225115757845;
				m_dblToFALSE_N = 2000000;
				m_dblToFALSE_E = 1000000;
	
				break;
			case this.eProjectionTypes.epKatec:
				m_dblToFactor = 0.9999000000000;
				m_dblToLONG_CEN = 2.23402144255274;
				m_dblToLAT_CEN = 0.663225115757845;
				m_dblToFALSE_N = 600000;
				m_dblToFALSE_E = 400000;
	
				break;
		}
	}
	
	// 소스 좌표계, 타겟 좌표계 문자열로 받아서 프로젝션 셋팅.
	this.setProj = function(souSrc, tarSrc) {	
		var elDefSrc = this.eEllipsoidTypes.etBessel1841;
		var souProjection = this.eProjectionTypes.epTM_M;
		var elTarSrc = this.eEllipsoidTypes.etWGS84;
		var tarProjection = this.eProjectionTypes.epNone;
		
		if( souSrc != null && tarSrc != null && tarSrc != "" && souSrc != tarSrc) {
		
			//console.log('setProj..일단 여긴 들어왔어!!');
			if( souSrc == "EPSG:4326" || souSrc == "epsg:4326" ) {
				elDefSrc = this.eEllipsoidTypes.etWGS84;
				souProjection = this.eProjectionTypes.epNone;
			}
			else if (souSrc == "EPSG:4047" || souSrc == "epsg:4047" ) {
				elDefSrc = this.eEllipsoidtypes.etGRS80;
				souProjection = this.eProjectionTypes.epNone;
			}
			else if( souSrc == "EPSG:2096" || souSrc == "epsg:2096" ) {
				elDefSrc = this.eEllipsoidTypes.etBessel1841;
				souProjection = this.eProjectionTypes.epTM_E;
			}
			else if( souSrc == "EPSG:2097" || souSrc == "epsg:2097" ) {
				elDefSrc = this.eEllipsoidTypes.etBessel1841;
				souProjectionTypes = this.eProjectionTypes.epTM_M;
			}
			else if( souSrc == "EPSG:2098" || souSrc == "epsg:2098" ) {
				elDefSrc = this.eEllipsoidTypes.etBessel1841;
				souProjection = this.eProjectionTypes.epTM_W;
			}
			
			//변환될 좌표값의 기본값은 EPSG:4326 WGS84 좌표.
			if( tarSrc == "EPSG:4047" || tarSrc == "epsg:4047" ) {
				elTarSrc = this.eEllipsoidTypes.etGRS80;
				tarProjection = this.eProjectionTypes.epNone;
			}
			else if( tarSrc == "EPSG:4326" || tarSrc == "epsg:4326" ) {
				elTarSrc = this.eEllipsoidTypes.etWGS84;
				tarProjection = this.eProjectionTypes.epNone;
			}
			else if( tarSrc == "EPSG:2096" || tarSrc == "epsg:2096" ) {
				elTarSrc = this.eEllipsoidTypes.etBessel1841;
				tarProjection = this.eProjectionTypes.epTM_E;
			}
			else if( tarSrc == "EPSG:2097" || tarSrc == "epsg:2097" ) {
				elTarSrc = this.eEllipsoidTypes.etBessel1841;
				tarProjection = this.eProjectionTypes.epTM_M;
			}
			else if( tarSrc == "EPSG:2098" || tarSrc == "epsg:2098" ) {
				elTarSrc = this.eEllipsoidTypes.etBessel1841;
				tarProjection = this.eProjectionTypes.epTM_W;
			}
			//console.log('setProj : 2번째도 들어왔어!!' + tarSrc + ", " + tarProjection);
			
			
			
			this.SetProjection(elDefSrc, souProjection, elTarSrc, tarProjection);
			return true;
		}//
		
		return false;
	} // End of setProj();
	
	
	this.SetUser = function(fromEllip, fromProjection, toEllip, toProgection, fromFactor, fromLONG_CEN, 
					fromLAT_CEN, fromFALSE_N, fromFALSE_E, toFactor, toLONG_CEN, toLAT_CEN, toFALSE_E, toFALSE_N) {
		m_eFromEllipsoid = fromEllip;
		m_eToEllipsoid = toEllip;
	
		m_eFromProjection = fromProjection;
		m_eToProjection = toProgection;
	
		switch(fromEllip)
		{					
			case this.eEllipsoidTypes.etBessel1841:
				m_dblFromEllipsoidMajor = 6377397.155;
				m_dblFromEllipsoidMinor = 6356078.96325;
				break;
			case this.eEllipsoidTypes.etWGS84: 
			case this.eEllipsoidTypes.etGRS80:
				m_dblFromEllipsoidMajor = 6378137;
				m_dblFromEllipsoidMinor = 6356752.3142;
				break;
		}
	
		switch(toEllip)
		{					
			case this.eEllipsoidTypes.etBessel1841:
				m_dblToEllipsoidMajor = 6377397.155;
				m_dblToEllipsoidMinor = 6356078.96325;
				break;
			case this.eEllipsoidTypes.etWGS84: 
				m_dblToEllipsoidMajor = 6378137;
				m_dblToEllipsoidMinor = 6356752.3142;
				break;
			case this.eEllipsoidTypes.etGRS80:
				m_dblToEllipsoidMajor = 6378137;
				m_dblToEllipsoidMinor = 6356752.3142;
				break;
		}
	
		m_dblFromFactor = fromFactor;
		m_dblFromLONG_CEN = fromLONG_CEN;
		m_dblFromLAT_CEN = fromLAT_CEN;
		m_dblFromFALSE_N = fromFALSE_N;
		m_dblFromFALSE_E = fromFALSE_E;
		m_dblToFactor = toFactor;
		m_dblToLONG_CEN = toLONG_CEN;
		m_dblToLAT_CEN = toLAT_CEN;
		m_dblToFALSE_N = toFALSE_N;
		m_dblToFALSE_E = toFALSE_E;
	}
	
	this.tmfor = function(lon, lat) {
		var delta_lon;
		//double theta;
		//double delta_theta;
		var sin_phi, cos_phi;
		var al, als;
		var b, c, t, tq;
		var con, n, ml;
	
		delta_lon = lon - lon_center;
		sin_phi = Math.sin(lat);
		cos_phi = Math.cos(lat);
	
		if(ind != 0) {
			b = cos_phi * Math.sin(delta_lon);
			if((Math.abs(Math.abs(b) - 1)) < 0.0000000001) {
				//System.out.println("tmfor --> 0.0000000001 보다 작다니....ㅡㅡ;");
				console.log("tmfor --> 0.0000000001 보다 작다니....ㅡㅡ;");
				return;
			}
		} else {
			b = cos_phi * Math.sin(delta_lon);
			this.toX = 0.5 * r_major * scale_factor * Math.log((1 + b) / (1 - b));
			con = Math.acos(cos_phi * Math.cos(delta_lon) / Math.sqrt(1 - b * b));
			if(lat < 0) {
			    con = -con;
			    this.toY = r_major * scale_factor * (con - lat_origin);
			}
		}
	
		al = cos_phi * delta_lon;
		als = al * al;
		c = esp * cos_phi * cos_phi;
		tq = Math.tan(lat);
		t = tq * tq;
		con = 1 - es * sin_phi * sin_phi;
		n = r_major / Math.sqrt(con);
		ml = r_major * mlfn(e0, e1, e2, e3, lat);
	
		this.toX = scale_factor * n * al * (1 + als / 6 * (1 - t + c + als / 20 * (5 - 18 * t + t * t + 72 * c - 58 * esp))) + false_easting;
		this.toY = scale_factor * (ml - ml0 + n * tq * (als * (0.5 + als / 24 * (5 - t + 9 * c + 4 * c * c + als / 30 * (61 - 58 * t + t * t + 600 * c - 330 * esp))))) + false_northing;
	}
	
	
	this.TMInit = function( major,  minor,  scaleFact,  cen_lon,  cen_lat,  f_east,  f_north) {
		r_major = major;
		r_minor = minor;
		scale_factor = scaleFact;
	
		lon_center = cen_lon;
		lat_origin = cen_lat;
		false_northing = f_north;
		false_easting = f_east;
	
		var temp = r_minor / r_major;
		es = 1 - temp * temp;
		e = Math.sqrt(es);
		e0 = 1 - 0.25 * es * (1 + es / 16 * (3 + 1.25 * es));
		e1 = 0.375 * es * (1 + 0.25 * es * (1 + 0.46875 * es));
		e2 = 0.05859375 * es * es * (1 + 0.75 * es);
		e3 = es * es * es * 35 / 3072;
		ml0 = r_major * mlfn(e0, e1, e2, e3, lat_origin);
		esp = es / (1-es);
	
		if(es < 0.00001)
			ind = 1;
		else
			ind = 0;
	}
	
	this.TMInv = function(x, y) {
		var con;
		var phi;
		var delta_Phi;
		var i;
		var sin_phi, cos_phi, tan_phi;
		var c, cs, t, ts, n, r, d, ds;
		var f, h, g, temp;
	
		var max_iter = 6;
	
		if(ind != 0) {
			f = Math.exp(x / (r_major * scale_factor));
			g = 0.5 * (f - 1 /f);
			temp = lat_origin + y / (r_major * scale_factor);
			h = Math.cos(temp);
			con = Math.sqrt((1 - h * h) / (1 + g * g));
			var tmp = asinz(con); //, this.lon_temp, this.lat_temp
			this.lat_temp = tmp;
			if(temp < 0)
				this.lat_temp = -tmp;
			
			if(g == 0 && h == 0)
				this.lon_temp = lon_center;
			else
				this.lon_temp = Math.atan(g/h) + lon_center;
		}
	
		x = x - false_easting;
		y = y - false_northing;
		con = (ml0 + y / scale_factor) / r_major;
		phi = con;
		i = 0;
		do{
		    delta_Phi = ((con + e1 * Math.sin(2 * phi) - e2 * Math.sin(4 * phi) + e3 * Math.sin(6 * phi)) / e0) - phi;
			phi = phi + delta_Phi;
	
			if(Math.abs(delta_Phi) <= EPSLN)
				break;
			if(i >= max_iter) {
				//AfxMessageBox("????");
				break;
			}
	
			i = i + 1;
		} while(true);
	
		if(Math.abs(phi) < (PI / 2)) {
			sin_phi = Math.sin(phi);
		    cos_phi = Math.cos(phi);
		    tan_phi = Math.tan(phi);
			c = esp * cos_phi * cos_phi;
			cs = c * c;
			t = tan_phi * tan_phi;
			ts = t * t;
			con = 1 - es * sin_phi * sin_phi;
		    n = r_major / Math.sqrt(con);
		    r = n * (1 - es) / con;
			d = x / (n * scale_factor);
			ds = d * d;
			this.lat_temp = phi - (n * tan_phi * ds / r) * (0.5 - ds / 24 * (5 + 3 * t + 10 * c - 4 * cs - 9 * esp - ds / 30 * (61 + 90 * t + 298 * c + 45 * ts - 252 * esp - 3 * cs)));
			this.lon_temp = lon_center + (d * (1 - ds / 6 * (1 + 2 * t + c - ds / 20 * (5 - 2 * c + 28 * t - 3 * cs + 8 * esp + 24 * ts))) / cos_phi);
		} else {
			this.lat_temp = PI/2 * Math.sin(y);
		    this.lon_temp = lon_center;
		}
	}
	
	mlfn = function(te0, te1, te2, te3, tphi) {
		return (te0 * tphi - te1 * Math.sin(2 * tphi) + te2 * Math.sin(4 * tphi) - te3 * Math.sin(6 * tphi));
	}
	
	asinz = function(val) {
		if (Math.abs(val) > 1) {
			if(val > 1)
				val = 1;
			else
				val = -1;
		}
	
		return Math.asin(val);
	}
	
	this.DatumTrans = function( input_a,  input_b,  input_Phi,  input_Lamda,  input_H,  output_a,  output_b, delta_X, delta_Y, delta_Z) {
		var delta_a, delta_f, delta_Phi, delta_Lamda, delta_H;
		var Rm, Rn;
		var temp, es_temp;

		temp = input_b / input_a;
		es_temp = 1 - temp * temp;

		delta_a = output_a - input_a;
		delta_f = input_b / input_a - output_b / output_a;

	
		var pp = 1 - es_temp * Math.sin(input_Phi) * Math.sin(input_Phi);
		Rm = (input_a * (1 - es_temp)) / Math.sqrt(pp * pp * pp);
		Rn = input_a / Math.sqrt((1 - es_temp * Math.sin(input_Phi) * Math.sin(input_Phi)));

		delta_Phi = ((((-delta_X * Math.sin(input_Phi) * Math.cos(input_Lamda) - delta_Y * Math.sin(input_Phi) * Math.sin(input_Lamda)) + delta_Z * Math.cos(input_Phi)) + delta_a * Rn * es_temp * Math.sin(input_Phi) * Math.cos(input_Phi) / input_a) + delta_f * (Rm / temp + Rn * temp) * Math.sin(input_Phi) * Math.cos(input_Phi)) / (Rm + input_H);
		delta_Lamda = (-delta_X * Math.sin(input_Lamda) + delta_Y * Math.cos(input_Lamda)) / ((Rn + input_H) * Math.cos(input_Phi));
		delta_H = delta_X * Math.cos(input_Phi) * Math.cos(input_Lamda) + delta_Y * Math.cos(input_Phi) * Math.sin(input_Lamda) + delta_Z * Math.sin(input_Phi) - delta_a * input_a / Rn + delta_f * temp * Rn * Math.sin(input_Phi) * Math.sin(input_Phi);

		out_lat = input_Phi + delta_Phi;
		out_lon = input_Lamda + delta_Lamda;
		out_h = input_H + delta_H;
	}


} // End of XCoordinate.