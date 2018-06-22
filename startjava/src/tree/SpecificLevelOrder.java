//http://www.geeksforgeeks.org/perfect-binary-tree-specific-level-order-traversal-set-2/
package tree;

public class SpecificLevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( ( Math.log(16) / Math.log(2)));
		
		
		int[] a= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int n=4;
		int j= 14;
		int i= 7;
		
		while(n>0){
			
			while(j>=i){
				System.out.printf("%d\t%d\t", a[i], a[j]);
				i++;j--;
			}
			n--;
			j=(int)Math.pow(2, n)-2;
			i=(int)Math.pow(2, n-1)-1;
			
		}
		
	}
}
