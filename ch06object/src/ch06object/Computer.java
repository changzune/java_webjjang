package ch06object;

public class Computer {
	
	//int 여러개의 데이터를 받아서 더하는 처리문 작성
	// 이 메서드를 사용하려면 사용하려면 반드시 배열을 넣어주셔야 합니다.
	int sum1(int[] values) {
		int sum = 0;
		for (int v : values) sum +=v ;
		return sum;	
	}
	
	//불특정 다수 개의 타입 ...을 이용 할 수 있다. 파라메터로 받는 쪽에서는 배열로 처리된다.
	//다른 파라메터와 함께 사용가능 대신 맨마지막에 위치해야 한다.
	// 이 메서드를 사용하려면 int, int, ... 을 넣어주셔야 한다.
	// values는 배열이 된다.
	int sum2(int ... values) {
		int sum = 0;
		for (int v : values) sum +=v ; // 향상된 for문이 기때문에 하나씩 꺼내서 추가한다.
		return sum;	
	}
	

}
