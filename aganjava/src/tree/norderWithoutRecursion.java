package tree;

public class norderWithoutRecursion {
	
	static Node root ;
	static int[] a = new int[20];
	static int i=0;
	public static void main(String[] args) {
		norderWithoutRecursion  tree = new norderWithoutRecursion();
		tree.root = new Node(1);
		tree.root.l = new Node(2);
		tree.root.l.l = new Node(3);
		tree.root.r= new Node(4);
		tree.root.l.r = new Node(5);
		withoutRecursion(root);
		for(int i:a)
			if(i!=0)
			System.out.println(i+" ");
	}
	private static void withoutRecursion(Node root) {
	            if(root==null) return;
	            if(root.l!=null) withoutRecursion(root.l);
	            a[i++] = root.d;
	            if(root.r!=null) withoutRecursion(root.r);
	}

}
