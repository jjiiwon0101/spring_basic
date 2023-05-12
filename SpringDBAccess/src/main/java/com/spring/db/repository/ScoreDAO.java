package com.spring.db.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.db.common.ScoreMapper;
import com.spring.db.model.ScoreVO;

@Repository 
public class ScoreDAO implements IScoreDAO {
	
	//Spring-jdbc 방식의 처리: JdbcTemplate 활용!
	@Autowired
	private JdbcTemplate template;

	@Override
	public void insertScore(ScoreVO vo) {
		String sql = "INSERT INTO scores "
				+ "(stu_name, kor, eng, math, total, average) "
				+ "VALUES(?,?,?,?,?,?)"; //autowired때문에 작성 안해도 자동 지목
		template.update(sql, vo.getStuName(), vo.getKor(), vo.getEng(), 
				vo.getMath(), vo.getTotal(), vo.getAverage());
	}

	@Override
	public List<ScoreVO> selectAllScores() {
		String sql = "SELECT * FROM scores ORDER BY stu_id ASC";
		return template.query(sql, new ScoreMapper());
	}

	@Override
	public void deleteScore(int num) {
		// TODO Auto-generated method stub

	}

	@Override
	public ScoreVO selectOne(int num) {
		// TODO Auto-generated method stub
		return null;
	}

}
