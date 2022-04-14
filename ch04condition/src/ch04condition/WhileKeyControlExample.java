package ch04condition;

import java.io.IOException;

public class WhileKeyControlExample {
	// 자동차의 주행 프로그램 1.증속 2.감속 3.중지(프로그램 종료)
	public static void main(String[] args) throws IOException {
		// boolean 타입의 변수 run을 선언하고 초기값을 넣는다.
		boolean run = true; // 반복처리의 기준 -> while(조건) : 만족하면 (true) 계속반복한다.
		// 차의 속도 -0~ 최대속도
		int speed = 0;
		// 눌려진 키의 코드값 저장하는 변수
		int keyCode =0;
		
		int cnt = 0;
		//차를 운영하기 위한 반목문 처리 -> true면 운행한다.
		// run이 true 계속 반복 처리 / run이 false 이면 빠져 나간다.
		while(run) {
			System.out.println("반복횟수 : " + ++cnt);
			
			
			//13- 커리지 리턴 : 줄바꿈, 10 - 라인피드 : 앞쪽으로 이동 => 엔터라고 한다.
			// enter를 친게 아닌 경우의 실행
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("키 코드 값:" + keyCode);
				System.out.println("-----------------------");
				System.out.println("1.증속 2.감속 3.중지");
				System.out.println("-----------------------");
				System.out.println("선택->");
				System.out.println("-----------------------");
				
			}
			
			//키를 입력 받는다. -> key code 값으로 저장한다.
			keyCode = System.in.read();
			
			if(keyCode == 49) speed++;
			else if(keyCode== 50) speed --;
			System.out.println("현재속도 : " + speed);
			//키의 3의 키값
			if(keyCode == 51) run = false;
			
			
		}//while 끝
		
		System.out.println("프로그램 종료합니다.");
		
		
	}

}
