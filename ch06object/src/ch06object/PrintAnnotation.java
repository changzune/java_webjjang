package ch06object;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// 작성되고 있는 PrintAnnotation은 메서드에 적용되는 것이다.
@Target(ElementType.METHOD)
// 실행할때 유지시켜준다.
@Retention(RetentionPolicy.RUNTIME)
//intet : 사이, face : 얼굴, interface : 얼굴과 얼굴 사이 -> 대화하기 위한 도구.
//interface + 메타데이터 -> 어노테이션 -> 타입으로 사용가능

public @interface PrintAnnotation {
	//value 라는 속성으로 값을 넣어야 한다. 넣지 않으면 "-"가 된다.: 출력할 문자열을 정의
	String value() default "-";
	//number 라는 속성 으로 값을 넣어야한다. 넣지 않으면 15가 된다. : 출력할 문자열 반복 출력하는 회수
	int number() default 15;

}
