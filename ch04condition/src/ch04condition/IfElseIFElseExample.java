package ch04condition;

public class IfElseIFElseExample {
	public static void main(String[] args) {
		
		//int 변수 score 선언하고 75값을 초기값으로 넣는다.
		int score = 75;
		
		//평점을 계산해보자
		//90이상 - A
		if(score >= 90)
			System.out.println("A");
		//80이상 90미만 데이터
		else if(score >= 80)
			System.out.println("B");
		//80이상 70미만 데이터
		else if(score >= 70)
			System.out.println("C");
		//70미만(그외)
		else
			System.out.println("D");
		  
		
	}
	

}
