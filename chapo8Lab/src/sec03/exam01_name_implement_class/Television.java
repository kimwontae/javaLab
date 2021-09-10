package sec03.exam01_name_implement_class;

//Television 구현 클래
public class Television implements RemoteControl {
	//구성요소
	//필드
	private int volume;
	
	//생성자
	
	//메소드

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}

	}

}
