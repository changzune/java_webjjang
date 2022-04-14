package ch06object;

public class DataExample {
	
	public static void main(String[] args) {
		DataClass data = new DataClass();
		System.out.println(data.publicVal);
		System.out.println(data.protectedVal);
		//System.out.println(data.defaultVal);
		//private은 같은 패키지 안에 있더라도 같은 클래스 안이 아니면 보이지 않아서 사용할 수가 없다.
		//System.out.println(data.privateVal);
	}

}
