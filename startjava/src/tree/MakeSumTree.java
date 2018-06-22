//http://www.geeksforgeeks.org/convert-an-arbitrary-binary-tree-to-a-tree-that-holds-children-sum-property/
package tree;

public class MakeSumTree {

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
		
		tree root=getnode(100);
		root.l=getnode(3);
		root.l.l=getnode(6);
		root.l.r=getnode(3);
		root.r=getnode(8);
		root.r.l=getnode(2);
		root.r.r=getnode(9);
		
		pre(root);
		make(root);
		System.out.println();
		pre(root);
	}
	private static void make(tree root) {
		// TODO Auto-generated method stub
		if(root.l ==null && root.r==null)return;
		make(root.l);
		make(root.r);
		if(root.l!=null && root.r!=null){
			
			if(root.data >root.l.data + root.r.data){
				
			}
		}
			else if(root.l!=null) root.data= root.l.data;
		else if(root.r!= null) root.data= root.r.data;
	}
	private static void pre(tree root){
		if(root==null) return;
		pre(root.l);
		System.out.print(root.data +" ");
		pre(root.r);
		
	}
}
