//https://www.hackerrank.com/challenges/funny-string
package string;

import java.util.Scanner;

public class beautyfullString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
				int t=sc.nextInt();
 
				
				while(t-->0)
				{
					int c=1;
					String s=sc.next();
					int i;
					int j; 
					for(i=1,j=s.length()-1 ; i<s.length() && j>0 ; i++,j--  )
					{
						if (  Math.abs((int)((s.charAt(i)-s.charAt(i-1)))) != Math.abs ((int)(s.charAt(j)-s.charAt(j-1))))  {
							c=0;
							break;
						}
					}
					
					
					if(c==1
							)
						System.out.println("Funny");
					else 
						System.out.println("Not Funny");
						
				}
				
	}

}
