package ch06object;

//BoardVO 클래스 변수 들과 메서드를 자기고 있다.
public class AccessBoardVO {
	
	// 접근 제한자 사용하는 이유 : 1.데이터 보호 차원 2.프레임워크들이 setter()/getter() 형식을 원한다.
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
	public long getNo() {return no;} //게터를 써서 호출하면 넘버가 나온다. //겟넘버하면 반환값으로 넘버를 준다.
	public String getTitle() {return title;}
	public String getContent() {return content;}
	public String getWriter() {return writer;}
	public String getWriterDate() {return writerDate;}
	public long getHit() {return hit;}
	
	//데이터를 넣는 setter 만들기
	public void setNo(long no) { this.no = no;}
	public void setTitle(String title) { this.title = title;}
	public void setContent(String content) {this.content = content;}
	public void setWriter(String writer) {this.writer = writer;}
	public void setWriterDate(String writerDate) {this.writerDate = writerDate;}
	public void setHit(long hit) {this.hit = hit;}
	
	
	
}
