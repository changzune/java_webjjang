package ch04condition;

public class ArrayForExmaple {
	public static void main(String[] args) {
		// 점수 3개 100, 95 , 90
		// int 여러개로 선언 : 배열 - 타입이 모두 같다. int 3개 - 연속된 주소에 저장된다.
		// index를 사용하는 데이터의 갯수 (length)가 3개면 index 0~2까지 사용된다.
		// index는 배열 주소를 찾아가서 떨어진 정도를 표시한다.
		int[] scores = {100, 95, 90, 100, 85};
		System.out.println(scores);
		System.out.println(scores[0]);//100
		System.out.println(scores[1]);//95
		System.out.println(scores[2]);//90
		// index 번호 0~2번까지 변경하면서 거기에 있는 값들을 출력해보자.반복은 3번 0~2 +1 증가 : for문
		for(int i = 0; i <= 2; i++)
			System.out.println(scores[i]);
		//인덱스 번호가 0 ~ length -1 까지 변경해서 거기에 있는 값들을 출력해보자.
		//반복은 5번 0~4번 +1증가
		// scores.length : 배열 scores의 길이 (데이터의 갯수)
		for(int i= 0; i <= scores.length-1; i++)System.out.println(scores[i]);
		for(int i= 0; i < scores.length; i++)System.out.println(scores[i]);
		
		
		
		
		
	}

}
