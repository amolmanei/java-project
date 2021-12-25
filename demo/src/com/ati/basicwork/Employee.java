package com.ati.basicwork;

public class Employee {

	int empId;
	String empName;
	static String empcompany,companyAddress;
	float empSalary;
	
	 void setInstanceDeta (int id,String name,float salary)
	{
		empId=id;
	    empSalary=salary;
	    empName=name;
	}
	void display()
	{
		System.out.println("******************************");
		System.out.println("EMP id="+empId);
		System.out.println("EMP salary="+empSalary);
		System.out.println("EMP Name="+empName);
		System.out.println("EMP Company="+empcompany);
		System.out.println("EMP companyAddress="+companyAddress);
		System.out.println("*******************************");
	}
	public static void main(String[] args) {
	System.out.println("Employee 1st information");
      Employee emp1=new Employee();
      Employee emp2=new Employee();
      Employee emp3=new Employee();
      Employee.empcompany="INFOSYS";
      Employee.companyAddress="PUNE";
      emp1.setInstanceDeta(1122,"ABHIJEET",58558.29f);
      emp1.display();
      System.out.println("Employee 2nd information");
      emp2.setInstanceDeta(3344,"AMOL",66558.88f);
      emp2.display();
      System.out.println("Employee 3rd information");
      emp3.setInstanceDeta(5566,"NILAM",77558.77f);
      emp3.display();
      
      
      
      
      
      
 
	}

}
