package tree;

public class widthofTree {

	static tree getnode(int d)
	{
		tree t=new tree();
		t.data=d;
		t.l=null;
		t.r=null;
		return t;
	}
	
	static void width(tree root)
	{
		tree[] a=new tree[100];
		int e = 0,s = 0,r,f;
		r=-1;f=0;
		if(root==null)
			System.out.println(0);
		
		a[++r]=root;
		int max=1;
		while(f<=r)
		{
			//System.out.println(max);
			s=f;
			e=r;
			if((e-s+1>max))
				max=(e-s+1);
			while(s<=e)
			{
				tree temp=a[f++];
				if(temp.l != null)
				a[++r]=temp.l;			
				if(temp.r!=null)
					a[++r]=temp.r;
				s++;
			}	
		}
		System.out.println("width is:"+max);
	}
	static int c=1;
	static int l=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   tree root=getnode(0);
				root.l=getnode(1);
				root.l.l=getnode(2);
				root.l.r=getnode(3);
				root.l.r.l=getnode(4);
				root.l.r.r=getnode(5);
				root.l.l.r=getnode(66);
				root.l.l.l=getnode(48);
				root.r=getnode(6);
				root.r.r=getnode(7);
				root.r.l=getnode(88);
				root.r.r.r=getnode(8);
				root.r.r.l=getnode(9);
				root.r.r.l.r=getnode(11);
				root.r.r.r.r=getnode(13);
				width(root);
				System.out.println();
				atdepthK(root, 3);//find the no. of node at depth k
				
				int n=numberofNodes(root);
				System.out.println();
				System.out.println(n);
				int leafs = leaf(root);
				System.out.println(l);
				
				
	}

	private static int leaf(tree root) {
		// TODO Auto-generated method stub
		if(root==null) return 0;
		
		
		if(root.l!=null)
			leaf(root.l);
		if(root.r!=null)
			 leaf(root.r);
		if(root.l==null && root.r==null)
		     l++;
		return l;
	}

	private static int numberofNodes(tree root) {
		// TODO Auto-generated method stub
		if(root==null) return 0;
		
		if(root.l!=null) 
		{
			c++;
			numberofNodes(root.l);
		}
		if(root.r!=null) 
			{
			c++;
			numberofNodes(root.r);
			}
		return c;
	}

	private static void atdepthK(tree root, int i) {
		// TODO Auto-generated method stub
		
		if(root==null){
		return;
		}
		
		if(i==0){
		 System.out.printf("%d\t",root.data);
		return;
		}
		atdepthK(root.l,i-1);
		atdepthK(root.r, i-1);
		
		
	}
}










