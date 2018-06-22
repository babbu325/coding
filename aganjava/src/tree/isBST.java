package tree;

class check111111{
	boolean isbst = true;
	int check = Integer.MIN_VALUE;
}

public class isBST {
	Node root;
	 void isbstUtil(Node root, check111111 check){
		if(root==null)return;
		isbstUtil(root.l, check);
		System.out.println(check.check+" "+root.d+ " "+ check.isbst);
		if(root.d > check.check)check.check = root.d;
		else {
			check.isbst=false;
			return;
		}
		isbstUtil(root.r, check);
		return;
	}
	
	void isbst(Node root){
		check111111 check = new check111111();
		isbstUtil(root, check);
		System.out.println(check.isbst);
	}
	
	public static void main(String[] args) {
		isBST tree = new isBST();
		tree.root = new Node(20);
		tree.root.l = new Node(10);
		tree.root.l.l = new Node(5);
		tree.root.l.r = new Node(15);
		tree.root.r= new Node(40);
		tree.root.r.l = new Node(30);
		tree.root.r.r = new Node(50);
		tree.isbst(tree.root);
		
	}
}