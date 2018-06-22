//http://www.geeksforgeeks.org/maximum-value-k-such-that-array-has-at-least-k-elements-that-are-k/
package array;

public class seeMe {

	public static void main(String[] args){
int[] a= {10,2,3,4,6,2,4,5,6,8,2};
int f[] = new int[a.length+1];
for(int i=0;i<a.length;i++){
	if(a[i]>=a.length)f[a.length]++;
	else f[a[i]]++;
}
for(int i:f)System.out.print(i);
int i=0;
for(i=f.length-1;i>0;i--){
	if(f[i]<i)f[i-1]+=f[i];
	else break;
}
System.out.println();
System.out.print(i);

	}

}
