package ch06object;

public class DataCycleExample {
	public static void main(String[] args) {
		// static 변수는 new 하지 않고 사용할수 있다.
		System.out.println(DataCycleClass.x);
		DataCycleClass.x = 1000;
		System.out.println(DataCycleClass.x);
	}
}
