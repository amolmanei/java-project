package com.ati.pune.oops.type;
class FirstStudentMockResult{
	protected String studentName;
	String groupName;
	int studentMarks;
	void display(String name,String group,int marks)
	{ 	
		studentName=name;
		this.groupName=group;
		this.studentMarks=marks;
		System.out.println("*****************************************");
        System.out.println("STUDENT NAME=" +name);
		System.out.println("STUDENT GROUP NAME=" +group);
		System.out.println("STUDENT OBTAINED MARKS=" +marks);
		System.out.println("*****************************************");

	}
}
class SecondStudentMockResult extends FirstStudentMockResult{ 
	
	void display(String name,String group,int marks)
	{ 	
		studentName=name;
		this.groupName=group;
		this.studentMarks=marks;
		System.out.println("*****************************************");
		System.out.println("STUDENT NAME=" +name);
		System.out.println("STUDENT GROUP NAME=" +group);
		System.out.println("STUDENT OBTAINED MARKS=" +marks);
		System.out.println("*****************************************");

	

}
class ThirdStudentMockResult extends SecondStudentMockResult {
	
	void display(String name,String group,int marks)
	{ 	
		studentName=name;
		this.groupName=group;
		this.studentMarks=marks;
		System.out.println("*****************************************");
		System.out.println("STUDENT NAME=" +name);
		System.out.println("STUDENT GROUP NAME=" +group);
		System.out.println("STUDENT OBTAINED MARKS=" +marks);
	    System.out.println("*****************************************");
	}
	
	
	
	
	
	
	
}
}
public class PracticeInfo {

	public static void main(String[] args) {
		
		FirstStudentMockResult f1= new FirstStudentMockResult();
		f1.display("SWETA JAGTAP ", "first", 20);
        f1.display("NILAM KOKARE","second",18);
        f1.display("POOJA MANE","third",12);
	}

}











