package tree;

public class BTtoDDL {
	static tree getnode(int d){
		tree t=new tree();
		t.data=d;
		t.l=null;
		t.r=null;
		return t;
	}
	static tree head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree root=getnode(0);
		root.l=getnode(1);
		root.l.l=getnode(2);
		root.l.r=getnode(3);
		root.r=getnode(4);
		root.r.l=getnode(5);
		root.r.r=getnode(7);
		root.r.r.r=getnode(8);
		root.r.r.r.r=getnode(9);
		root.r.r.r.r.r=getnode(16);
		ddl(root);
		while(head!=null)
		{	
			System.out.print(head.data+" ");
			head=head.r;
	}
	}
	private static void ddl(tree root) {
		if(root==null)
			return;
		ddl(root.r);
		root.r=head;
		if(head!=null)
			head.l=root;
		head=root;
		
		ddl(root.l);
	}
}