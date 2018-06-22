package string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class permutation {
	static	int c=0;
	 static int permute(String prefix, String str,HashMap h) {
	    int n = str.length();
	    if (n == 0){
	    	if(h.containsKey(prefix))c++;//repeating
	    	else{
	    	System.out.println(prefix);
	    	h.put(prefix, prefix);
	    }
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n),h);
	    }
	    return c;
	}
public static void main(String[] args) {
	
	ArrayList<Integer> a= new ArrayList<Integer>();
	a.add(1);
	a.add(13);
	a.add(2);
	a.add(10);
    Collections.sort(a);
    for(int i:a)
    	System.out.print(i+" ");
		String s=("bbcb");
		HashMap<String, String> h = new HashMap<String, String>();
	 	int r=	permute("",s,h);
	 	System.out.println(r);
	}
}