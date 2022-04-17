//CellPHone 기능 + 추가기능을 하기위해서 상속을 받자.
//CellPhore 상속을 받고 + 추가 기능 = > 확장시키다.

public class DmbCellPhone extends CellPhone {

	// 필드 변수
	int channal; // 초기값 : 0

	// 생성자 파라메터초기값을 셋팅하기위한 생성자. -- > 기본생성자는 생기짆는다.

	public DmbCellPhone(String model, String color, int channle) {
		// 부모클래스의 생성자를 호출를 먼저하게된다. - 생략가나으
		super();
		System.out.println("DmbCellPhone의 생성자.. 자식 클래스");
		this.model = model;
		this.color = color;
		this.channal = channle;
	}

}
