package array;

public class flipZeroForMaximum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,1,0,1,0,1,1,0,1,1,1};
		int m=2;
		int res = fun(a,a.length,m); 
		System.out.println();
		System.out.println(res);
	}

	private static int fun(int[] a, int n, int m) {
		int lw=0,rw=0,cz=0,l=0,res=0;
		
		while(rw < n){
			
			if(cz<=m){
			if(a[rw]==0)cz++;
			rw++;
			}
			
			if(cz>m){
				if(a[lw]==0)cz--;
				lw++;
			}
			
			if(rw-lw > res){
				res= rw-lw;
				l=lw;
			}
		}
		
		for(int i=l; i<n;i++)
		{
			if(a[i]==0)System.out.print(i+" ");
		}
		return res;
	}

}
