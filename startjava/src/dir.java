import java.util.Scanner;
import java.util.Stack;

public class dir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		
		while(t-- > 0){
			int n= sc.nextInt();
			int m= sc.nextInt();
			int[][] a= new int[3][n];
			for(int i=0;i<m;i++){
				
				int r= sc.nextInt();
				int c1=sc.nextInt();
				int c2=sc.nextInt();
				
				for(int j=c1-1; j<c2;j++)
					a[r-1][j] = 1;
			}
			
			/*for(int i=0;i<3;i++){
				for(int j=0;j<n;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}*/
			
			
			System.out.println(area(a , n));
			
		}
		
		
	}

	private static int area(int[][] a, int n) {
	    int result = maxHist(a[0], n);
	 
	    for (int i = 1; i < 3; i++)
	    {
	        for (int j = 0; j < n; j++)
	            if (a[i][j]==1) a[i][j] += a[i - 1][j];
	        result = Math.max(result, maxHist(a[i], n));
	    }	
		return result;
	}

	private static int maxHist(int[] is , int n) {
	
		 Stack<Integer> result = null;
		    int top;
		 
		    int ma=0;
		    int area = 0;
		    int i = 0;
		    while (i < n)
		    {
		    	if(result.lastElement()!=null);
		    	int  k=result.lastElement();
		        if (result.empty() || is[k] <= is[i])
		        {	result.push(k);
		            result.push(i++);
		        }
		        else
		        {
		 
		            top = is[result.lastElement()];
		            result.pop();
		            area = top * i;
		 
		            if (!result.empty())
		                area = top * (i - result.lastElement() - 1 );
		            ma = Math.max(area, ma);
		        }
		    }
		    while (!result.empty())
		    {
		        top = is[result.lastElement()];
		        result.pop();
		        area = top * i;
		        if (!result.empty())
		            area = top * (i - result.lastElement() - 1 );
		 
		        ma = Math.max(area, ma);
		    }
		    return ma;
	}

}
