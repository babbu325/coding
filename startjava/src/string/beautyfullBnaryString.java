package string;

import java.util.Scanner;

public class beautyfullBnaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//char[] c=new char[n];
		String s =sc.next();
		char[] c=s.toCharArray();
		//for(int i=0;i<n;i++)
			//System.out.print(c[i]);
		
		int count=0;
		
		for(int i=0; i<c.length-2; i++)
		{
			if(c[i]=='0' && c[i+1]=='1' && c[i+2]=='0'){
				c[i+2]=1;
			   count++;
			}	
		}
		System.out.println(count);
	}

}
