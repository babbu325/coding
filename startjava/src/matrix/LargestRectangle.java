package matrix;

import java.util.Scanner;

public class LargestRectangle {


	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	       //int n= sc.nextInt();
	        //
	       //int[] a = new int[n];
	        //for(int i=0;i<n;i++)
	          //  a[i]=sc.nextInt();
	        int[][] m = {
	        		{0,0,0,1,0,0},
	        		{1,1,0,1,1,1},
	        		{1,1,1,1,1,1},
	        		{1,1,1,0,1,1},
	        		{0,0,0,1,1,1}
	        };
	        int[] a=m[0];
	        int max = fun(a);
	        
	        for(int i=1;i<m.length;i++){
	        	for(int j=0;j<m[0].length;j++)
	        	{
	        		if(m[i][j]==0)a[j]=0;
	        		else a[j] = a[j]+m[i][j];
	        	}
	        	max = Math.max(max, fun(a));
	        }
	        
	        System.out.println(max);
	  		}

	    
	    
		private static int fun(int[] a) {
			// TODO Auto-generated method stub
			int max=0;
			int i=0,area=0;
			int[] ind  = new int[a.length];
			int[] val  = new int[a.length];
			int topi=0;
			int topv=0;
			ind[0] = 0;
			val[0] = a[0];
			
			for(i=1;i<a.length;i++){
				
				if(a[i]>=val[topv])
				{
					val[++topv] = a[i];
					ind[++topi]=i;
				}
				
				else{
					while(val[topv]>=a[i] ){
						area = val[topv]*(i-ind[topi]);
						max = Math.max(max, area);
						topv--;
						topi--;
						if(topv==-1 || topi==-1)break;
					}
					val[++topv]=a[i];
					topi++;
				}//else
			}//for
			
			while(topv>=0 &&topi>=0){
				area = val[topv]*(i-ind[topi]);
				max = Math.max(max, area);
				topv--;
				topi--;	
			}
			return max;
		}
}