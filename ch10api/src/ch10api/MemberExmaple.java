package ch10api;

public class MemberExmaple {
	
		public static void main(String[] args) {
		// vo1과 vo2는 같은 회원
		MemberVo vo1 = new MemberVo();
		vo1.setId("test");
		vo1.setPw("1234");
		vo1.setName("이영환");
		vo1.setTel("010-1111-2222");
		
		MemberVo vo2 = new MemberVo();
		vo2.setId("test");
		vo2.setPw("1234");
		vo2.setName("이영환");
		vo2.setTel("010-1111-2222");
		
		// 같다로 처리해야하는데 아이디,이름,연락처 같으면 같다고 해주자.
		// memberVO equals() 오버라이드 작성해줘야 합니다.
		if(vo1.equals(vo2)) System.out.println("같은 회원 입니다.");
		else System.out.println("다른 사람입니다.");
	}

}
