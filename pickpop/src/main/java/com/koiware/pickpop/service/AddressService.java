package com.koiware.pickpop.service;

import java.util.List;

import com.koiware.pickpop.domain.AddressVO;
import com.koiware.pickpop.domain.CityVO;

public interface AddressService {
	public void addAddress(AddressVO addressVo) throws Exception;
	public AddressVO getAddress(int idaddress) throws Exception;
	
	public List<CityVO> listCity();
	public CityVO getCity(int idcity);
}
