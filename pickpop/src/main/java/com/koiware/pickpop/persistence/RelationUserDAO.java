package com.koiware.pickpop.persistence;

import java.util.List;

import com.koiware.pickpop.domain.RelationUserVO;

public interface RelationUserDAO {
	public int insertRelationUser(RelationUserVO vo);
	public List<RelationUserVO> listRelationUserWithUserID(int user_id);
}
