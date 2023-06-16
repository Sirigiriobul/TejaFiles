package allPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {
public static void main(String[] args) throws IOException {
	FileInputStream file =new FileInputStream("./excelOperations/orangeHrm Excel Operation.xlsx");
XSSFWorkbook workBook=new XSSFWorkbook(file);
XSSFSheet sheet=workBook.getSheet("Sheet1");

int rowsCount=sheet.getLastRowNum();
System.out.println(rowsCount);
for (int row=0;row<rowsCount;row++)
{
Row	sheetRow=sheet.getRow(row);
int cellCount=sheetRow.getLastCellNum();
for (int cell=0;cell<cellCount;cell++)
{
	Cell rowOfCell=sheetRow.getCell(cell);
String	testData=rowOfCell.getStringCellValue();
System.out.print(testData);
	}
System.out.println();
	}

System.out.println("excel");




}
}
