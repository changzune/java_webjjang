package ch04condition;

public class ForSumFor1To100Example {
	public static void main(String[] args) {
		//1부터 100까지 더한다. 1~100번 실행 +1 실행 증가 for으로작성
		//for문 밖에서 출력을 해야 하므로 for 들어가기 전에 선언을 먼저해서 사용한다.
		
		int sum = 0;
		int i = 0;
		//조건에 만족하지 않으려면 i = 101 이 되어야한다.
		for(i = 1; i <= 100; i++) {
			sum = sum + i;
			
		}
		System.out.println("반복문을 빠져 나온 후의 i :" + i);
		System.out.println(sum);
	}
	

}
