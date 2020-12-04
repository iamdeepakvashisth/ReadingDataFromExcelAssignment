package com.studentData.ReadingExcelProject;

import java.util.ArrayList;
import java.util.Collections;

public class Science implements Subject {

	int sci;
	ArrayList<Integer> sl;
	

	

	public ArrayList<Integer> sciMarks() {
		ArrayList<Integer> sMarks = new ArrayList<Integer>();
		Statistics s = new Statistics();
		//logic is yet to be written 
		return sMarks;
	}

	public int subjectMaxMarks() {

		return Collections.max(sl);
	}

	public int subjectMinMarks() {

		return Collections.min(sl);
	}

}