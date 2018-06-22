package tree;

class node1
{
int data;
node1 l;
node1 r;
};


public class two_tree_are_equal {

	static node1 getnode(int d)
	{
		node1 temp=new node1();
		temp.data=d;
		temp.l=null;
		temp.r=null;
		return temp;
		
	}
	
	static boolean find(node1 r1,node1 r2 )
	{
		if(r1==null && r2==null)return true ;
		if(r1.data==r2.data)
		{
			find(r1.l,r2.l);
			find(r1.r,r2.r);
		}
		else return false;
		return true;
	}
	
	static boolean subtree(node1 t1,node1 t2)
	{
		
	    if(t1==null) return false ;
	    
		if(t1.data != t2.data)
		{
			if(t1.l != null)
			   return subtree(t1.l,t2);
			if(t1.r != null)
				  return subtree(t1.r,t2);
				
		}
			else
			{
			return	find(t1,t2);
				
			}	
		
		return false;
	}
	
	
	public static void main(String[] args) {
   node1 root1=getnode(1);
		 root1.l=getnode(2);
         root1.r=getnode(3);
		 root1.l.l=getnode(4);
		 root1.l.r=getnode(5);
		 root1.r.l=getnode(6);
		 root1.r.r=getnode(7);
		 root1.l.l.l=getnode(8);
		 root1.l.l.r=getnode(9);
		 root1.l.r.l=getnode(10);
		 root1.l.r.r=getnode(11);
		 root1.r.l.l=getnode(12);
		 root1.r.l.r=getnode(13);
		 root1.r.r.l=getnode(14);
		 root1.r.r.r=getnode(15);
		 
   node1 root2=getnode(1);
		 root2.l=getnode(2);
         root2.r=getnode(3);
		 root2.l.l=getnode(4);
		 root2.l.r=getnode(5);
		 root2.r.l=getnode(6);
		 root2.r.r=getnode(7);
		 
        System.out.println(subtree(root1,root2));
		 
	}
}