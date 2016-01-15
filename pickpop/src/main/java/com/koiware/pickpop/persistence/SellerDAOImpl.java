package com.koiware.pickpop.persistence;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.koiware.pickpop.domain.SellerVO;
import com.koiware.pickpop.dto.LoginDto;

@Repository
public class SellerDAOImpl implements SellerDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.koiware.pickpop.mapper.sellerMapper";
	
	@Override
	public void insertSeller(SellerVO vo){
		sqlSession.insert(namespace+".insertSeller", vo);
	}

	@Override
	public SellerVO getSellerWithIdPw(LoginDto dto) {
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
	public SellerVO checkUserWithSessionKey(String value) {
		return sqlSession.selectOne(namespace +".checkUserWithSessionKey", value);
	}	
}
