package ch03op;

public class IncreaseDecreaseOperatorExamlpe {
	
	public static void main(String[] args) {
		//int 변수 X 선언하고 초기값 10을 넣었다.
		int x = 10;
		System.out.println(x);
		//int 변수 y 선언하고 초기값 10을 넣었다.
		int y = 10;
		System.out.println(y);
		//int 변수 초기값
		int z ;
		//변수 Z 초기화 하지 않으면 출력 할 수 없다.
		//System.out.println(z);
		// (처리 후) X를 1 증가 시킨다.
		//구분선 출력
		System.out.println("--------------------------------");
		x++; //11
		// X를 1 증가 시킨다. (그리고 처리한다.)
		++x; //12
		// system의 있는 out 안에 println() 메서드를 이용해서 X를 출력한다.
		System.out.println(x);
		
		//변수의 값을 1증가 시켜서 다시 X에 넣는다.
		x = x + 1; //13
		System.out.println(x);//13
		
		x += 1;//14
		System.out.println(x);//14
		
		x++;
		System.out.println(x);//15
		
		//X를 1를 증가시킨다. 그리고 출력을 처리한다.  
		System.out.println(++x);//16
		
		//출력을하고 
		System.out.println(x);//16
		x++;
		//x의 값을 출력한다.
		//출력 처리를 하고 1증가 시킨다.
		System.out.println(x++);//17이 출력되고 X는 값이 18이 된다.
		
		System.out.println(++x + "/" + ++x);
		
		
		//구분선 출력
		System.out.println("--------------------------------");
		//(처리 후) y를 감소시킨다.
		y--; // 9
		//y를 감소시킨다. (그리고 처리한다.)
		--y; // 8
		System.out.println(8);
		
		
	}
	
	
	

}
