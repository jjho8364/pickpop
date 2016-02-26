package com.koiware.pickpop.persistence;

import java.util.List;

import com.koiware.pickpop.domain.SizeVO;

public interface SizeDAO {
	public List<SizeVO> listSize();
	public List<SizeVO> listSizeWithCategorySmlId(int idcategorysml);
}
