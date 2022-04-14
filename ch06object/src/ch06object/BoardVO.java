package ch06object;

//BoardVO 클래스 변수 들과 메서드를 자기고 있다.
public class BoardVO {
	
	//한꺼번에 처리할 변수를 선언.모여라.//맴버변수
	//위치상 BoardVO바로 아래 있으면 맴버 변수,클래스를 설명하고 있다. - > 속성이다.영역 - 필드
	// 적용범위 : 전역변수- 메서드 안에 들어 가 있지 않나서 모든 메서드에 적용이 된다.
	long no;
	String title;
	String content;
	String writer;
	String writerDate;
	long hit;

}
