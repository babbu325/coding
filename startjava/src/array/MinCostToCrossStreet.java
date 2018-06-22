//http://www.geeksforgeeks.org/minimum-initial-energy-required-to-cross-street/
package array;

public class MinCostToCrossStreet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,3,-7,4,-3,-5,7,8};
		
		int cur=0;
		int min=0;int flag=0;
		for(int i=0;i<a.length;i++){
			cur += a[i];
			if(cur<=0){
				min += 1+ Math.abs(cur);
				cur= 1;
				flag =1;
			}
		}
		System.out.println(min);
	}
}