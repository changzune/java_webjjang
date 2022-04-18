
public class Cat extends Animal {
	
	// 동물의 종류를 세팅하는 처리문 ->  생성자에서 해결 (한번만하고 바뀌지 않는다.)
	public Cat() {
		this.kind = "포유류";
	}

	//재정의 - 부모클래스의 추상 매서드는 반드시 재정의해서 사용해야만한다.
	//@Override 어노테이션을 부모클래스의 재정의하는것인지 확인
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}

}
