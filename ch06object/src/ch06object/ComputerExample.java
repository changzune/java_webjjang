package ch06object;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer(); //생성해야 되서 뉴를 사용
		// {}를 이용한 데이터 세팅 변수의 초기값만 가능하다.
		int [] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println(result1);
		// 전달 배열 데이터를 직접 생성해 넣어 줄 수 있다.
		result1 = myCom.sum1(new int[] {10,20,30,40});
		System.out.println(result1);
		
		int result2 = myCom.sum2(1,2,3,4);
		result2 = myCom.sum2(1,2);
		System.out.println(result2);
		result2 = myCom.sum2(new int[] {1,2});
		System.out.println(result2);
		
		

	}

}
