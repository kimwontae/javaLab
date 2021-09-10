package sec02.exam_interface_declaaration;

public interface RemoteControl {
	
	//인터페이스의 구성멤버
	//상수
	
	
	public static final int MAX_VOLUME =10; //pubilc static final = 생략가능 
	int MIN_VOLUME =10;
	
	
	
	//추상 메소드
	abstract void turnOn();  //abstract 생략가
	void turnOff();
	void setVolume();
	
	
	
	//디폴트메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다 ");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	
	//정적 메소
	static void changeBattery(){
		System.out.println("건전지를 교체합니다.");
	}

}
