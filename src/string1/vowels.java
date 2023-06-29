package string1;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter string:");
		Scanner sc= new Scanner(System.in);
		String a1=sc.nextLine();
		
		
	        int c = 0;
	        for (int i = 0; i < a1.length(); i++)
	        {
	        	 if (a1.charAt(i) == 'a' || a1.charAt(i) == 'e' || a1.charAt(i) == 'i'
	                     || a1.charAt(i) == 'o' || a1.charAt(i) == 'u')
	            {
	                c++;
	            }
	        }
	        System.out.println("enter string:"+c); 
	        
	    }


}


