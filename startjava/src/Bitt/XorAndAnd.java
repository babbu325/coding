//http://www.geeksforgeeks.org/print-first-n-numbers-with-exactly-two-set-bits/
package Bitt;

public class XorAndAnd {

	public static void main(String[] args) {
		int n=6;
		int x=0;
		while(true){
			
			int y=0;
			x++;
			while(y<x){
				System.out.println((int) (Math.pow(2, x) + Math.pow(2, y)));
				n--;
				y++;
				if(n==0) return;
			}
		}
	}
}
