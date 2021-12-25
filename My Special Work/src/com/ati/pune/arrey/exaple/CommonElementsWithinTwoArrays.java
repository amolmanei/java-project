package com.ati.pune.arrey.exaple;

public class CommonElementsWithinTwoArrays {

	public static void main(String[] args) {
		int a1[]={10,50,40,7,12};
		int a2[]={1,0,12,11,50,10};
		
		System.out.println("Common element is :");
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==(a2[j])){
					System.out.println(+a1[i]);
				}		
			}
			
	    }

    }

	}


