package Polymorphism;

public class Compiletime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compiletime ob=new Compiletime();
		ob.add();
		ob.add(22,33);
		ob.add(22,33.5);
	}
	public void add()
	{
		int a=20,b=30;
		int c=a+b;
		System.out.println(c);
		
	}
	
	public void add(int a,int b)
	{
		
	
	int c=a+b;
	System.out.println(c);
}
	public void add(int a,double b)
	
	{
		double c=a+b;
		System.out.println(c);
	}
}