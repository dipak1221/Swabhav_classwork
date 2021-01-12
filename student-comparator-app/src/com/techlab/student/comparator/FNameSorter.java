package com.techlab.student.comparator;

import java.util.Comparator;

public class FNameSorter implements Comparator<Student>{
	@Override
	public int compare(Student arg0, Student arg1) {
		
		return (arg0.getfName()).compareTo(arg1.getfName());
	}
}
