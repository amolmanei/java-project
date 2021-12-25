package com.ati.pune.arrey.exaple;

public class NonRepeatingArray {

	public static void main(String[] args) {
		int a[]={10,5,1,9,4,6,1,10};
  	  int count;
        System.out.println("Non Repeating element in array");

	     for(int i=0;i<a.length;i++)
	     {
	         count=0;
	         //Initialize the for loop for checking the elenemnt which are not repeated)
	         for (int j = 0; j < a.length; j++)
	         {
	              //check the condition if any number is same so
	            if(a[i]==a[j] && i!=j)
	                   count++;
	         }
	        //if count became zero so print the current element
	      if(count==0)
	          System.out.print(a[i]+" ");
	     }
 }

	}


