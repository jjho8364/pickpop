package com.koiware.pickpop.service;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;

import com.koiware.pickpop.domain.AddressVO;
import com.koiware.pickpop.domain.UserVO;
import com.koiware.pickpop.dto.LoginDto;
import com.koiware.pickpop.persistence.AddressDAO;
import com.koiware.pickpop.persistence.UserDAO;

public class UserServiceImpl implements UserService{
	@Inject
	UserDAO userDao;
	@Inject
	AddressDAO addressDao;
	
	@Transactional
	@Override
	public void addUser(UserVO userVo, AddressVO addressVo) throws Exception {
		addressDao.insertAddress(addressVo);
		int idaddress = addressVo.getIdaddress();
		userVo.setIdaddress(idaddress);
		userDao.insertUser(userVo);		
	}

	@Override
	public void keepLogin(String uid, String sessionId, Date next) throws Exception {
		userDao.keepLogin(uid, sessionId, next);
	}

	@Override
	public UserVO login(LoginDto login) throws Exception {
		return userDao.getSellerWithIdPw(login);	
	}

	@Override
	public UserVO checkLoginBefore(String value) {
		return userDao.checkUserWithSessionKey(value);
	}

	@Override
	public List<UserVO> listUser() throws Exception {
		return null;
	}
}
