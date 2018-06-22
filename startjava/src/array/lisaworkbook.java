package array;

import java.util.Scanner;

public class lisaworkbook {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int ch=sc.nextInt();
		int q=sc.nextInt();
		int a[]=new int[ch+10];
		
		for(int i=1;i<=ch;i++)
			 a[i]=sc.nextInt();
		
		int count=1;
	    int p=1;
		int c=0;
		while(count <=ch)
		{
			int s=1;
			int e=q;
			for(int i=1;i<= a[count];i++)
			{
				if(i>=s && i<=e)
				{
					if(p==i)
						c++;
				}
				else if(i>e)
				{
					s=s+q;
					e=e+q;
					p++;
					if(p==i)
						c++;
				}
			}//end for		
		p++;
		count++;
		}//end while
	
		System.out.println(c);
	}

}
