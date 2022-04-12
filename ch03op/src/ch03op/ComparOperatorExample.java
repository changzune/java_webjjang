package ch03op;

public class ComparOperatorExample {
	public static void main(String[] args) {
		
		// int 변수 num1에 초기값 10을 넣는다.
		int num1 = 10;
		// int 변수 num2에 초기값 10을 넣는다.
		int num2 = 10;
		// num1과 num2가 같은지 알아 낸 (turn/false) 후 
		// 결과 값을 boolean 변수 result1에 초기값으로 저장한다.
		boolean result1 = (num1 == num2);
		System.out.println(result1);
		
		// num1과 num2가 같지 않은지 알아 낸 (turn/false) 후 
		// 결과 값을 boolean 변수 result1에 초기갑으로 저장한다.
		boolean result2 = num1 != num2;
		System.out.println(result2);
		
		// num1이 num2가 이하인지 알아 낸 (turn/false) 후 
		// 결과 값을 boolean 변수 result1에 초기갑으로 저장한다.
		boolean result3 = num1 <= num2;
		System.out.println(result2);
	}

}
