package ch12collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//데이터를 배열로 저장 할 수 있는 객체 - ArrayList. -> 기본적으로 Object를 저장한다.
		// 제네릭 - 여러데이터를 저장하는 변수의 타입 <제네릭 타입> : 제네릭 타입 - 안에 저장하는 변수의 타입 지정
		//모든종류를 저장 할 수 있따.
		List<Object> list = new ArrayList<>();
//		int  a = 10; //기본 변수
//		Integer b = 20; //참조형 변수 기본형 int 값을 가지고 있는 랩퍼 클래스 이다.
//		a = b; // 타입에 맞는 기본 변수와 랩퍼 클래스 변수는 자동으로 캐스팅이 된다.
//		b = a; //
//		
		list.add(10);
		System.out.println(list);
		list.add("이창준"); // 이유는 기본값을 object이기 때문이다.
		System.out.println(list);
		
		List<Integer> intList = new ArrayList<Integer>();// 안에 저장 변수를 Integer로 만들었다.
		intList.add(100);// integet 데이터는 된다.
		//intList.add("홍길동");// 문자열 데이터는 안된다.
		intList.add(80);// integet 데이터는 된다.
		intList.add(90);// integet 데이터는 된다.
		
		//꺼내온 int 데이터를 더하자
		int sum = 0;
		for(int s : intList) {
			sum += s;
			
		}
		
		System.out.println(sum);
		//int list가 가지고 있는 데이터의 갯수
		System.out.println(intList.size());
		System.out.println(sum/intList.size());
		//index를 이용한 모든 데이터 출력하기.
		
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
			
		}
		
		
	}

}
