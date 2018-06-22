package tree;

public class alternateExtreamNodes {

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
		root.r=getnode(2);
		root.l.l=getnode(3);
		root.l.r=getnode(4);
		root.r.l=getnode(5);
		root.r.r=getnode(7);
		root.l.l.l=getnode(8);
		root.l.l.r=getnode(9);
		root.l.r.l=getnode(16);
		root.l.r.r=getnode(17);
		root.l.l.l.l=getnode(18);
		root.l.l.l.r=getnode(19);
		extream(root);
	}


	private static void extream(tree root) {
		// TODO Auto-generated method stub
		int r=-1;
		int f=0;
		int s=0;
		int e=0;
		int p=1;
		tree[] a=new tree[100]; 
		if(root==null) return;
		a[++r]=root;
		while(f<=r)
		{
			s=f;
			e=r;			
			if(p==0)
			System.out.println(a[s].data);
			else System.out.println(a[e].data);
			
			while(s<=e)
			{
				tree t=a[f++];
				if(t.l != null)
					a[++r]=t.l;
				if(t.r != null)
					a[++r]=t.r;
				s++;
			}
			p= ++p % 2;
		}
	}
}