package sec02.exam_interface_declaaration;

public interface RemoteControl {
	
	//�������̽��� �������
	//���
	
	
	public static final int MAX_VOLUME =10; //pubilc static final = �������� 
	int MIN_VOLUME =10;
	
	
	
	//�߻� �޼ҵ�
	abstract void turnOn();  //abstract ������
	void turnOff();
	void setVolume();
	
	
	
	//����Ʈ�޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("����ó���մϴ� ");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	
	//���� �޼�
	static void changeBattery(){
		System.out.println("�������� ��ü�մϴ�.");
	}

}
