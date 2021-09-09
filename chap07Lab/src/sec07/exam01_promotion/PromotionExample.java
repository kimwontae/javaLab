package sec07.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		C c = new C();
		D d = new D();
		E e= new E();
		
		
		//최상의 부모아래의 자식의 자식의 객체까지 넣을 수 있다.
		A a1=b;
		A a2=c;
		A a3=d;
		A a4=e;
		
		B b1= d;
		C c1=e;
		
		//B b2=e;
		//C c2=d;

	}

}
