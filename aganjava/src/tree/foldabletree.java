package tree;

public class foldabletree {

	static Node root;
	public static void main(String[] args) {
		foldabletree tree = new foldabletree();
		tree.root = new Node(1);
		tree.root.l = new Node(1);
		tree.root.l.l = new Node(1);
		tree.root.l.l = new Node(1);
		tree.root.r = new Node(1);
		tree.root.r.r = new Node(1);
		if(foldable(root.l, root.r))System.out.println("yes");
		else System.out.println("no");
	}
	
	private static boolean foldable(Node r1, Node r2){
		if(r1==null && r2== null) return true;
		if(r1==null || r2== null) return false;
		
		return foldable(r1.l, r2.r) && foldable(r1.r, r2.l);
	}

}
