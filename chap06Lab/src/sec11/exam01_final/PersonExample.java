package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-123456", "계백");
		//p1.nation="china";//final로 설정해놨기때문에 변경 안됨.
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		p1.name="을지문덕";
		System.out.println(p1.name);
		
		//p1.ssn="111-1111"; //final은 최초

	}

}
