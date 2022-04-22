package com.webjjang.board.service;

import java.util.List;

import com.webjjang.board.dao.BoardDAO;
import com.webjjang.board.vo.BoardVO;

public class BoardListService {
	
	public List<BoardVO> service()	{
		//생성하고 호출한 결과를 리턴한다. Controller-service - DAO
		BoardDAO dao = new BoardDAO();
		return dao.list();

	}
	
	

}
