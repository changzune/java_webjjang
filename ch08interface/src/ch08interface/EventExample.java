package ch08interface;

public class EventExample {
	
	public static void main(String[] args) {
		BoardEvent boardEvent = new BoardEvent();
		//필요한 이벤트만 호출을 해서 사용한다.
		boardEvent.click();
		boardEvent.doubleClick();
		
		
		
		
		
	}

}
