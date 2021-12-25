package com.special.work.array;

public class CommenElementOfTwoArray {

	public static void main(String[] args) {
             int a3[]= {10,20,30,55,23,40,60};
             int a4[]= {1,23,30,40,64,55};
             System.out.println("common element of array:");
             for(int i=0;i<a3.length;i++) {
	          for(int j=0;j<a4.length;j++) {
	        	  if(a3[i]==(a4[j])) {
	              System.out.println(+a3[i]);
	       }
        }
      }
	}
}
