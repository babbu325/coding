//http://www.geeksforgeeks.org/replace-every-element-with-the-least-greater-element-on-its-right/
package array;

public class ReplaceByMax {

	public static void main(String[] args) {
		int[] a= { 8, 58, 71, 18, 31, 32, 63, 92,43, 3, 91, 93, 25, 80, 28};
		int[] b=new int[a.length];
		b[a.length-1]=-1;
		for(int i=0; i< a.length;i++)
			System.out.printf("%d ", b[i]);
		System.out.println();
		
		for(int i=a.length-2; i>=0; i--){
			int j=i+1;
			int k=i;
			int key= a[i];
			while(a[j] < key){
				a[k++]=a[j++];
				if(j==a.length) break;
			}
			 a[j-1]=key;
			if(j==a.length)b[i]=-1;
			else b[i]=a[j];	
		}
		System.out.println();
		for(int i=0; i< a.length;i++)
			System.out.printf("%d ", a[i]);
		System.out.println();
		for(int i=0; i< a.length;i++)
			System.out.printf("%d ", b[i]);
		}
	}

