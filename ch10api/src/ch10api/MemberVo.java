package ch10api;

public class MemberVo {
	
	// private 맴버 변수 - 아이디,비밀번호,이름,연락처
	private String id, pw, name , tel;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//object에서 가지고 있는 equals 메서드를 재정의해서 객체와 같다 개념으로 코딩한다.
	@Override
	public boolean equals(Object obj) {
		// obj -> vo로 캐스팅한다.
		MemberVo vo = (MemberVo) obj;
		// 아이디, 이름, 연락처가 같으면 true를 리턴하고 그렇지 않으면 false를 리턴한다.
		if(id.equals(vo.getId()) && name.equals(vo.getName()) && tel.equals(vo.tel))
			return true;
		else return false;
		
		
	}
	
	
	@Override
	//테스트용이다.객체를 찍으면 모든 데이터를 찎는다.
	public String toString() { 
		return "MemberVo [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
	

}
