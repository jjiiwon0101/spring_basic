package com.spring.db.service;

import java.util.List;

import com.spring.db.model.BoardVO;

public interface IBoardService {
	
	//글 등록 기능
	void insertBoard(BoardVO vo);
	
	//글 조회 기능
	List<BoardVO> selectAllboard();
	
	
	//글 삭제 기능
	
	//글 수정 기능
	
	//글 내용 상세 보기

}
