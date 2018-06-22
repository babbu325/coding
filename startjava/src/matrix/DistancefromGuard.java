package matrix;

import java.util.Queue;

class cell
{
int i,j,dis;	
int[] q=new int[100];
};



public class DistancefromGuard  {

	static int[] row={-1,0,1,0};
	static int[] col={0,1,0,-1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] m= new char[][]
				    {{'o','o','o','o','g'},
				    {'o','w','w','o','o'},
				    {'o','o','o','w','o'},
				    {'g','w','w','w','o'},
				    {'o','o','o','o','g'}};
		distamceCalculate(m,m.length,m[0].length);
	}

	private static void distamceCalculate(char[][] m, int r, int c) {
		// TODO Auto-generated method stub
		int[][] output=new int[r][c];
		cell cell=new cell();
		
		//cell[] q=new cell[r*c];
		
		int rear=0;
		int front=0;
		
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{ 
			output[i][j]=-1;
			if(m[i][j]=='g'){
				cell.q[rear].i=i;
				q[rear].j=j;
				q[rear].dis=0;
				output[i][j]=0;
				rear++;
			}
		}
	}
	
	while(front < rear)
	{
		cell cl=q[front++];
		int x=cl.i;
		int y=cl.j;
		int d=cl.dis;
		for(int i=0;i<4;i++)
		{
			if( validmove(x+row[i], y+col[i], m,output) && inboundry(x+row[i], y+col[i],r,c))
			{
				q[rear].i=x+row[i];
				q[rear].j=y+col[i];
				q[rear].dis=cl.dis +1;
				rear++;
				output[x+row[i]][y+col[y]]=cl.dis+1;
			}
		}
	}
	
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.printf("%d\t",output[i][j]);
		}
		System.out.println();
	}
}
	private static boolean inboundry(int i, int j,int r,int c) {
		// TODO Auto-generated method stub
		if( (i<0 || i>=c ) || (j<0 || j>=r) )
			return false;
		return true;
	}

	private static boolean validmove(int i, int j, char[][] m, int[][] output) {
		// TODO Auto-generated method stub
		if(output[i][j] !=-1 || m[i][j]!='o')
			return false;
		return true;
	}

}
