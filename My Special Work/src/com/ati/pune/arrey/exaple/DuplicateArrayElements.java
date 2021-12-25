package com.ati.pune.arrey.exaple;

public class DuplicateArrayElements {

	public static void main(String[] args) {
		int a[]={10,50,40,10,15,10,47,87,40};
		System.out.println("DuplicateArrayElements:");	
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)  
			{
				if(a[i]==a[j] && i!=j)
				System.out.println(a[j]);	
				
			}
		}
	}
	}


