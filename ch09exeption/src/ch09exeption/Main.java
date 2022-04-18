package ch09exeption;

public class Main {
	
	
	//예외처리 ->프로그램 실행하는데 오류가 발생되거나 발생될 확률이 있는 프로그램에 사용한다.
	// 주로 외부자원을 사용 할 때 사용한다. 그러면 반드시 예외처리를 하도록 프고르램이 되어 있다.
	public static void main(String[] args) {
		System.out.println("main의 시작");
		try {
			//정상처리 
			System.out.println(10/0);
			System.out.println("0으로 나눈 코드");// 프로그램 상의 처리 불가 상태 : 예외 -> jre에서 알맞은
			// 예외를 던진다.ArithmeticException
		} catch (ArithmeticException e) { // 예외처리 던젼진 예외를 받는다.
			// TODO: handle exception
			System.out.println("0으로 나누기를 실행한 예외가 발생");
		}
		System.out.println("main의 끝");
	}

}
