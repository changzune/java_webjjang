package ch04condition;

public class StringToNimber {
	public static void main(String[] args) {
		String s = "100";
		//숫자로된 문자열 + 연산을 하면 이어붙이기가 된다. -> 숫자로 계산이 되어야 한다.
		System.out.println(s + 100);
		//문자열을 숫자로 변경
		//Intger.parseInt(s), Long.parseLong(s), Double.parseDoble(s)
		int i = Integer.parseInt(s);
		//숫자를 문자열로 바꾸는 방법 따음표를 붙여라 뒤에는 다 문자열이 된다.
		String str = "" + i;
		System.out.println(str + "년");
		System.out.println((""+i) instanceof String );
	}

}
