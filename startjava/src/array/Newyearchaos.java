package array;

import java.util.Scanner;

public class Newyearchaos {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		//int n=sc.nextInt();
		
		
		
		while(t>0) {
			int n=sc.nextInt();	
			int a[]=new int[n+1];
			
		for(int i=1;i<=n;i++)
		 a[i]=sc.nextInt();
		
		int c=0;
		
		for(int i=1;i<=n;i++){
			if( !( (a[i]>i && a[i]<=i+2) ||  ( a[i]<i && a[i]>=i-2))   )
		      c=-1;
		}
		
		if(c==0)
		for(int i=1;i<=n;i++)
		{
			if(  (a[i]!=i) ){
				        int temp=a[i];
			         	a[i]=a[temp];
				        a[temp]=temp;
				        c++;
			}
			
		}
		if(c >= 0)
		System.out.println(c);
		else 
			System.out.println("Too chaotic");
			
		
	}
t--;

}
}