package array;

import java.util.Scanner;

public class circularArray {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int q=sc.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        while(q >0)
            {
            int r=sc.nextInt();
            System.out.println(a[((n-1)+r+k)%n]);
            q--;
        }


	}

}
