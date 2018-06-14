package main.java.suit.service;

import java.util.List;

import main.java.suit.dao.ISuitDao;
import main.java.suit.model.SuitBean;
import main.java.suit.model.SuitLandBean;
import main.java.suit.model.SuitRegBean;

public class SuitService implements ISuitService {

	private ISuitDao objSuitDao = null;

	public void setSuitDao(ISuitDao newSuitDao) {
		this.objSuitDao = newSuitDao;
	}
	
	//소송정보 수정 LawSuitProxy
	public void setLawSuitProxyModify(SuitBean bean){
		objSuitDao.setLawSuitProxyModify(bean);
    }
	// LawSuitProxy 존재여부 조사
	public int getLawSuitProxyCount(String affairNum,String gubun){
		return objSuitDao.getLawSuitProxyCount(affairNum,gubun);
    }
	
	//소송정보 수정 Suitor
	public void setSuitorModify(SuitBean bean){
		objSuitDao.setSuitorModify(bean);
    }
	//원고피고 존재여부 조사
	public int getSuitorCount(String affairNum,String gubun){
		return objSuitDao.getSuitorCount(affairNum,gubun);
    }
	//소송정보 수정 lawsuit
	public void setLawSuitModify(SuitBean bean){
		objSuitDao.setLawSuitModify(bean);
    }
	//소송정보 수정 landsuit
	public void setLandSuitModify(SuitBean bean){
		objSuitDao.setLandSuitModify(bean);
    }
	//소송 수정화면 조회
	public List GetLawSuitModify(String affairNum,String pnu){
		return objSuitDao.GetLawSuitModify(affairNum, pnu);
	}
	
	public void setLawSuitCopy(SuitRegBean bean){
		objSuitDao.setLawSuitCopy(bean);
    }
	public void setLawSuitRelationCopy(SuitRegBean bean){
		objSuitDao.setLawSuitRelationCopy(bean);
    }
	
	public List getSuitFileList(String affairNum){
		return objSuitDao.getSuitFileList(affairNum);
	}
	
	
	public List getSuitRegList(SuitRegBean searchBean,String currentPage,String countPerPage){
		return objSuitDao.getSuitRegList(searchBean,currentPage,countPerPage);
	}
	
    public int getSuitRegListCount(SuitRegBean searchBean){
		return objSuitDao.getSuitRegListCount(searchBean);
    }
	
	//소송번호 체크
    public int getAffairNumCount(String affairNum){
    	return objSuitDao.getAffairNumCount(affairNum);
    }
    
	public void setLawSuitInsert(SuitRegBean bean){
		objSuitDao.setLawSuitInsert(bean);
	}
	
	public void setLandLawSuitInsert(SuitRegBean bean){
		objSuitDao.setLandLawSuitInsert(bean);
	}
	
	public void setSuitorInsert(SuitRegBean bean){
		objSuitDao.setSuitorInsert(bean);
	}
	
	public void setLawSuitProxyInsert(SuitRegBean bean){
		objSuitDao.setLawSuitProxyInsert(bean);
	}
	
	public void setOwnerInsert(SuitRegBean bean){
		objSuitDao.setOwnerInsert(bean);
	}
	
	
	
	
	
	public List getSuitList(SuitBean searchBean,String currentPage,	String countPerPage){
		return objSuitDao.getSuitList(searchBean,currentPage,countPerPage);
	}
	
	public List getSuitListExcel(SuitBean searchBean){
		return objSuitDao.getSuitListExcel(searchBean);
	}
	
	public int getSuitCount(SuitBean searchBean){
		return objSuitDao.getSuitCount(searchBean);
	}
	
	public List getSuitView(String affairNum,String pnu){
		return objSuitDao.getSuitView(affairNum,pnu);
	}
	

	
}