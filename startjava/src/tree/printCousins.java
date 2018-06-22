package tree;

public class printCousins {

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
			root.l.r.l=getnode(4);
			root.l.r.r=getnode(5);
			root.l.l.r=getnode(66);
			root.l.l.l=getnode(48);
			root.r=getnode(6);
			root.r.r=getnode(7);
			root.r.l=getnode(88);
			root.r.r.r=getnode(8);
			root.r.r.l=getnode(9);
			root.r.r.r.r=getnode(13);
			printCousins(root, 88);

	}

	private static void printCousins(tree root , int n) {
		// TODO Auto-generated method stub
		int r=-1;
		int f=0;
		tree[] a= new tree[100];
		for(int i=0;i<100;i++)
			a[i]=null;;
		
		if(root==null) return;
		a[++r] =root;
		
		while(f<=r)
		{
			tree t=a[f++];
			if(t==null);
			 	
			else {
				 if(t.l!=null)
				 {
				r=(f-1)*2+1;
				a[r]=t.l;
			}
			if(t.r!=null)
			{
				r=(f-1)*2+2;
				a[r]=t.r;
			}		
			}	
		}
		int i=0;
		while(i<=r){
			
			System.out.print(i);
			if(a[i]!=null)
				System.out.println(" "+a[i].data);
			else System.out.println(" "+null);
		i++;
		}
		i=0;
		int p = 0;
		while(i<=r)
		{
			if(a[i]!=null && a[i].data==n)
			{  p=i;
			break;
			}
			i++;
		}
		
		System.out.println();
		System.out.println(p);
		int rng=0;
		i=0;
		System.out.println();
		System.out.println();
		System.out.println();
		while(p/(int)Math.pow(2, rng) != 0)
			rng++;
		for(i=(int) (Math.pow(2,rng-1)-1); i<= Math.pow(2, rng)-2; i++)
		{
		if((i-1)/2!= (p-1)/2)
			if(a[i]!=null)
			System.out.println(a[i].data);
			
		}
	}//function;

}//class
