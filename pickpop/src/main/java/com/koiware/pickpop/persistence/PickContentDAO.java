package com.koiware.pickpop.persistence;

import java.util.List;

import com.koiware.pickpop.domain.PickContentVO;
import com.koiware.pickpop.domain.PickFolderVO;

public interface PickContentDAO {
	public int insertPickContent(PickContentVO vo);
	public List<PickContentVO> listPickContentWithFolderId(int idpickfolder);
	public List<PickContentVO> listPickContentWithProductId(int idproduct);
}
