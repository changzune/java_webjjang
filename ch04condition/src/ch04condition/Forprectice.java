package ch04condition;

import java.util.Scanner;


public class Forprectice {
	
	public static void main(String[] args) {
		//1.1~5까지 출력하는 프로그램 작성
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		//2.1~5까지 더하는 프로그램 작성
		int sum = 0;
		for(int i= 1; i <= 5; i++) sum += i;
		System.out.println(sum);
		//3. 데이터를 키보드로 입력해서 출력하는것을 3번 반복하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 3; i++){
			System.out.println("데이터 입력 : ");
			String data = sc.nextLine();
			System.out.println(data);
		}

		//4. 다음 데이터를 모두 출력하는 프로그램 작성
		String[] name = {"이우리","한정희","윤수환"};
		//4-1 index를 사용하여 출력하는 프로그램 작성
		for (int i = 0; i < name.length; i++)System.out.println(name[i]);
		
		//4-2 향상된 for(foreach)를 이용하여 출력하는 프로그램작성
		for(String names : name) System.out.println(names);
		//5.다음 데이터의 합계와 평균을 구하는 프로그램 작성
		int [] scores = {100,85,90,100,70};
		int yy = 0;
		for(int y = 0; y < scores.length; y++) yy += scores[y];
		System.out.println(yy);
		int avg = (int)((double)yy / scores.length + 0.5);
		System.out.println(avg);

		//1~10 데이터 중 3의 배수를 출력하는 프로그램 작성
		//변수 int 설정해라.
		for(int i = 1; i <= 10; i++) //10번 실행된다.
			if(i % 3 == 0 ) System.out.println(i);
		//3의 배수 다른 방법.
		for(int i = 3; i<= 10; i += 3) System.out.println(i); //3번만 처리된다.
		
			

	}
	


}
