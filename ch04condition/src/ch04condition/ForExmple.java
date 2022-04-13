package ch04condition;

public class ForExmple {
	public static void main(String[] args) {
		//1~3까지 출력하는 처리문 for
		//1. 초기값 2.조건 3.처리 4. 증감
		for(int i = 1; i <=3; i++)System.out.println(i);
		
		//1.초기값
		int i = 1;
		//2.조건 3. 처리. 4. 증감
		for(;i <=3; i++)System.out.println(i);
		
		//1. 초기값
		i = 1;
		//2.조건 
		for(;i <=3;) {
			//3.처리
			System.out.println(i);
			//4.증가
			i++; 
		}
		
		//1. 초기값
		i = 1;
		//무한 반복 for 문
		for(;;) {
			//2.반복조건 (for문을 빠져 나간 조건)
			if(i > 3)break;
			//3.처리
			System.out.println(i);
			//4.증가
			i++; 
		}
		
		
		
		
		
	}

}
