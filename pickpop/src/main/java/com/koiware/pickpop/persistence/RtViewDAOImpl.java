package com.koiware.pickpop.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.koiware.pickpop.domain.MarketListVO;
import com.koiware.pickpop.domain.UserFilterVO;

public class RtViewDAOImpl implements RtViewDAO{
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.koiware.pickpop.mapper.rtviewMapper";
	

	@Override
	public int insertRtView(MarketListVO vo) {
		return sqlSession.insert(namespace+".insertRtView", vo);
	}
	
	@Override
	public List<MarketListVO> listRtView() {
		return sqlSession.selectList(namespace+".listRtView");
	}

	@Override
	public List<MarketListVO> listRtViewWithFilter(UserFilterVO vo) {
		return sqlSession.selectList(namespace+".listRtViewWithFilter", vo);
	}

}
