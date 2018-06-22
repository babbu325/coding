package dynemicPrograming;

public class longestPalindromeSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="forgeeksskeegfor";
		
		palin(s);
	}

	private static void palin(String s) {
		int n=s.length();
		int f=0;
		int l=0;
		boolean[][] m=new boolean[n][n];
		for(int i=0;i<n;i++)
		    m[i][i]=true;
		l=1;
		for(int i=0;i<n-1;i++){
			if(s.charAt(i)==s.charAt(i+1)){
				m[i][i+1]=true;
				f=i;
				l=2;
			}
		}		
		for(int L=3;L<=n;L++)
		{
			for(int i=0;i<n-L+1;i++)
			{
				int j=i+L-1;
				
				if((m[i+1][j-1]) && s.charAt(i)==s.charAt(j))
				{
					m[i][j]=true;
					if(L>l)
					{
						f=i;
						l=L;
					}
				}
			}
		}
			System.out.println(s.substring(f, f+l));
	}
}