package com.koiware.pickpop.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.koiware.pickpop.domain.PickFolderVO;

public class PickFolderDAOImpl implements PickFolderDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.koiware.pickpop.mapper.pickfolderMapper";
	
	@Override
	public int insertPickFolder(PickFolderVO vo) {
		return sqlSession.insert(namespace+".insertPickFolder", vo);
	}

	@Override
	public List<PickFolderVO> listPickFolderWithUserId(int user_id) {
		return sqlSession.selectList(namespace+".listPickFolderWithUserId", user_id);
	}

}
