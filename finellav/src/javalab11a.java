import java.util.Scanner;

public class javalab11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		String n[]=new String[10];
		System.out.println("enter the names");
		for(int i=0;i<10;i++)
			n[i]=s.next();
			
			//for(int i=0;i<10;i++)
				//System.out.println(n[i]+"\t");
		System.out.println("enter the index:");
		int r=s.nextInt();
		
		try{
			
		 
		   
			System.out.println(n[r]+"\t");
			
			
						
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{System.out.println("asdfghj");
			
		}
		
	}

}
