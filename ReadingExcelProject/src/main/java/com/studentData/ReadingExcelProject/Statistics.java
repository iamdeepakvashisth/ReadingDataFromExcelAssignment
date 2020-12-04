package com.studentData.ReadingExcelProject;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Statistics {

	public String FILENAME = "C:/Users/deepa/Desktop/students.xlsx";

	public void percentage(ArrayList<Integer> list) {
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		double per = (sum * 100) / 300;
		System.out.print(per + "%  ");
	}

	public void readExcel() {
		try {
			FileInputStream file = new FileInputStream(new File(FILENAME));
			Workbook workbook = new XSSFWorkbook(file);
			DataFormatter dataFormatter = new DataFormatter();
			Iterator<Sheet> sheets = workbook.sheetIterator();
			int marks = 0;

			while (sheets.hasNext()) {
				Sheet sh = sheets.next();
				System.out.println("Data from " + sh.getSheetName() + " worksheet");

				Iterator<Row> iterator = sh.iterator();
				while (iterator.hasNext()) {
					Row row = iterator.next();
					if (row.getRowNum() == 0) {
						continue;
					}
					ArrayList<Integer> al = new ArrayList<Integer>();
					HashMap<String, ArrayList<Integer>> hmAl = new HashMap<String, ArrayList<Integer>>();
					
					

					int firstIndex = 0;
					for (int j = 1; j < row.getLastCellNum(); j++) {
						Cell cell = row.getCell(j);
						marks = Integer.parseInt(dataFormatter.formatCellValue(cell));
						al.add(marks);
						
					}

					Cell nameOfStudent = row.getCell(firstIndex);
					String nameKey = dataFormatter.formatCellValue(nameOfStudent);
					
					hmAl.put(nameKey, al);
					System.out.print(hmAl + " ");
					percentage(al);
					System.out.print("| Maximum marks of " + nameKey + " is " + Collections.max(al));
					System.out.println("| Minimum marks of " + nameKey + " is " + Collections.min(al));
				}
			}
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
