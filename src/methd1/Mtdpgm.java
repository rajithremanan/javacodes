package methd1;

public class Mtdpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mtdpgm ob=new Mtdpgm();
		ob.add();
		int subt=ob.sub();
		System.out.println("substaction="+subt);
		System.out.println(ob.mul(20,30));
		ob.div(2,3);
	}
	public void add ()
	{
		int a=30,b=20;
		int c=a+b;
		System.out.println("sum is="+c);
		
	}
	public int sub()
	{
		int a=22,b=20;
		int c=a-b;
		return c;
		
	}
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
		
	}
	public void div(double  a,double b)
	{
		double c=a/b;
		System.out.println("division="+c);
	}
}

