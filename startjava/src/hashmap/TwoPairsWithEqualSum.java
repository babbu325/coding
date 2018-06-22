package hashmap;

import java.util.HashMap;

public class TwoPairsWithEqualSum {

	class pair{
		int i;
		int j;
		pair(int f,int l)
		{
			i=f;
			j=l;
		}
	};

	private  void getpair(int[] a) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,pair>hm =new HashMap<Integer,pair>();
		int s=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				s=a[i]+a[j];
				if(hm.containsKey(s))
				{
					pair p=hm.get(s);
					System.out.print(p.i+" "+p.j+" ");
					System.out.println("and "+ i+" "+j);
				}
				else
				{   //pair p=new pair(i,j);
					hm.put(s,new pair(i,j));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,4,7,1,2,9,8};
		TwoPairsWithEqualSum ob=new TwoPairsWithEqualSum();
		ob.getpair(a);
	}
}
