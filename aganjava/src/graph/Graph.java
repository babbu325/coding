package graph;
import java.util.*;

public class Graph {
	int v;
	LinkedList<Integer> adjlist[];
	Graph(int v){
		this.v = v;
		adjlist = new LinkedList[v];
		for(int i=0; i<v; i++){
			adjlist[i] = new LinkedList<>();
		}
	}
}