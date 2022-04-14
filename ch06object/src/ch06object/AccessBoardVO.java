package ch06object;

//BoardVO 클래스 변수 들과 메서드를 자기고 있다.
public class AccessBoardVO {
	
	//한꺼번에 처리할 변수를 선언.모여라.//맴버변수
	//위치상 BoardVO바로 아래 있으면 맴버 변수,클래스를 설명하고 있다. - > 속성이다.영역 - 필드
	// 적용범위 : 전역변수- 메서드 안에 들어 가 있지 않나서 모든 메서드에 적용이 된다.
	// 접근제한자 -> private
	private long no;
	private String title;
	private String content;
	private String writer;
	private String writerDate;
	long hit;

	//setter ()데이터 넣기 / getter()데이터를 받을 때 보통 public 으로 작성한다.
	//접근 제한자는 선언하는 곳에서 다른 객체에 접근할 권한 선언 해주는 것이다.
	public long getNo() {return no;}
	public String getTitle() {return title;}
	public String getContent() {return content;}
	public String getWirter() {return writer;}
	public String getWriterDate() {return writerDate;}
	public long getHit() {return hit;}
	
	
}
