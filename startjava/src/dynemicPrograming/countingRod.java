//http://www.geeksforgeeks.org/dynamic-programming-set-13-cutting-a-rod/
package dynemicPrograming;

public class countingRod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={3,5,8,9,10,17,17,20};
		int n=a.length;
		System.out.println("max :"+calculate(a,n));

	}

	private static int calculate(int[] a, int n) {
		// TODO Auto-generated method stub
		int[] l=new int[n+1];
		l[0]=0;
		for(int i=1;i<=n;i++)
		{
			int m=Integer.MIN_VALUE;
			for(int j=0;j<i;j++)
			   m=Math.max(m, a[j]+l[i-1-j]);
			
			l[i]=m;
		}
		return l[n];
	}

}
