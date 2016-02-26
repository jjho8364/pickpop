package com.koiware.pickpop.persistence;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.koiware.pickpop.domain.UserVO;
import com.koiware.pickpop.dto.LoginDto;

public class UserDAOImpl implements UserDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.koiware.pickpop.mapper.userMapper";
	
	@Override
	public void insertUser(UserVO vo) {
		sqlSession.insert(namespace+".insertUser", vo);
	}

	@Override
	public UserVO getSellerWithIdPw(LoginDto dto) {
		return sqlSession.selectOne(namespace+".getWithIdPw", dto);
	}

	@Override
	public void keepLogin(String uid, String sessionId, Date next) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", uid);
		paramMap.put("sessionId", sessionId);
		paramMap.put("next", next);
		sqlSession.update(namespace+".keepLogin", paramMap);		
	}

	@Override
	public UserVO checkUserWithSessionKey(String value) {
		return sqlSession.selectOne(namespace +".checkUserWithSessionKey", value);
	}

}
