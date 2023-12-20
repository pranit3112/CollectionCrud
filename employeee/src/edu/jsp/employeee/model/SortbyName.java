package edu.jsp.employeee.model;

import java.util.Comparator;

public class SortbyName implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
		
	}
	

}
