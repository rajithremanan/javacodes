package array;

import java.util.Scanner;

public class arrayusingscanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] ar= new int[3];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number=");
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		System.out.println("entered numbers ");
		for(int i=0;i<3;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
