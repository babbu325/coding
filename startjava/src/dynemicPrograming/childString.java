//there are two string given,x,y
//we have to find the length of a child string which can be formed by deleting elements from either x, of y



package dynemicPrograming;

import java.util.Scanner;

public class childString {	
	
	static public  void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int l=dp(s1,s2,s1.length(),s2.length());
		System.out.println(l);
	}

	private static int dp(String s1, String s2, int l1, int l2) {
		// TODO Auto-generated method stub
		int[][] l=new int[l1+1][l2+1];
		
		for(int i=0; i<l1;i++)
			for(int j=0;j<l2;j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
					l[i+1][j+1]=1+l[i][j];
				else 
					l[i+1][j+1]=Math.max(l[i][j+1], l[i+1][j]);
			}
		return l[l1][l2];
	}

}
