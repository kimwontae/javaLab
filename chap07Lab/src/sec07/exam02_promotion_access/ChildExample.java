package sec07.exam02_promotion_access;

public class ChildExample {
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		
		

		Parent parent = child;//�ڵ��� ��
		
		parent.method1();
		parent.method2();
		
		
		//�ڽĿ��� �θ������� �ڵ�����ȯ�� �θ����� �ٽ� �ڽ����� ������ ��ȯ ��
		Child child2 = (Child)parent;
		child2.method1();
		child2.method2();
		child2.method3();
		
		Parent parent1=new Parent();
		
		
		//���� �θ���� �ڽ����� �� ��ȯ�� ��
		child2 = (Child)parent1;
		child2.method1();
		child2.method2();
		child2.method3();
	}


}
