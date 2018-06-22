package dynemicPrograming;

import java.util.Scanner;

public class knapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
		
		int n=sc.nextInt();
		int W=sc.nextInt();
		
		int[] wet =new int[n];
		int[] val =new int[n];
		
		for(int i=0; i<n; i++){
			wet[i]=sc.nextInt();
		    val[i]=wet[i];//if value is given saperatly, the scan it 
		}
		
		int res=kanpsack(wet,val,n,W);
		System.out.println(res);
		}

	}

	private static int kanpsack(int[] wet, int[] val, int n, int w) {
		// TODO Auto-generated method stub
		
		int[][] l=new int[n+1][w+1];
		
		for(int i=0;i<=w;i++)
			l[0][i]=0;
		for(int i=0;i<=n;i++)
			l[i][0]=0;
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=w;j++)
			{
			 if(wet[i-1] <=j)
				 //if single suply of items
			 l[i][j]=Math.max(val[i-1]+ l[i-1][j-wet[i-1]], l[i-1][j]);
			 //if infinite suply of items
			 //l[i][j]=Math.max(val[i]+ l[i-1][j-wet[i-1]], l[i-1][j]);
			 
			 else l[i][j]=l[i-1][j];	 
							
			}
	}
		return l[n][w];
	}
}
