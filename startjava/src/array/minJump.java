package array;

import java.util.Scanner;

public class minJump {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		int i=0;
		int  count=0;
		
		while(i<n){
			if(i==n-2 || i==n-3)
			{
				count++;
				break;
			}
			
			else if(a[i+2]==0 && i<n)
			{
				i+=2;
				count++;
			}
			
			else if(a[i+1]==0 && i<n)
			{
			i=i+1;
			count++;
			}
		}
		System.out.println(count);

	}

}
