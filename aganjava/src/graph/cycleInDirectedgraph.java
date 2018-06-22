package graph;

import java.util.LinkedList;

public class cycleInDirectedgraph {

	static Graph g;
	static void addedge(Graph g, int s, int d){
		g.adjlist[s].add(d);
	}
	
	static void printg(Graph g){
		for(int i=0;i<g.v;i++){
			System.out.print(i +" : " );
			for(int j : g.adjlist[i])
				System.out.print(j+", ");
			System.out.println();
		}
	}
	static boolean findc(Graph g, int i, boolean[] vis){
		System.out.println(i+" "+vis[i]);
		if(vis[i]==true)return true;
		vis[i]=true;
		LinkedList<Integer> l = g.adjlist[i];
		for(Integer j : l){
			if(findc(g,j,vis))return true;
		}
		return false;
	}
	
	static boolean findCycle(Graph g){
		for(int i=0; i<g.v; i++){
			boolean[] vis = new boolean[g.v];
			if(findc(g,i, vis))return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
     g = new Graph(4);
     addedge(g,0,1);
     addedge(g,0,2);
     addedge(g,1,2);
     addedge(g,2,0);
     addedge(g,2,3);
     addedge(g,3,3);
     printg(g);
     System.out.println(findCycle(g));
	}
}
