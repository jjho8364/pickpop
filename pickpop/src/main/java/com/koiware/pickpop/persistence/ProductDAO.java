package com.koiware.pickpop.persistence;

import com.koiware.pickpop.domain.ProductVO;
import com.koiware.pickpop.dto.LoginDto;

public interface ProductDAO {
	public void insertProduct(ProductVO vo);
	public ProductVO getProduct(int idproduct);
}
