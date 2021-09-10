package sec03.exam02_noname_imoplement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		//익명구현객체:이너페이스 변수 = new 인터페이스{추상메소드 재정의}
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
