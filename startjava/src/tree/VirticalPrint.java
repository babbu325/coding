//http://www.geeksforgeeks.org/vertical-sum-in-binary-tree-set-space-optimized/
package tree;

import java.util.ArrayList;
import java.util.HashMap;

public class VirticalPrint {

	static tree getnode(int d){
		tree t= new tree();
		t.l=null;
		t.r=null;
		t.data=d;
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tree root= getnode(1);
		root.l = getnode(2);
		root.l.l= getnode(4);
		root.l.r= getnode(5);
		root.r= getnode(3);
		root.r.l= getnode(6);
		root.r.l.l= getnode(7);
		HashMap<Integer, ArrayList> hm = new HashMap<Integer, ArrayList>();
		vir(root, 0, hm);
		System.out.println(hm);
	}
	private static void vir(tree root, int i, HashMap<Integer, ArrayList> hm) {
		if(root==null) return;
		if(hm.get(i)== null){
			ArrayList<Integer> a= new ArrayList<Integer>();
			a.add(root.data);
			hm.put(i, a);
		}
		else {
			ArrayList a= hm.get(i);
			a.add(root.data);
			hm.put(i, a);
		}
		
		vir(root.l, i-1, hm);
		vir(root.r, i+1, hm);
	}
}
