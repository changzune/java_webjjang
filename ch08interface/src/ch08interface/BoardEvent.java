package ch08interface;

// EventInterface를 상속받은 클래스 -> 추상메서드를 전체를 다 재정의 해야한다.
public class BoardEvent implements EventInterface{

	//필요한 메소드만 구체적 구현하고 나머지는 그대로둔다.{아무처리없음}
	@Override
	public void click() { //클릭만필요.
		System.out.println("게시판을 보여준다.");
		
	}

	@Override
	public void doubleClick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dragAndDrop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseUp() {
		// TODO Auto-generated method stub
		
	}

}
