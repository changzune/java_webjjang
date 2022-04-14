package ch06object;

//클래스의 선언 public - 다른 패키지에서도 접근 할 수 있다.
//public으로 선언은 한개만 해야만 하고 파일이름과 갈아야 한다.
public class DataCycleClass {

	//int 변수 a를 선언하고 초기값으로 0을 세팅해 준다. new 할 때 생성이 된다.
	int a;
	static int x;
	
	
	//초기화 블록 - 초기값 세팅 - new(생성)할때 무조건 동작
	{
		System.out.println("초기화 블록 실행- static 변수, non-static 변수의 초기값 정해진 것으로 세팅 가능 ");
		a = 10;
		x = 20;
	}
	
	// static 초기화 블록 - 초기값 세팅 - 클래스 이름이 나타나면 무조건 동작 처음 딱한번만 무조건 동작
	static {
		System.out.println("static 초기화 블록 실행 - static 변수의 초기값을 정해진 것으로 세팅 가능하다.");
		//a=100;
		x = 200;
		
	}
	
	// 생성자 - new 할 때 사용. 생성하면 주소만 나오므로 리턴 타입이 없다.
	// 기본 생성자 - 다른 생성자가 없으면 자동으로 생긴다.
	// 이것으로 호출해서 생성하면 3번째로 실행된다.
	
	public DataCycleClass() { a = 50; }{
		System.out.println("기본 생성자");
		a = 50;
	}
	
	//일반 생성자 - 생성을 하면서 a 값을 전달해서 세팅하다.
	public DataCycleClass(int a) {
		System.out.println("일반 생성자 : a 값을 전달 받아서 세팅, 전달되는 값 a = " + a);
		this.a = a; // 전달받은것은 초기값으로 셋팅한다.
	}
	
	// 객체를 출력할때 자동으로 호출 당하는 toString 메서드 작성
	// object에서 상속 받은 toString()와 똑같은 매서드를 만들어 작성 된것 . 재정의(=덮어쓰기)
	// object에서 상속 받은 toString() 똑같지 않으면 오류가 난다.{~~} 구현을 마음대로 쓸수가 있다. 작성 할수 있다.
	@Override
	public String toString() {
		return "DataCycleClass [a="+ a + "]";
	}
	
	
	
	
}
