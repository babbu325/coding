package shorting;
import java.util.LinkedList;

class list{
	int data;
	list next;
	

       list(int d){
	      this.next=null;
	      this.data=d; 	
	     }
    }

public class mergeSortLinkedlist {
	    
static list mergesort(list l){
	
	if(l==null || l.next==null) return l;
	
	list head= l;
	
    list a ;
    list b ;   
            
       int count=0;
       while(head!=null){
    	   count++;
    	   head=head.next;
       }
       //System.out.println(count);
       
       int mid=count/2;
       list curr=l;
       list pre=null;
       while(mid>0){
    	   pre=curr;
    	   curr=curr.next;
    	   mid--;
       }
       a=l;
       b=curr;
       pre.next=null;
      
    	list l1=mergesort(a);
    	list r1= mergesort(b);
	
    	list nod= sort(l,a,b);
return nod;   
}


	static list sort(list l,list a, list b){
		
		list res=l;
		list res2=res;
		
		if(a==null) return b;
		if(b==null) return a;
		while(a!=null || b!=null )
		{	
			if(a.data <=b.data){
			res.data=a.data;
            a=a.next;
			}
			
		else {
			res.data=b.data;
			b=b.next;
		     }
	      res=res.next;
	   }
		
		while(a!=null)
		{
			res.data=a.data;
			res=res.next;
			a=a.next;
		}
		while(b!=null)
		{
			res.data=b.data;
			res=res.next;
			b=b.next;
		}
		
		res=res2;
		return res;
}

static void split(list head,list a,list b){
	
	list slow;
	list fast;
	
	slow=head;
	fast=head.next;
	while(fast!=null)
	{
		fast=fast.next;
		if(fast!=null)
		{
			fast=fast.next;
			slow=slow.next;
		}
		
	}
	
	a=head;
	b=slow.next;
	slow.next=null;
	
}

static void print(list n1) 
{
	list l=n1;;
	while(l!=null){
		System.out.printf("%d\t",l.data);
	   l=l.next;
	}
}


    public static void main(String[] args) {
		
		list n1=new list(7);
		list n2=new list(5);
		list n3=new list(4);
		list n4=new list(3);
		list n5=new list(2);
		list n6=new list(8);
		list n7=new list(9);
		list n8=new list(1);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n8;
		
		print(n1);
		System.out.println(n1.data);
		
		n1=mergesort(n1);
		System.out.println(n1.data);
		print(n1);
		
	}

}
