package tree;

import java.util.ArrayList;

public class PrintAllPath {

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
		tree root=getnode(1);
		root.l=getnode(2);
		root.l.r=getnode(3);
		root.l.r.l=getnode(4);
		root.r=getnode(5);
		root.r.l=getnode(6);
		root.r.r=getnode(7);
		root.r.l.r=getnode(8);
		root.l.r.r=getnode(9);
		root.l.r.r.r=getnode(10);
		root.l.r.r.r.l=getnode(11);
		root.l.r.r.r.l.r=getnode(12);
	     int[] st = new int[20];
	     int k=-1;
		if(root!=null)
			st[++k]=root.data;
		printpath(root, st, k);
	}
	static int l=0;
	private static void printpath(tree root, int[] st, int k){
		
		if(root.l==null && root.r==null){
			for(int i=0; i<=k; i++)System.out.print(st[i]+" ");
			System.out.println();
			return;
		}
			if(root.l!=null){
		
				int[] l = st;
				l[k+1]= root.l.data;
				printpath(root.l , l ,k+1);	
			}
			if(root.r != null){
			
				int[] r = st;
				 r[k+1]= root.r.data;
				printpath(root.r , r, k+1);
			}
		}
}
