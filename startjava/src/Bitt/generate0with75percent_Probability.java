//http://www.geeksforgeeks.org/generate-0-1-25-75-probability/
package Bitt;

import java.util.concurrent.ThreadLocalRandom;

public class generate0with75percent_Probability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++){
			System.out.print(ThreadLocalRandom.current().nextInt(0, 2));
		}

		System.out.println();
		
		//System.out.println(ThreadLocalRandom.current().nextInt(0, 49 + 1));
	}

	private static int rnd() {
		// TODO Auto-generated method stub
		return r()^r();/wrong
	}

	private static int r() {
		// TODO Auto-generated method stub
		return ThreadLocalRandom.current().nextInt(0,2)&1;
	}

}
