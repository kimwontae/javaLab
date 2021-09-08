package sec11.exam01_final;

public class Person {
	final String nation = "Korean";
	final String ssn;//초기값은 null
	String name;
	
	public Person(String ssn, String name) {
		this.ssn=ssn;
		this.name=name;
	}

}
