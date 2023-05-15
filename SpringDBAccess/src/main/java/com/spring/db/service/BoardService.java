package com.spring.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.db.model.BoardVO;
import com.spring.db.repository.IBoardDAO;

@Service
public class BoardService implements IBoardService{

	@Autowired
	private IBoardDAO dao;
	
	@Override
	public void insertBoard(BoardVO vo) {
		System.out.println("service: " + vo);
		dao.insertArticle(vo);
		
	}
	@Override
	public BoardVO getArticle(int bno) {
		return dao.getArticle(bno);
	}

	@Override
	public List<BoardVO> selectAllboard() {
		return null;
	}

	@Override
	public void deleteBoard(int num) {
		dao.deleteArticle(num);
		
	}
	@Override
	public void updateArticle(BoardVO vo) {
		
		
	}

	
	

}
