package com.koiware.pickpop.persistence;

import java.util.List;

import com.koiware.pickpop.domain.PopBoxVO;

public interface PopBoxDAO {
	public int insertPopBox(PopBoxVO vo);
	public List<PopBoxVO> listPickContentWithUserId(int user_id);
}
