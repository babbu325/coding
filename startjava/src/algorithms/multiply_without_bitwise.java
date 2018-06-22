package algorithms;

public class multiply_without_bitwise {

     static int cal(int i, int j) {
		
		if( j==0 )return 0;
		 
		else if(j>0)
			return (i+ cal(i,j-1));
		else 
			return -(cal(i,-j));
		
		
		//return j;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int r=	cal(4,-7);
		System.out.printf("%d",r);

	}

	 

}
