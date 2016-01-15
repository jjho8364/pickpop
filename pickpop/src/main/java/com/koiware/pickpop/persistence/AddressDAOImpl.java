package com.koiware.pickpop.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.koiware.pickpop.domain.AddressVO;

@Repository
public class AddressDAOImpl implements AddressDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.koiware.pickpop.mapper.addressMapper";
	
	@Override
	public void insertAddress(AddressVO vo){
		sqlSession.insert(namespace+".insertAddress", vo);
	}
}
