package linkedLiat;

import java.util.Scanner;

public class moonfrogQ {
     
	moonfrogQ l,r;
	String data;
	
	public moonfrogQ()
	{  		
		l=null;
		r=null;
		data=null;
	}
	
	  public static moonfrogQ getnode(String d)
	{  moonfrogQ temp = null;
		temp.data=d;
		temp.l=null;
		temp.r=null;
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		moonfrogQ root=null;
        moonfrogQ head=root;
        moonfrogQ t=null;
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Enter the no of moves:");
		   int n=sc.nextInt();
           
		   System.out.println("Enter moves:");
		   String s=sc.next();
		  if(s.contains("begins"))
		  root=getnode(s);
		  else System.out.println("This is not a good begins");
		  
		   //moonfrogQ node=null;
		   for(int i=0;i<n-1;i++)
		   {
			    s=sc.next();
			    if(s.contains("left"))
			    {	t=getnode(s);
			        root.l=t;
			        root=root.l;
			    }
			    else if (s.contains("right"))
			    {
			    	t=getnode(s);
			    	root.r=t;
			    	root=root.r;
			    	
			    }	   
		}//end for	
		   

		   root=head;
		   while(root!=null)
		   {
			   System.out.println(root.data);
			   if(root.l!=null)
			       root=root.l;
			   else if(root.r!=null)
				   root=root.r;
			   
		   }
				   		   
	}//end main

}


