package ch04condition;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		// 신체 지표 판정(BMI)
		// 몸무게(kg)와 키(m-cm가 아니다.)의 String 데이터를 받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("몸무게를 입력하세요.");
		String kg = sc.nextLine();
		System.out.println("키를 입력하세요.");
		String m = sc.nextLine();

		// String -> double
		// String -> double
		double x = Double.parseDouble(kg);//몸무게
		double y = Double.parseDouble(m);//키
		System.out.println(x);
		System.out.println(y);
	
		double bmi = (x/(y*y))*10000;
		System.out.println("BMI지수입니다."+ bmi);

		System.out.println("몸무게 : " + x + "키 :" + y + "Bmi 지수 =" + bmi);
		
		if(bmi < 20)
			System.out.println("저체중 입니다.");
		else if(bmi <= 24)
			System.out.println("정상 입니다.");
		else if(bmi <= 29)
			System.out.println("과체중 입니다.");
		else 
			System.out.println("비만 입니다.");
		
		sc.close();
		
	}
	

}
