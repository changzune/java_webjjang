package ch08interface;


// 인터페이스는 - 추상 메서드만 가지고 있다.
public interface EventInterface {
	
	// static 변수나 메서드를 선언할 수 있다. 구현을 반드시 해놔야 자동으로 올릴 수 있다.
	
	//사용할 메서드들을 추상 메서드로 선언한다.{}가 없다.
	//클릭한다.
	public void click();
	//더블클릭한다.
	public void doubleClick();
	//드래그앤드랍한다.
	public void dragAndDrop();
	//키보드입력한다.
	public void keyIn(); 
	//마우스를 올린다.
	public void mouseUp();
	


}
