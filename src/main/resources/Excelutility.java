import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility {
	   public FileInputStream fi;
	   public FileOutputStream fo;
	   public XSSFWorkbook wb;
	   public XSSFSheet sheet;
	   public XSSFRow row;
	   public XSSFCell cell;
	    String path;
    public Excelutility(String path) {
    	this .path=path;
    }
    public int getrowcount(String sheetname ) {
    	 fi=new FileInputStream(path);
    	 wb=new XSSFWorkbook(fi);
    	 sheet=wb.getSheet(sheetname);
    	 int rowcount=sheet.getLastRowNum();
    	 fi.close();
    	 return rowcount;    	 
    	 
    	}
    public int getcol(String sheetname,int rownum ) {
   	 fi=new FileInputStream(path);
   	 wb=new XSSFWorkbook(fi);
   	 sheet=wb.getSheet(sheetname);
   	 row=sheet.getRow(rownum);
   	 int colcount=row.getLastCellNum();
   	 fi.close();
   	 return colcount;    	 
   	 
   	}
    public int getcelldata(String sheetname,int rownum,int colnum ) {
   	 fi=new FileInputStream(path);
   	 wb=new XSSFWorkbook(fi);
   	 sheet=wb.getSheet(sheetname);
   	 row=sheet.getRow(rownum);
   	 DataFormatter formatter=new DataFormatter();
   			 try {
		if(row==null) {
			return "";
		}
    	cell=row.getCell(colnum);

		if(cell==null) {
			return "";
		}
		data=formatter.formatCellValue(cell);
		
	}
	catch(Exception e) {
		e.printStackTrace();
		data="";
	}
	return data;    
	 
   	 
   	}

}
