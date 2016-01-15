package com.koiware.pickpop.service;

import java.util.List;

import javax.inject.Inject;

import com.koiware.pickpop.domain.ProductVO;
import com.koiware.pickpop.persistence.ProductDAO;

public class ProductServiceImpl implements ProductService{
	@Inject
	ProductDAO productDao;
	
	@Override
	public void addProduct(ProductVO vo) throws Exception {
		productDao.insertProduct(vo);		
	}

	@Override
	public List<ProductVO> listProduct(int idseller) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
