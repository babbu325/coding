//http://algorithms.tutorialhorizon.com/construct-a-binary-tree-from-given-inorder-and-postorder-traversal/
package tree;

import java.util.ArrayList;
import java.util.Comparator;
class P{
	int pos;
}
public class InorderAndPostToTree {

	static tree getnode(int d)
	{
		tree t=new tree();
		t.data=d;
		t.l=null;
		t.r=null;
		return t;
	}
	public static void main(String[] args){
		ArrayList<Integer> in= new ArrayList<Integer>();
		int[] ino={4,2,5,1,6,3,7};
		for(int i=0;i<ino.length;i++)
			in.add(ino[i]);
		int[] post = {4,5,2,6,7,3,1};
		tree root = fun(post, in);
		pre(root);
	}

	private static void pre(tree root) {
		// TODO Auto-generated method stub
		if(root==null)return;
		pre(root.l);
		System.out.print(root.data+" ");
		pre(root.r);
	}
	private static tree fun(int[] post, ArrayList<Integer> in){
		P a= new P();
		a.pos = post.length-1;
		tree root = getnode(post[a.pos]);
		a.pos--;
		System.out.println(a.pos +" " + root.data+" ");//--------------
		root.r = util(post, in ,a, in.indexOf(post[a.pos+1])+1 , post.length-1);
		root.l = util(post, in ,a, 0 , in.indexOf(post[a.pos+1])-1 );
		return root;
	}
	
	private static tree util(int[] post, ArrayList<Integer> in,P a, int i, int j) {
	    tree root = null;
	    //------------------
		if(a.pos>=0 && i<= j){
			System.out.println(i + " " +j);
			int k = in.indexOf(post[a.pos]); 
			if(k>=i && k <=j){
				root = getnode(post[a.pos--]);
				root.r = util(post , in , a,k+1 ,j );
				root.l = util(post , in , a,i, k-1 );
			}
		}
		else return root;;
		return root;
	}
}