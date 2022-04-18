
import java.awt.*;
//awt package > 사용자 인터페이스 제공하는 패키지 > 창 ,버튼 기본소리(띵)
public class BeepPrintExample {
	
	public static void main(String[] args) {
		// Toolkit 기본
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//5번반복처리
		for(int i = 0 ; i<5; i++) {
			// 삐소리내기 처리에 따라 소리가 안날수도 있다.
			toolkit.beep();
			
			try {
				Thread.sleep(500); // 1000분의 1초 단위로 쓴다 0.5초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
