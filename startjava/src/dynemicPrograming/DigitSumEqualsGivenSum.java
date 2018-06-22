//http://www.geeksforgeeks.org/count-of-n-digit-numbers-whose-sum-of-digits-equals-to-given-sum/
package dynemicPrograming;

public class DigitSumEqualsGivenSum {

	static int[][] l= new int[100][5000]; 
	public static void main(String[] args) {		
		int n=5;
		int sum=10;
		int res= cal(n,sum);
		
		System.out.println(res);
	  }

	private static int cal(int n, int sum) {
		if(n==0)return 0;
		for(int i=0;i<100;i++){
			for(int j=0;j<5000;j++)
				l[i][j]=-1;
		}
		int ans=0;
		for(int i=1;i<=9;i++)
			if(sum-i>=0)
				ans+=util(n-1,sum-i);
		return ans;
	}

	private static int util(int n, int sum) {
		if(n==0)
			return (sum==0)?1:0;
		int ans=0;
		for(int i=0;i<=9;i++)
			if(sum-i>=0)
				ans+=util(n-1,sum-i);
		return l[n][sum]=ans;
	}
}