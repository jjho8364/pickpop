package com.koiware.pickpop.persistence;

import com.koiware.pickpop.domain.PickContentVO;
import com.koiware.pickpop.domain.PickFolderVO;

public interface PickBoxDAO {
	public int insertPickFolder(PickFolderVO vo) throws Exception;
	public void deletePickFolder(int idpickfolder) throws Exception;
	
	public int insertPickContent(PickContentVO vo) throws Exception;
	public int deletePickContent(int idpickcontent) throws Exception;
}
