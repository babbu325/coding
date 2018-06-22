//this program is to find minimum no. of coins to get a given sum
// 


package dynemicPrograming;

import java.util.Scanner;

public class coinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
		
		int sum=sc.nextInt();
		int n=sc.nextInt();
		int[] coin = new int[n];
		
		for(int i=0;i<n;i++)
			coin[i]=sc.nextInt();
		
		int res= coinchange(sum,n,coin);

		System.out.println(res);
	}
	private static int coinchange(int sum, int n, int[] coin) {
		
		int[][] l=new int[n][sum+1];
		
		for(int i=0;i<n;i++)
		  l[i][0]=1;
		
		for(int i=1;i<=sum;i++)
			if(i%coin[0]==0) l[0][i]=1;
        		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				if(coin[i] <= j)
				    l[i][j]=l[i-1][j]+ l[i][j-coin[i]];
				 else 
				     l[i][j] = l[i-1][j];
			}
		}
		
		return l[n-1][sum];
	}

}









