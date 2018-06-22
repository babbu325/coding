//http://www.geeksforgeeks.org/minimum-positive-points-to-reach-destination/
package dynemicPrograming;

public class MinimunPositiveNumberToReachDestination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a=
				 { {-12,-6, 4},
                    {-9,-10,8},
                    { 1, 3,-5}
                   };
		int res= util(a);
		System.out.println(res);
	}

	private static int util(int[][] a) {
		// TODO Auto-generated method stub
		int r= a.length;
		int c=a[0].length;
		int[][] l = new int[r+1][c+1];
		for(int i=0;i<r+1;i++)
			l[i][0]=Integer.MIN_VALUE;
		for(int i=0;i<c+1;i++)
			l[0][i]=Integer.MIN_VALUE;
		
		l[1][0]=0;
		for(int i=1;i<r+1;i++)
		{
			for(int j=1;j<c+1;j++)
			{
				l[i][j]= (a[i-1][j-1]+ Math.max(l[i-1][j], l[i][j-1]));
				if(l[i][j]>0)l[i][j]=Integer.MIN_VALUE;
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<r+1;i++)
		{
			for(int j=1;j<c+1;j++)
			{
				System.out.print(l[i][j]+" ");
			}
			System.out.println();
		}
		return  -l[r][c]+1;
	}
}
