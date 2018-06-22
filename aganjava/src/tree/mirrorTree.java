package tree;

public class mirrorTree {
	static Node root1;
	static Node root2;
	public static void main(String[] args) {
		mirrorTree tree= new mirrorTree();
		
		tree.root1 = new Node(1);
		tree.root1.l = new Node(2);
		tree.root1.r = new Node(3);
		tree.root1.l.l = new Node(4);
		
		tree.root2 = new Node(1);
		tree.root2.l = new Node(3);
		tree.root2.r = new Node(2);
		tree.root2.r.r = new Node(4);
        
		if(mirror(root1,root2)) System.out.println("yes");
		else System.out.println("No");

	}
	private static boolean mirror(Node root12, Node root22) {
		if(root12 == null && root22 == null) return true;
		if(root12 == null || root22 == null) return false;
		
		return root12.d == root22.d && mirror(root12.l, root22.r) && mirror(root12.r, root22.l);
	}

}
