package sec04.exam01_overriding;

public class Computer extends Calculator {

	@Override   //�������Ѵٴ¶� ���������ϳ� �ĺ������ϵ��� �ۼ��ϴ°��� ����.
	double areaCircle(double r) {  //�����Ǵ� �θ� Ŭ������ �޼ҵ��̸��� ���ƾ� �Ѵ�.
		// TODO Auto-generated method stub
		System.out.println("Computer ��ü�� areaCircle()���� ");
		return Math.PI*r*r;
	}
	

}
