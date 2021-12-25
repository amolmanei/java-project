package com.ati.basicwork;


	public class ByteDataType {
		
		//default datatype for integral data type is int ....
		//source=(source type)destination; src<dest
		//source=destination; src>dest 
		//-128 to 127   
		//127=128
		byte b1=127;
		byte b2=(byte)128;
		byte b3=-127;
		byte b4=-128;
		byte b5=(byte)-129;
		byte b6=(byte)-130;
		
		public void display(){
			System.out.println(b1);
			System.out.println(b2);//128
			System.out.println(b3);
			System.out.println(b4);
			System.out.println(b5);	
			System.out.println(b6);	
			}
		
		public static void main(String[] args) {
			ByteDataType dt= new ByteDataType();
			dt.display();
		}
	}


