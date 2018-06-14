/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
 */
package main.java.common.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil {
    protected static Log logger = LogFactory.getLog(FileUploadUtil.class);

public static String uploadFormFile(MultipartFile formFile, String realPath) {
		
        InputStream stream;
        String strFileName = formFile.getOriginalFilename();
        strFileName = strFileName.replaceAll("%00","");	//	00 ����
        strFileName = strFileName.replaceAll("%02","");	//	02 ����       
        strFileName = strFileName.replaceAll(" ","");	//	��������        
        
        try {
            stream = formFile.getInputStream();
            
            String strExtension = getExtension(strFileName).toLowerCase(); //Ȯ���� �и���, �빮�� �ҹ��ڷ� ġȯ�Լ�

        	//���������� ������� �����̸��� (1) �� ����
        	while(fileExistYn(realPath+strFileName))
        	{
				Calendar cal = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("yyMMddhhmmss"); // ������ ���
				String toDate = sdf.format(cal.getTime()); // ���� ��¥ ������ ����
          		strFileName = getNewFileName(strFileName,toDate);
          	}

            OutputStream bos = new FileOutputStream(realPath + strFileName);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = stream.read(buffer, 0, 8192)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            bos.close();
            stream.close();

            System.out.println("The file has been written to \"" + realPath+ strFileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return strFileName;
    }
	
	public static String getExtension(String strFileName){
    	
    	try{
    		int intIdx = strFileName.lastIndexOf(".");
    		String strExtention = strFileName.substring(intIdx);
    		return strExtention;
    		
    	}catch(Exception e){
    		return "";
    	}
    		
    }	
	
	public static String getNewFileName(String strFileName,String strNewVal){		
		int intIdx = strFileName.lastIndexOf(".");
		int lastIdx = strFileName.length();				
		String returnVal = strFileName.substring(0,intIdx)+strNewVal+strFileName.substring(intIdx,lastIdx);
		return returnVal;
    }	
	
	

	public static boolean fileExistYn(String strFileName) {
		File aFile = new File(strFileName);    //File ��ü ����
		// ������ �������� ���� ���
		if (aFile.isFile()) return true;
		else return false;    
    }
}
