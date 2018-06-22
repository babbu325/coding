package maths;

import java.util.ArrayList;
import java.util.HashMap;

public class SevenSegment {

	public static void main(String[] args){
		int num = 2345634;
		int n =  7;
		int a[]  = new int[7];
		HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();
		HashMap<Integer,ArrayList<Integer>> hm2 = new HashMap<Integer,ArrayList<Integer>>();
		hm1.put(0, 6);
		hm1.put(1, 2);
		hm1.put(2, 5);
		hm1.put(3, 5);
		hm1.put(4, 4);
		hm1.put(5, 5);
		hm1.put(6, 6);
		hm1.put(7, 3);
		hm1.put(8, 7);
		hm1.put(9, 6);
		
		int seg=0;
		while(num>0){
			seg+=hm1.get(num%10);
			num=num/10;
		}
		System.out.println(seg);
		
		int res[] = new int[n];
		for(int i=0; i<n;i++)
		res[i]=1;

		int i=0;
		seg = seg-2*n;
		while(seg>=4){
			seg -= 4;
			res[i++]=0;
		}
	
		if(seg==3)res[n-1]=2;
		else if(seg==2)res[n-1]=4;
		else res[n-1]=7;		
		for(int j:res)
			System.out.print(j+" ");
		
	}
}
