package algorithms;

public class luckyno {
	  static int c=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(getlucky(17));
	}

	private static boolean getlucky(int i) {
		// TODO Auto-generated metho

	
	  int pos=i;
	  
		if(c>i)return true;
		if(pos%c==0) return false;
		
		
		pos -=pos/c;
		c++;
		return getlucky(pos);
	}

}
