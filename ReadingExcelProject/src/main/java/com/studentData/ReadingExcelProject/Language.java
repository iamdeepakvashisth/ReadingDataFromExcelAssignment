package com.studentData.ReadingExcelProject;

import java.util.ArrayList;
import java.util.Collections;


public class Language implements Subject {
	int l;
	ArrayList<Integer> ll;
	
	public ArrayList<Integer> mathMarks(){
		ArrayList<Integer> lMarks = new ArrayList<Integer>();
		Statistics s = new Statistics();
		//logic is yet to be written 
		return lMarks;
	}
	
	public int subjectMaxMarks() {

		return Collections.max(ll);
	}

	public int subjectMinMarks() {

		return Collections.min(ll);
	}

}
