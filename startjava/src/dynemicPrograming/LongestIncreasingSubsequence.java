package dynemicPrograming;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={1,101,2,3,100,4,5};
		System.out.println(lis(a));
	}

	private static int lis(int[] a) {
		// TODO Auto-generated method stub
		int n=a.length;
		int[] l= new int[n];
		for(int i=0;i<n;i++)
			l[i]=a[i];
		
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
			   	if( a[i]>a[j] && l[j]+ a[i]>l[i] )
			   		l[i]=l[j]+ a[i];
			}
		}
		int max=l[0];
		for(int i=0;i<n;i++)
		{
			if(max < l[i])
				max=l[i];
		}
		return max;
	}
}
