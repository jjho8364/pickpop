package com.koiware.pickpop.service;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.koiware.pickpop.domain.AddressVO;
import com.koiware.pickpop.domain.SellerVO;
import com.koiware.pickpop.dto.LoginDto;
import com.koiware.pickpop.persistence.AddressDAO;
import com.koiware.pickpop.persistence.SellerDAO;

@Service
public class SellerServiceImpl implements SellerService{
	@Inject
	SellerDAO sellerDao;
	@Inject
	AddressDAO addressDao;
	
	@Transactional
	@Override
	public void addSeller(SellerVO sellerVo, AddressVO addressVo) throws Exception {
		// TODO Auto-generated method stub
		addressDao.insertAddress(addressVo);
		int idaddress = addressVo.getIdaddress();
		sellerVo.setIdaddress(idaddress);
		sellerDao.insertSeller(sellerVo);
	}
	
	@Override
	public List<SellerVO> listSeller() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SellerVO login(LoginDto login) throws Exception {
		return sellerDao.getSellerWithIdPw(login);
	}
	
	@Override
	public void keepLogin(String uid, String sessionId, Date next) throws Exception {
		sellerDao.keepLogin(uid, sessionId, next);
	}

	@Override
	public SellerVO checkLoginBefore(String value) {
		return sellerDao.checkUserWithSessionKey(value);
	}
	
}
