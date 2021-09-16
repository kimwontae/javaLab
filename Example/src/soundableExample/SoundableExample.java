package soundableExample;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
	
	int a = 1;
	String string = "aaa";
	//int int = 2;
	Object object = "asd";
	
}
