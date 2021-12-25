package com.ati.pune.arrey.exaple;

public class ArrayMaxxMinElements {

	public static void main(String[] args) {
		 int[] values = {120,-1230,21,215,-16,610,-100,-660,5980,-1234};
		   int  max = 0,min=0; 
		   
		    for(int i = 0;i < values.length;i++){
		     if(values[i] > max){
		        max = values[i];
		       }
		    }
		    
		    System.out.println("Max value:"+max);
		    for(int i = 0;i < values.length;i++){
			     if(values[i] < min){
			        min = values[i];
			       }
			    }
			    System.out.println("min Value:"+min);
		}	
	
	}


