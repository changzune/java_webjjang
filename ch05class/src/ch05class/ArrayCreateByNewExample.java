package ch05class;

import java.util.Arrays;

public class ArrayCreateByNewExample {
	
	
	public static void main(String[] args) {
		// int 배열 생성해서  3개 짜리 배열을 생성해서 주소를 arr1의 넣어준다.
		// 객체를 생성하면 가지고 있는 저장 변수들은 기본값으로 세팅된다.(숫자인 경우 0) 초기값을 넣지 않더라도
		// 오류가 발생되지 않는다.
		int []	arr1 = new int [3];
		// arr1에 데이터를 넣을 때나 꺼낼 때는 인덱스를 사용해야 한다.
		//인덱스를 이용한 출력 0~2까지반복 ->
		for(int i = 0; i <= 2; i++) System.out.println(arr1[i]);
		//int a; 기본형 변수로 매소드 안에 선언되 변수들은 꼭 초기값을 넣어줘야 사용 할 수 있다.
		//System.out.println(a);
		// 배열 arr1에 값을 넣기. -> 각각의 값이 나중에 생기면 아래처럼 코딩한다.
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		//배열 기초적인 처리문
		//배열을 선언먼 헌다.
		int [] arr11;
		int arr12 [];
		//배열을 작업할 자리를 만든다. - 몇개로 만들지 정한다.
		arr11 = new int[10];
		arr11[0] = 80;//이때 인덱스 번호를 9번까지 사용이 가능하다.
		//객체 출력 : 타입@해쉬코드값
		System.out.println(arr11);
		//배열 객체가 가지고 있는 값을 확인 - for문을 index 사용 -> Arrays.toSring(배열)
		System.out.println(Arrays.toString(arr11));
		
		double [] arr2 = new double[3];
		arr2[2] = 1; //int ->double : 작-> 큰(데이터 손실없음) - 자동캐스팅이 일어났다.
		System.out.println(Arrays.toString(arr2));
		
		String [] arr3 = new String[3];
		arr3[0] ="1월";
	
		
		//데이터를 이미가지고 있는 경우의 배열 - 100,80,90
		
		int [] arr13 = new int[] {100, 80, 90}; // 배열 생성을 하면서 {} 값을 ","을 이용해서 넣는다.
		System.out.println(arr13.length);
		System.out.println(Arrays.toString(arr13));
		String [] days = {"일","월","화","수","목","금","토"};
		System.out.println(days.length);
		System.out.println(Arrays.toString(days));
		//날짜 형 데이터를 처리하는 Date나 Calender 객체에서 요일을 뽑아내면 숫자 0~6까지 숫자가나온다.
		System.out.println(days[1]);
		
		}
		

}

