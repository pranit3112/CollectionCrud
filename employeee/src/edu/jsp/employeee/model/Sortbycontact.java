package edu.jsp.employeee.model;

import java.util.Comparator;

public class Sortbycontact implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return o1.getContact()-o2.getContact();
		
	}
	
}
