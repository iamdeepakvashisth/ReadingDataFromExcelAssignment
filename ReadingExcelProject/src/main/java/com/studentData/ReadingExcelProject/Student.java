package com.studentData.ReadingExcelProject;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private ArrayList<Integer> studMarksList;
	

	public Student(String name, ArrayList<Integer> studMarksList) {
		super();
		this.name = name;
		this.studMarksList = studMarksList;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<Integer> getStudMarksList() {
		return studMarksList;
	}


	public void setStudMarksList(ArrayList<Integer> studMarksList) {
		this.studMarksList = studMarksList;
	}
	
	
	
	
	
	
	
	

}
