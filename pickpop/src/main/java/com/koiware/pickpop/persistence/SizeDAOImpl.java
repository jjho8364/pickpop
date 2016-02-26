package com.koiware.pickpop.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.koiware.pickpop.domain.SizeVO;

public class SizeDAOImpl implements SizeDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.koiware.pickpop.mapper.addressMapper";
	
	@Override
	public List<SizeVO> listSize() {
		return sqlSession.selectList(namespace+".listSize");
	}

	@Override
	public List<SizeVO> listSizeWithCategorySmlId(int idcategorysml) {
		return sqlSession.selectList(namespace+".listSizeWithCategorySmlId", idcategorysml);
	}

}
