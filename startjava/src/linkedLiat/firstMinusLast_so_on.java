package linkedLiat;

class list
{
	int data;
	list next;
};


public class firstMinusLast_so_on {

	static list getnode(int d)
	{
		list l=new list();
		l.data=d;
		l.next=null;
		return l;
	}
	
	static void getres(list root)
	{
		list fast;
		list slow;
		int a[]=new int[100];
		int r=-1;
		
		if(root==null)
		{	
			System.out.println("Make way, Dont waste time");
	        return;
		}
		if(root.next==null){
			System.out.println(root.data);
        return;
		}
		
        slow=root;
        fast=root.next;
        while(fast!=null)
        {   
        	fast=fast.next;
        	if(fast!=null)
        	{
        		fast=fast.next;
        		slow=slow.next;
        	}
        	
        }
		
        System.out.println(slow.data);
        
        
        slow=slow.next;
        
        while(slow!=null)
        {
        	a[++r]=slow.data;
        	slow=slow.next;
        }
       // for(int i:a)
        ///	System.out.print(i);
        
        
	    list root1=root;
		while(r>=0)
		{
			root.data= root.data-a[r--];
			root=root.next;
		}
        root=root1;
		while(root!=null)
		{
		System.out.printf("%d\t",root.data);
	    root=root.next;
		}
	}
	
	
	
	public static void main(String[] args) {
   list root=getnode(10);
        root.next=getnode(12);
        root.next.next=getnode(14);
        root.next.next.next=getnode(15);
        root.next.next.next.next=getnode(1);
        root.next.next.next.next.next=getnode(2);
        root.next.next.next.next.next.next=getnode(4);
        root.next.next.next.next.next.next.next=getnode(6);
        //root.next.next.next.next.next.next.next.next=getnode(20);
		
		getres(root);
	}

}
