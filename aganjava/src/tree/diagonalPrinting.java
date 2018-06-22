package tree;
import java.security.KeyStore.Entry;
import java.util.*;

public class diagonalPrinting {

	Node root;
	
	static void fun2(Node root, int d, HashMap<Integer, Vector<Integer>> hm){
		if(root==null) return;
		
		Vector<Integer> v = hm.get(d);
		if(v==null){
			v = new Vector();
		}
		v.add(root.d);
		hm.put(d, v);
		fun2(root.l, d+1, hm);
		fun2(root.r, d, hm);
	}
	
	static void fun(Node root){
		if (root ==null)return;
		HashMap<Integer, Vector<Integer>> hm = new HashMap<>();
		fun2(root, 0, hm);
		
		for(Map.Entry<Integer, Vector<Integer>>  e : hm.entrySet()){
			System.out.println(e.getValue());
		}
	}
	
	public static void main(String[] args) {

		diagonalPrinting tree = new diagonalPrinting();
		tree.root = new Node(8);
		tree.root.l = new Node(3);
		tree.root.l.l = new Node(1);
		tree.root.r = new Node(10);
		tree.root.r.l = new Node(6);
		tree.root.r.l.l = new Node(4);
		tree.root.r.l.r = new Node(7);
		tree.root.r.r = new Node(14);
		tree.root.r.r.l= new Node(13);
		tree.fun(tree.root);

	}
}