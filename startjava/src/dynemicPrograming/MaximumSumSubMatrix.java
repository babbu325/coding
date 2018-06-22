package dynemicPrograming;

public class MaximumSumSubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m={
				{ 1, 2,-1,-4,-20},
				{-8,-3, 4, 2, 1},
				{ 3,-8 ,10,1 ,3},
				{-4,-1, 1, 7, 6}
		};
		int r=m.length;
		int c=m[0].length;
		int[] res= new int[3];
		int sum=Integer.MIN_VALUE;
		int top=0,bot=0,left=0,rigth=0;
		
		for(int r1=0;r1<c;r1++)
		{
			int[] addrow= new int[c];
			for(int r2=r1;r2<c;r2++)
			{
				for(int i=0;i<r;i++)
					addrow[i]+=m[i][r2];
				res= kadane(addrow);
				
				if(res[0]>sum)
				{
					sum=res[0];
					top=res[1];
					bot=res[2];
					left=r1;
					rigth=r2;
				}
			}
		}
		
		System.out.println(sum);
		System.out.println(left +" "+ rigth);
		System.out.println(top +" "+ bot);
		
		

	}

	private static int[] kadane(int[] a) {
		// TODO Auto-generated method stub
		int[] res= new int[3];
		int sum=0;
		int s=0;
		int l=-1;
		int maxSum=Integer.MIN_VALUE;
		res[0]=Integer.MIN_VALUE;
		res[1]=0;
		res[2]=-1;
		
		for(int i=0;i<a.length;i++){
		 	sum+=a[i];
		 	l=i;
		 	
		 	if(sum<0){
		 		sum=0;
		 		s=i+1;
		 		l=i+1;
		 	}
		 	else if(sum<=res[0]){
		 		l=i;
		 	}
		 	else if(sum> res[0]){
		 		res[0]=sum;
		 		res[1]=s;
		 		res[2]=l;
		 	}
		}
		return res;
	}

}
