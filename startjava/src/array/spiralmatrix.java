package array;

public class spiralmatrix {

	public static void main(String[] args) {

		int a1[][]=new int[][]{
			               {1,2,3,4},
		                   {5,6,7,8},
			               {9,10,11,12},
			               {13,14,15,16}
		                     };
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++)
			System.out.printf("%d\t",a1[i][j]);
		System.out.println();
		}
		
		int t=0,l=0;
		int b=3,r=3;
		int dir=0;
		int c=-1;
		int a2[] = new int[16];
		
		while(t<=b && l<=r)
		{
			if(dir==0)
			{
				for(int i=l;i<=r;i++ )
					a2[++c]=a1[t][i];
				  t++;
				
			}
			if(dir==1)
			{
				for(int i=t;i<=b;i++ )
					a2[++c]=a1[i][r];
				  r--;
				
			}
			
			if(dir==2)
			{
				for(int i=r;i>=l;i-- )
					a2[++c]=a1[b][i];
				  b--;
				
			}
			
			if(dir==3)
			{
				for(int i=b; i>=t ;i-- )
					a2[++c]=a1[i][l];
				  l++;
				
			}
			
			dir=(dir+1)%4;
		}
		
		System.out.println();
		System.out.println();
		
			for(int j=0;j<16;j++)
			System.out.printf("%d\t",a2[j]);
		}
		
	}


