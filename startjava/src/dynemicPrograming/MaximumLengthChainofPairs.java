package dynemicPrograming;

public class MaximumLengthChainofPairs {
		
	static int fun(pair a[])
	{
		int max=0;
	    int l[]=new int[a.length];
	    for(int i:l)
	    	l[i]=1;
	    
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=0;j<i;j++)
	    	{
	    		if(a[i].a > a[j].b)
	    			l[i]=l[j]+1;
	    	}
	    }
	    
	    for(int k=0;k<l.length;k++)
	    	if(max < l[k])
	    		max=l[k];
		return max;
	}
	
	public static void main(String[] args) {
		
		pair[] a=new pair[5];
		for(int i=0;i<5;i++)
	    a[0]= new pair(3,19);
		a[1]= new pair(7,16);
		a[2]= new pair(9,12);
		a[3]= new pair(14,7);
		a[4]= new pair(15,8);
		
		System.out.println(fun(a));
	}
}
class pair{
	int a;
	int b;
	//pair(){};
	public pair(int A,int B)
	{
		a=A;
		b=B;
	}
}