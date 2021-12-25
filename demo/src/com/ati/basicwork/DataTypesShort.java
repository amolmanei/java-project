package com.ati.basicwork;

public class DataTypesShort {
	//default datatype for integral data type is int ....
		//source=(source type)destination; src<dest
		//source=destination; src>dest 
		//-32768 to 32767    2bytes 16bits 
		
		short s0;//0
		short s1=128;//ok
		short s2=32767;//0k  
		short s3=(short)216587215;  //int to short  explicit type casting 
		short s4=-32768;//ok
		short s5=(short)-32769;   //int to short  explicit type casting 
		short s6=(short)-32770;   //int to short   explicit type casting 
		
		public void display(){
			System.out.println("s0=>"+s0);
			System.out.println("s1=>"+s1);
			System.out.println("s2=>"+s2);
			System.out.println("s3=>"+s3);
			System.out.println("s4=>"+s4);
			System.out.println("s5=>"+s5);	
			System.out.println("s6=>"+s6);	
			}
		
		public static void main(String[] args) {
			DataTypesShort dts= new DataTypesShort();
			dts.display();
		}
}
