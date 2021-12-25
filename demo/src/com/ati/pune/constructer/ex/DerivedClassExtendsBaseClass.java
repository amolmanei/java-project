package com.ati.pune.constructer.ex;

	 class BaseClass {
	int x=30,y=10;
	void add()
	{
	System.out.println("addition :"+(x+y));
	}
	void sub()
	{
	System.out.println("sub :"+(x-y));
	}
	void mul()
	{
	System.out.println("mul :"+(x*y));
	}
	//Base class can't access derived class methods
	}
	public class DerivedClassExtendsBaseClass extends BaseClass {
	// 3 methods access is for derived class
	// derived class own new features/methods
	void div()
	{
	System.out.println("div :"+(x/y));
	}
	void mod()
	{
	System.out.println("mod :"+(x%y));
	}
	public static void main(String[] args) {
	// derived class reference and derived class object
	DerivedClassExtendsBaseClass d=new DerivedClassExtendsBaseClass();
	d.add();
	d.mul();
	d.div();
	d.sub();
	d.mod();
	// Base class reference and base class object
	BaseClass bs=new BaseClass();
	bs.add();
	bs.mul();
	bs.sub();
	//b.div(); not accessible
	//b.mod(); not accessible
	//Base class reference and derived class object
	BaseClass b=new DerivedClassExtendsBaseClass();
	//b.div(); not accessible
	//b.mod(); not accessible
	b.add();
	b.mul();
	b.sub();
	//DerivedClass dref=new BaseClass();
	//not allowed
	}

}
