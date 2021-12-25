package com.ati.basicwork;

public class Student {

	int stdId;
	static String stdName,collegeName,collegeAddress;
	float stdFees;
	
	void studentInfo(int id,String name,float fees)
	{
		stdId=id;
		stdName=name;
		stdFees=fees;
		
	}
	
	void display()
	{
		System.out.println("***************************");
		System.out.println("STDid="+stdId);
		System.out.println("STD Name="+stdName);
		System.out.println("STD ColllageName="+collegeName);
		System.out.println("STD CollegeAddress="+collegeAddress);
		System.out.println("STD StdFees="+stdFees);
		System.out.println("****************************");		
	}
	
	
	public static void main(String[] args) {
		System.out.println("student 1st information");
		Student std1=new Student();
		Student std2=new Student();
		Student std3=new Student();
		Student.collegeName="shivaji college";
		Student.collegeAddress="pune";
		std1.studentInfo(111,"PRAMOD",1125.22f);
		std1.display();
		System.out.println("student 2nd information");
		std2.studentInfo(222,"VINOD",2855.12f);
		std2.display();
		std3.studentInfo(333,"AMOL",3255.12f);
		std3.display();
	}

}
