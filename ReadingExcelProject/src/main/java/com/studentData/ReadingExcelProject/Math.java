package com.studentData.ReadingExcelProject;

import java.util.ArrayList;
import java.util.Collections;

public class Math implements Subject {

	int m;
	ArrayList<Integer> ml;

	

	public ArrayList<Integer> mathMarks() {
		ArrayList<Integer> mMarks = new ArrayList<Integer>();
		Statistics s = new Statistics();
		//logic is yet to be written 
		return mMarks;
	}

	public int subjectMaxMarks() {

		return Collections.max(ml);
	}

	public int subjectMinMarks() {

		return Collections.min(ml);
	}

}
