package Ooops;

import java.util.Scanner;

public class Avgof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("enter a number=");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(); 
		int n2=sc.nextInt(); 
		int n3=sc.nextInt(); 
		Avgof3 ob=new Avgof3();
		ob.average(n1,n2,n3);
		
	}
	
	public void average(int n1,int n2,int n3)
	{
		int avg=n1+n2+n3;
		int result=avg/3;
		System.out.println("average is ="+result);
		
	}
}
