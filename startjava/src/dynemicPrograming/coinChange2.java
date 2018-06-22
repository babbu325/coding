//this program is to find the total no. of ways to find the given sum

package dynemicPrograming;

import java.util.Scanner;

public class coinChange2 {

	public static void main(String[] args) {

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
		// TODO Auto-generated method stub
		
		int[][] l=new int[n+1][sum+1];
		
		for(int i=0;i<n;i++)
		  l[i][0]=1;
		
		for(int i=0;i<sum;i++)
			l[0][i]=0;
        		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				if(coin[i-1] <= j){
				    
					   l[i][j] =(l[i][j-coin[i-1]] +  l[i-1][j]);
				}
				 else 
				     l[i][j] = l[i-1][j];				
			}
		}
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=sum;j++)
			{
				System.out.printf("%d\t",l[i][j]);
			}
			System.out.println();
			System.out.println();
		}
		
		return l[n][sum];
	}

}
