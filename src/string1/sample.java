package string1;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CONCATENATION
				String s="      "
						+ "hello";
				String s1="    welcome";
				String s2="hello. how are you";		
			System.out.println(s.concat(s1));
			System.out.println(s+s1);
			System.out.println(1+2+3+s+4+5);
			
			//equals
			
			System.out.println(s.equals(s1));
			System.out.println(s.equals(s2));
			System.out.println(s.equalsIgnoreCase(s2));
			
			
			//contains
			System.out.println(s2.contains("how"));
			
			// touppercase &lowercase 
			System.out.println(s.toUpperCase());
			System.out.println(s2.toLowerCase());
			
			//trim
			
			System.out.println(s1.trim());
			
			//length
			System.out.println(s1.length());
			
			//startwith
			
			System.out.println(s2.startsWith("hello"));
			
			//endswith
			
			System.out.println(s2.endsWith("you"));
			
			//substring
			System.out.println(s2.substring(2,6));
			
			//character
			
			System.out.println(s1.charAt(4));
			
			//split
			String[] sr=s2.split(" ");
			for(String v:sr)
			{
				System.out.println(v);
			}
				
			}
}

		
