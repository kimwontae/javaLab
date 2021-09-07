package sec04.exam01_class_new;


//main메소드가 있으니까 실행형
public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		//Student 객체를 만들어 생성된 객체의 주소값을 s1변수에 저장한다.
		//s1은 Student 객체를 참조하니까 s1은 Student객체라고 할 수 있다.
		
		System.out.println("s1변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2변수가 또다른 Student 객체를 참조합니다.");
		

	}

}
