package ch05class;

import java.util.Arrays;

public class ArgsPrintExample {
	
	public static void main(String[] args) {
		// args에 데이터를 넣으러면 run < run configuration > arguments
		// args 배열 객체 출력 ==> [ 타입@ 해쉬코드값
		System.out.println(args);
		//배열 객체의 덜이 있는 데이터 갯수
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
		for(String s : args)System.out.println(s);
	}

}
