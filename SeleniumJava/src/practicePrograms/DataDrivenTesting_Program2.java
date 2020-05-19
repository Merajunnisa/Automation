package practicePrograms;

import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTesting_Program2 {

	public static void main(String[] args) throws Throwable, InvalidFormatException, IOException {
		File f = new File("F:\\Adactin\\Excel.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		Sheet s = wb.getSheet("Sheet1");
		int rowCount = s.getLastRowNum();
		for(int i=0; i<=rowCount; i++) {
			Row r = s.getRow(i);
			int colCount = r.getLastCellNum();
			String data = "";
			for(int j=0; j<colCount; j++) {
				if(s.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_NUMERIC) {
					int cellData = (int)s.getRow(i).getCell(j).getNumericCellValue();
					data = String.valueOf(cellData);
				}else {
					data = s.getRow(i).getCell(j).getStringCellValue();
				}
				System.out.println(data);
			}
		}
		
		

	}

}
