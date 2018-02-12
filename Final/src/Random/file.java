package Random;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class file {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
FileInputStream fs=new FileInputStream("D:\\Selenium.xlsx");
Workbook wb=WorkbookFactory.create(fs);
Sheet sh=wb.getSheet("Sheet1");
for(int i=1;i<sh.getLastRowNum();i++){
	Row row=sh.getRow(i);
	if(row.getCell(i)==null){
		FileOutputStream fo=new FileOutputStream("D:\\Selenium.xlsx");
	}
	
	System.out.println(row.getCell(i));
}
//Row row=sh.getRow(1);
////String[] credentials = null;
//	Cell cell=row.getCell(0);
	}

}
