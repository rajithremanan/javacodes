package Inheritance;


class Animal1
{
public void animaldetails()
{
	System.out.println("Animaldetails");
}
}
class Dog extends Animal1
{
	public void Dogdetails()
	{
	System.out.println("dog");
	}
	
	}
class Tiger extends Animal1
{
	public void Tigerdetails()
	{
		
	System.out.println("Tigerdetails");
	
}
}


public class Hierarchialinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog ob=new Dog();
		ob.animaldetails();
		ob.Dogdetails();
		Tiger t=new Tiger();
		t.animaldetails();
		t.Tigerdetails();
		
	}

}
