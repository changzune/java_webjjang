package ch12collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	//Map의 장점 - key를 마음대로 사용할 수 있다.
	//Map의 단점 - 없는 키를사용하더라도 예외가 발생되지 않는다.논리오류를 찾아내기 힘들다.
	//Map의 단점 - 메모리를 많이 잡아 먹는다.->메모리가 충분하거나 동시 접속자 수가 많지 않은 경우에 사용한다.
	
	public static void main(String[] args) {
		Map<String, Object> vo = new HashMap<String, Object>();
		//데이터 저장
		vo.put("no", 10);
		vo.put("title", "java");
		vo.put("content", "javaJJang");
		vo.put("writer", "lee");
		vo.put("writerDate","2021-11-25");
		vo.put("hit","123");
		System.out.println(vo);
		System.out.println("번호 :" + vo.get("no"));
		System.out.println("제목 :" + vo.get("title"));
		System.out.println("내용 :" + vo.get("content"));
		System.out.println("작성자 :" + vo.get("writer"));
		System.out.println("작성일 :" + vo.get("writerDate"));
		System.out.println("조회수 :" + vo.get("hit"));
		
	}

}
