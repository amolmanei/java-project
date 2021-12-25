package com.special.work.array;

public class Array {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {10,20,21,22,55,44};
int maxx=0;
for(int i=0; i<a.length;i++) 
	if(a[i]>maxx) {
	maxx=a[i];
}System.out.println("maxx valu" +maxx);
}
}
