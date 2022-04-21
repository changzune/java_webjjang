package com.webjjang.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.webjjang.board.utill.db.DB;
import com.webjjang.board.vo.BoardVO;

public class BoardDAO {
	
	//필요한 객체를 사용
	//전역변수의 경우에는 참조형 변수를 선언하면 초기값이 null로 자동세팅된다.
	public Connection con;
	public PreparedStatement pstmt;
	public ResultSet rs;
	
	
	public List<BoardVO> list(){
		System.out.println("BoardDAO.list()");
		List<BoardVO> list =null;
		
		//예외처리
		try {
			//1,2
			con = DB.getConnection();
			//3.sql
			String sql = "select no, title, content, writer, writeDate, hit from board "
					+ " order by no desc";
			//4.실행객체
			pstmt = con.prepareStatement(sql);
			//5.실행 
			rs = pstmt.executeQuery();
			//6.표시담기
			if(rs != null) {
				while(rs.next()) {
					//만약에 데이터를 담을 list가 null이면 못담기 때문에 한번은 생성해야 한다.
					if(list == null) list = new ArrayList<BoardVO>();
					//실제적인 데이터를 담을 객체를 생성
					BoardVO vo = new BoardVO();
					//setter를 이용해서 데이터 담기
					vo.setNo(rs.getLong("no"));
					vo.setTitle(rs.getString("title"));
					vo.setContent(rs.getString("content"));
					vo.setWriter(rs.getString("writer"));
					vo.setWriteDate(rs.getString("writeDate"));
					vo.setHit(rs.getLong("hit"));
//vo를 list에 담기
					list.add(vo);
				}
				
			}// end of if  if(rs != null) 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // end of try
		
		System.out.println("BoardDAO.list().list" + list);
		
		
		return list;
		
	}
	

}
