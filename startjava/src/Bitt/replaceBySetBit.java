//http://www.geeksforgeeks.org/copy-set-bits-in-a-range/
package Bitt;

public class replaceBySetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=8, y=7,l=1,r=2;
		String x1= Integer.toBinaryString(x);
		StringBuffer s= new StringBuffer(x1);
		
		String y1 = Integer.toBinaryString(y);
		StringBuffer xx1= new StringBuffer(x1);
		
		xx1.replace(xx1.length()-2, xx1.length()-1, "1");
		System.out.println(s);
		
		
		for(int i=l; i<=r; i++){
			if(y1.charAt(y1.length()-i)==1){
				//System.out.println(y1.charAt(y1.length()-i));
				xx1.replace(xx1.length()-i, xx1.length()-i+1, "1");
			//System.out.println(xx1);
		}
		}
		//System.out.println(xx1);
	}

}
