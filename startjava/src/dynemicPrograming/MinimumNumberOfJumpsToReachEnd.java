package dynemicPrograming;

public class MinimumNumberOfJumpsToReachEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,5,8,9,5,7,2,1,3,5,6,4,3};
		System.out.println();
		System.out.println("\nreslt is:"+ fun(a));
	}

	private static int fun(int[] a) {
		// TODO Auto-generated method stub
		int l[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		l[i]=999;
		l[0]=0;
		for(int i=0;i<a.length;i++)
			System.out.print(" "+l[i]);	
		
		System.out.println();
		for(int i=1;i<a.length;i++)
		{
			for(int j=0 ; j<i ; j++)
			{
				if( (i-j)<= a[j])
					l[i] = Math.min(l[i], 1+l[j]);
			}
			System.out.print(" "+l[i]);
		}
		return l[a.length-1];
	}

}
