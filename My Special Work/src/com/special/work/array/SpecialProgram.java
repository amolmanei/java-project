package com.special.work.array;

public class SpecialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                int[] marks={20,18,15,25,23,23};
                int maxx=0, min=0;
              for(int i = 0;i < marks.length;i++){
       		     if(marks[i] > maxx){
       		        maxx = marks[i];
       		       }
       		    }
       		    System.out.println("PRINT MAXX MARKS=" +maxx);	
               for(int i =0 ;i < marks.length-1;i++){
	           if(marks[i] < min){
	           min = marks[i];
	           }
               }
System.out.println("PRINT MIN MARKS=" +min );
	}
}