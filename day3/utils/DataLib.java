package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLib {

	public  static String[][] readData(String filepath) throws IOException {

		//Step1-> Set path for workbook
		XSSFWorkbook excel =new XSSFWorkbook("./data/"+filepath+".xlsx");
		//step2-> Get into the sheet2
		//XSSFSheet sheet =wB.getSheet("Sheet2");
		XSSFSheet sheet =excel.getSheetAt(0);
		//Step3-> Get into Row values
		XSSFRow row =sheet.getRow(1); 
		//Step4-> Get into cell values
		//XSSFCell cell = row.getCell(3);
		//Step5-> Read Data from workbook and print
		String[][] data= new String[sheet.getLastRowNum()][row.getLastCellNum()];
		//System.out.println("-------------------------");
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			for (int j = 0; j < row.getLastCellNum(); j++) {
				data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			//System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+"\t "+"| ");
			}
			//System.out.println();
			//System.out.println("-------------------------");
		}
		
		//Step6-> close the workbook
		excel.close();
		return data;
		
	}



}
