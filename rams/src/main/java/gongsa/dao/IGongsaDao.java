package main.java.gongsa.dao;
import java.util.List;
import java.util.Map;

import main.java.gongsa.model.GongsaBean;

import org.springframework.dao.DataAccessException;

public interface IGongsaDao {	
    //	공사대장 조회
	public List getGongsaList(GongsaBean searchBean,String currentPage,String countPerPage);
	// 공사대장 갯수
	public int getGongsaListCount(GongsaBean searchBean);
	
	// 공사대장 검색 상세내역
	public List getGongsaDetail(String CONSTNUM);
	
	//삭제
	// 공사대장 삭제
	public void setGongsaDelete(String CONSTNUM);
	// 시행자삭제
	public void setGongsaCarryDelete(String CONSTNUM);
	// 파일 삭제
	public void setGongsaFileDelete(String CONSTNUM);
	// PNU삭제
	public void setGongsaPnuDelete(String CONSTNUM);
   
   
	//수정 시리즈
	// 공사수정
	public void setGongsaUpdate(GongsaBean gongsaBean);
	// 시행자수정
	public void setGongsaCarryUpdate(GongsaBean gongsaBean);
	// 파일수정
	public void setGongsaFileUpdate(GongsaBean gongsaBean);
	
   
}