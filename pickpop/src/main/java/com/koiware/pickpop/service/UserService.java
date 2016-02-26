package com.koiware.pickpop.service;

import java.util.Date;
import java.util.List;

import com.koiware.pickpop.domain.AddressVO;
import com.koiware.pickpop.domain.UserVO;
import com.koiware.pickpop.dto.LoginDto;

public interface UserService {
	  public void addUser(UserVO userVo, AddressVO addressVo) throws Exception;
	  public List<UserVO> listUser() throws Exception;
	  public UserVO login(LoginDto login) throws Exception;
	  
	  public void keepLogin(String uid, String sessionId, Date next)throws Exception;
	  public UserVO checkLoginBefore(String value); 
}
