package com.ati.basicwork;

public class DataTypeFloat {
	//default datatype for floating point data type is double ....
		//source=(source type)destination; src<dest
		//source=destination; src>dest 
		//4bytes 32 bits -3.4e38 to 3.4e38 
		
		float f0;//0.0
		float f1=23.5f;  //Writing f is compulsory as you defined data type float
		float f2=567; //? int converted to float 567.0 implicit type casting
		float f3=9223372036854775900.32656576745f; 
		float f4=-92808f;
		float f5=2.1234567890f; //6 to 7 decimal points
		float f6=(float)23.6d;  // Explicit type casting
		float f7=(float)23.6;    //writing d is not compulsory Because by default double
		
		public void display(){
			System.out.println("f0=>"+f0);
			System.out.println("f1=>"+f1);
			System.out.println("f2=>"+f2);
			System.out.println("f3=>"+f3);
			System.out.println("f4=>"+f4);
			System.out.println("f5=>"+f5);
			System.out.println("f6=>"+f6);
			System.out.println("f7=>"+f7);
			}
		
		public static void main(String[] args) {
			DataTypeFloat dtf= new DataTypeFloat();
			dtf.display();
		}
}
