package com.koiware.pickpop.persistence;

import java.util.List;

import com.koiware.pickpop.domain.AddressVO;
import com.koiware.pickpop.domain.CityVO;

public interface AddressDAO {
	public int insertAddress(AddressVO vo);
	public AddressVO getAddress(int idAddress);
	public List<CityVO> listCity();
	public CityVO getCity(int idcity);
	
}
