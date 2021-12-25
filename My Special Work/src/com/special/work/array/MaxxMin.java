package com.special.work.array;

public class MaxxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []values= {55,66,77,88,99,111,-222};
int maxx=0,min=0;
for(int i =0 ;i<values.length;i++) {
if(values[i]>maxx) {
	maxx= values[i];
	}
}
System.out.println("maxx valu=" +maxx);
for(int i =0;i< values.length; i++){
	if(values[i]<min) {
		min= values[i];
	}		
}
System.out.println("min valu=" +min);
}
}