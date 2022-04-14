package ch06object;

public class CalculatorExmaple {
	
	public static void main(String[] args) {
		// 클래스와 메서드를 만드는 목적 - 복잡하다. 반복된다.
		// 계산기 가져와야 한다.new 한다.
		Calculator myCalc = new Calculator();//생성자
		// 계산기를 켠다. 
		myCalc.powerOn();
		// 더한다
		int result1 =myCalc.plus(5, 6);
		System.out.println(result1);
		// 나눈다.
		byte x = 10;
		byte y = 4;
		// 전달되는 값이 꼭 맞는 데이터를 전달하는 메서드를 
		// 찾아간다. 그런데 딱맞는 데이터 타입없으면 자동캐스팅 되는곳을 찾아간다.
		// byte -> int  : 데이터 손실이 없어서 자동 캐스팅 된다
		double result2 =myCalc.divide(10, 4);
		System.out.println(result2);
		// 전원을 끈다.
		myCalc.powerOff();
		
		
		
	}

}
