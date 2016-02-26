package com.koiware.pickpop.persistence;

import java.util.List;

import com.koiware.pickpop.domain.PickContentVO;
import com.koiware.pickpop.domain.CommentVO;

public interface CommentDAO {
	public int insertComment(CommentVO vo);
	public List<CommentVO> listCommentWithPopBoxId(int idpopbox);
	public List<CommentVO> listCommentWithProductId(int idproduct);
}
