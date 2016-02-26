package com.koiware.pickpop.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.koiware.pickpop.domain.UserFilterVO;

public class UserFilterDAOImpl implements UserFilterDAO{
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.koiware.pickpop.mapper.userfilterMapper";

	@Override
	public int insertUserFilter(UserFilterVO vo) {
		return sqlSession.insert(namespace+".insertUserFilter", vo);
	}

	@Override
	public List<UserFilterVO> listUserFilterWithUserID(int user_id) {
		return sqlSession.selectList(namespace+".listUserFilterWithUserID", user_id);
	}

}
