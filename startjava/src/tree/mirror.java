package tree;

public class mirror {

	static tree getnode(int d)
	{
		tree t=new tree();
		t.data=d;
		t.l=null;
		t.r=null;
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree root=getnode(0);
		root.l=getnode(1);
		root.l.l=getnode(2);
		root.l.r=getnode(3);
		root.r=getnode(4);
		root.r.l=getnode(5);
		root.r.r=getnode(6);
		root.r.r.r=getnode(7);
		root.r.r.r.r=getnode(8);
		root.r.r.r.l=getnode(9);
		System.out.println("preorder\n");
		preorder(root);
		System.out.println("mrror\n");
	 mirror(root);
	 System.out.println("preorder\n");
	 preorder(root);
	 System.out.println("inorder\n");
	 inorder(root);
	 int h=hight(root);
	 System.out.println();
	 System.out.println(h);
	 
	}
static	int c=0;
	private static void inorder(tree root) {
		// TODO Auto-generated method stub
		
		if( root==null) return;
		inorder(root.l);
		c++;
		if(c==6) System.out.println(root.data);
		inorder(root.r);
	}
	private static int hight(tree root) {
		// TODO Auto-generated method stub
		if(root==null)return 0;
		return (1+ Math.max(hight(root.l),hight(root.r)));
	}
	private static void preorder(tree root) {
		// TODO Auto-generated method stub
		if(root==null) return;
		System.out.printf("%d\t",root.data);
		preorder(root.l);
		preorder(root.r);
	}
	private static void mirror(tree root) {
		if(root==null) return;
		
		if(root.l!=null && root.r!=null)
		{
			tree t=root.l;
			root.l=root.r;
			root.r=t;
		}
		
		else if(root.l!=null && root.r==null)
		{
			root.r=root.l;
			root.l=null;
		}
		else if(root.l==null && root.r!=null)
		{
			root.l=root.r;
			root.r=null;
		}
		
		if(root.l!=null)
			mirror(root.l);
		if(root.r!=null)
			mirror(root.r);
		
	}

}
