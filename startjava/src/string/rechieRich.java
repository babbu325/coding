package string;
import java.util.Scanner;

public class rechieRich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
	
		char[] a=new char[n];
		String s=sc.next();
		a=s.toCharArray();
		
		int i=0;
		int c=0;
		int j=a.length-1;
		int[] index=new int[n];
		while(i<=j && c<k)
		{	
			if(a[i] != a[j] )
			 {
		       if(a[i]>a[j])
                    a[j]=a[i];
		       else a[i]=a[j];
		       
		    	   c++;
		    	   index[i]=1;
			}
			i++;
			j--;
		}

		
		i=0;
		j=a.length-1;
		while(c<k && i<=j)
		{
			if(a[i]!='9' && a[j]!='9')
			{
				if(index[i] == 1)
					{
					a[i]='9';
				    a[j]='9';
				    c++;
				}
				else if(k-c>1)
				{
					a[i]='9';
				    a[j]='9';
				    c=c+2;
				}
			}
			i++;
			j--;
	 }
		if(c<k)
		{
			if(a.length%2 != 0)
				a[a.length/2]='9';
		}
		
		 i=0;
		 c=1;
		 j=a.length-1;
		 
		while(i<=j)
		{
		if(a[i++]!=a[j--])
			c=0;
	}

		if(c==1){
			for(i=0;i<a.length;i++)
				System.out.printf("%c",a[i]);
		}
		else System.out.println("-1");
}
}