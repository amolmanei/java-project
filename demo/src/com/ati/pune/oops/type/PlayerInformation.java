package com.ati.pune.oops.type;
class PlayerInfo{
	protected String playername;
	int runs;
	int balls;
	void display(String name,int runs,int balls)
	{ 	
		playername=name;
		this.runs=runs;
		this.balls=balls;
		System.out.println(name);
		System.out.println(runs);
		System.out.println(balls);
	
	}
}
class Secondplayer extends PlayerInfo{
	

	void display(String name,int runs,int balls)
	{
	playername=name;
	this.runs=runs;
	this.balls=balls;
	System.out.println(name);
	System.out.println(runs);
	System.out.println(balls);
	}
}
class ThirdPlayer extends Secondplayer{
	void display(String name,int runs,int balls)
	{
	playername=name;
	this.runs=runs;
	this.balls=balls;
	System.out.println(name);
	System.out.println(runs);
	System.out.println(balls);
	}
}
public class PlayerInformation {


	public static void main(String[] args) {
		ThirdPlayer d1= new ThirdPlayer();
		d1.display("AMOL", 50, 20);
        d1.display("PRAMOD",150,66);
        d1.display("VINOD",111,77);
	}

}













