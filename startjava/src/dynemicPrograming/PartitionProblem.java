package dynemicPrograming;


public class PartitionProblem {

	boolean partition(int[] a,int s)
	{
		int[][] l= new int[s/2+1][a.length];
		for(int i=0;i<a.length;i++)
			l[0][i]=0;
		
		for(int i=1;i<s/2+1;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				
				
				
				
			}
			
			
		}
		
		
		
		
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartitionProblem p=new PartitionProblem();
		
		int[] a={4,5,6,7,8,22,12,3,11,9};
		int s=0;
		for(int i:a)
			s+=a[i];
		
		if(s%2!=0)
			System.out.println("false");
		else 
			System.out.println(p.partition(a,s));
	}
}