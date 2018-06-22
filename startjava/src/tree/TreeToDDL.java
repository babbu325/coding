//http://www.geeksforgeeks.org/convert-a-binary-tree-to-a-circular-doubly-link-list/

package tree;

public class TreeToDDL {
	
	static tree getnode(int d){
		tree t= new tree();
		t.l=null;
		t.r=null;
		t.data=d;
		return t;
	}

	public static void main(String[] args) {
		tree root= getnode(2);
		root.l = getnode(1);
		root.l.l= getnode(3);
		root.l.r= getnode(4);
		root.r= getnode(5);
		root.r.l= getnode(6);
		root.r.l.l= getnode(7);
		tree head = DDL(root);
		
		tree t=head.l;
		while(t != head){
			System.out.print(t.data+" ");
			t=t.l;
		}
		System.out.print(t.data+" ");
	}

	private static tree DDL(tree root){
		// TODO Auto-generated method stub
		if(root.l==null && root.r==null){
			root.l=root;
			root.r=root;
			return root;
		}
		
		tree l=null;
		tree r= null;
		if(root.l!=null)
			l = DDL(root.l);
		if(root.r!= null)
			r= DDL(root.r);
		
		return con(l,root,r);
	}

	private static tree con(tree l, tree root, tree r) {
		if(l != null && r != null){
			tree ll = l.l;
			tree rr = r.l;
			l.l=rr;
			rr.r=l;
			root.l=ll;
			ll.r=root;
			root.r=r;
			r.l=root;
			return l;
		}
		else if(r == null){
			
			tree ll= l.l;
			ll.r=root;
			root.l=ll;
			root.r=l;
			l.l=root;
			return l;
		}
		
		else {
			tree rr= r.l;
			root.l=rr;
			rr.r=root;
			root.r=r;
			r.l=root;
			return root;
		}
	}
}