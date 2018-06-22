package Bitt;

import java.util.ArrayList;
import java.util.Scanner;

public class bit {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
			ArrayList<Integer> a= new ArrayList<Integer>();
			int n=sc.nextInt();
			while(n-->0)
				a.add(sc.nextInt());
			int res=getRes(a);
			System.out.println(res);
		}
	}
	private static int getRes(ArrayList<Integer> a) {
		
		int[][] l= new int[a.size()][a.size()];
		int r=0;
		for(int i=0;i<a.size();i++)
		{
			for(int j=0;j<a.size();j++) 
			{
               if(j>i)
               {
            	   l[i][j]= l[i][j-1] ^ a.get(j);
               }
               else if(i==j){
            	   l[i][j]=a.get(i);
            	   r=r^a.get(i);
            } 
          }
		}
		for(int i=0;i<a.size();i++)
		{
			for(int j=0;j<a.size();j++) 
			{
            	if(j>i)
            		r=r^l[i][j];
            } 
		}
		return r;
	}

}