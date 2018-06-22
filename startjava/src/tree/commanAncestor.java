//http://www.geeksforgeeks.org/lowest-common-ancestor-in-a-binary-tree-set-2-using-parent-pointer/
package tree;

import java.util.ArrayList;

public class commanAncestor {
	static tree getnode(int d)
	{
		tree t=new tree();
		t.data=d;
		t.l=null;
		t.r=null;
		return t;
	}
	public static void main(String[] args){
		tree root =  getnode(6);
		 root.l =  getnode(5);
		 root.l.l =  getnode(4);
		root.r =  getnode(8);
		 root.r.l =  getnode(7);
		root.r.r =  getnode(9);
		root.r.r.l =  getnode(10);
		int n1=5;
		int n2=9;
		ArrayList<Integer> a1 = new ArrayList<Integer>();
				a= fun(root,a1,n1);
		
		ArrayList<Integer> a2 =new ArrayList<Integer>();
				a=fun(root,a2,n2);
				
		for(int i:a)
			System.out.println(i);
		
		int i1=a.indexOf(root.data);
		int i2=a.lastIndexOf(root.data);
		System.out.println(i1 +" " + i2);
		while(a.get(i1) == a.get(i2)){
			i1++;
			i2++;
		}
		System.out.println(a.get(--i1));
	}
	static ArrayList<Integer> a= new ArrayList<Integer>();
	
	private static ArrayList fun(tree root, ArrayList a1,int n){
		if(root==null)return null;
		if(root.data==n){
			a1.add(root.data);
	        a.addAll(a1);
		}
		else{
		ArrayList<Integer> al1= new ArrayList<Integer>();
		ArrayList<Integer> al2= new ArrayList<Integer>();
		al1.addAll(a1);
		al2.addAll(a1);
		al1.add(root.data);
		al2.add(root.data);
		fun(root.l, al1,n);
		fun(root.r, al2,n);
		}
		return a;
	}

}
