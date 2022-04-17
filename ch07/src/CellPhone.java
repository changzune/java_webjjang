// 부모클래스
public class CellPhone {
	//필드 = 속성 = 맴버변수 = 전역변수 = 객체 변수 = 변수
	
	String model;//초기값 : null
	String color;//초기값 : null
	
	//생성자 - > 생략하면 기본생성장
	public CellPhone() {
		System.out.println("CellPhone 생성자.. 부모클래스");
	}
	
	// 메서드 - 기능, 동작 , 처리무늘늘 가지고 있는것 
	// 전원켜기 .
	void powerOn( ){
		System.out.println("전원을 켭니다.");
		
	}// end of CellPhone
	//전원끄기
	void powerOff(){
		System.out.println("전원을 끕니다.");
	}
	//전화벨 울림
	void Bell() {
		
	}
	//음성보내기 // 파라미터 massage에 넣으면 보낸다.
	void sendVoice(String massage) {
		System.out.println("자기 : " + massage);
	}
	//음성받기
	void receiveVoice(String massage) {
		System.out.println("상대방 : " + massage);
	}
	//전화끊기
	void hangup() {
		System.out.println("전화를 끊습니다.");
	}
	
	
}
