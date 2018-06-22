//http://www.geeksforgeeks.org/print-all-subarrays-with-0-sum/

package array;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArrayWithSum0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,-3,1,2,-3};
		
		 int n= a.length;
		 System.out.println(n);
		HashMap<Integer ,Integer> hm=new HashMap<Integer,Integer>();
		int i=0;int sum=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		int[] ha=new int[n];
		
		while(i < n)
		 { 
			sum += a[i];
			if(hm.containsValue(sum))
			{
			   	for(int j=0;j<i;j++)
			   	{
			   		if(ha[j]==sum)
			   			System.out.println(j+1+" "+ i);
			   	}
				
			}
			if(sum==0)
				System.out.println(0+" "+i);
		    hm.put(i, sum);
		    ha[i]=sum;
			 i++;
		 }
	}
}
