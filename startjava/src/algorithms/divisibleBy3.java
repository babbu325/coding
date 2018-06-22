//http://www.geeksforgeeks.org/find-the-largest-number-multiple-of-3/

package algorithms;

public class divisibleBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n= new int[]{8,1,9};
		for(int i:n)
			System.out.print(i);
		    merge(n);
		    
		    System.out.println();
		    for(int i:n)
				System.out.print(i);
	
		    int[] res=new int[n.length];
		    
		    int not=getresult(res,n);
		    if(not==1)
		    	System.out.println("not possible");
		    
		    else if(not==-1)
		    {
		      for(int i=n.length-1;i>=0;i--)
		    	  System.out.print(n[i]);
		    }
		    	
		    else {
		    	int[] res2=new int[not];
		    	for(int i=0;i<not;i++)
		    		res2[i]=res[i];
		    	merge(res2);
		    	for(int i=not-1;i>=0;i--)
		    	System.out.print(res2[i]);
		    }
			
	}

	private static int getresult(int[] res,int[] n) {
		// TODO Auto-generated method stub
		int[] stack0=new int[n.length];
		int[] stack1=new int[n.length];
		int[] stack2=new int[n.length];
	    int s0=-1;
	    int s1=-1;
	    int s2=-1;
	    int f0=0;
	    int f1=0;
	    int f2=0;
	    int not=0;
	    int k=0;

		for(int i=0;i<n.length;i++)
		{
			if(n[i]%3==0)
				stack0[++s0]=n[i];
			
			else if(n[i]%3==1)
				stack1[++s1]=n[i];
			
			else stack2[++s2]=n[i];
			
		}
		System.out.println();
		
		
		int sum=0;
		for(int i=0;i<n.length;i++)
	      sum+=n[i];
	
		
		if(sum%3==0){
		return -1;
		}
		
		else if(sum%3==1)
		{
			System.out.println(1);
			
			if(s1>=f1)
				f1++;
			else if(s2-f2>=1)
				f2=f2+2;
			else  not=1;
				
		}
		
		else
		{
			System.out.println(2);
			if(s2>=f2)
				f2++;
			else if(s1-f1>=1)
				f1=f1+2;
			else not=1;
			
		}

		while(f0<=s0)
			res[k++]=stack0[f0++];
	
		while(f1<=s1)
			res[k++]=stack1[f1++];
		
		while(f2<=s2)
			res[k++]=stack2[f2++];
		
		
		if(not!=1)
			not=k;
		
		return not;
	}

	private static void merge(int[] n) {
		if(n.length<2) return;
		
		int l=n.length;
		int l1=l/2;
		int l2=l-l1;
		int[] left=new int[l1];
		int[] right=new int[l2];
		
		for(int i=0;i<l1;i++ )
			left[i]=n[i];
		
		for(int i=l1;i<l;i++ )
			right[i-l1]=n[i];
		
		merge(left);
		merge(right);
		
		submerge(n,left,right);
		}

	private static void submerge(int[] n, int[] left, int[] right) {
		// TODO Auto-generated method stub
		int l1=left.length;
		int l2=right.length;
		int i=0,j=0,k=0;
		while(i<l1 && j<l2)
		{
			if(left[i] < right[j])
				n[k++]=left[i++];
			else 
			   n[k++]=right[j++];			
		}
		
		while(i<l1)
			n[k++]=left[i++];
		while(j<l2)
			n[k++]=right[j++];
		
	}

}
