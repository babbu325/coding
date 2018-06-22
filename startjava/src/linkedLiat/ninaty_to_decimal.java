package linkedLiat;

class node
{
int data;
node next;
};


public class ninaty_to_decimal {
    
	static int v=0;
	static int c=0;
	static node getnode(int d)
	{
		
		node n=new node();
		n.data=d;
		n.next=null;
		return n;	
	}

	static int val(node n)
	{  
		int r=0;
      while(n!=null)
      {
    	  r=r*2+n.data;
    	  n=n.next;
      }
     		
       		return r;
	}
	
	public static void main(String[] args) {
   
   node root=getnode(1);
		root.next=getnode(1);
		root.next.next=getnode(1);
		root.next.next.next=getnode(0);
		root.next.next.next.next=getnode(0);
		root.next.next.next.next.next=getnode(0);
		
		int n=val(root);
		System.out.println(n);
		

	}

}
