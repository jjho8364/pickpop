package com.koiware.pickpop.service;

import java.util.List;

import com.koiware.pickpop.domain.ProductVO;

public interface ProductService {
	  public void addProduct(ProductVO productVo) throws Exception;
	  public List<ProductVO> listProduct(int idseller) throws Exception;
}
