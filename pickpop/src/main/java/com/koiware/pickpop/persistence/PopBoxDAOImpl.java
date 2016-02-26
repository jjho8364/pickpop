package com.koiware.pickpop.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.koiware.pickpop.domain.PopBoxVO;

public class PopBoxDAOImpl implements PopBoxDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.koiware.pickpop.mapper.popboxMapper";

	@Override
	public int insertPopBox(PopBoxVO vo) {
		return sqlSession.insert(namespace+".insertPopBox", vo);
	}

	@Override
	public List<PopBoxVO> listPickContentWithUserId(int user_id) {
		return sqlSession.selectList(namespace+".listPickContentWithUserId", user_id);
	}

}
