//http://www.geeksforgeeks.org/closest-leaf-to-a-given-node-in-binary-tree/
package tree;

class depth {
	boolean l=false;
	boolean r= false;
	int d =0;
	int h=0;
	tree node =null;
}
public class NearestLeaf {
	static tree getnode(int d){
		tree t= new tree();
		t.data=d;
		t.l=null;
		t.r=null;
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tree root = getnode(3);
		root.l = getnode(4);
		root.l.l = getnode(5);
		root.r = getnode(6);
		root.r.l = getnode(7);
		root.r.r = getnode(8);
		root.r.l.l = getnode(9);
		root.r.l.r = getnode(10);
		root.r.r.l = getnode(11);
		root.r.r.r = getnode(12);
		root.r.l.l.l = getnode(13);
		root.r.l.l.r = getnode(14);
		root.r.l.r.l = getnode(15);
		root.r.l.r.l = getnode(16);
		root.r.r.l.l = getnode(17);
		root.r.r.l.r = getnode(18);
		System.out.println(fun(root, 11));
		
		
		
	}
	private static int fun(tree root, int n){
		depth d= new depth();
		int h=0;
		 util1(root.l, n,d,'l',0);
		 util1(root.r, n,d,'r',0);
		 System.out.println("hig="+d.h +" , " + "root="+d.node.data+ " , side= "+ d.l+d.r );
		 tree t= d.node;
		 int res = fun1(t, 0);
		 System.out.println(min);
		 
		return 0;
	}

	static int min;
	WRONG SOLU
	private static int fun1(tree root, int d) {
		if(root.l==null && root.r==null){
			if(d < min) min = d;
		}
		if(root.l!=null)
		fun1(root.l, d+1);
		if(root.r!=null)
		fun1(root.r,d+1 );
		return min;
	}
	private static void util1(tree root, int n, depth d, char c, int h){
		if(root==null) return;
		if(root.data==n){
			if(c=='l')d.l=true;
			else d.r=true;
		d.h=h;
		 d.node=root;
		}
		util1(root.l, n, d, c,++h);
		util1(root.r, n, d, c,++h);
		return;
	}

}












