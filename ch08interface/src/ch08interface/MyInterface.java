package ch08interface;

public interface MyInterface {
	
	//반드시 재정의 해야하는 추상매서드
	public void method1();// {} 없는 추상 메서드
	
	// 재정의를 생략할 수 있는 메서드 -default 키워드를 반드시 사용하여야 한다.
	
	public default void method2() {
		System.out.println("MyInterface=method2 실행");
	}

}
