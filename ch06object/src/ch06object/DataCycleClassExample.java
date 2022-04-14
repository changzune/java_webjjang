package ch06object;

public class DataCycleClassExample {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println("DataCycleClassExample.main()실행");
		System.out.println("DataCycleClassExample.main()객체 생성 2번");
		DataCycleClass data = new DataCycleClass();
		DataCycleClass data2 = new DataCycleClass();
		System.out.println("DataCycleClassExample.main() 처리");
		System.out.println("data.a = " + data.a);
		System.out.println("data.x = " + data.x);
		System.out.println("data2.a = " + data2.a);
		System.out.println("data2.x = " + data2.x);
		data.a = 100;
		System.out.println("data.a = " + data.a);
		System.out.println("data.x = " + data.x);
		System.out.println("data2.a = " + data2.a);
		System.out.println("data2.x = " + data2.x);
		data.x = 200;
		System.out.println("data.a = " + data.a);
		System.out.println("data.x = " + data.x);//static 변수
		System.out.println("data2.a = " + data2.a);
		System.out.println("data2.x = " + data2.x);//static 변수
		// static 변수를 사용하는 방법
		// 자동으로 올라가므로 변수 이름을 붙일 수 없다. -> 클래스이름. 변수이름
		System.out.println("DataCycleClass.x =" + DataCycleClass.x);
		
		System.out.println("일반 생성자에 a 값을 1000을 넣어서 생성해보자.");
		DataCycleClass data3 = new DataCycleClass(1000);
		
		System.out.println(data);
		//객체를 출력하라고 시키면 자동으로 toString()을 호출해서 결과를 가져오게 된다.
		System.out.println(data.toString());
		//object가 가지고 있는 내용대로 출력하지 않으려면 toString()와 똑같은 메서드를 만들면 된다.
		
	}

}
