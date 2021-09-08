package sec14.exam01_getter_setter;

public class Car {
	//필드
	int speed2;
	private int speed;
	private boolean stop;
	
	//생성자
	
	//메소드
	//getter
	public int getSpeed() {
		return speed;
	}
	
	//setter 외부에서 값을 받아와서 이 클래스의 speed값에 할당해라 (외부입력값을 한번더 검증하기 위하여 사용)
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed=0;
			return; //리턴되는게 없는데 리턴하라는 의미는 메소드를 종료한다라는뜻
		} else {
			this.speed=speed;
		}
	}
	
	//getter  불린값에 대한 게터
	public boolean isStop() {
		return stop;
	}
	
	//setter 불린값에 대한 세터
	public void setStop(boolean stop) {
		this.stop=stop;
		this.speed=0;
	}

}
