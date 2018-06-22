//http://www.geeksforgeeks.org/maximum-sum-iarri-among-rotations-given-array/
package array;

public class MaxSumOfAllRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] a= {8,3,1,2};
		for(int i =0;i<a.length;i++)
			sum += a[i];
		
		int val=0;
		for(int i =0;i<a.length;i++)	
			val += i* a[i];
		
		System.out.println(sum+" "+val);
		
		int res= val;
		for(int i=1;i<a.length;i++){
			
			int cval = val-(sum - a[i-1])  + a[i-1] * (a.length-1);
			val=cval;
			
			res= Math.max(res, cval);
		}
		
		System.out.println(res);
	}

}
