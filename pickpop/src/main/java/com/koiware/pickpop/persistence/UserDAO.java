package com.koiware.pickpop.persistence;

import java.util.Date;

import com.koiware.pickpop.domain.UserVO;
import com.koiware.pickpop.dto.LoginDto;

public interface UserDAO {
	public void insertUser(UserVO vo);
	public UserVO getSellerWithIdPw(LoginDto dto);
	
	public void keepLogin(String uid, String sessionId, Date next);
	public UserVO checkUserWithSessionKey(String value);
}
