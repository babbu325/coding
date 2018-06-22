package dynemicPrograming;

public class MaximumSizeSubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] m=
			{
			 {1,1,1,0,1,1},
			 {1,0,0,0,0,1},
			 {1,0,0,0,0,1},
			 {0,0,1,1,1,1},
			 {0,1,1,1,1,1}
			 };
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=0; j<m[0].length; j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
		// System.out.println(m.length+" "+m[0].length);
		subMatrix(m , m.length, m[0].length);
	}

	private static void subMatrix(int[][] m, int r, int c) {
		// TODO Auto-generated method stub
		System.out.println();
		for(int i=0;i<r;i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(r+" "+c);
		int l[][]=new int[r][c];
		
		for(int i=r-1;i>=0;i--)
		{
			for(int j=c-1; j>=0; j--)
			{
				
				if(i+1 <=r-1 && j+1 <=c-1 && m[i][j]==1)
				{
					//System.out.println("hi");	
					l[i][j]= 1+ Math.min(Math.min(l[i+1][j], l[i+1][j+1]), l[i][j+1]);
				}
				else l[i][j]=m[i][j];
				//System.out.println("hi");
			}
		}
		//System.out.println("hi");
		for(int i=0;i<r;i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0;i<r;i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(l[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
