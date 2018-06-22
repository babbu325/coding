//http://www.geeksforgeeks.org/run-length-encoding/
package string;

import java.util.HashMap;

public class LengthEncodeing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="wwwwsssssssffflllrrrr";
		int r=0;
		int[] a= new int[s.length()];
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)==s.charAt(i+1))
             ++a[r];
             else {
            	 ++a[r];
            	 r++;
             }
		}
		a[r]++;
		
		for(int i:a)
			System.out.print(i);
		System.out.println();
		int i=0;
		r=0;
	    for(i=0; i<s.length()-1; i++){
	    	if(s.charAt(i) != s.charAt(i+1))
	    		System.out.printf("%c%d",s.charAt(i),a[r++]);
	    }
	    System.out.printf("%c%d",s.charAt(i),a[r]);
	}
}
