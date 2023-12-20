package edu.jsp.employeee.controller;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import edu.jsp.employeee.model.SortbyName;
import edu.jsp.employeee.model.Sortbycontact;
import edu.jsp.employeee.model.Sortbyid;
import edu.jsp.employeee.model.Sortbysalary;
import edu.jsp.employeee.model.employee;
import edu.jsp.model.Employeemodel;

public class Controller {
	private List<employee> employees = new ArrayList<>();

	

	public employee savEmployee(employee employeee) {

		if (employeee != null) {
			employees.add(employeee);
			return employeee;

		} else {
			return null;
		}
	}

	public employee deleteEmployee(employee target) {
    	  if (target != null){
			for(employee employee : employees) {
				if (employee.getId()== target.getId()) {
					employees.remove(employee);	
				    return employee;
				}
			}
			return null;
		}else {
			return null;
			}
    	  
    	  }

	public List<employee> getAllEmploye() {
		return sortedEmployees(null);
	}
	
	
	public employee getEmployee(int id) {
		if(id>=1) {
			for(employee e : employees) {
				if(e.getId()==id) {
					return e;
				}
			}return null;
	}else {
		return null;
	}
	}
	
	
	
	
	public List<employee>sortedEmployees(Comparator<employee>comparator){

		if (comparator instanceof Sortbyid){
			Collections.sort(employees,comparator);
			return employees;
					
		}
		else if (comparator instanceof SortbyName){
			Collections.sort(employees,comparator);
			return employees;
					
		}
		else if (comparator instanceof Sortbycontact){
			Collections.sort(employees,comparator);
			return employees;
					
		}
		else if (comparator instanceof Sortbysalary){
			Collections.sort(employees,comparator);
			return employees;
					
		}else {
			return employees;					
		}
		
		
		
}
}