package ch03op;

public class Test {
	public static void main(String[] args) {

		int a = 15;

		int b = 4;

		// 5칙 연산을하고 출력하는 프로그램 작성 (+ - * / %)
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	
		// 80점 이상이면 합격 미만이면 불합격을 출력하는 프로그램을 작성
		int score = 80;		
		if(score >= 80)
			System.out.println("합격");
		else
			System.out.println("불합격");

		int i = 10;

		// 증감 연산자만 이용해서 ++ --

		System.out.println(); // 11, 11, 10 출력이되도록 해 보세요. 한줄에 데이터 i를 3번 출력
		
		System.out.println(++i + "," + i-- +"," + i--);
		
		System.out.println(--i); // 9가 출력이 되어야 한다.
		

		//3 항 연산자 i가 10이상이면 "10이상" 출력 아니면 "10미만"이라고 출력한다.

		System.out.println((i>=10)?"10이상":"10미만");

		}

		
}
