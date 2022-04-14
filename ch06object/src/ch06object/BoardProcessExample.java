package ch06object;

public class BoardProcessExample {//변수와 메서드를 가지고 있다.
	//BoardProcessExample을 실행할 떄 static으로 정의된 내용이 자동으로 올라간다.
	//BoardProcessExample이라는 클래스 main()메서드를 가지고 있다.
	
	public static void main(String[] args) {
		//게시판 변수 정보처리
		long no = 10;
		String title = "java";
		String content = "java jjang";
		String writer = "lee";
		String writerDate = "2022.04.14";
		long hit = 0;
		//메서드를 호출한다.
		print(no,title,content,writer,writerDate,hit);
		
	}
	//borad 데이터를 출력하는 메서드 - 데이터를 전달받아서 출력한다.
	//전달되는 변수는 순서가 중요하다. 변수이름은 상관이 없다.
	public static void print(long no, String title, String content,
			String writer, String writerDate, long hit) {
		System.out.println("번호 :" + no);
		System.out.println("제목 :" + title);
		System.out.println("내용 :" + content);
		System.out.println("작성자 :" + writer);
		System.out.println("작성일 :" + writerDate);
		System.out.println("조회수 :" + hit);
	}
	
	
	
	
}
