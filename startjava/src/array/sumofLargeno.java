package array;

import java.util.Scanner;

public class sumofLargeno {

	public static void main(String[] args) {
		
		        Scanner in = new Scanner(System.in);
		        int n = in.nextInt();
		        long  arr[] = new long[n];
		        for(int i=0; i < n; i++){
		            arr[i] = in.nextLong();
		        }
		        long  sum=0;
		        for(int i=0 ; i<n ; i++)
		            sum+=arr[i];
		        
		        System.out.println(sum);
		    }
		


	}


