//	2010 		Kim Joohyun

package main.java.gongsa.service;

import java.util.List;


import main.java.gongsa.dao.GongsaDao;
import main.java.gongsa.dao.IGongsaDao;
import main.java.gongsa.model.GongsaBean;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class GongsaService implements IGongsaService{

	private	IGongsaDao	gongsaDao	= null;
	
	public void setGongsaDao(IGongsaDao gongsaDao) {
	    this.gongsaDao = gongsaDao;
	}
	
    //	게시판 조회
	public List getGongsaList(GongsaBean searchBean,String currentPage,String countPerPage)
    {
    	return gongsaDao.getGongsaList(searchBean,currentPage,countPerPage);
    }
	public int getGongsaListCount(GongsaBean searchBean) {
		return gongsaDao.getGongsaListCount(searchBean);
	}
	// 공사대장 검색 상세내역
	public List getGongsaDetail(String CONSTNUM) {
		return gongsaDao.getGongsaDetail(CONSTNUM);
	}
	
	
	//삭제
	// 공사대장 삭제
	public void setGongsaDelete(String CONSTNUM){
		gongsaDao.setGongsaDelete(CONSTNUM);
	}

	// 시행자삭제
	public void setGongsaCarryDelete(String CONSTNUM){
		gongsaDao.setGongsaCarryDelete(CONSTNUM);
	}

	// 파일 삭제
	public void setGongsaFileDelete(String CONSTNUM){
		gongsaDao.setGongsaFileDelete(CONSTNUM);
	}
	
	// PNU삭제
	public void setGongsaPnuDelete(String CONSTNUM){
		gongsaDao.setGongsaPnuDelete(CONSTNUM);
	}
	
	
	//수정 시리즈
	// 공사수정
	public void setGongsaUpdate(GongsaBean gongsaBean){
		gongsaDao.setGongsaUpdate(gongsaBean);
	}
	// 시행자수정
	public void setGongsaCarryUpdate(GongsaBean gongsaBean){
		gongsaDao.setGongsaCarryUpdate(gongsaBean);
	}
	// 파일수정
	public void setGongsaFileUpdate(GongsaBean gongsaBean){
		gongsaDao.setGongsaFileUpdate(gongsaBean);
	}

	
}
