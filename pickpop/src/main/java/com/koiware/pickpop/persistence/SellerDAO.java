package com.koiware.pickpop.persistence;

import java.util.Date;

import com.koiware.pickpop.domain.SellerVO;
import com.koiware.pickpop.dto.LoginDto;

public interface SellerDAO {
	public void insertSeller(SellerVO vo);
	public SellerVO getSellerWithIdPw(LoginDto dto);
	
	public void keepLogin(String uid, String sessionId, Date next);
	public SellerVO checkUserWithSessionKey(String value);
}
