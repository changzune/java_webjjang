package ch03op;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		// int 변수 charCode에 문자형 변수 'A'를 초기값을 넣는다.
		// int 변수가 크기 때문에 데이터 손실이 없다. 그래서 자동 캐스팅 된다.
		// 'A' = 65
		int charCode = 'A';
		
		System.out.println(charCode);
		System.out.println("알파벳 코드값 :" + 65 + "~" + 90);
		System.out.println("알파벳 코드값 :" + (char)65 + "~" + (char)90);
		
		// if 만약에 (조건)이 맞음녀 다음에 나오는 처리문을 실행해라.
		// &: 앞에 것이 false 이면 뒤에 것을 물어볼 필요가 없는데 굳이 물어보러 간다.
		// &&: 앞에 것이 false이면 뒤에 것은 물어보지 않는다. 아무생각이 && 사용한다.
		// 2문장 이상을 처리하려면 {}묶어서 만든다. 0개 이상을 묶을 수 있다.
		// 조건문에 맞는 처리문이 없으면 바로 ;으로 마감한다.
		if((charCode >= 65 & charCode <=90)) 
			System.out.println("영문자 대문자 입니다.");
		
		// int 변수 value에 초기값을 0을 넣는다.
		int Value = 6;
		System.out.println(Value);
		
		// if 만약에 (조건)이 맞으면 다음에 나오는 처리문 하나를 실행하세요.
		// | 앞에 것이 true 이면 뒤에 것을 물어볼 필요가 없는데 굳이 물으러 간다.
		//아무생각없이 || 사용한다.
		if(Value % 2 == 0 || Value % 3 == 0)
			System.out.println("2의 배수이거나 3의 배수입니다.");
		//변수 value의 값이 2의 배수이면 "2의 배수"
		if(Value % 2 ==0 )
		System.out.println("2의 배수 입니다.");
		else
			System.out.println("");
		//3항 연산자를 이용한 조건에 맞는 문자열 출력하기.
		//(조건)? ture; false일 때의 값
		System.out.println((Value % 2==0)?"2의배수입니다.":"");
		
		String name = "이창준";
		System.out.println(name);
		// name 변수가 String 타입의 변수가 맞는지 알아보자. - > instanceof 연산자.
		System.out.println(name instanceof String);
	
			
		
	}

}
