package com.koiware.pickpop.persistence;

import java.util.List;

import com.koiware.pickpop.domain.UserFilterVO;

public interface UserFilterDAO {
	public int insertUserFilter(UserFilterVO vo);
	public List<UserFilterVO> listUserFilterWithUserID(int user_id);
	
}
