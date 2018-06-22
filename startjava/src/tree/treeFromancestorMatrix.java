//http://www.geeksforgeeks.org/construct-tree-from-ancestor-matrix/
package tree;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class treeFromancestorMatrix {
	public static void main(String[] args) {
		 
		 HashMap<Integer, ArrayList<Integer>> hm =  new HashMap<Integer, ArrayList<Integer>>();
		int[][] m =
			  { { 0, 0, 0, 0, 0, 0 ,0},
		        { 1, 0, 0, 0, 1, 0 ,0},
		        { 0, 0, 0, 1, 0, 0 ,1},
		        { 0, 0, 0, 0, 0, 0 ,1},
		        { 0, 0, 0, 0, 0, 0 ,0},
		        { 1, 1, 1, 1, 1, 0 ,1}, 
		        { 0, 0, 0, 0, 0, 0, 0}};
		
		int r=0, c=0;
		int q=0;

		for(c=0;c<m.length;c++){
			
		for(r=0;r<m.length;r++){
			if(m[r][c]==1)q++;
		}
		
		if(hm.get(q)==null){
			ArrayList<Integer> aa = new  ArrayList<Integer>();
			aa.add(c);
			hm.put(q, aa);
		}
		else {
			ArrayList<Integer> a = new  ArrayList<Integer>();
			a=hm.get(q);
			a.add(c);
			hm.put(q,a);
		}
		q=0;
	  }
		int[] res= new int[100];
		int k=0;
		int pos=0;
		res[0]= hm.get(0).get(0);
		
		for(int i=0;i<hm.size()-1;i++){
			ArrayList l= hm.get(i);
			java.util.Iterator itr = l.iterator();
			while(itr.hasNext()){
				int val= (int) itr.next();
			for(int j=0;j<m.length;j++){
				if(m[val][j] == 1 && hm.get(i+1).contains(j)){
					res[++pos]=j;
				System.out.println(val+" "+j +" ");
				}
			}
			}
		}
		System.out.println(hm);
		for(int z=0;z<=pos;z++)
			System.out.println(res[z]);
			
	}
}