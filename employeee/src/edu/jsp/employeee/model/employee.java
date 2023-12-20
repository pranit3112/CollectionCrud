package edu.jsp.employeee.model;

public class employee {
    private int id;
    private String name;
    private int sal;
    private int contact;

    
public int getid() {
	return id;
}
public void setid(int id) {
	this.id= id;
}
    
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public int getContact() {
	return contact;
} 
public void setContact(int contact) {
	this.contact = contact;
}
public employee(int id, String name, int sal, int contact) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
	this.contact = contact;
}
public employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "employee [id=" + id + ", name=" + name + ", sal=" + sal + ", contact=" + contact + "]\n      ";
}

  
  
}
