
class point{
int x;
int y;
};

public class NumberOfSquaresFromPionts {
	static boolean vis[] = new boolean[9];
	static int count=0;
	static double distance(int x1,int y1, int x2, int y2)
	{	
		return (Math.sqrt( Math.pow(x1-x2, 2)+ Math.pow(y1-y2, 2)));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=9;
		point[] p= new point[n];
		for(int i=0;i<9;i++)
			p[i]= new point();
		p[0].x=0;  p[0].y=0;  p[1].x=2;  p[1].y=0;  p[2].x=2;  p[2].y=2;
		p[3].x=0;  p[3].y=2;  p[4].x=3;  p[4].y=0;  p[5].x=3;  p[5].y=2;
		p[6].x=3;  p[6].y=3;  p[7].x=2;  p[7].y=3;  p[8].x=0;  p[8].y=3;
		double[][] m= new double[9][9];
		for(int i=0;i<9;i++)
			m[i][i]=0;
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				m[i][j]= distance(p[i].x, p[i].y,  p[j].x, p[j].y);	
			}	
		}
		
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.printf("%.2f\t",m[i][j]);
			}	
			System.out.println("\n");
		}
 		int r=0;
		boolean res=false;
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				count=0;
				for(int k=0;k<9;k++)
					vis[k]=false;		
				res |=util(m,m[i][j],i,j);
				if(res==true)
					r++;
					
			}		
		}
		System.out.println("\n\n"+r);
	}
	private static boolean util(double[][] m, double d, int I, int J) {
		// TODO Auto-generated method stub
		vis[I]=true;
		count++;
		if(count==4 && vis[I]!=true) return false;
		if(count==4 && vis[I]==true) return true;
			for(int i=0; i<9 &&i!=I; i++){
				if(m[J][i]==d)
				return	util(m,d,J,i);
			}
		return false;
	}
}
























