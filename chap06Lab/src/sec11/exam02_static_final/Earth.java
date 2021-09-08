package sec11.exam02_static_final;

public class Earth {
	
	//상수
	static final double EARTH_RADIUS = 6400;//상수는 대문자로 쓰는게 관례
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA=4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
		
	}
}
