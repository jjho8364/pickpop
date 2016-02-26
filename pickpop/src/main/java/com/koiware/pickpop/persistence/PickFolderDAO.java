package com.koiware.pickpop.persistence;

import java.util.List;

import com.koiware.pickpop.domain.PickFolderVO;

public interface PickFolderDAO {
	public int insertPickFolder(PickFolderVO vo);
	public List<PickFolderVO> listPickFolderWithUserId(int user_id);
}
