//http://www.geeksforgeeks.org/maximum-consecutive-increasing-path-length-in-binary-tree/
package tree;

 class lev{
	 int l=0;
 }
public class MaxConsicutivePath {
	static tree getnode(int d)
	{
		tree t=new tree();
		t.data=d;
		t.l=null;
		t.r=null;
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree root =  getnode(6);
		 root.l =  getnode(5);
		 root.l.l =  getnode(4);
		root.r =  getnode(8);
		 root.r.l =  getnode(7);
		root.r.r =  getnode(9);
		root.r.r.r =  getnode(10);
		System.out.println(fun(root));
	
	}
	private static int fun(tree root) {
		// TODO Auto-generated method stub
		return    1 + Math.max(util(root.l, root.data, 0) , util(root.r, root.data, 0));
	}
	static int max=0;
	private static int util(tree root, int d, int le){
		// TODO Auto-generated method stub
		if(root == null) return 0;
		lev l= new lev();
		if(root.data==1+d) l.l=le+1;
		else l.l=0;
		if(l.l>max) max=l.l;
		util(root.l, root.data, l.l);
		util(root.r, root.data, l.l);
	    return max;
	}
}