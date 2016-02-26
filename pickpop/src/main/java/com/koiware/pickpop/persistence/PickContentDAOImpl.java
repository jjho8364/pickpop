package com.koiware.pickpop.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.koiware.pickpop.domain.PickContentVO;

public class PickContentDAOImpl implements PickContentDAO{
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.koiware.pickpop.mapper.pickcontentMapper";

	@Override
	public int insertPickContent(PickContentVO vo) {
		return sqlSession.insert(namespace+".insertPickContent", vo);
	}

	@Override
	public List<PickContentVO> listPickContentWithFolderId(int idpickfolder) {
		return sqlSession.selectList(namespace+".listPickContentWithFolderId", idpickfolder);
	}

	@Override
	public List<PickContentVO> listPickContentWithProductId(int idproduct) {
		return sqlSession.selectList(namespace+".listPickContentWithProductId", idproduct);
	}
}
