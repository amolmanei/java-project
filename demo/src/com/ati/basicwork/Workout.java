package com.ati.basicwork;



interface Examform{
void registration();
}
interface ExamReceipt{
void hallTicket();
}

class Result implements Examform,ExamReceipt{
public void registration()
{
	System.out.println("***************************************************");
	System.out.println("Brows Exam form link and Visit exam form Page");
	System.out.println("Enter your Personal information in the exam form");
	System.out.println("Enter youreducational details");
	System.out.println("Enter your your work experience");
	System.out.println("Enter your photo and signature");
	System.out.println("Click submit button to submit your exam application form");
	System.out.println("***************************************************");
}
public void hallTicket()
{
	System.out.println("Visit Exam Form Page and Brows Exam Hall Ticket Link");
	System.out.println("Enter your exam login ID and Password");
	System.out.println("submit entered details");
	System.out.println("Download your exam Hall Tecket");
	System.out.println("Prit Hall Ticket and Keep with you in exam Hall");
	System.out.println("Attaind Exam with Hall Ticket");
	System.out.println("Visit Exam Page and View your exam result");
	System.out.println("Check Result PASS / FAIL");
}
}
public class Workout {
	
public static void main(String[] args) {
Result r = new Result();
r.registration();
r.hallTicket();	

}
}

