package matrix;

import java.util.Scanner;

public class rotate_matrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int rot= sc.nextInt();
		
		System.out.println("Enter the 2Dmatrix:");
		int a[][]=new int[n][m];
		
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=sc.nextInt();
		
		while(rot-- > 0)
		{
			
			int t=0;
			int b=n-1;
			int l=0;
			int r=m-1;
				
		
			while(t<=b && l<=r)
			{
				int corner=a[t][l];
				//top direction shift to left
				int i=l;
				int j=l+1;
				while(j<=r)
					a[t][i++]=a[t][j++];
				
				//right most column shift to up
				i=t;
				j=t+1;
				while(j<=b)
					a[i++][r]=a[j++][r];
				
				//bottom shift to right 
				i=r;
				j=r-1;
				while(j>=l)
					a[b][i--]=a[b][j--];
				
				//left column shift to up				
				i=b;
				j=b-1;
				while(j > t )
				  a[i--][l]=a[j--][l];
				a[i][l]=corner;	
				
				t++;
				b--;
				l++;
				r--;
		  }	
		}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
			System.out.printf("%d",a[i][j]);
		System.out.println();
	}
	
	}

}
