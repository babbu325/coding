//http://www.geeksforgeeks.org/find-next-smaller-next-greater-array/
package array;

import java.util.HashMap;

public class nextGretterNextSmaller {

	public static void main(String[] args) {

		int a[] = {4,8,2,1,9,5,6,3};
		
		int[] res = fun(a);
		for(int i:res)
			System.out.print(i+" ");
	}

	private static int[] fun(int[] a) {
		// 
		HashMap<Integer , Integer> hm1  = new HashMap<Integer , Integer>();
		HashMap<Integer , Integer> hm2  = new HashMap<Integer , Integer>();
		int st[] = new int[a.length];
		int top=-1;
		int n = a.length-1;
		st[++top]=a[n];
		hm1.put(a[n], -1);
		hm2.put(a[n], -1);
		for(int i=n-1;i>=0;i--){
			if(a[i] > st[top]){
				hm2.put(a[i], st[top]);
				
				while(a[i] > st[top]){
					top--;
					if(top==-1){ 
						hm1.put(a[i], -1);
						break;}
				}
				
				if(top!=-1)hm1.put(a[i], st[top]);
				st[++top]=a[i];
			}
			
			else{
				hm1.put(a[i],st[top]);
				st[++top]= a[i];
			}
		}
		
		int[] res = new int[a.length];
		for(int i=0;i<a.length;i++){
			if(hm1.get(a[i])==-1 )res[i]=-1;
			else res[i] = hm2.get(hm1.get(a[i]));
		}
		
		System.out.println(hm1);
		System.out.println(hm2);
		
		return res;
	}

}
