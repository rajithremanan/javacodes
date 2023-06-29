package Polymorphism;

class car
{
	public void accelator()
	{
		System.out.println("Accelator");
	}
}
class BMW extends car 
{
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public void ac()
	{
		System.out.println("BMW accelerator");
}

	@Override
	public void accelator() {
		// TODO Auto-generated method stub
		super.accelator();
	}

}

public class Cars {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW ob=new BMW ();
		ob.accelator();
		
	}

	
	}


