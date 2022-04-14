package ch04condition;

import java.util.Scanner;

public class DoWhileExample {
	
	public static void main(String[] args) {
		//데이터를 입력 받아서 처리를 진행한다. 입력 -> 조건과 처리
		System.out.println("메시지를 입력하세요");
		System.out.println("종료하려면 q를 입력하세요");
		// 입력받고 조건 처리
		Scanner scanner = new Scanner(System.in);
		//입력받은 변수 tjsdjs
		String inputString = "";
		//사용자가 입력할 메시지가 q이면 출력하지말고 종료 시키다.
		//System.out.print(">");
		//inputString= scanner.nextLine();
		
		//while(!inputString.equals("q")) {
			//System.out.println("while문 안");
			//메시를 입력 -> 조건처리
			//System.out.print(">");
			//inputString= scanner.nextLine();
			//System.out.println(inputString);
			//System.out.println(inputString);
			//System.out.print(">");
			//inputString= scanner.nextLine();
				
		//}
		
		do {
			if(!inputString.equals(""))
			System.out.println(inputString);
			System.out.print(">");
			inputString= scanner.nextLine();
		}while(!inputString.equals("q"));
	}

}
