package ch04condition;

import java.util.Scanner;

public class Bmi2 {
	public static void main(String[] args) {
		// 신체 지표 판정(BMI)
		// 몸무게(kg)와 키(m-cm가 아니다.)의 String 데이터를 받는다.
		// String -> double
		// BMI 공식을 이용하여 지수를 계산한다.(* / 를 이용) - 인터넷 검색
		// BMI 지수에 따른 판정을 해낸다.(인터넷 검색)
		// 판정된 키와 몸무게를 출력하고 BMI 지수와 판정을 출력한다.
		// 입력 객체를 생성하고 저장한다.
		Scanner scanner = new Scanner(System.in);
		// 필요한 데이터(몸무게와 키)를 키보드로 입력받는다.
		// "몸무게를 입력하시오." 문장 다음줄에 data1의 값으로 몸무게를 입력받는다.
		System.out.println("몸무게를 입력하시오.(kg)");
		String data1 = scanner.nextLine();
		// "키를 입력하시오." 문장 다음줄에 data2의 값으로 키를 입력받는다. 이때 키는 cm가 아닌 m로 받는다.
		System.out.println("키를 입력하시오.(m)");
		String data2 = scanner.nextLine();
		// 입력받은 몸무게와 키의 값(data1, data2)값을 String에서 double로 변환한다.
		// String은 문자열, double은 숫자이므로 Double.parseDouble를 사용해 변환한다.
		double w = Double.parseDouble(data1);
		double t = Double.parseDouble(data2);
		// BMI 계산 공식 몸무게 나누기 키의 제곱의 값을 bmi로 나타낸다.
		double bmi = w / (t * t);
		// 일부 결과값의 경우 소수점이 길게 나오므로 소수점 2째자리까지 나타낸다.
		// *100을 통해 소수점의 위치를 변경한다.
		bmi = bmi * 100;
		System.out.println(bmi);
		// int를 이용해 소수점 아래 숫자를 제거한다.
		bmi = (int) bmi;
		System.out.println(bmi);
		// /100.0을 통해 소수점을 원래 위치로 변경한다.
		bmi = bmi / 100.0;
		System.out.println(bmi);
		// 계산된 bmi의 값을 출력한다.
		System.out.println("BMI지수 =" + bmi);
		// if else if else 를 사용해 위에 나온 bmi의 값의 범위를 결정한다.
		if (bmi < 20) {
			System.out.println("저체중");
		} else if (bmi < 25) {
			System.out.println("정상");
		} else if (bmi < 30) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
		// 입력 객체를 닫는다.
		scanner.close();
}
}
