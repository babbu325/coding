package tree;

import java.awt.List;
import java.util.ArrayList;

class var{
	int i;
	var(int v){
		i=v;
	}
}

public class replace_node_binary_tree_sum_inorder_predecessor_successor {
	static Node root;
	static var v;
	static ArrayList<Integer> a = new ArrayList<Integer>();
	
	public static void main(String[] args) {
	replace_node_binary_tree_sum_inorder_predecessor_successor tree = new replace_node_binary_tree_sum_inorder_predecessor_successor();
	v = new var(1);
	 root = new Node(1);
	 root.l= new Node(2);
	 root.l.l = new Node(4);
	 root.l.r = new Node(5);
	 root.r = new Node(3);
	 root.r.l = new Node(6);
	 root.r.r = new Node(7);
	 a.add(0);
	 addToArray(root, a);
	 a.add(0);
	 v.i=1;
	 replace(root, a);
	 inorder(root);
	}
	
	private static void replace(Node root, ArrayList<Integer> a2) {
		if(root==null) return;
		replace(root.l, a);
		root.d = a2.get(v.i-1)+ a.get(v.i+1);
		v.i++;
		replace(root.r, a);
	}

	private static void inorder(Node root) {
		if(root==null)return;
		inorder(root.l);
		System.out.print(root.d+" ");
		inorder(root.r);
		
	}
	
	private static void addToArray(Node root, ArrayList a) {
		if(root==null)	return;
		addToArray(root.l, a);
		a.add(root.d);
		addToArray(root.r, a);
	}
}
