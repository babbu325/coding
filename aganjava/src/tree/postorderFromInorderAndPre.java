package tree;

import java.util.Arrays;

public class postorderFromInorderAndPre {

	public static void main(String[] args) {
		int[] in = {4,2,5,1,3,6};
		int[] pre = {1,2,4,5,3,6};
		postOrder(in,pre,in.length);
	}
	
	private static void postOrder(int[] in, int[] pre, int n) {
		int i = search(in,pre[0],n);
		
		if(i!=0) postOrder(in, Arrays.copyOfRange(pre, 1,n), i);
		if(i!=n-1) postOrder(Arrays.copyOfRange(in, i+1, n), Arrays.copyOfRange(pre, i+1, n), n-i-1);
		System.out.print(pre[0]+" ");
		
	}

	private static int search(int[] in, int pre, int n){
		for(int i=0; i<n; i++)
			if(pre==in[i]) return i;
		return -1;
	}

}
