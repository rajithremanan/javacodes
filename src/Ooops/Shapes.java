package Ooops;

import methd1.Mtdpgm;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes ob=new Shapes();
		ob.triangle();
		int squre=ob.squ();
		System.out.println("squre="+squre);
		System.out.println("rectangle is ="+ob.rectangle(20,30));
		System.out.println("circle="+ob.circle(2));
	}
	public void triangle ()
	{
		int h=30,b=20;
		double c=0.5*h*b;
		System.out.println("triangle is ="+c);
		
	}
	public int rectangle(int l,int b)
	{
		
		int c=l*b;
		return c;
		
	}
	public double circle(double r)
	{
		double c=3.14*r*r;
		return c;
		
	}
	public int squ()
	{
		int a=5;
			int c= a*a;
		return c;
		

	}
}

