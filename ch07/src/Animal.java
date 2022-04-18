//추상 클래스는 - 추상 매서드를 가지고 있는 클래스
public abstract class Animal {
	
	public String kind; // 동몰의 종류 저장 -> 초기값을 null
	
	//숨을 쉰다.
	public void breadthe() {
		System.out.println("숨을 쉽니다.");
	};
	
	//소리를 낸다.
	//추상매서드는 반드시 상속받아서 재정의해서 사용을 해야만 한다.
	
	public abstract void sound(); // 구현이 {}없는 추상 메서드 
	
	

}
