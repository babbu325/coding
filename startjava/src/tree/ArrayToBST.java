//http://www.geeksforgeeks.org/convert-normal-bst-balanced-bst/
package tree;

public class ArrayToBST {
	static tree getnode(int d){
		tree t=new tree();
		t.data=d;
		t.l=null;
		t.r=null;
		return t;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,6,7,8,9};
		tree h = makeTree(a, 0,a.length-1);
		pre(h);
		System.out.println();
		System.out.print(h.data+" ");
		
	}

	private static void pre(tree h) {
		if(h==null) return;
		pre(h.l);
		System.out.print(h.data+" ");
		pre(h.r);
	}

	private static tree makeTree(int[] a, int s, int e){
		
		if(s>e)return null;
		int mid = (s+e)/2; 
		tree root= getnode(a[mid]);
		root.l= makeTree(a, s,mid-1);
		root.r= makeTree(a, mid+1, e);
		return root;
	}
}
