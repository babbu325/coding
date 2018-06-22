package hashmap;
import java.util.HashMap;
public class SubArrayGivesGivenSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//given a array, find the no. of pairs thar gives the given sum;
		
		int [] a={10,12,10,15,-1,7,6,5,4,2,1,1,1};
		int sum=11;
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			hm.put(a[i],hm.get(a[i])+1);
			else hm.put(a[i],1);
		}
		int r=0;
		System.out.println(hm);
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(sum-a[i]))
				r += hm.get(a[i]) * hm.get(sum-a[i]);
			    hm.put(a[i],0);
			    hm.put(sum-a[i],0);
		}
		System.out.println(r);
	}
}