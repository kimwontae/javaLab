package sec08.sxam01_method_declaration;

public class Calculator {
	/*
	 * �������
	 * 1. �ʵ�
	 * 2. ������
	 * 3. �޼ҵ�
	 */
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double) x/y;
		return result;
	}

	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
}
