package com.ati.basicwork;

public class DataTypesBoolean {
// only  allowed true or false 
	
    boolean b0;
	boolean b1=true;
	boolean b2=true;
	boolean b3=false;
/*not allowed
	boolean b4=0;    
  	boolean b5=(boolean)1;  
	boolean b6=False;    
	boolean b7=True;   	 
	boolean b8=True;   	 
	boolean b9=True;   	 
	boolean b10='false';   
	boolean b11='T'; 	
  	boolean b12=null;
*/		
	public void display(){
		System.out.println("b0=>"+b0);
		System.out.println("b1=>"+b1);
		System.out.println("b2=>"+b2);
		System.out.println("b3=>"+b3);
				}
	
	public static void main(String[] args) {
		DataTypesBoolean dtb= new DataTypesBoolean();
		dtb.display();
	}
}
