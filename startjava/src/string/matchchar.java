package string;

import java.util.Scanner;

public class matchchar {

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		String s1="my name is ramendra kumar singh";
		//String[] s1= new String[] {"my name is ramendra kumar singh"};
		 //Scanner s= new Scanner(System.in);
		 
		 System.out.println("Enter the string:");
		 CharSequence s2=s.next();
		 System.out.println(s2);
		 
		 int r=-1;
		 
		 for(int i=0;i<s2.length();i++){
			 char x=s2.charAt(i);
			 //System.out.println(x);
			 
		 for(int j=0; j < s1.length();j++)
		 {   
			 if(j<r){
				 System.out.println("false");
			return;	 
			 }
			 if(s1.charAt(j)==x)
			 {	
				 //s1= s1.replace(s1.charAt(j),'#');
				 r=j;
			     //System.out.println("hi"+x);
			 }
	 }
	}
		 System.out.println("true");
	}
}
