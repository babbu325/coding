package tree;

public class MinDepthLeafSum {

	static tree getnode(int d){
		tree t = new tree();
		t.l=null;
		t.r=null;
		t.data=d;
		return t;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
tree root =  getnode(1);
root.l =  getnode(2);
root.l.l =  getnode(4);
root.l.r =  getnode(5);
root.l.l.l =  getnode(6);
root.l.l.r =  getnode(7);
root.l.r.l =  getnode(8);
root.l.r.r =  getnode(9);
root.r =  getnode(3);
root.r.l =  getnode(10);
root.r.l.l= getnode(2);
root.r.r =  getnode(11);
root.r.r.l = getnode(3);
int sum = fun(root);		
System.out.println(sum);
	}

	private static int fun(tree root) {
		// TODO Auto-generated method stub
		if(root==null) return -1;
		tree[] a = new tree[100];
		
		int r =-1;
		int f=0;
		int s=0;
		int e = 0;
		a[++r] = root;
		int res=0;
		while(f<=r){
			while(f<=e){
				tree t = a[f++];
				if(t.l!=null)a[++r]=t.l;
				if(t.r!=null)a[++r]=t.r;
			}
			if(f>r ){
				for(int j=s;j<=e;j++){
				res+=a[j].data;}
						return res;
					
				}
			
			for(int j=s;j<=e;j++){
				if(a[j].l==null && a[j].r==null){
					while(a[j].l==null && a[j].r==null && j<=e){res+=a[j].data;j++;}
					return res;
				}
			}
			
			s=f;
			e=r;
			
		}
		int i=0;
		while(a[i]!=null)
			System.out.print(a[i++].data+" ");
		
		return 0;
	}

}







