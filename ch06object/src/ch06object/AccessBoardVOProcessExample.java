package ch06object;

public class AccessBoardVOProcessExample {//변수와 메서드를 가지고 있다.
	//BoardProcessExample을 실행할 떄 static으로 정의된 내용이 자동으로 올라간다.
	//BoardProcessExample이라는 클래스 main()메서드를 가지고 있다.
	
	public static void main(String[] args) {
		// BoardVO를 사용하기 위해서는 반드시 생성해 주어야 한다.(new, static)
		AccessBoardVO vo = new AccessBoardVO();
		//게시판 변수 정보처리
		vo.setNo(10);
		vo.setTitle("java");
		vo.setContent ("java jjang");
		vo.setWriter ("lee");
		vo.setWriterDate ("2022.04.14");
		vo.setHit (0);
		//메서드를 호출한다.
		print(vo);
		
	}
	//board 데이터를 출력하는 메서드 - 데이터를 전달받아서 출력한다.
	//전달되는 변수는 순서가 중요하다. 변수이름은 상관이 없다.
	public static void print(AccessBoardVO vo) {
		System.out.println("번호 :" + vo.getNo()); //데이터를 가져올수 있도록 만든거
		System.out.println("제목 :" + vo.getTitle());
		System.out.println("내용 :" + vo.getContent());
		System.out.println("작성자 :" + vo.getWriter());
		System.out.println("작성일 :" + vo.getWriterDate());
		System.out.println("조회수 :" + vo.getHit());
	}
	
	
	
	
}
