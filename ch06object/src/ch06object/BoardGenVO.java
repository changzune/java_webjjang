package ch06object;

public class BoardGenVO {
	
	// 변수 선언
	private long no;
	//같은 타입의 변수인 경우 변수를 선언하면서 ","를 이용하여 작성할 수 가 있다.
	private String title, content, writer, writerDate;
	private long hit;
	
	
	//생성자 - 생성하는 놈. 초기값을 세팅해주기 위해서 사용한다.
	// 기본생성자 - 생략할수가 있다. 그러나 다른생성자가 있으면 생략하면 안된다.
	public BoardGenVO() {
		no = 100;
		title ="java";
		content = "java jjang";
		writer = "lee";
		
	}
	
	//일반 생성자 
	//자바는 메서드 이름이 같아도 ()안에 파라메터의 갯수나 타입의 순서가 다르면 
	//다른것으로 인식된다.  -> 오버로드(overload)
	public BoardGenVO(long no) { 
		this.no = no;
		
	}
	
	//setter / getter - 데이터 저장 , 데이터 가져오기.
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriterDate() {
		return writerDate;
	}
	public void setWriterDate(String writerDate) {
		this.writerDate = writerDate;
	}
	public long getHit() {
		return hit;
	}
	public void setHit(long hit) {
		this.hit = hit;
	}
	

	
}
