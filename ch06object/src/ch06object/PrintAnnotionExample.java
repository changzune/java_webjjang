package ch06object;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotionExample {
	public static void main(String[] args) {
		//Service 안에 있는 메서드를 가져오기 -> 순서대로 가져오지는 않는다.
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		System.out.println(Service.class);
		System.out.println(declaredMethods);
		
		//모든 데이터(메서드들)에 대한 처리 -> 3개의 매서드를차례로 실행한다.
		for(Method method : declaredMethods) {
			//실행할 메서드 타입 - PrintAnnotion 어노테이션이 선언되어진 타입의 메서드만
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//맞으면 실행처리하는 작성
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//메소드 이름 출력하기 
				System.out.println("["+method.getName()+"]");
				System.out.println("Value = " + printAnnotation.value());
				System.out.println("number = " + printAnnotation.number());
				
				//반복 문자를 반복 횟수만큼 출력한다. 줄바꿈은 하지않는다. print() 사용 ln이 없다.
				for(int i= 0; i < printAnnotation.number(); i++)
					System.out.println(printAnnotation.value());
				//줄바꿈을 출력한다.
				System.out.println();
				
				//Annotation 이 적용된 메서드를 실행한다.-------------
				try {
					//service 객체 안에서 매칭되는 메서드를 실행한다.
					method.invoke(new Service());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("오류발생");
				}
				
			}
			
		}

	}
}
