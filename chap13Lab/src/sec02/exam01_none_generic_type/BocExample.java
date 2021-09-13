package sec02.exam01_none_generic_type;

public class BocExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");  //object = "홍길동" ==> 자동형변환됨(부모형<==자식형)
		String name = (String)box.get(); //강제 형변환(자식현 <== 부모형)
		
		box.set(new Apple());//object =new apple ==>자동형변환 (부모형<==자식형)
		Apple apple =(Apple) box.get();
		

	}

}
