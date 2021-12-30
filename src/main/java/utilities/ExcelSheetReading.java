package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetReading {
	public String Excel() throws Exception {

		File src = new File("C:\\Users\\pratik\\Desktop\\AmazonApp.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);

		String data1 = sheet1.getRow(0).getCell(0).getStringCellValue();

		 //System.out.println("data from excel " + data1);
		return data1;

		// wb.close();
	}

}
