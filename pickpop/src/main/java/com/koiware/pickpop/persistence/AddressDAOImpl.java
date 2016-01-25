package com.koiware.pickpop.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.koiware.pickpop.domain.AddressVO;
import com.koiware.pickpop.domain.CityVO;

@Repository
public class AddressDAOImpl implements AddressDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.koiware.pickpop.mapper.addressMapper";
	
	@Override
	public int insertAddress(AddressVO vo){
		return sqlSession.insert(namespace+".insertAddress", vo);
	}

	@Override
	public AddressVO getAddress(int idaddress) {
		AddressVO vo = sqlSession.selectOne(namespace+".getAddress", idaddress);
		return vo;
	}

	@Override
	public List<CityVO> listCity() {
		return sqlSession.selectList(namespace+".listCity");
	}

	@Override
	public CityVO getCity(int idcity) {
		return sqlSession.selectOne(namespace+".getCity", idcity);
	}
}
