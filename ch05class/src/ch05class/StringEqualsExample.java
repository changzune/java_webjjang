package ch05class;

public class StringEqualsExample {
	public static void main(String[] args) {
		//148페이지 소스 입력하기 
		String strVar1 = "이창준";
		String strVar2 = "이창준";
		
		if(strVar1 == strVar2) System.out.println("str1과 str2가 같다.");
		else System.out.println("str1 str2같지 않다.");
		System.out.println(strVar1 + "/ " + strVar2);
		System.out.println(strVar1.hashCode() + "/"	+ strVar2.hashCode());
		
		
		String strVar3 = new String("이창준");;
		String strVar4 = "이창준";
		if(strVar3 == strVar4) System.out.println("str1과 str2가 같다.");
		else System.out.println("str1 str2같지 않다.");
		System.out.println(strVar3 + "/ " + strVar4);
		System.out.println(strVar3.hashCode() + "/"	+ strVar4.hashCode());
		System.out.println(System.identityHashCode(strVar3) + "/" + System.identityHashCode(strVar4));
		
		//문자열이 경우 데이터가 같더라도 ==로 비교하지 않는다. equals()를 사용한다.
		if(strVar3.equals(strVar4)) System.out.println("str1과 str2가 같다.");
		else System.out.println("str1 str2같지 않다.");
		
	}//end of main

}//end of StungEqualsEample Class
