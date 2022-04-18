//CellPHone 기능 + 추가기능을 하기위해서 상속을 받자.
//CellPhore 상속을 받고 + 추가 기능 = > 확장시키다.
//부모클래스를 만든 목적 - 복잡, 중복 

public class DmbCellPhone extends CellPhone {

	// 필드 변수
	int channal; // 초기값 : 0
	String model; // 부모클래스와 똑같은 변수의 재정의
	

	// 생성자 파라메터초기값을 셋팅하기위한 생성자. -- > 기본생성자는 생기짆는다.

	public DmbCellPhone(String model, String color, int channle) {
		// 부모클래스의 생성자를 호출를 먼저하게된다. - 생략가능
		super();
		System.out.println("DmbCellPhone의 생성자.. 자식 클래스");
		this.model = model;
		this.color = color; //내가 가지고 있는 컬러라고 작성 없으면 부모것 사용.있으면 내것을사용한다. 
		this.channal = channle;
	}
	// 메소드 - 기능 ,동작 , 처리문들을 가지고 있는 것 
	// dmb 켜기
	void turnOnDmb() {
		System.out.println("DMB 방송수신을 시작합니다.");
	}//채널바꾸기
	void changeChannelDmb(int channel) {
		 	this.channal = channel;
		System.out.println("채널 " + channel + "번호로 바꿉니다.");
		
	}
	//dmb끄기
	void turnOffDmb() {
		System.out.println("dmb방송수신을 멈춥니다.");
	}
	
	//부모클래스의 model 데이터 셋팅
	void setPrantModel(String model) {
		super.model =model;
	}
	//부모클래스의 model 데이터 가져오기
	String getPrantMdoel() {
		return super.model;
		
	}
	//출력하면 자동으로 호출 당하는 매세드
	@Override
	public String toString() {
		return "DmbcellPhone의 ToString"
		+ " " + super.toString();
	}
	

}
