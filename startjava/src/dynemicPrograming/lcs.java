package dynemicPrograming;

public class lcs {

	static int max(int a,int b)
	{
		return a>b?a:b;
	}
	
	static int lcs(char[] c1,char[] c2,int m,int n)
	{
		int[][] l = new  int[m+1][n+1];
		if(m==0 || n==0) return 0;
		
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || j==0)
				  l[i][j]=0;
				else if(c1[i-1] == c2[j-1]){
					l[i][j]= 1+l[i-1][j-1];
				System.out.println(c1[i-1]);
				}
				else l[i][j]=max(l[i-1][j], l[i][j-1]);
			}
		}
		for(int i=0;i<=m;i++)
		{		for(int j=0;j<=n;j++)
				System.out.printf("%d\t",l[i][j]);
		System.out.println();
	}
		
		return l[m][n];
		
	}
	
	
	
	public static void main(String[] args) {
		
		char[] c1={'a','t','b','c','r','j','f'};
		char[] c2={'b','a','t','r','f'};
		int l1=c1.length;
		int l2=c2.length;
		int r=lcs(c1,c2,l1,l2);
		System.out.println(r);
		

	}

}
