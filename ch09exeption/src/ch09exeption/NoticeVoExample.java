package ch09exeption;

import java.awt.print.Printable;

public class NoticeVoExample {
	
	public static void main(String[] args) {
		
		NoticeVO noticeVO = new NoticeVO();
		
		
		noticeVO.setNo(1);
		
		noticeVO.setTitle("공지사항");
		
		noticeVO.setContent("내일은 자바책");

		noticeVO.setWriteDate("2022.04.18");
		
		//method 호출
		print(noticeVO);
		
	}
	
	public static void print(NoticeVO noticeVO){
		
		System.out.println(noticeVO.getNo());
		System.out.println(noticeVO.getTitle());
		System.out.println(noticeVO.getContent());
		System.out.println(noticeVO.getWriteDate());
		
		
		
		
	}
	

}
