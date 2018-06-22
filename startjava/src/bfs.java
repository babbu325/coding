import java.util.Iterator;
import java.util.LinkedList;

public class bfs {

	   private int V;
	   private LinkedList<Integer> list[];
	   
	   bfs(int v )
	   { 
		   V=v;
		   list = new LinkedList[v];
		   for(int i=0;i<v;i++){
			   list[i] = new LinkedList();
		   }
	   }
	
	   void BFS(int s)
	   {
		  boolean[] visited = new boolean[V];
		    LinkedList<Integer> queue = new LinkedList<Integer>();
		    visited[s]=true;
		    queue.add(s);
		    
		    while(queue.size() != 0)
		    {
		  
		    	s=queue.poll();
		    	System.out.printf(s+" ");
		    	
		    	Iterator<Integer> i = list[s].listIterator();
		    	while(i.hasNext())
		    	{
		    		int n=i.next();
		    		if(!visited[n]){

		    			visited[n]=true;
		    		queue.add(n);}		
		    	}
		    	
		    }		  
	   }
	   
	
	void addEdge(int i, int j){
		list[i].add(j);		
	}
	
	
	public static void main(String args[])
    {
        bfs g = new bfs(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);
    }
}
