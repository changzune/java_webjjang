package ch06object;

public class Calculator {
	
	// [접근제한자 + 기타 제한들] 리턴 타입 메서드명 ([전달변수들 = 파라메터들]){ 처리문들 }
	// 전원을 켜는 처리메서드(전원킨다.)
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	
	// 더하기
	int plus(int x, int y) {
		return x + y;
	}
	// 나누기 
	double divide(int x, int y) {
		return (double)x / (double)y;
	}
	
	
	//전원을 끄는 처리메서드 (전원끈다.)
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

}
