package sec07.exam03_contructor_overloading;

public class Car {
	//Ŭ������ ���� ���
	//1.�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	//2.������
	Car() {
		
	}
	
	Car(String model) {
		this.model = model;
	}

	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	//3.�޼ҵ�
	
	
}
