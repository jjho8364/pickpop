package com.koiware.pickpop.service;

import java.util.List;

import javax.inject.Inject;

import com.koiware.pickpop.domain.AddressVO;
import com.koiware.pickpop.domain.CityVO;
import com.koiware.pickpop.persistence.AddressDAO;

public class AddressServiceImpl implements AddressService{
	@Inject
	AddressDAO addressDao;

	@Override
	public void addAddress(AddressVO addressVo) throws Exception {
		addressDao.insertAddress(addressVo);
	}

	@Override
	public AddressVO getAddress(int idaddress) throws Exception {
		return addressDao.getAddress(idaddress);
	}

	@Override
	public List<CityVO> listCity() {
		return addressDao.listCity();
	}

	@Override
	public CityVO getCity(int idcity) {
		return addressDao.getCity(idcity);
	}

}
