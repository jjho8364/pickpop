package com.koiware.pickpop.persistence;

import java.util.List;

import com.koiware.pickpop.domain.MarketListVO;
import com.koiware.pickpop.domain.UserFilterVO;

public interface RtViewDAO {
	public List<MarketListVO> listRtView();
	public List<MarketListVO> listRtViewWithFilter(UserFilterVO vo);
	public int insertRtView(MarketListVO vo);
}
