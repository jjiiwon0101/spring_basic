package com.spring.db.repository;

import java.util.List;

import com.spring.db.model.BoardVO;

public interface IBoardDAO {
	
	//게시글 등록
	 void insertArticle(BoardVO vo);
	
	//전체 게시글 조회
	List<BoardVO> getArticle();
	
	//게시글 상세 보기
	BoardVO getArticle(int bno);
	
	//게시글 삭제
	void deleteArticle(int bno);
	
	//게시글 수정
	void updateArticle(BoardVO vo);

}