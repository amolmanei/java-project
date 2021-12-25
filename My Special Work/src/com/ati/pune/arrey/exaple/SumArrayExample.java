package com.ati.pune.arrey.exaple;

public class SumArrayExample {

	public static void main(String[] args) {
          int[] number= new int []{ 20, 30, 25,35 , -54, 60, -50,};
           int sum=0;
           
           for(int i=0; i < number.length; i++)
           {
        	   sum =sum + number[i];
           }
	
           
	System.out.println("Arrays valus of sum=" +sum);
	double average=sum / number.length;
	System.out.println("Avarage of arrays=" +average);
}
	}
