package com.ati.basicwork;

public class DataTypeChar {
	
	//https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
	//https://www.ssec.wisc.edu/~tomw/java/unicode.html#x0000
	// 0 to 65535
	
	char c0=0;  // char c0;  char c0='\u0000';	
	char c1=65;   
	//int c1='A';
	char c2=32767;   //displays ? because 
	char c3=65535;   //displays ? because 
	char c4=(char) 65536;  //out of range
	char c5='@';
	char c6='a';
	char c7='t';
	char c8='9';
	//char c8=true;  wrong 
	
		
	public void display(){
		System.out.println("c0=>"+c0);
		System.out.println("c1=>"+c1);
		System.out.println("c2=>"+c2);
		System.out.println("c3=>"+c3);
		System.out.println("c4=>"+c4);
		System.out.println("c5=>"+c5);
		System.out.println("c6=>"+c6);
		System.out.println("c7=>"+c7);
		System.out.println("c8=>"+c8);
		}
	
	public static void main(String[] args) {
		DataTypeChar dtc= new DataTypeChar();
		dtc.display();
	}
}


