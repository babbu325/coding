package Bitt;

public class getParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=7;
		System.out.println(get(n));
	}

	private static boolean get(int n) {
		// TODO Auto-generated method stub
		boolean c=true;
		while(n>0)
		{
			if((n&1)==1)
				c=!c;
			n=n>>1;
		}
		return c;
	}

}
