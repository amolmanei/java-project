package com.ati.basicwork;

public class DataTypesInt {
	//default datatype for integral data type is int ....
		//source=(source type)destination; src<dest
		//source=destination; src>dest 
		//-2147483648 to 2147483647     4bytes 32 bits  
		
		int i0;
		int i1=866024242;//ok
		int i2=2147483647;  
		int i3=(int)2147483453434l; //range value is long convert to int,explicit type casting  
		int i4=(int)2147483649l; //range value is long convert to int,explicit type casting
		int i5=-2147483648;
		int i6=(int)-2147483649L; //range value is long convert to int,explicit type casting
		
		public void display(){
			System.out.println("int default value is:"+i0+"INR"+i2);
			System.out.println("i1=>"+i1);
			System.out.println("i2=>"+i2);
			System.out.println("i3=>"+i3);
			System.out.println("i4=>"+i4);
			System.out.println("i5=>"+i5);	
			System.out.println("i6=>"+i6);	
			}
		
		public static void main(String[] args) {
			DataTypesInt dti= new DataTypesInt();
			dti.display();
		}
}
