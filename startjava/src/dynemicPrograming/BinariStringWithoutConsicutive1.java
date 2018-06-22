package dynemicPrograming;

import java.util.Scanner;

public class BinariStringWithoutConsicutive1 {

	 static  long countStrings(int n)
	    {
	        long a[] = new long [n];
	        long b[] = new long [n];
	        a[0] = b[0] = 1;
	        for (int i = 1; i < n; i++)
	        {
	            a[i] = a[i-1] + b[i-1];
	            b[i] = a[i-1];
	        }
	        return a[n-1] + b[n-1];
	    }
	    /* Driver program to test above function */
	    public static void main (String args[])
	    {
	          System.out.println(countStrings(68));
	    }
	}/* This code is contributed by Rajat Mishra */