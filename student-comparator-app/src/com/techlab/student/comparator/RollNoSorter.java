package com.techlab.student.comparator;

import java.util.Comparator;

public class RollNoSorter implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg0.getRollNo()-arg1.getRollNo();
	}
	

}
