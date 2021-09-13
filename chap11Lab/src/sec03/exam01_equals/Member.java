package sec03.exam01_equals;

public class Member {
	public String id;//필드
	
	public Member(String id) { //메소드
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
