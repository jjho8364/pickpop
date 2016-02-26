package com.koiware.pickpop.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.koiware.pickpop.domain.CategorySmlVO;

public class CategorySmlDAOImpl implements CategorySmlDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.koiware.pickpop.mapper.categoryMapper";

	@Override
	public List<CategorySmlVO> listCategorySml() {
		return sqlSession.selectList(namespace+".listCategorySml");
	}

	@Override
	public List<CategorySmlVO> listCategorySmlWithMidId(int idcategorymid) {
		return sqlSession.selectList(namespace+".listCategorySmlWithMidId", idcategorymid);
	}
	
}
