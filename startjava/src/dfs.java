import java.util.*;
import java.*;
import java.util.ListIterator;

public class dfs {
    	private  int V;
		private  LinkedList<Integer> list[];
		 
		dfs(int n)
		{
			V=n;
			list = new LinkedList[n]; //1
			for(int i=0 ; i<n ; ++i)
			{
		 	   list[i]= new LinkedList();      
			}
			
		}
		
		
		 void addToList(int i,int j)
			{
				list[i].add(j);			
			}
					
	private  void DFSREcursive(int s, boolean visited[]) {
		     
		     
		    	 System.out.printf(s+" ");
		    	 visited[s]=true;
		     
		     Iterator<Integer> i =  list[s].iterator();
		     while(i.hasNext())
		     {
		    	int k=  i.next();
		    	 if(!visited[k])
		    		DFSREcursive(k,visited);
		     }
		}


	 void DFS(int v)
	{
		 boolean visited[]= new boolean[V];
              	  DFSREcursive(v,visited);	  
	}
	
	
	
		
	
	public static void main(String[] args) {
		
		dfs d= new dfs(9);
		
		d.addToList(0,1);
		d.addToList(0,2);
		
		d.addToList(1,0);
		
		d.addToList(2,0);
		d.addToList(2,3);
		d.addToList(2,7);
		
		d.addToList(3,2);
		d.addToList(3,4);
		d.addToList(3,5);
		d.addToList(3,6);
		
		d.addToList(4,3);
		
		d.addToList(5,3);
		d.addToList(5,8);
		
		d.addToList(6,3);
		d.addToList(6,7);
		
		d.addToList(7,2);
		d.addToList(7,8);
		d.addToList(7,6);
		
	    d.addToList(8,5);
		d.addToList(8,7);

		
		d.DFS(4);
	}

}
