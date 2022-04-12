package ch03op;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		// -100을 int 변수 X에 초기값을 저장한다.
		int result1 = +x; //+(-100) -< -100
		System.out.println(result1);
		int result2 = -x; // -(-100) -> 100;
		System.out.println(result2);
	}

}
