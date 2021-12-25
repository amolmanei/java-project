package com.ati.basicwork;

public class DataTypesDouble {
	//default datatype for floating point data type is double ....
		//source=(source type)destination; src<dest
		//source=destination; src>dest 
		//8 bytes 64 bits       -1.7e308 to 1.7e308
		
		double d0; 
		double d1=23.6;  
		double d2=56789; 
		double d3=922337200.32656576745d; 
		double d4=-92808f;
		double d5=2.123456789012345678; // up to 15 decimal points
		double d6=23.6d;  
		double d7=23.6f;   
		
		public void display(){
			System.out.println("d0=>"+d0);
			System.out.println("d1=>"+d1);
			System.out.println("d2=>"+d2);
			System.out.println("d3=>"+d3);
			System.out.println("d4=>"+d4);
			System.out.println("d5=>"+d5);
			System.out.println("d6=>"+d6);
			System.out.println("d7=>"+d7);
			}
		
		public static void main(String[] args) {
			DataTypesDouble dtf= new DataTypesDouble();
			dtf.display();
		}
	}


