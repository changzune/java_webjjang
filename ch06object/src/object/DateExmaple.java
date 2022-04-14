package object;

import ch06object.DataClass;

public class DateExmaple {

	public static void main(String[] args) {
		DataClass data = new DataClass();
		System.out.println(data.publicVal);
		// protect는 다른 패키지에서 생성 할 수 없다. 그래서 안보인다. 오류
		//System.out.println(data.protectedVal);
		// default는 다른 패키지에서 생성 / 상속 할 수 없다. 그래서 안보인다. 오류
		//System.out.println(data.defaultVal);
		//private은 같은 패키지 안에 있더라도 같은 클래스 안이 아니면 보이지 않아서 사용할 수가 없다. 오류
		//System.out.println(data.privateVal);
	}
}
