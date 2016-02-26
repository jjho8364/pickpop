package com.koiware.pickpop.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.koiware.pickpop.domain.PickContentVO;
import com.koiware.pickpop.domain.PickFolderVO;

public class PickBoxDAOImpl implements PickBoxDAO {
	@Inject
	private SqlSession sqlSession;

	private static final String namespace = "com.koiware.pickpop.mapper.PickBoxMapper";

	
	@Override
	public int insertPickFolder(PickFolderVO vo) throws Exception {
		sqlSession.insert(namespace+".insertPickFolder", vo);
		return 0;
	}

	@Override
	public void deletePickFolder(int idpickfolder) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int insertPickContent(PickContentVO vo) throws Exception {
		sqlSession.insert(namespace+".insertPickContent", vo);
		return 0;
	}

	@Override
	public int deletePickContent(int idpickcontent) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
