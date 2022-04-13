package ch04condition;

import java.util.Scanner;

public class NoticeControllerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("공지사항 서비스");
		System.out.println("1:공지리스트");
		System.out.println("2:공지보기");
		System.out.println("3:공지쓰기");
		System.out.println("4.공지수정");
		System.out.println("5.공지삭제");
		System.out.println("0.프로그램종료");
		System.out.println("원하시는 번호를 입력해주세요.");
		String data1 = sc.nextLine();
		int choice = Integer.parseInt(data1);

		switch (choice) {
		//1. 공지 리스트
		case 1:
			System.out.println("공지리스트");
			break;
			//2. 공지 보기
		case 2:
			//3. 공지 쓰기
			System.out.println("공지보기");
			break;
		case 3: 
			//4. 공지 수정
			System.out.println("공지쓰기");
			break;
		case 4: 
			System.out.println("공지수정");
			break;
			//5. 공지 삭제
		case 5: 
			System.out.println("공지삭제");
			break;
			//0. 프로그램 종료
		case 0:
			System.out.println("프로그램 종료");
		
		sc.close();
		System.exit(0);
		default:
		System.out.println("잘못된 메뉴를 선택 하셨습니다.");
		break;
			//실행하고 메뉴에서 1 -> 0 : 소스를 복사붙여 넣기하고. 결과 화면을 캡쳐해서 답글로 올려 주세요.
		}
		
		
		
		
	}

}
