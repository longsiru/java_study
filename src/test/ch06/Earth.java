package test.ch06;

public class Earth {
	//상수(병수명은 대문자로 쓴다)
	//final:절대 변경 불가; static:전역 변수.
	static final double EARTH_RADIUS = 6400;  //지구 둘레
	static final double EARTH_RADIUS_AREA;
	
	//static; static field를 초가값 해줄때 사용.
	static {
		EARTH_RADIUS_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;  //求地球表面的公式，因为要计算，所以放在static block里面
	}
	

}
