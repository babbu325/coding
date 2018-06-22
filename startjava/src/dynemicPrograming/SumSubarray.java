package dynemicPrograming;
public class SumSubarray {
	public static void main(String[] args) {
		int[] a= {1,2,8,3,9,4};
		int c= find(a,18);
		System.out.println(c);        
	}

	private static int find(int[] a, int sum){
		System.out.println(a.length+" "+sum);
		int[] l = new int[sum+1];
		l[0]=1;
		for(int i=0;i<=sum;i++)
			System.out.print(i+" ");
		
		for(int i=0;i<a.length;i++)
			for(int j=sum; j >=a[i]; j--)
				l[j] |= l[j-a[i]];
		return l[sum];
	}
}