package ch02var;

	public class CastiongExample {
	
	public static void main(String[] args) {
		int intValue = 44032;
		// charVlaue가 intVlaue가 작다. 그러면 데이터 손실이 발생한다. 오류가 발생한다.
		// 큰데이터를 작은 타입으로 저장 할 때는 강제 캐스팅 해줘야한다..
		char charValue = (char) intValue; 
		System.out.println(intValue + "-" + charValue);
		
	
		double doubleValue = 3.14;
		//큰데이터  작은 데이터 타입으로 저장하면 데이터 손실이 있어서 오류가 발생된다.
		intValue = (int) doubleValue; //소실점 있는 숫자로 할 때 캐스틍하면 날아간다.
		System.out.println(intValue);
	
		intValue = 10;
		Integer integerValue = intValue;
		System.out.println(integerValue);
		//기본형 변수와 wrapper 클래스 간의 데이터들은 자동 변환 된다.
		intValue = integerValue;
		System.out.println(intValue);
		
		//연산자와 캐스팅
		// int / int --> int가 된다. 10 / 4 -> 2.5 : int 처리라서 소숫점이 생기지 않는다. 5가 날아간다.
		System.out.println(10 / 4);
		// int / double -> double이 된다. 큰데이터 타입의 맞춰준 후 연산을 한다.
		System.out.println(10 / 4.0);
		// 나머지 연산자 % -> 4 * 2(8)을 10에서 빼면 나머지가 2가 된다.
		System.out.println(10 % 4);
		
		//문자열 이어 붙이기 연산자 : +, 뒤에는 무조건 +가 나오는 문자열로 이어 붙이기 한다.
		//순서가 중간에 산술 연산을 시키려면 ()로 묶는다.
		//문자열 이어 붙이기 연산자인 +보다 /,-,*,% 연산자가 우선 연산이된다.
		System.out.println("10 / 4 = " + (10/4));
		System.out.println("10 / 4 = " + (10+4));
				
	}

		
		
}
