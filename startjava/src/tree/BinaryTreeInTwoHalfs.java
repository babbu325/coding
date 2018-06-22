//http://www.geeksforgeeks.org/check-if-removing-an-edge-can-divide-a-binary-tree-in-two-halves/
package tree;

class f{
	boolean flag;
	int v=0;
}
public class BinaryTreeInTwoHalfs {
	static tree getnode(int d){
		tree t= new tree();
		t.l=null;
		t.r=null;
		t.data=d;
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tree root= getnode(1);
		root.l = getnode(2);
	    root.l.l= getnode(4);
	    root.l.r= getnode(4);
	    root.r= getnode(3);
		root.r.l= getnode(6);
		//root.r.r= getnode(7);
		int n = count(root);
		System.out.println(n);
		
		f flag =new f();
		check(root,n,flag);
		System.out.println(flag.flag+" "+ flag.v);	
	}
	
	
	private static int check(tree root, int n, f flag) {
		if(root == null) return 0;
		
		int c= check(root.l,n ,flag) + 1 + check(root.r,n, flag);
		if(c==n-c){
			flag.flag = true;
			flag.v=root.data;
		}
		return c;
	}
	private static int count(tree root) {
		if(root==null) return 0;
		return 1+ count(root.l) + count(root.r);
	}
}