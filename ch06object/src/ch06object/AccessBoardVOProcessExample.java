package ch06object;

public class AccessBoardVOProcessExample {//변수와 메서드를 가지고 있다.
	//BoardProcessExample을 실행할 떄 static으로 정의된 내용이 자동으로 올라간다.
	//BoardProcessExample이라는 클래스 main()메서드를 가지고 있다.
	
	public static void main(String[] args) {
		// BoardVO를 사용하기 위해서는 반드시 생성해 주어야 한다.(new, static)
		AccessBoardVO vo = new AccessBoardVO();
		//게시판 변수 정보처리
		vo.no = 10;
		vo.title = "java";
		vo.content = "java jjang";
		vo.writer = "lee";
		vo.writerDate = "2022.04.14";
		vo.hit = 0;
		//메서드를 호출한다.
		print(vo);
		
	}
	//board 데이터를 출력하는 메서드 - 데이터를 전달받아서 출력한다.
	//전달되는 변수는 순서가 중요하다. 변수이름은 상관이 없다.
	public static void print(AccessBoardVO vo) {
		System.out.println("번호 :" + vo.getNo());
		System.out.println("제목 :" + vo.getTitle());
		System.out.println("내용 :" + vo.content);
		System.out.println("작성자 :" + vo.writer);
		System.out.println("작성일 :" + vo.writerDate);
		System.out.println("조회수 :" + vo.hit);
	}
	
	
	
	
}
