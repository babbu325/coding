package array;

public class Duplicate {

	public static void main(String[] args) {		
		int[] a= {4,3,4,1,2,3,6,6,1};
		for(int i=0;i<a.length;i++){
			if(a[Math.abs(a[i])] >=0)
				a[Math.abs(a[i])] = -a[Math.abs(a[i])];
			else 
				System.out.printf("%d\t",Math.abs(a[i]));
		}
	}
}