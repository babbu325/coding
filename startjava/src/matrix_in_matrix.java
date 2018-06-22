import java.util.Random;
import java.util.Scanner;

public class matrix_in_matrix {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		int[][] a = new int[10][10];
		Scanner s = new Scanner(System.in);
		Random rn = new Random();
		
		System.out.println("This is  10 BY 10 matrix ");
		 
		for(int i = 0 ; i < 10 ; i++){
			for(int j=0 ; j < 10 ; j++)
			{
				a[i][j]= Math.abs((rn.nextInt()) % 100);
			}
		}
		
		for(int i = 0 ; i < 10 ; i++){
			for(int j=0 ; j < 10 ; j++)
			{
				System.out.printf(a[i][j]+"\t");
			}
			System.out.println("\n");
	}
		System.out.println("\n\t\n i,j should be in clockwise order starting from north-west corner"); 
		
			System.out.println("Enter i1 , j1\t:");
			int i1=s.nextInt();
			int j1=s.nextInt();
			
			System.out.println("Enter i2 , j2\t:");
			int i2=s.nextInt();
			int j2=s.nextInt();
			
			System.out.println("Enter i3 , j3\t:");
			int i3=s.nextInt();
			int j3=s.nextInt();
			
			System.out.println("Enter i4 , j4\t:");
			int i4=s.nextInt();
			int j4=s.nextInt();
			
			if(i1 == i2 || i3 == i4 || j1 == j4 || j2 == j3)
			{
			int	r1=getSum(i1-1,j1-1, a);
			int	r2=getSum(i2-1,j2, a);
			int	r3=getSum(i3,j3, a);
			int	r4=getSum(i4,j4-1, a);
			int res= (r3-(r2+r4) + r1);
			System.out.println("\n\n\t\t" + res);
			
			}
			
			else System.out.println("i and j are nor in order:");

	}

	private static int getSum(int x, int y, int[][] a) {
	   int sum=0;
	    
	   for(int i=0; i <= x ; i++)
       for(int j = 0 ; j <= y ; j++)
	   sum+=a[i][j];
	    	
		return sum;
	}

}





