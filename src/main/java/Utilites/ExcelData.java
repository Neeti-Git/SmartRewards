package Utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;
import org.testng.xml.XmlTest;

public class ExcelData {

	public static String getExcelData(String sheet_name, String row_name, String column_name) throws IOException {
		String retVal = null;
		int intVaue;
		FileInputStream file_input_stream = null;
		XSSFWorkbook workbook = null;
		// XmlTest xmlTest =
		// Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest();
		Properties props = new PropertyManager().getProps();

		String file_path = System.getProperty("user.dir") + "/src/test/resources/TestData/"
				+ "SmartRewardsTestData.xlsx";
		try {
			file_input_stream = new FileInputStream(file_path);
			workbook = new XSSFWorkbook(file_input_stream);
			XSSFSheet sheet = workbook.getSheet(sheet_name);
			int rowCount = sheet.getLastRowNum() + 1;
			int colCount = sheet.getRow(0).getLastCellNum() + 1;
			int row_number = 0;
			for (int i = 0; i <= rowCount; i++) {

				if (sheet.getRow(i).getCell(0).getStringCellValue().equals(row_name.toString())) {
					row_number = i;
					break;

				}
			}
			for (int j = 0; j <= colCount; j++) {
				if (sheet.getRow(0).getCell(j).getStringCellValue().equals(column_name)) {
					try {

						retVal = sheet.getRow(row_number).getCell(j).getStringCellValue().toString();

					} catch (IllegalStateException e) {
						retVal = String.valueOf(sheet.getRow(row_number).getCell(j).getNumericCellValue());
						
					}
					break;
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		file_input_stream.close();
		workbook.close();

		return retVal;
	}

	public static void setExcelData(String sheet_name, int row_num, String value) throws IOException {
		FileInputStream file_input_stream1 = null;
		XSSFWorkbook workbook1 = null;
		// int row_number = 0;

		String file_path1 = System.getProperty("user.dir") + "/src/test/resources/TestData/"
				+ "SmartRewardsTestData.xlsx";
		try {
			file_input_stream1 = new FileInputStream(file_path1);
			workbook1 = new XSSFWorkbook(file_input_stream1);
			XSSFSheet sheet = workbook1.getSheet(sheet_name);
			XSSFRow row = sheet.getRow(row_num);
			// int rowCount = sheet.getLastRowNum() + 1;
			// int colCount = sheet.getRow(0).getLastCellNum() + 1;

			row.createCell(1).setCellValue(value);

			FileOutputStream outputStream = new FileOutputStream(file_path1);
			workbook1.write(outputStream);

			file_input_stream1.close();
			workbook1.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}