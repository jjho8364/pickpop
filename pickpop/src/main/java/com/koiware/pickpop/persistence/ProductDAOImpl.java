package com.koiware.pickpop.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.koiware.pickpop.domain.ProductVO;

@Repository
public class ProductDAOImpl implements ProductDAO{
	@Inject
	private SqlSession sqlSession;

	private static final String namespace = "com.koiware.pickpop.mapper.productMapper";
	
	@Override
	public void insertProduct(ProductVO vo) {
		sqlSession.insert(namespace+".insertProduct", vo);
	}

	@Override
	public ProductVO getProduct(int idproduct) {
		return sqlSession.selectOne(namespace+".getProduct", idproduct);
	}

}
