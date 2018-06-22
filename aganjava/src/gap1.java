import java.util.*;
public class gap1 {
	
	static int minDistance(long dist[], Boolean sptSet[], int V)
    {
        long min = Long.MAX_VALUE;
        int min_index=-1;
 
        for (int v =0 ; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
            }
        return min_index;
    }
	
    static long[] dijk(Long[][] d, int src, int V)
    {
        long dist[] = new long[V];
        Boolean sptSet[] = new Boolean[V];
        for (int i = 0; i < V; i++)
        {
            dist[i] = Long.MAX_VALUE;
            sptSet[i] = false;
        }
        dist[src] = 0;
        for (int count = 0; count < V-1; count++){
           int u = minDistance(dist, sptSet, V); 
           sptSet[u] = true;
            for (int v = 0; v < V; v++)
               if (!sptSet[v] && d[u][v]!=0 &&
                        dist[u] != Long.MAX_VALUE &&
                        dist[u]+d[u][v] < dist[v])
                    dist[v] = dist[u] + d[u][v];
        }
       return dist;
    }
	
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     int f = sc.nextInt();
     int[] c = new int[n];
     for(int i=0; i<n;i++)c[i] =  sc.nextInt();
     Long[][] d = new Long[n][n];
     for(int i=0; i<m; i++){
    	 int b = sc.nextInt();
    	 int e = sc.nextInt();
    	 long v = sc.nextLong();
    	 d[b-1][e-1]=v;
    	 d[e-1][b-1]=v;
     }
     long[] dij = dijk(d, 0, n);
     int k = sc.nextInt();
     long[] kv = new long[k];
     
     for(int i=0; i<k; i++){
    	 int mi = findmin(dij, c);
    	 if(mi==-1)kv[i]=-1;
    	 else{
    		 kv[i] = dij[mi]+f;
    		 c[mi]--;
    	 }
     }
     for(long i: kv)
    	 System.out.print(i+" ");
	}
	private static int findmin(long[] dij, int[] c) {
	    long min = Long.MAX_VALUE;
	    int ind =-1;
	    for(int i=0; i<dij.length; i++){
	    	if(dij[i]<min && c[i]>0){
	    		min = dij[i];
	    		ind = i;
	    	}
	    }
		return ind;
	}
}
