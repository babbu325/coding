package array;

public class subarrayProductLessThanK {

	public static void main(String[] args) {
		int[] a = {2,3, 6};
		int k = 10;
	    int[] p=new int[a.length];
	    p[0]=a[0];
	    for(int i=1;i<a.length;i++)
	    	p[i]= a[i]*p[i-1];
	    int res=0;
	   
	    for(int i=0; i<a.length;i++){
	    	if(p[i]<k)res++;  	
	    	System.out.println(res + " "+ i);
	    
	    	for(int j=0; j<i; j++){
	    		int tmp = p[i]/p[j];
	    		if(tmp <k)res++;
	    		System.out.println(res+ " "+ i+" "+ j);
	    	}
	    }
	    System.out.println(res);
	}
}
