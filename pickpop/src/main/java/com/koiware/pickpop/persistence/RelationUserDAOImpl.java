package com.koiware.pickpop.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.koiware.pickpop.domain.RelationUserVO;

public class RelationUserDAOImpl implements RelationUserDAO {
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.koiware.pickpop.mapper.userMapper";

	@Override
	public int insertRelationUser(RelationUserVO vo) {
		return sqlSession.insert(namespace+".insertRelationUser", vo);
	}

	@Override
	public List<RelationUserVO> listRelationUserWithUserID(int user_id) {
		return sqlSession.selectList(namespace+".listRelationUserWithUserID", user_id);
	}

}
