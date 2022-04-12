public class ByteExample {
	
	public static void main(String[] args) {
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 =  0;
		byte var4 =  30;
		byte var5 =  30;
		byte var6 =  30;
		//byte var7 =  128;
		//128은 오류
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		
		//wrapper class : byte - Byte
		// + 연산자: 문자열이 나오기 시작하면 그뒤로 모두 문자열로 취급한다. + 연산은 이어 붙이기가 된다.
		System.out.println("byte: "+Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("int: "+Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		
		
		
	}
	

}
