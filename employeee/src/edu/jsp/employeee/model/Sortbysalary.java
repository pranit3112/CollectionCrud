package edu.jsp.employeee.model;

import java.util.Comparator;

public class Sortbysalary implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return o1.getSal()-o2.getSal();
	}

}
