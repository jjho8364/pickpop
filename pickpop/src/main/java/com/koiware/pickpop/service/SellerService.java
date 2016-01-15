package com.koiware.pickpop.service;

import java.util.Date;
import java.util.List;


import com.koiware.pickpop.domain.AddressVO;
import com.koiware.pickpop.domain.SellerVO;
import com.koiware.pickpop.dto.LoginDto;

public interface SellerService {
	  public void addSeller(SellerVO SellerVo, AddressVO addressVo) throws Exception;
	  public List<SellerVO> listSeller() throws Exception;
	  public SellerVO login(LoginDto login) throws Exception;
	  
	  public void keepLogin(String uid, String sessionId, Date next)throws Exception;
	  public SellerVO checkLoginBefore(String value); 
}
