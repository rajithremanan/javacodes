package array;

import java.util.Scanner;

public class sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enternumber=");
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		}
		int s=0;
		for(int v:a)
		{
	 s=s+v;
}

System.out.println("sum is ="+s);
}
}

