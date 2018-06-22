package array;

import java.util.Scanner;

public class greatest_number_in_digit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[10];
		int k=0;
		while(n>0)
		{
			int rem=n%10;
			a[k++]=rem;
			n=n/10;
			
		}
		
		int max=a[0];
		int d=0;
		for(int i=0;i<k;i++)
		{
			if(max < a[i])
			{max=a[i];
			d=i;}
		}
    
		
		System.out.println(max +" "+ (k-d));
	}

}
