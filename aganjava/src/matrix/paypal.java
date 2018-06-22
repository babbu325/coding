package matrix;
import java.util.*;

public class paypal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r= sc.nextInt();
		int c=sc.nextInt();
		char[][] a = new char[r][c];
		for(int i=0;i<r;i++){
			String s = sc.next();
			for(int j=0;j<c;j++){
				a[i][j] = s.charAt(j);
			}
			}
		int[][] resM = calM(a, r,c);
		int max = findmax(resM,r,c);
		System.out.println(max);
		int[] arr = getA(resM, r,c,max);
		int[] last = finalDestination(arr, max);
		int q = sc.nextInt();
		while(q-- > 0){
			int k = sc.nextInt();
			System.out.println(last[k]);
		}
	}

	private static int[] finalDestination(int[] arr, int max) {
		for(int i=max-1; i>0; i--){
			arr[i] += arr[i+1];
		}
		for(int i=1;i<=max;i++)arr[i]+=arr[i-1];
		return arr;
	}

	private static int[] getA(int[][] resM, int r, int c, int max) {
		int[] a = new int[max+1];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(resM[i][j]!=0){
					a[resM[i][j]]++;
				}
			}
			System.out.println();
			}
		return a;
	}

	private static int findmax(int[][] resM, int r, int c) {
		 int res=0;
		 for(int i=0; i<r;i++)
			 for(int j=0;j<c;j++)
				 if(resM[i][j]>res) res=resM[i][j];
		return res;
	}

	private static int[][] calM(char[][] a, int r, int c) {
		int[][] res = new int[r][c];
		for(int i=0;i<r;i++)
			if(a[r-1][i]=='*')res[r-1][i]=1;
		for(int i=0;i<r;i++)
			if(a[i][c-1]=='*') res[i][c-1]=1;
		
		for(int i=r-2; i>=0;i--){
			for(int j=c-2;j >=0;j--){
				if(a[i][j]=='*')res[i][j]=1+Math.min(res[i][j+1], Math.min(res[i+1][j], res[i+1][j+1]));
			}
		}
		return res;
	}

}