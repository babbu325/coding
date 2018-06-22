
/*
 * find length of path of consecutive no.
 * in any direction , given no. are not repeated
 * ..this is another question 
 * */

package tree;

public class LongestConsicutiveSequence {

  static tree getnode(int d){
		tree t= new tree();
		t.data=d;
		t.l=null;
		t.r=null;
		return t;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree root =  getnode(1);
		 root.l =  getnode(1);
		 root.l.r =  getnode(1);
		root.r =  getnode(8);
		 root.r.l =  getnode(7);
		root.r.r =  getnode(9);
		root.r.r.r =  getnode(10);
		System.out.println(fun(root));
	}
	private static int fun(tree root) {
	return 1+ (util(root.l,root.data)+ util(root.r, root.data));
	}
	private static int util(tree root, int data) {
		if(root==null) return 0;	
		if( Math.abs(root.data-data)==1)
			return 1 + Math.max(util(root.l,root.data) , util(root.r, root.data ));
		
		else return (util(root.l,root.data)+ util(root.r, root.data));
	}
}