package string;

import java.util.Arrays;
import java.util.Collections;

public class sortString {

	public static void main(String[] args) {
		int[] a = {621,234,60};
		String[] s = new String[a.length];
		for(int i=0; i<a.length; i++) s[i] = Integer.toString(a[i]);
		for(int i=0; i<s.length; i++) System.out.print(s[i]+" ");
		Arrays.sort(s,Collections.reverseOrder());
		System.out.println();
		for(int i=0; i<s.length; i++) System.out.print(s[i]+" ");
	}

}
