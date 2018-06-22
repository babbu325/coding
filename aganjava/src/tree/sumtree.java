package tree;

class mvvvgighhhmmmmuhu{
	boolean c=true;
}

public class sumtree {
	Node root;
	 mvvvgighhhmmmmuhu sum;
	 
	private int fun(Node root, mvvvgighhhmmmmuhu s) {	
		if(root==null) return 0;
		if(root.l==null && root.r==null) return root.d;
		int l = fun(root.l,s);
		int r = fun(root.r,s);
		if(!(l+r ==root.d)){
			s.c=false;
		}
		return l+r;
	}
	
	public static void main(String[] args) {
		sumtree tree = new sumtree();
		tree.sum = new mvvvgighhhmmmmuhu();
		tree.root = new Node(42);
		tree.root.l = new Node(18);
		tree.root.r = new Node(24);
		tree.root.l.l = new Node(9);
		tree.root.l.r = new Node(9);
		tree.root.l.r.r = new Node(5);
		tree.root.l.r.l = new Node(4);
		tree.root.r.l = new Node(16);
		tree.root.r.r = new Node(8);
		tree.root.r.r.l= new Node(8);
		tree.fun(tree.root, tree.sum);
		System.out.println(tree.sum.c);
	}
}
