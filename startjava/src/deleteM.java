import java.util.Arrays;
import java.util.HashMap;

public class deleteM {

	public static void main(String[] args) {
		int[] a = {5,5,5,4,4,3,3,3,3,2,2,2,2,2};
		int[] h = new int[10];
		for(int i=0;i<a.length;i++)
			h[a[i]]++;
		for(int i:h)System.out.print(i+" ");
		String s = Arrays.toString(h);
		System.out.println();
		System.out.print(s);
		Arrays.sort(h);
		for(int i:h)System.out.print(i+" ");
	}
}