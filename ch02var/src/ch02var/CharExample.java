package ch02var;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65; //'A' - 65 대입된다.
		char c3 = '\u0041'; //유니코드 4 * 16 = 64 + 1 => 65
		
		int unicode = c1;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println((int)c3);
		System.out.println(unicode);
		
		char c4 = '가';
		System.out.println(c4);
		System.out.println((int)c4);
		char c5 = 44032;
		System.out.println(c5);
	}

}
