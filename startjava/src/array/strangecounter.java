package array;

import java.util.Scanner;

public class strangecounter {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        long m=1;
        long c=3;
        long d=3;
        while(m!=t)
        {
        	if(c==1)
        	{
        		c=d*2;
        		d=c;
        	}
        	else c--;
        	m++;
        	
        	
        }
        System.out.println(c);
	}

}
