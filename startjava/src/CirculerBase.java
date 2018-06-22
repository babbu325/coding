import java.util.Scanner;

public class CirculerBase {

	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[][] c=new char[n][n];
		for(int i=0;i<n;i++)
	     {
			for(int j=0;j<n;j++)
				c[i][j]=sc.next().charAt(0);
	     }
		
				
				for(int i=0;i<c.length;i++)
				{
					for(int j=0; j<c[0].length; j++)
					{
						System.out.print(c[i][j]+" ");
					}
					System.out.println();
				}
				
				// System.out.println(m.length+" "+m[0].length);
				subMatrix(c , c.length, c[0].length);
			}

			private static void subMatrix(char[][] m, int r, int c) {
				// TODO Auto-generated method stub
				System.out.println();
				
				System.out.println(r+" "+c);
				int l[][]=new int[r][c];
				
				for(int i=r-1;i>=0;i--)
				{
					for(int j=c-1; j>=0; j--)
					{
						
						if(i+1 <=r-1 && j+1 <=c-1 && m[i][j]=='*')
						{
							//System.out.println("hi");	
							l[i][j]= 1+ Math.min(Math.min(l[i+1][j], l[i+1][j+1]), l[i][j+1]);
						}
						else 
						{
							if(m[i][j]=='*')
								l[i][j]=1;
							else l[i][j]=0;
						}
						//System.out.println("hi");
					}
				}
				//System.out.println("hi");
				for(int i=0;i<r;i++)
				{
					for(int j=0; j<c; j++)
					{
						System.out.print(m[i][j]+" ");
					}
					System.out.println();
				}
				
				System.out.println();
				for(int i=0;i<r;i++)
				{
					for(int j=0; j<c; j++)
					{
						System.out.print(l[i][j]+" ");
					}
					System.out.println();
				}
				
			}

		}
