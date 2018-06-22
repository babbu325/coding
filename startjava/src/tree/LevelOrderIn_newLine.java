package tree;

 import java.util.Queue;
    class node{
	int data;
	node l;
	node r;		
     };




public class LevelOrderIn_newLine{
	static node getnode(int d)
	{
		node temp=new node();
		temp.data=d;
		temp.l=null;
		temp.r=null;
		return temp;
		}
	
	static void levelorder(node root)
	{
		if(root==null) return;
		
		node queue[]=new node[100];
		int r=-1;
		int f=0;
		int sl=1;
		int el=1;
		
		queue[++r]=root;
		
		while(f<=r)
		{
			for(int i=sl;i<=el;i++)
			{
				
				node t=queue[f++];
				System.out.printf("%d\t",t.data);
				if(t.l!=null)
					queue[++r]=t.l;
				if(t.r!=null)
					queue[++r]=t.r;
			}
			sl=f;
			el=r;
			System.out.println();
		}//while end
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		node root=getnode(1);
		 root.l=getnode(2);
         root.r=getnode(3);
		 root.l.l=getnode(4);
		 root.l.r=getnode(5);
		 root.r.l=getnode(6);
		 root.r.r=getnode(7);
		 root.l.l.l=getnode(8);
		 root.l.l.r=getnode(9);
		 root.l.r.l=getnode(10);
		 root.l.r.r=getnode(11);
		 root.r.l.l=getnode(12);
		 root.r.l.r=getnode(13);
		 root.r.r.l=getnode(14);
		 root.r.r.r=getnode(15);
		 levelorder(root);

	}

}