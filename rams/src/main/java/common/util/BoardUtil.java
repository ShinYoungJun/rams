
package main.java.common.util;

public class BoardUtil{
	
	private static final String BEGIN_IMG_TAG		=	"<img src='/rams/images/common/start.gif' width='17' height='15' border='0' alt='처음'>";
	private static final String END_IMG_TAG			=	"<img src='/rams/images/common/end.gif' width='17' height='15' border='0' alt='끝'>";	
	private static final String PREV_IMG_TAG		=	"<img src='/rams/images/common/prev.gif' width='17' height='15' border='0' alt='이전'>";
	private static final String NEXT_IMG_TAG		=	"<img src='/rams/images/common/next.gif' width='17' height='15' border='0' alt=다음>";
	
	private static String 	ActionUrl	=	"";
	private static int 		CountPerPage	=	0;
	private static final int intPageGroupSize = 10;	// 페이지 리스트 사이즈

	
	/**
	 * 페이지수를 계산해 리턴
	 * @param	int	intCurrentPage	현재보여줄 페이지번호
	 * @param	int	intCountPerPage	페이지당 보여줄 게시물 수
	 * @param	int intTotalNo	전체게시물수
	 * @return	int	페이지수 
	 */
    public static int endPage(int intCurrentPage, int intCountPerPage, int intTotalNo) {
        int intExtra = intTotalNo % intCountPerPage;
        
        if ( intExtra > 0 ){           
            return (intTotalNo - intExtra )/intCountPerPage + 1;
        } else {
            return intTotalNo/intCountPerPage;
        }
    }
    
	/**
	 * 페이징 표시 문자열을 생성해 리턴 
 	 * @param int intCurrentPage 현재페이지번호, 
 	 * @param int intCountPerPage 한페이지당 출력할 게시물 수
 	 * @param String strActionUrl 리스트를 보여줄 요청 이름
 	 * @param int intTotalCount 게시판 전체 게시물 수
	 * @return String 페이징 표시 문자열
	 */
 	public static String getDividePageForm(int intCurrentPage, int intCountPerPage, String strKeyword, String strActionUrl, int intTotCount) {
 		
    	System.out.println("getDividePageForm:::"+strKeyword);

 		StringBuffer strPagingBuf 	= new StringBuffer();
 		int intPageTotal			=	0;
 		int intPageGroupStart		=	0;	// 페이지 리스트 그룹시작번
 		int intPageGroupEnd			=	0;	// 페이지 리스트 그룹 끝번 		
 		CountPerPage				= intCountPerPage;
 		ActionUrl					= strActionUrl;

		intPageTotal				= (intTotCount-1)/CountPerPage;	//11
        intPageGroupStart			= (int)((intCurrentPage-1)/intPageGroupSize) * intPageGroupSize;	//
        if(intPageGroupStart<0)
        	intPageGroupStart=0;

        intPageGroupEnd   	= intPageGroupStart + intPageGroupSize;

        if (intPageGroupEnd>intPageTotal)
        	intPageGroupEnd = intPageTotal + 1;

        boolean hasPreviousPage = intCurrentPage-intPageGroupSize>=0;
        boolean hasNextPage     = intPageGroupStart+intPageGroupSize < intPageTotal+1;

        strPagingBuf.append(makeButtonLink(1, BEGIN_IMG_TAG, strKeyword));

        if (hasPreviousPage) {
        	if(intPageGroupStart ==0)
        		strPagingBuf.append(makeButtonLink(1, PREV_IMG_TAG, strKeyword));
        	else
        		strPagingBuf.append(makeButtonLink(intPageGroupStart, PREV_IMG_TAG, strKeyword));
        } // end if

        strPagingBuf.append("<td width='5'></td>");
        
        for(int i=intPageGroupStart; i<intPageGroupEnd ;i++){
        	if (i+1==intCurrentPage) {
        		strPagingBuf.append("<td width='15' align='center'><a href='#' class='blue2'>") 
        		.append(i+1)
        		.append("</a></td>");
        	} else {
        		strPagingBuf.append(makeLink(i+1, ""+(i+1)+"", strKeyword));
        	} // end if
 			if( i < (intPageGroupEnd-1) ){
 				strPagingBuf.append(" ");
 			}        	
        } // end for
        strPagingBuf.append("<td width='5'></td>");    
        
        if (hasNextPage) {
        	strPagingBuf.append(makeButtonLink(intPageGroupEnd+1, NEXT_IMG_TAG, strKeyword));
        } // end if

        strPagingBuf.append(makeButtonLink(intPageTotal+1, END_IMG_TAG, strKeyword));
        return strPagingBuf.toString();
 	}
 	

 	/**
 	 * 이미지파일에 대한 링크태그를 구성한다. (first.gif, prev.gif, next.gif, end.gif에 대한 이미지)
 	 * **/
    private static	String makeButtonLink(int intPageNum, String strLinkImg, String strKeyword) {
        StringBuffer strLinkBuf = new StringBuffer();
        strLinkBuf.append("<td width='17' height='15'><a href=\"")
 		.append(ActionUrl)
 		.append("?currentPage=")
 		.append(intPageNum)
 		.append("&")
 		.append(strKeyword)
 		.append("\">")			
 		.append(strLinkImg)
        .append("</a></td>");
        return strLinkBuf.toString();
    }	 	

 	/**
 	 * 페이지번호에 대한 링크태그를 구성한다.
 	 * **/
    
    private static	String makeLink(int intPage, String strLinkNum, String strKeyword) {
        StringBuffer strLinkBuf = new StringBuffer();
        strLinkBuf.append("<td width='15' align='center'><a class='blue2' href=\"")
 		.append(ActionUrl)
 		.append("?currentPage=")
 		.append(intPage)
 		.append("&countPerPage=")
 		.append(CountPerPage)
 		.append("&")
 		.append(strKeyword)
 		.append("\">")
 		.append(strLinkNum)
        .append("</a></td>");
        return strLinkBuf.toString();
    }	
 
}