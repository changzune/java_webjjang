package ch02var;

public class PromotionExmaple {
	public static void main(String[] args) {
		
		byte bytevalue = 10;
		// 오류가 없다. byte 데이터를 int 데이터로 형변환해서 넣어줬다.
		// 작은 데이터를 큰 변수에 넣을 때는 자동 형변환이 된다.
		// 데이터 손실이 없다. auto casting 이다.
		int intValue = bytevalue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; //int가 더 큰 타입이므로 데이터 손실이 없다. 자동 형변환
		System.out.println(charValue + "-" + intValue);
		
		
	}
}
