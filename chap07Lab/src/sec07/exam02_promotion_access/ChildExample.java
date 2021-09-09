package sec07.exam02_promotion_access;

public class ChildExample {
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		
		

		Parent parent = child;//자동형 변
		
		parent.method1();
		parent.method2();
		
		
		//자식에서 부모형으로 자동형변환된 부모형은 다시 자신으로 강제형 변환 가
		Child child2 = (Child)parent;
		child2.method1();
		child2.method2();
		child2.method3();
		
		Parent parent1=new Parent();
		
		
		//원래 부모령은 자식으로 형 변환이 불
		child2 = (Child)parent1;
		child2.method1();
		child2.method2();
		child2.method3();
	}


}
