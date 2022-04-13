package ch04condition;
public class ForPrintFromTo10Example {
	public static void main(String[] args) {
		//1~10까지 출력하는 프로그램 작성. 반복되어지는 횟수가 정해져 있고 증감이 되면 for으로 작성
		//for(초기값;반복조건; 증감값) 반복되는 처리 한개. 처리문이 여러개면 {} 묶는다.
		//for안에서 선언된 변수 i 는 밖으로 나오면 사라진다.
		
		for(int i =1; i<=10; i++) {
			System.out.println(i);
		}
		
		
		//for문 안에서 선언해서 사용한 i 밖으로 나오면 사라진다.
		//반복문에서 사용되는 변수 i,j,k... 지정을 한다.
		//System.out.println(i);
		// int i = 1; - int 변수 i를 선언 초기값으로 1을 넣어준다.
		//조건은 <=10; 반복되는 조건문 : 맞으면 반복처리한다.	
		//i++ 증감값이라고 한다.
		for(int i = 1; i <= 10; i++) System.out.println(i);
		
	}

}
