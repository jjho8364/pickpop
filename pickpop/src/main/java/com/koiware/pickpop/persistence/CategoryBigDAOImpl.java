package com.koiware.pickpop.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.koiware.pickpop.domain.CategoryBigVO;

public class CategoryBigDAOImpl  implements CategoryBigDAO {
	@Inject
	private SqlSession sqlSession;

	private static final String namespace = "com.koiware.pickpop.mapper.categoryMapper";

	@Override
	public List<CategoryBigVO> listCategoryBig() {
		return sqlSession.selectList(namespace+".listCategoryBig");
	}

}
