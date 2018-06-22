package array;
public class OddOccuring {
	public static void main(String[] args){
		int[] a={1,2,3,4,5,1,2,3,4,5,3}; 
		int r=a[0];
		for(int i=1;i<a.length;i++) r = r^a[i];
		System.out.println(r);}
	}