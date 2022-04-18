package ch08interface;

public class DefaultMethodExample {
	public static void main(String[] args) {
		//인터페이스는 구현 한개 없어서 new 할 수 없다. 인터페이스를 상속받은 클래스로 생성해서 인터페이스
		//넣어 사용한다.
		MyInterface mi2 = new MyClassB(); //부모 자식 생성해서 쓴다.
		mi2.method1();
		mi2.method2();
		
		//만약에 구현하지 않는 추상 메서드들의 구현한다면 생성할 수 잇다. 익명클래스 객체
		//다른곳에서 사용하지 못한다. 인터페이스를 상속받는 클래스를 만들면 다른곳에서 사용할수 있다.
		
		MyInterface mi3 = new MyInterface() {
			
			@Override
			public void method1() {
				System.out.println("익명 클래스로 인터페이스를 구현한 객체");
				
			}
		};
		mi3.method1();
		executeMethod1(new MyInterface() {
			
			@Override
			public void method1() {
				System.out.println("한번만 실행이 되는 처리를 위한 익명클래스 객체를 생성");
				
			}
		});
} //end of main()
	
	public static void executeMethod1(MyInterface my) {
		System.out.println("=익명 클래스 객체 실행 시작 ================");
		my.method1();
		System.out.println("익명클래스 끝========================");
	}
	
	
	
	
	
	
	
	
}