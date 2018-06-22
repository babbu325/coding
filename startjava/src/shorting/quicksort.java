package shorting;

import java.util.Scanner;

public class quicksort {
	private static int partition(int[] a, int s, int e) {
		int pi=s;
		int piv=a[e];
		for(int i=s;i<e;i++){
			if(a[i] <= piv){
				int t=a[i];
				a[i]=a[pi];
				a[pi]=t;
				pi++;
			}
		}
		int t=a[pi];
		a[pi]=a[e];
		a[e]=t;
		return pi;
	}
      
	 static void quick(int[] a,int s,int e) {
		if(s<e){
			int p=partition(a,s,e);
			quick(a,s,p-1);
			quick(a,p+1,e);	
		}
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int a[] = {8,7,-6,0 ,4, 1, 6,-4 };
		int n = a.length;
		for(int i:a)
			System.out.printf(i+" ");
		quick(a,0,n-1);
		System.out.println("\nAfter sorting:");
		for(int j:a)
			System.out.printf(j+" ");
	}
}
