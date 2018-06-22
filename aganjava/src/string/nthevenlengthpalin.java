package string;

import java.util.Scanner;

public class nthevenlengthpalin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			Long n = sc.nextLong();
			String palin = nthpalin(Long.toString(n));
			System.out.println(countnim(palin));
		}

	}

	private static int countnim(String palin) {
		int[] a = new int[10];
		for(int i=0;i<palin.length();i++){
			a[(int)palin.charAt(i)-48]++;
		}
		int count=0;
		int nm=0;
		for(int i=0;i<10;i++){
			if(a[i]>count){
				count = a[i];
				nm = i;;
			}
		}
		return nm;
	}

	private static String nthpalin(String n) {
		    String res = n;
            for (int j = n.length() - 1; j >= 0; --j)
            res += n.charAt(j);
		    return res;
		  }	
	}
