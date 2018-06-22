package tree;

class tree
{
	int data;
	tree l;
	tree r;
};


public class lesft_view {

	
static tree getnode(int d)
	{
tree t=new tree();
t.data=d;
t.l=null;
t.r=null;
	return t;
}
	
static int  max_level = 0;
	public static void main(String[] args) {
				
		tree root=getnode(0);
		 root.l=getnode(1);
		 root.r=getnode(2);
		 root.r.l=getnode(3);
		 root.r.r=getnode(4);
		 root.r.l.l=getnode(5);
		 
		 leftView(root,1);
	}

	  static void leftView(tree node, int level){
	        if (node==null) return;
	 
	        // If this is the first node of its level
	        if (max_level < level)
	        {
	            System.out.print(" " + node.data);
	            max_level = level;
	        }
	 
	        // Recur for left and right subtrees
	        leftView(node.l, level+1);
	        leftView(node.r, level+1);
	    }
	 
}