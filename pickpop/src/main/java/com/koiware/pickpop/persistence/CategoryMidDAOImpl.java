package com.koiware.pickpop.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.koiware.pickpop.domain.CategoryMidVO;

public class CategoryMidDAOImpl implements CategoryMidDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.koiware.pickpop.mapper.categoryMapper";
	
	@Override
	public List<CategoryMidVO> listCategoryMid() {
		return sqlSession.selectList(namespace+".listCategoryMid");
	}

	@Override
	public List<CategoryMidVO> listCategoryMidWithBigId(int idcategorybig) {
		return sqlSession.selectList(namespace+".listCategoryMidWithBigId", idcategorybig);
	}

}
