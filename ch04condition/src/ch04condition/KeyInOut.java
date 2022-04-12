package ch04condition;

// 다른위치의 프로그램을 사용하려면 반드시 import 해야한다.
// 단 자바의 기본패키지 (=java.lang)는 import 없이 사용이 가능하다.(자동 import해준다)
import java.util.Scanner;

public class KeyInOut {
	public static void main(String[] args) {
		//키보드로 데이터를 입력받아 화면을 출력한다.
		//키보드 System.in -> Scanner
		//콘솔출력 System.out
		//1. 입력객체(Scanner)를 생성한다. - 메인 메모리에 올린다.
		//2. 안내메시지를 출력 -> 3. 메시지 데이터를 받는다. ->4.화면에 출력한다.
		//5. 입력객체를 닫는다.
		//1. 입력객체를 선언하고 생성(new)해서 넣는다.(메인 메모리)
		Scanner scanner = new Scanner(System.in);
		//2.안내 메세지 출력
		System.out.println("데이터를 입력하시오.");
		//3.메시지 데이터를 받는다.
		String data = scanner.nextLine();//줄단위로 받는다.
		//4.화면에 출력한다.
		System.out.println("입력한 데이터 :" + data);
		//5.입력 객체를 닫는다.
		scanner.close();
		
	}

}
