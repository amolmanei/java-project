package com.ati.pune.arrey.exaple;

public class RevarseElements {

	public static void main(String[] args) {
		int a[]={10,5,7,9,4,6,1};
		int length=a.length;
		
		System.out.println("original array elements:");
		for (int i = 0; i < length; i++)
		{
				System.out.println(a[i]);
		}
		
		//Reverse Logic
		for (int i = 0; i < length/2; i++)
		{
				int temp=a[i];
				a[i]=a[length-1-i];
				a[length-1-i]=temp;
		}
	 
		System.out.println("reversed array elements:");
		for (int i = 0; i < length; i++)
		{
				System.out.println(a[i]);
		}
		
	}

	}


