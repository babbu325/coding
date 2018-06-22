import java.util.Scanner;

public class javalab3a {

	public static void main(String[] args) {
		

		int a,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the marks:");
		try
		{
		
		a=obj.nextInt();
		if(a < 20)
			throw new markseligible(a);
		else System.out.println("marks ok");
		b=obj.nextInt();
		if(b<20)
			throw new markseligible(b);
		else System.out.println("marks ok");
	}
		
		
		
		catch(markseligible o){ o.pe();	}
		
		
		}
		
		
	}

class markseligible extends Exception
{
int n;
public markseligible(int n)
{this.n=n;}
public void pe()
{
	
System.out.println("number is"+n);

}

}
