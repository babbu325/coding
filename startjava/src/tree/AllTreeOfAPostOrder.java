//http://www.geeksforgeeks.org/find-all-possible-trees-with-given-inorder-traversal/
package tree;

public class AllTreeOfAPostOrder {

	static tree getnode(int d){
		tree t= new tree();
		t.l=null;
		t.r=null;
		t.data=d;
		return t;
	}
	public static void main(String[] args) {
		int a[] = {4,5,7};
		for(int i=0;i<a.length;i++){
			tree root = getnode(a[i]);
			fun(root,0,i-1,a);
		    fun(root, i+1 ,a.length-1, a);
		}
	}
	private static void pre(tree root) {
		// TODO Auto-generated method stub
		if(root==null) return ;
		System.out.print(root.data+" ");
		pre(root.l);
		pre(root.r);
	}	

	private static tree fun(tree node,int l, int r, int[]a){wrong ans
		// TODO Auto-generated method stub
		//System.out.println(l+" "+r);
		tree root = null;
		if(l>r){
			return root;
			}
		else{
			for(int i=l; i<=r; i++){
				root = getnode(a[i]);
				root.l = fun(node, l, i-1, a);
				root.r = fun(node, i+1, r, a);
			
			}
			pre(node);
		}
		return root;
	}
}