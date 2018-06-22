package tree;

public class deleteNode {

	static void inorder(Node root){
		if(root==null) return;
		inorder(root.l);
		System.out.print(root.d+" ");
		inorder(root.r);
	}
	
	static Node delete(Node root, int data){
		if(root==null) return root;
	
		if(root.d < data) root.l = delete(root.l, data);
		else if(root.d > data) root.r = delete(root.r, data);
		else{
			if(root.l==null) return root.r;
			else if(root.r==null) return root.l;

			root.d = findSuccessor(root.r);
			root.r = delete(root.r, root.d);
		}
		return root;
	}
	
	static int findSuccessor(Node root){
		while(root.l!= null) root=root.l;
		return root.d;
	}
	
	static Node root;
	public static void main(String[] args) {
		deleteNode tree = new deleteNode();
		root = new Node(1);
		root.l = new Node(2);
		root.l.l = new Node(3);
		root.l.r = new Node(4);
		root.r = new Node(5);
		root.r.r = new Node(6);
		root.r.l = new Node(7);
		root.r.r.r = new Node(8);
		inorder(root);
		System.out.println();
		delete(root,2);
		inorder(root);

	}

}
