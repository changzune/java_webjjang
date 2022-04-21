package com.webjjang.board.controller;

import java.util.Scanner;

/**
 * 요구한 내용을 가지고 어떤 객체를 실행할지 정해 주는 클래스
 * @author zune
 *
 */


public class BoardController {
	public static Scanner scanner = new Scanner(System.in);
	
	
	
	// 실행의 처음 - main을 만든다. 다른곳에는 main이 동작되면 안된다.
	 public static void main(String[] args) throws ClassNotFoundException {
		 
		 //DB 클래스 확인
		 Class.forName("com.webjjang.utill.db.DB");
		 
		 
		 // 무한 반복
		 while(true){
			 
			 // 메뉴 출력
			 System.out.println("===========================================");
			 System.out.println("1. 게시판 리스트   2.게시판 글보기   3.게시판 글쓰기");
			 System.out.println("4. 게시판 글수정   5.게시판 글삭제   0.프로그램종료");
			 System.out.println("===========================================");
			 // 메뉴 선택
			 System.out.print("메뉴를 선택해주세요.--->");
			 String menu = scanner.nextLine();
			 // 메뉴 처리
			 switch (menu) {
			case "1":
				//게시판 리스트 처리 -> 호출하고 생성한다.:Controller - service - DAO
				break;

			default:
				break;
			}
		 }
		 
		
	}

}
