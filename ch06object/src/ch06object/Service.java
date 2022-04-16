package ch06object;

public class Service {
	
	//@PrintAnnotation 2가지 속성이 있는데 지정을 안해도 되므로 ()가 없다. value에는 "-", number에는 15가 세팅
	@PrintAnnotation
	public void method1() {
		System.out.println("실행내용 1");
	}
	//@PrintAnnotation 2가지 속성이 있는데 출력할 문자영을 지정을 안해도 되므로 ()가 없다. value에는 "-", number에는 15가 세팅
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행내용 2");
	}
	//@PrintAnnotation 2가지 속성이 있는데 지정함. value에는 "#" ,number에는 20을 세팅
	@PrintAnnotation(value ="#", number =20)
	public void method3() {
		System.out.println("실행내용 3");
		
	}

}
