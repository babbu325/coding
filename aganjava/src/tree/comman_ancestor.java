package tree;

public class comman_ancestor {

	Node root;
	Node fun(int n1, int n2){
		return fun2(root, n1 ,n2);
	}
	
	Node fun2(Node node, int n1, int n2){
		if(node==null) return null;
		
		if(node.d==n1 || node.d==n2)return node;
		
		Node lf = fun2(node.l, n1, n2);
		Node rt = fun2(node.r, n1, n2);
		
		if(lf != null && rt != null)return node;
		
		return (lf!= null)? lf:rt;
	}
	public static void main(String[] args) {
		comman_ancestor tree = new comman_ancestor();
		tree.root = new Node(1);
		tree.root.l = new Node(2);
		tree.root.l.l = new Node(3);
		tree.root.l.r = new Node(4);
		tree.root.r = new Node(5);
		tree.root.r.l = new Node(6);
		System.out.println(tree.fun(3,1).d);
		
		
	}

}
