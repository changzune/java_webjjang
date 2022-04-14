package ch04condition;

import java.util.Scanner;

public class BoardController {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//게시판 서비스
		//"0"을 입력하면 종료.(if-break). 그러ㅓㅎ지 않으면 무한 반복 (while)
		//while 무한 루프 시작
		//while 반복의 이름표 라벨 처리
		//whileLoop:
		while(true){
			//메뉴출력
			System.out.println("1.게시판 리스트 2.게시판 글보기 3.게시판 글 쓰기");
			System.out.println("4.게시판 글수정 5.게시판 글삭제 0.프로그램 종료.");
			//메뉴선택 - 문자열로 입력
			System.out.println("메뉴선택 ->");
			String menu = scanner.nextLine();
			//메뉴 처리 - 문자열로 처리
			switch (menu) {
			case "1":
				System.out.println("++ 게시판 리스트 처리 ");
				break;//switch 빠져나간다.
			case "2":
				System.out.println("++ 게시판 글보기 처리 ");
				
				break;
			case "3":
				System.out.println("++ 게시판 글쓰기 처리 ");
				
				break;
			case "4":
				System.out.println("++ 게시판 글수정 처리 ");
						
				break;
			case "5":
				System.out.println("++ 게시판 글삭제 처리 ");
				
				break;
			case "0": // whlie  문을 빠져 나가도록 해야한다.		
				System.out.println("프로그램 종료");			
				//break whileLoop;
				scanner.close();
				//return; //main 메소드를 빠져나감 
				System.exit(0); //실행하고 있는 자바 프로그램 종료 0:의도한 종료, 그외 오류가 나서 종료
			default:
				System.out.println("잘못된 메뉴를 선택하셨습니다. 1~5,0을 선택하셔야합니다.");
				break;
				
			}//switch문의 긑
			
			
		}// 무한 루프의 긑
		
		
		
	}//main()의 끝

}//boardController class의 메뉴
