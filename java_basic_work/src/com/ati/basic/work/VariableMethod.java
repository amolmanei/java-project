package com.ati.basic.work;

import com.atipune.my.work.VariableMethod;

public class VariableMethod {
	int x=20;
	static int y=30;
	
	
	void instanceMethod()
	  {
		System.out.println("Before change");
		System.out.println(x);//instance
		System.out.println(y);//static
		x=x+1;
		y=y+1;
		System.out.println("after chhange");
		System.out.println(x); //instance
		System.out.println(y); //static
	}
	
	static void staticmethod()
	
	{
	    System.out.println("Before change");
	    System.out.println(y);//static
	    y=y+1;
	    System.out.println("after chhange");
	    System.out.println(y);//static
		
	}

	public static void main(String[] args) {
		 VariableMethod vm=new VariableMethod();
		 vm.instanceMethod();
		 VariableMethod.staticmethod();
		 
	}

}

