package ch04condition;

import java.util.Arrays;

public class ArrayTask {

	public static void main(String[] args) {
		//<< 배열 과제>>
		//클래스 이름 : ArrayTask
		//** 배열로 이용해서 100, 75, 80, 90을 세팅한다.
		int []data = {100, 75, 80, 90};
		//1. 배열의 길이(데이터 개수)를 출력하시오.
		System.out.println(data.length);
		//2. index와 배열의 length를 이용해서 모든 데이터를 출력하는 for문 작성
		for(int i = 0; i < data.length; i++)
			System.out.println(data[i]);
		//3. 향상된 for(=foreach)를 이용하여 모든 데이터를 출력하시오.\
		//변수값을 주어야 한다.
		for(int data2 : data)
			System.out.println(data2);
		//4. 점수들의 합계를 구하여 출력하시오. (for문 사용)
		// += 기호를 유념하자
		int data3 = 0;
		for(int i = 0; i < data.length; i++) data3 += data[i];
		System.out.println(data3);
		//5. 점수 배열 중에서 3번째 데이터 80을 출력하시오.
		System.out.println(data[2]);
		//6. 점수들의 평균을 구하시오. (소수점 이하 2째자리에서 절삭시킨다.)
		for(int i = 0; i < data.length; i++) data3 += data[i];
			System.out.println(data3 / data.length);
		
		//7. Arrays 클래스를 이용하여 모든 데이터를 출력하시오.
			System.out.println(Arrays.toString(data));
		

	}
}
