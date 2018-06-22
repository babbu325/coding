package array;
import java.util.Scanner;

public class maxSubarray {
	static int maximum(int a[],int n){
	  int maxf = Integer.MIN_VALUE;
	  int maxb=Integer.MIN_VALUE;
	  int m=1;
	  for(int i=0;i<n;i++){
		  m=m*a[i];
		  if(m==0)
			  m=1;
		  if(maxf<m)
			  maxf=m;
	  }
	  m=1;
	  for(int i=n-1;i>=0;i--){
		  m=m*a[i];
		  if(m==0)
			  m=1;
		  if(maxb<m)
			  maxb=m;
	  }
	  int max=Math.max(maxf,maxb);
		return Math.max(max, 0);
	}
	public static void main(String[] args){	
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{-40,-10,0,-33,69,0,90,4};
		int n=a.length;
		System.out.println(maximum(a,n));
	}
}