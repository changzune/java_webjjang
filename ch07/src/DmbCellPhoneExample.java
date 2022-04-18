
public class DmbCellPhoneExample {
	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정색", 10);
		
		//demCellPhone - 상속바은 내용 테스트 - Cellphone있는 데이터 
		System.out.println("모델 : "	 + dmbCellPhone.model);
		System.out.println("색상 : "	 + dmbCellPhone.color);
		
	
		//demCellPhone -자신이 가지고 있는 내용 테스트 - 상속받은 내용 테스트 - Cellphone있는 데이터
		System.out.println("채널 : "	 + dmbCellPhone.channal);
		
		//부모클래스의 모델 바꾸기
		dmbCellPhone.setPrantModel("오라클폰");
		System.out.println("부모님클래스모델 : "	 + dmbCellPhone.getPrantMdoel());
		
		
		//cellPhone 이 가지고 있는 출력
		dmbCellPhone.powerOn();
		dmbCellPhone.Bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요.! 저는 홍길동 입니다.");
		dmbCellPhone.sendVoice("반갑습니다.");
		dmbCellPhone.hangup();
		
		
		//dmb를 켠다.
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		System.out.println("채널 : "	 + dmbCellPhone.channal);
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.powerOff();
		
		//dmbCellPhone 객체 출력
		System.out.println(dmbCellPhone);
		System.out.println(dmbCellPhone.toString());
		
}
}
