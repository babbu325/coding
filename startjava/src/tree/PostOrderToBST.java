//http://www.geeksforgeeks.org/construct-a-binary-search-tree-from-given-postorder/
package tree;

class ind{
	int i=0;
}
public class PostOrderToBST {
	static tree getnode(int d){
		tree t=new tree();
		t.data=d;
		t.l=null;
		t.r=null;
		return t;
	}
	public static void main(String[] args){
		int[] post = {5,8,6,12,14,10};
		tree root = fun(post, post.length);
	    inorder(root);
	}
	private static void inorder(tree root) {
		// TODO Auto-generated method stub
		if(root==null)return;
		
		System.out.print(root.data+" ");
		inorder(root.l);
		inorder(root.r);
		
	}
	private static tree fun(int[] post, int length) {
		// TODO Auto-generated method stub
		ind i = new ind();
		i.i=length-1;
		return util(post ,i, post[i.i], Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	private static tree util(int[] post, ind i, int val, int min, int max){
		if(i.i < 0) return null;
		tree root=null;
		if( val > min &&  val <max){
			
			root = getnode(val);
			i.i--;
			if(i.i>=0){
				root.r = util(post , i , post[i.i] , val, max);
				root.l = util(post , i , post[i.i] , min, val);
			}//if
		}//if
		return root;
	}//util
}//amin
