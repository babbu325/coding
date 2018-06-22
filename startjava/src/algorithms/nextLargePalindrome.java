//given a no.
//get the next larget palindrome;
//
package algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class nextLargePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		ArrayList a=new ArrayList();
		int[] n =new int[]{1,2,1};
		int done=9;
		int[] a2 = new int[n.length+1];
		int k=0;
		
		for(int i:n)
			System.out.println(i);
		
		if(check9(n)==true)
		{
			
			a2[k++]=1;
			while(k<n.length){
				a2[k++]=0;
				a2[k]=1;
			    	
			}
			done=1;
		}
		
		else if(isPoly(n)==true)
		{
			if(n.length%2==0)
			{
				++n[n.length/2-1];
				++n[n.length/2];
			}
			else ++n[n.length/2];
			done=2;
			
		}
		
		
		else  {
		    int end1,start2;
		    
		    end1 = (n.length-1)/2;
		    if(n.length%2==0)  start2=end1+1;
			else               start2=end1+2;
		    
		    while(true){
		    	
			if(n[end1] < n[start2])
			{	n[end1--]=n[start2++];
			   break;
			}
			else if(n[end1]> n[start2] ) 
				{
				n[start2++]=n[end1--];
				break;
				}
			else {
				for(int i:n)
					System.out.print(i);
				end1--;
			    start2++;  
			}			
		    }//while					    
		    while(end1>=0 && start2 <n.length)
		    	n[start2++]=n[end1--];
			  		    
		}//else last		
		
		
		if(done==1)
			for(int i:a2)
			System.out.print(i);
		
		else for(int i:n)
			System.out.print(i);
		
	}//main

	private static boolean isPoly(int[] n) {
		
		int i=0;
		int c=0;
		int j=n.length-1;
		
		while(i<=j)
		{
			if(n[i++]!=n[j--])
		    c=1;
				
		}
		if(c==1)return false;
		else return true;
	}//is poly

	private static boolean check9(int[] n) {
		
		for(int i=0;i<n.length;i++)
		{
			if(n[i]!=9) return false;
		}
		return true;
	}//check 9

}//main
