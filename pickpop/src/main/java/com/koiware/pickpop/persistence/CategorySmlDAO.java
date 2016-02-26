package com.koiware.pickpop.persistence;

import java.util.List;

import com.koiware.pickpop.domain.CategorySmlVO;

public interface CategorySmlDAO {
	public List<CategorySmlVO> listCategorySml();
	public List<CategorySmlVO> listCategorySmlWithMidId(int idcategorymid);

}
