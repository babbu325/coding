package dynemicPrograming;

public class countWayToReachNthStair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int m=4;
		int[] a=new int[n+1];
		a[1]=1;
		
		for(int i=2;i<=n;i++)
		{
			a[i]=0;
			for(int j=1;j<=m && j<=i;j++)
			{
				a[i] += a[i-j];
				
			}
		}
		System.out.println(a[n]);
	}

}
