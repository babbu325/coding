package algorithms;

public class efficient_divisibleBy3 {

	public static void main(String[] args) {
		int i = 27;
	   // System.out.println(i>>1);
			int r=divisibleBythree(i);
		System.out.println(r);

	}

	private static int divisibleBythree(int i) {
		// TODO Auto-generated method stubif
		
		if(i < 0) i=-i;
		if(i==0) return 1;
		if(i==1) return 0;
		int  odd=0;
		int even=0;
		
		while(i>0)
		{
		  if((i&1)==1)
			  odd++;
			i=i>>1;
			
			if((i&1)==1)
			 even++;
			i=i>>1;
			
			return divisibleBythree(Math.abs(odd-even));
		}
		
		return 0;
	}

}
