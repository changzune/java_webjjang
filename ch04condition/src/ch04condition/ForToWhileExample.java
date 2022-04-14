package ch04condition;

public class ForToWhileExample {
 public static void main(String[] args) {
	 // 1~10 까지 출력하는 프로그램
		/*
		 * int i = 1; for(; i <= 10;)
		 *  { System.out.println(i); i++; }
		 */
	 int i = 1; //무한 반복문
	while( i <= 10) {
		 System.out.println(i);
		 i++;
	 }
	
}
}
