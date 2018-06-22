package hashmap;

import java.util.HashMap;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String  s="abcdccdc";
       
       HashMap<String,String> hm = new HashMap<String,String>();
		int b=1;
		int e=3;
		
		String s1=s.substring(b, e+1);
		hm.put(s1,s1);
		StringBuffer s2=new StringBuffer(s1);
		
		s2.reverse();
		s1=s2.toString();   ///must be converted to string
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(hm);
		if(hm.containsKey(s1))
			System.out.println("true");
		else
		System.out.println("false");

	}

}
