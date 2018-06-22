package tree;
public class sumTree {
	static tree getnode(int d){
		tree t=new tree();
		t.data=d;
		t.l=null;
		t.r=null;
		return t;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tree root=getnode(26);
		root.l=getnode(10);
		root.l.l=getnode(4);
		root.l.r=getnode(6);
		root.r=getnode(3);
		root.r.l=getnode(2);
		root.r.r=getnode(1);
		System.out.println(sumTree(root));
		
	}
	private static boolean sumTree(tree root) {
		if(util(root.l)+util(root.r)==root.data)
			return true;
		else return false;
	}
	
	private static int util(tree root) {
		if(root.l==null && root.r==null)
			return root.data;
		
		if(util(root.l) + util(root.r)==root.data)
			{root.data=2*root.data;
			System.out.println(root.data);
		return root.data;
	}
    return 0;		
}

}
