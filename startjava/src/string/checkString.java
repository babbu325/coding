package string;

import java.util.HashMap;
import java.util.Scanner;

public class checkString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String , Integer> hm= new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		while(n-->0)
		{
			String s=sc.next();
			if(hm.containsKey(s))
				hm.put(s,hm.get(s)+1);
			else 
				hm.put(s,1);
		}
		int q=sc.nextInt();
		while(q-- > 0)
		{
			String qs = sc.next();			
		    if(hm.containsKey(qs))
		    	System.out.println(hm.get(qs));
		    else System.out.println(0);
		}
		

	}

}
