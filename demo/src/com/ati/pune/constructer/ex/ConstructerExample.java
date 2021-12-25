package com.ati.pune.constructer.ex;

           public class ConstructerExample {
		int age;
		String name;
		int aadharNo;
		int passportNo;
		String panNo;
		ConstructerExample()
		{
		System.out.println("default argumnet");
		}
		ConstructerExample(int age,String name,int aadharNo)
		{
		this.age=age;
		this.name=name;
		this.aadharNo=aadharNo;
		}
		ConstructerExample(int a,String name,int aadharNo,int passportNo,String
		panNo)
		{
		age=a;
		this.name=name;
		this.aadharNo=aadharNo;
		this.passportNo=passportNo;
		this.panNo=panNo;
		}
		ConstructerExample(int a,String name,int aadharNo,String panNo)
		{
		this.age=a;
		this.name=name;
		this.aadharNo=aadharNo;
		this.panNo=panNo;
		}
		void dispaly()
		{
		System.out.println("*******************");
		System.out.println(age);
		System.out.println(name);
		System.out.println(aadharNo);
		System.out.println(passportNo);
		System.out.println(panNo);
		System.out.println("*******************");
		}
		public static void main(String[] args) {
		ConstructerExample c1=new ConstructerExample();
		c1.dispaly();
		ConstructerExample c2=new
		ConstructerExample(23,"mahadev",23451234);
		c2.dispaly();
		ConstructerExample c3=new
		ConstructerExample(45,"mkk",23451234,123456,"Bzwpkn3");
		c3.dispaly();
		ConstructerExample c4=new
		ConstructerExample(445,"mhjgfhkk",23451,"fgdfd");
		c4.dispaly();
		}
		}

