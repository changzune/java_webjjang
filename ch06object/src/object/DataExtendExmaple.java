package object;

import ch06object.DataClass;

// DataClass를 상속받았다. DataClass가 가지고 있는 것이 전부 내꺼가 된다.(복붙이라고 생각하면 된다.)
// 상속받은 것과 더 확장 시켜서 선언한것을 쓰게 된다. 상속을 하면 다 사용할수 있다.

public class DataExtendExmaple extends DataClass{
	
	public static void main(String[] args) {
		DataExtendExmaple data = new DataExtendExmaple();
		// public 은 다른 패키지에서 생성과 상속이 모두 가능하다.
		System.out.println(data.publicVal);
		// protected 변수는 다른 패키지에서 상속은 가능하다. 생성은 되지 않는다.
		System.out.println(data.protectedVal);
		// defaultVal 변수는 다른 패키지에서 사용 할 수 없다.
		//System.out.println(data.defaultVal);
		//privateVal 변수는 다른 클래스 사용할 수없다.;
		//System.out.println(data.privateVal);
	}
	
	
}
