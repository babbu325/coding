package algorithms;

public class numberDoest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=45;
		int c = 0;
		int r=0;
		for(int i=1;i<=k;i++)
		{
			r=0;
			if( count(i)==1  )
			c++;
			
		}
		System.out.println(k-c);
		

	}

	private static int count(int i) {
		// TODO Auto-generated method stub

		while(i>0)
		{
			int r=i%10;
			if(r==3)return 1;
			else i=i/10;
		
		}
		return 0;
	}

}
