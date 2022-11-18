package test.ch07;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly(); //일반 비행 现在的flyMode的值还是nolmal,上面指定了nolmal=1,
		sa.flyMode = SupersonicAirplane.SUPERSONIC; //SUPERSONIC=2, 当flyMode=SUPERSONIC -> "초음속 비행"
		sa.fly();
	}

}
