package com.webjjang.board.service;

import com.webjjang.board.dao.BoardDAO;
import com.webjjang.board.vo.BoardVO;

public class BoardViewService {
	
	public BoardVO service(long no) { // Controller - service - DAO를 생성한다.
		//조회수 1증가하는 것을 해야한다.
		//객체를 생성하고 호출해서 데이터를 가져와서 리턴한다.
		
		BoardDAO dao = new BoardDAO();
		return dao.view(no);
		
	}

}
