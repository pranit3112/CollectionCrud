package edu.jsp.employeee.view;



import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import edu.jsp.controller.Employeecontroller;
import edu.jsp.employeee.controller.Controller;
import edu.jsp.employeee.model.SortbyName;
import edu.jsp.employeee.model.Sortbycontact;
import edu.jsp.employeee.model.Sortbyid;
import edu.jsp.employeee.model.Sortbysalary;
import edu.jsp.employeee.model.employee;

public class view {
	Scanner scanner = new Scanner(System.in);
	Controller ctrl = new Controller();
	boolean loop = true;
	public static void main(String[] args) {
		
		view vieww = new view();
		while(vieww.loop)
		{
			vieww.mainView();
		}
		
	
	}
    
    public void mainView() {
    	System.out.println("--------------------WELCOME----------------\n" 
                           + "SELECT OPERATON TO PERFORM\n" 
    			            + "1.SAVE EMPLOYEE\n"
                            + "2.GET EMPLOYEE\n"
    			            + "3.GET ALL EMPLOYEE\n"
                            + "4.DELETE EMPLOYEE\n"
    			            + "5.UPDATE EMPLOYEE\n"
                            + "6.Exit");
    	
    	int choice = scanner.nextInt();
    	
    	switch (choice) {
		case 1: {
		  saveEmployee();
		  break;
			
		}
        case 2: {
			getEmployee();
			break;
			
		}
        case 3: {
	        getAllEmploye();
	         break;
         }
        case 4: {
	         deleteEmployee();
	         break;
	
       }
        case 5: {
      
        	updateEmployee();
	         break;
        }
        case 6: {
        	this.loop =false;
	          System.out.println("THANK YOU");
	          break;
	
      }
		default: System.out.println("INVALID CHOICE PLEASE TRY AGAIN");
			
		}
    }
    
    public void saveEmployee() {
    	System.out.println("Enter emp id :");
    	int id = scanner.nextInt();
    	scanner.nextLine();
    	System.out.println("Enter emp name");
    	String name = scanner.nextLine();
    	System.out.println("Enter emp salary");
    	int  salary  = scanner.nextInt();
    	scanner.nextLine();
    	System.out.println("Enter emp contact");
    	int contact = scanner.nextInt();
    	scanner.nextLine();
    	employee employeee =new employee(id, name, salary, contact);   
    	if (ctrl.savEmployee(employeee)!= null) {
			System.out.println("Employee saved\n");
		}
    	else
		{
			System.out.println(" Something went wrong");
		}
      }
    
    public void getEmployee() {
    	System.out.println("Enter id");
    	int id = scanner.nextInt();
    	scanner.nextLine();
        employee emp ;
    	if ((emp = ctrl.getEmployee(id)) != null)
    	{
			System.out.println("Employee id is " + emp.getId());
			System.out.println("Employee name is " + emp.getName());
			System.out.println("Employee contact is " + emp.getContact());
			System.out.println("Employee salary is " + emp.getSal());
    	}
	    else 
	    
	    {
			System.out.println(" employee not found");
			System.out.println();
    	}
    }

