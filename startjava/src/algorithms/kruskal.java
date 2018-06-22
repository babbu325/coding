package algorithms;

import java.util.Scanner;

public class kruskal {
	
	 int V,E;
	 Edge edge[];
	 
	class Edge
	{
		int d,s;		
	};
	
	kruskal(int v,int e)
	{
		V=v;
		E=e;
		 edge=new Edge[E];               //array of objects, there are E no. of objects
		for(int i=0;i< e; i++)          //we need to create the E no. of objects by calling class Edge();
			edge[i]=new Edge();        //now we total 'e' no. of objects
		
	}
	 static kruskal addedge(kruskal g,int v,int e)
	 {    
		 kruskal k=g;
		 Scanner sc=new Scanner(System.in);
		 for(int i=0 ; i < e ; ++i){
		 System.out.println("Enter the surce and destination of "+i);
		 k.edge[i].s=sc.nextInt();
		 k.edge[i].d=sc.nextInt();
		 }
	 return g;
	 }
	 
	 int find(int pat[],int x)
	 {
		 if(pat[x]==-1)
			 return x;
		 return find(pat,pat[x]);		 
	 }
	 
	 void union(int pat[],int x,int y)
	 {
		 int p_x=find(pat,x);
		 int p_y=find(pat,y);
		 pat[p_x]=p_y;
	 }
	 
	int iscycle(kruskal graph){
     
		int pat[]=new int[graph.V];
		for(int i=0; i<graph.V; ++i)
			pat[i]=-1;
		
		for(int i=0;i<graph.E;++i)
		{
			int x=graph.find(pat,graph.edge[i].s);
			int y=graph.find(pat,graph.edge[i].d);
			
			if(x==y)return 1;
		    
			graph.union(pat,x,y);
		}
			return 0;

	}
	 
	 
	 //static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int v,e;
		System.out.println("Enter the no of vertices and edges:");
		v=sc.nextInt();
		e=sc.nextInt();
		
		kruskal graph=new kruskal(v,e);
		addedge(graph,v,e);
		//graph.edge[0].s=0;
		//graph.edge[0].d=1;
		
		//graph.edge[1].s=0;
		//graph.edge[1].d=2;
		
		//graph.edge[2].s=1;
		//graph.edge[2].d=;
		
		
		if(graph.iscycle(graph)==1)
			System.out.println("yes");
		
		else System.out.println("no");

	}

}
