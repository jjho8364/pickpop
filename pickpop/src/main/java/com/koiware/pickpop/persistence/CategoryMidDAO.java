package com.koiware.pickpop.persistence;

import java.util.List;

import com.koiware.pickpop.domain.CategoryMidVO;

public interface CategoryMidDAO {
	public List<CategoryMidVO> listCategoryMid();
	public List<CategoryMidVO> listCategoryMidWithBigId(int idcategorybig);
}
