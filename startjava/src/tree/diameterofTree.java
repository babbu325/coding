package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class hight
{
int h;
};


public class diameterofTree {

	static tree getnode(int d)
	{
		tree temp=new tree();
		temp.data=d;
		temp.l=null;
		temp.r=null;
		return temp;
	}
	
	static int diameter(tree root,hight hi)
	{
		hight lh=new hight();
		hight rh=new hight();
		if(root==null){
		hi.h=0;
		return 0;
		}		
		lh.h++;
		int ld=diameter(root.l,  lh);
		rh.h++;
		int rd=diameter(root.r,rh);		
		
		hi.h = Math.max(lh.h,rh.h)+1;
		
		return Math.max(lh.h+rh.h+1, Math.max(ld, rd));			
	}
	static int dime(tree root){
		hight hi=new hight();
	return diameter(root,hi);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

   tree root=getnode(0);
		root.l=getnode(1);
		root.l.l=getnode(2);
		root.l.r=getnode(3);
		root.l.r.l=getnode(4);
		root.l.r.r=getnode(5);
		root.r=getnode(6);
		root.r.r=getnode(7);
		root.r.r.r=getnode(8);
		root.r.r.r.l=getnode(9);
		root.r.r.r.r=getnode(11);
		root.r.r.r.l.l=getnode(12);
		root.r.r.r.l.r=getnode(13);
		//System.out.println("diameter is:"+ dime(root));
		
		LinkedList q = new LinkedList();
		Stack<Integer> s = new Stack();

		q.add(2);
		q.add(3);
		q.add(1);
		q.add(4);
		while(!q.isEmpty()){
			System.out.println(q.removeFirst());
		}
		
		
		
	}
}