package dynemicPrograming;

public class NoOfNun_decreasingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(3));
	}

	private static int fun(int n) {
		// TODO Auto-generated method stub
		int[][] l= new int[10][n+1]; 
		if(n==1)
			return 10;
		for(int i=0;i<10;i++)
			l[i][1]=1;
		for(int i=0;i<10;i++){
			for(int j=2;j<=n;j++){
				for(int k=i;k>=0;k--)
					l[i][j] += l[k][j-1];
			}
		}
		int res=0;
		for(int i=0;i<10;i++)
		 res+=l[i][n];
		return res;
	}
}
