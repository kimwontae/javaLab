package HashSetExample;

public class Student1 {
	public int studentNum;
	public String name;
	
	public Student1 (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student1) {
			Student1 student =(Student1) obj;
			return student.name.equals(name) &&(student.studentNum==studentNum);
		}else return false;
	}
}
