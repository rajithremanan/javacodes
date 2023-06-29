package Inheritance;

class Animal
{

	public  void animalfood()
	{
		System.out.println("animalfood:");
		// TODO Auto-generated method stub

	}
	class Dog extends Animal
	{
		public  void breed()
		{
			System.out.println("lab");
		}
	}
	class babydog extends Dog
	{
		public  void babydogfeature()
		{
			System.out.println("babydog");
		}
}
	
	public class Singleinheritance {
		
		//public static void main(String[] args) {
	
		{
			
			
			Dog ob=new Dog();
			ob.animalfood();
			ob.breed();
			
			babydog baby =new babydog();
			baby.animalfood();
			baby.breed();
			baby.babydogfeature();
			
	}
	}
}
	
