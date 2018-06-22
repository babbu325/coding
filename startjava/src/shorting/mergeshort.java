package shorting;

import java.util.Scanner;

public class mergeshort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arry size");
		int n=sc.nextInt();
		
		int[] a=new int[n];
		System.out.println("enter the arry element:");
		for(int i=0;i<n;i++)
		{
			a[i]=(int) sc.nextInt();
		}
		for(int i:a)
			System.out.printf(i+" ");
		
		merge(a);
		
		System.out.println("\nAfter sorting:");
		for(int i:a)
			System.out.printf(i+" ");
		

	}

	private static void merge(int[] a) {
		 int length=a.length;
		 if(length<2) return;
		 
		 int mid=length/2;
		 int[] l=new int[mid];
		 int[] r=new int[length-mid];
		 
		 for(int i=0;i<mid;i++)
			 l[i]=a[i];
		 for(int i=mid;i<length;i++)
			 r[i-mid]=a[i];
		 merge(l);
		 merge(r);
		 
		 recursion(a,l,r);
		 
	}

	private static void recursion(int[] a, int[] l, int[] r) {
		int ll=l.length;
		int lr=r.length;
		int i=0,j=0,k=0;
		
		while(i<ll && j<lr)
		{
			
			if(l[i] < r[j])
			{
				a[k]=l[i];
				i++;
				k++;
			}
			
			else {
				a[k]=r[j];
				k++;
				j++;
				
			}
			
		}
		
		while(i<ll)
			a[k++]=l[i++];
		while(j<lr)
			a[k++]=r[j++];
		
	}
}
