package com.ati.basicwork;

public class DataTypesLong {
	//default datatype for integral data type is int ....
		//source=(source type)destination; src<dest
		//source=destination; src>dest 
		//8 bytes 64 bits
		//-9223372036854775808  to   9223372036854775807

		long l0;
		long l1=92233720368547l;
		long l2=9223372036854775807L;  
		long l3=(long)9223372036854775900.132312312f; //range value is long use float or double  
		long l4=-9223372036854775808L;
		//long l5=-9223372036854775809L; //range value is long use float or double
		
		public void display(){
			System.out.println("l0=>"+l0);
			System.out.println("l1=>"+l1);
			System.out.println("l3=>"+l3);		
			System.out.println("l2=>"+l2);
			System.out.println("l4=>"+l4);
			}
		
		public static void main(String[] args) {
			DataTypesLong dtl= new DataTypesLong();
			dtl.display();
		}
}