    public void deleteEmployee() {
    	getAllEmploye();
    	System.out.println("Enter emp id :");
    	int id = scanner.nextInt();
    	scanner.nextLine();
    	System.out.println("Enter emp name");
    	String name = scanner.nextLine();
    	System.out.println("Enter emp salary");
    	int  salary  = scanner.nextInt();
    	scanner.nextLine();
    	System.out.println("Enter emp contact");
    	int contact = scanner.nextInt();
    	scanner.nextLine();
    	employee employeee =new employee(id, name, salary, contact);
    	
    	for(employee empl :ctrl.getAllEmploye()) {
    		if(empl.getId()==employeee.getId()){
    			if (empl.getSal() == employeee.getSal()){
					if (empl.getSal() == employeee.getSal()) {
						if (empl.getContact() == employeee.getContact()) {
							ctrl.deleteEmployee(employeee);
							System.out.println("Employee deleted\n");
							return;
						}
					}
				}
    		}
    	}
    	System.out.println("Employee not found");
}
		 

			
   public void getAllEmploye() 
   {
	   if (ctrl.getAllEmploye().isEmpty()) {
		System.out.println("NO EMPLOYEE FOUND");
		return ;	
		}
	
	   
	   emp();
	   
	   
	  for(employee emp : ctrl.getAllEmploye()) {
		 System.out.println("Employee id " + emp.getid());
		 System.out.println("Employee Name " + emp.getName());
		 System.out.println("Employee Salary " + emp.getSal());
		 System.out.println("Employee Contact " + emp.getContact());
		 System.out.println("-------------ThankYou-----------------");
		 
	 }
   }
	
    	
   public void updateEmployee() {
	   getAllEmploye();
	   
	   
	   System.out.println("Enter id of employee");
	   int id1 = scanner.nextInt();
	   	   
	  
	   for (employee emp1 : ctrl.getAllEmploye()) {
		   if (id1 == emp1.getid()) {
			   System.out.println("press "
			   		+ "1.ID update\n"
			   		+ "2.Name update\n"
			   		+ "3.salary update\n"
			   		+ "4.contact update\n"
			   		+ "5.All details update\n");
			   int case1 = scanner.nextInt();
			   scanner.nextLine();
			   switch (case1) {
			case 1:{
			    System.out.println("Enter emp id :");
		        int id2 = scanner.nextInt();
		        scanner.nextLine();
		        emp1.setId(id2);
		        System.out.println(" update Successfully");
		        break;
		           	
			}
           case 2:{
        	  System.out.println("Enter emp name");
              String name = scanner.nextLine();
        	  scanner.nextLine();
		      emp1.setName(name);
		      System.out.println(" update Successfully");
		      break;
				
			}
           case 3:{
        		System.out.println("Enter emp salary");
               	int  salary  = scanner.nextInt();
               	scanner.nextLine();
                emp1.setSal(salary);
                System.out.println(" update Successfully");
		        break;
	
           }
           case 4:{
        		System.out.println("Enter emp contact");
               	int contact = scanner.nextInt();
               	scanner.nextLine();
               	emp1.setContact(contact);
                System.out.println(" update Successfully");
		        break;
	
           }
           case 5:{
        	 System.out.println("Enter emp id :");
           	int id2 = scanner.nextInt();
           	scanner.nextLine();
           	System.out.println("Enter emp name");
           	String name = scanner.nextLine();
           	System.out.println("Enter emp salary");
           	int  salary  = scanner.nextInt();
           	scanner.nextLine();
           	System.out.println("Enter emp contact");
           	int contact = scanner.nextInt();
           	scanner.nextLine();
           	
           	emp1.setid(id2);
           	emp1.setContact(contact);
           	emp1.setName(name);
           	emp1.setSal(salary);  
           	
           	System.out.println("Employee update successfully");
           	break;
           	
        }
		   default: System.out.println("Invalid Choice");
				break;
			}
			
		}
	 }
   }
	

        public  void emp(){
	    
	     System.out.println("SELECT SORTING BASED ON\n"
	        + "1.SORT BY ID\n"
	        + "2.SORT BY NAME\n"
	        + "3.SORT BY SALARY\n"
	        + "4.SORT BY CONTACT\n"
	        + "5.DONT SORT\n");


	      int sortChoice = scanner.nextInt();
	       scanner.nextLine();

	      switch (sortChoice) {

	       case 1: 
	       {
	        ctrl.sortedEmployees(new Sortbyid());
	        break;
	      }
	       case 2: {
	    	  ctrl.sortedEmployees(new SortbyName());
	    	  break;
	       }
	       case 3: {
	    	   ctrl.sortedEmployees(new Sortbycontact());
	    	   break;
           }
	       case 4: {
	        	ctrl.sortedEmployees(new Sortbysalary());
	        	break;
           }
	      
	       default:System.out.println("Invalid sorting choice");
	       break;

	}
 



}
}
