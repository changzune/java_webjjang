package ch08interface;

public class MyClassB implements MyInterface{

	// 추상메서드 대한 재정의 반드시 재정의 헤야만 한다.
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("MyClassB- 재정의 method1() 실행");
	}
	
	// 기본 매서드의 대한 재정의 - 필요하면 한다.
	@Override
	public void method2(){
		System.out.println("MyClassB 기본매세더 재정의 -method 실행");
	}

}
