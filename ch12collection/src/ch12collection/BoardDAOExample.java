package ch12collection;

import java.util.ArrayList;
import java.util.List;

public class BoardDAOExample {
	
	public static void main(String[] args) {
		//BoardVO 객체를 생성하고 List에 저장한다. - > 3개의 데이터 저장
		List<BoardVO> list = new ArrayList<BoardVO>();
		// 데이터를 저장 BoardVO에 저장한다. 생성하면서
		BoardVO vo1 = new BoardVO(10, "자바", null, "이창준", "2021-12-01", 10);
		list.add(vo1);
		System.out.println(list);
		
		BoardVO vo2 = new BoardVO(9, "오라클", null, "홍길동", "2021-11-01", 15);
		list.add(vo2);
		System.out.println(list);
		
		BoardVO vo3 = new BoardVO(8, "자바", null, "이창준", "2021-12-01", 10);
		list.add(vo3);
		System.out.println(list);
		
		//출력하기
		System.out.println("==================================================");
		System.out.println("|번호|       제목     |   작성자   |  작성일  |  조회수   ");
		System.out.println("==================================================");
		//for(BoardVO vo : list)
		for(int i=0; i < list.size(); i++)
		{   BoardVO vo = list.get(i);
			System.out.println(" " + vo.getNo() + vo.getTitle() +vo.getWriter() 
			+vo.getWriteDate() + vo.getHit());
		}
		
		
		

		
}
	
}
