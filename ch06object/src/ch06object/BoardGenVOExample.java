package ch06object;

public class BoardGenVOExample {
	
	
	public static void main(String[] args) {
		BoardGenVO vo = new BoardGenVO();
		System.out.println(vo.getNo());
		System.out.println(vo.getTitle());
		
		BoardGenVO vo2 = new BoardGenVO(10);
		System.out.println(vo2.getNo());
		System.out.println(vo2.getTitle());
		
	}

	

}
