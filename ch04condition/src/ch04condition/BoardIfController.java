package ch04condition;

import java.util.Scanner;

public class BoardIfController {
	public static void main(String[] args) {
		//데이터를 키보드(System.in) 입력받는다. 변수에 저장한다.String 변수에 저장한다
		// 프로그램을 실행하려면 메인 메모리에 있어야 한다. 그때 사용하는 키워드 : static:자동 , new:수동
		// scanner라는 변수에 new해서 메인 메모리에 올인 위치(주소)를 넣는다.
		Scanner scanner = new Scanner(System.in);
		//1.list 2.view, 3.write 4.update 5.delete, 그외 잘못된 메뉴 선택
		//메뉴출력
		
		System.out.println("1.list 2.view, 3.write 4.update 5.delete");
		System.out.print("메뉴입력 ->");
		String menu = scanner.nextLine();
		// 메뉴 처리 1.list 2.view, 3.write 4.update 5.delete, 그외 잘못된선택
		//숫자로 비교하도록 한다. 문자열 ->int로 변환 (wrapper 클래스), 숫자가 아니면 오류가 발생
		int intMenu = Integer.parseInt(menu);
		System.out.println(intMenu);
		//메뉴처리 1.list 2.view, 3.write 4.update 5.delete, 그외 잘못된 선택
		//if else if else로 처리
		if(intMenu == 1)
			System.out.println("게시판 리스트");
		else if (intMenu == 2)
			System.out.println("게시판 글보기");
		else if (intMenu == 3)
			System.out.println("게시판 글쓰기");
		else if (intMenu == 4)
			System.out.println("게사판 글수정");
		else if (intMenu == 5)
			System.out.println("게시판 글삭제");
		else
			System.out.println("잘못된 메뉴선택 입니다.");
		
		//switch case 문으로 처리
		//처리가 다 끝나면 break를 사용해라 그렇지 않으면 밑으로 계속 진행된다.
		switch(intMenu){ //switch 문의 시작
		case 1:
			System.out.println("게시판리스트");
			break;
		case 2:
			System.out.println("게시판 글보기");
			break;
		case 3:
			System.out.println("게시판 글쓰기");
			break;
		case 4:	
			System.out.println("게사판 글수정");
			break;
		case 5:
			System.out.println("게시판 글삭제");
			break; //실행을 멈추고 switch 문을 빠져 나간다.
		default :
			System.out.println("잘못된 메뉴를 선택 하셨습니다.");
		}	
		//"1" 문자열 1. menu라고 문자가 담겨져 있는 참조형 변수 (주소)
		// if(menu의 주소 == "1" ) 틀리다. 주소가 틀리다.
		if(menu == "1")System.out.println("같다");
		else System.out.println("같지않다.");
		// menu의 주소가 가르키는 값과 비교하는 프로그램(메서드)를 작성해서 비교하면된다.
		if(menu.equals("1"))System.out.println("같다");
		else System.out.println("같지않다.");
	
		//자바6 버전 이상이여야 문자열 비교를 허용해 준다.
		switch(menu) {
		case "1":
			System.out.println("같다");
			break;
		default:
			System.out.println("같지 않다.");
		}
		
		}//switch 문의끝
		
	}

