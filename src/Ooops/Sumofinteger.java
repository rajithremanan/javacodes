package Ooops;

import java.util.Scanner;

public class Sumofinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a number=");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Sumofinteger s= new Sumofinteger();
		int sum=s.Sumofinteger(n);
		System.out.println("sum of interger="+sum);
		
	}
	public int Sumofinteger (int n)
	{
		int r,s=0;
		while(n>0)
		{
			r=n%10;
			s=s+r;
			n=n/10;
			
		}
		return s;
	}
	
}
