package com.studentData.ReadingExcelProject;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		Statistics st = new Statistics();
		st.readExcel();
		
		Math m = new Math();
		//m.subjectMaxMarks();
		//m.subjectMinMarks();
		
		Science s = new Science();
		//s.subjectMaxMarks();
		//s.subjectMinMarks();
		
		Language l = new Language();
		//l.subjectMaxMarks();
		//l.subjectMinMarks();
		
	}
}
