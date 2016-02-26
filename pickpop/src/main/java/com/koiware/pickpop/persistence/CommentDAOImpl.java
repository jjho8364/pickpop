package com.koiware.pickpop.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.koiware.pickpop.domain.CommentVO;

public class CommentDAOImpl implements CommentDAO{
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.koiware.pickpop.mapper.popcommentMapper";

	@Override
	public int insertComment(CommentVO vo) {
		return sqlSession.insert(namespace+".insertPopComment", vo);
	}

	@Override
	public List<CommentVO> listCommentWithPopBoxId(int idpopbox) {
		return sqlSession.selectList(namespace+".listPopCommentWithPopBox", idpopbox);
	}

	@Override
	public List<CommentVO> listCommentWithProductId(int idproduct) {
		return sqlSession.selectList(namespace+".listPopCommentWithPopContent", idproduct);
	}

}
