package ch08interface;

public interface MyInterface {
	
	//반드시 재정의 해야하는 추상매서드
	public void method1();// {} 없는 추상 메서드
	
	// 재정의를 생략할 수 있는 메서드 -default 키워드를 반드시 사용하여야 한다.
	
	public default void method2() {
		System.out.println("MyInterface 기본메서드 - method2 실행");
	}
	
	//기본 메서드 
	public default void method3() {}
	public default void method4() {}
	public default void method5() {}
	public default void method6() {}
	public default void method7() {}
	public default void method8() {}
	public default void method9() {}

}
