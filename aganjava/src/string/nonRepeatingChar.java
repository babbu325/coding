package string;

import java.util.HashMap;

public class nonRepeatingChar {

	private static char fun(String s){
       return 'a';
	}
	public static void main(String[] args) {
		String s = "abcdefghaacdfgh";
		String c = "abc,bbb,mmm,ooo,lll,lll,hhh,fff";
		String[] str= c.split(",");
		HashMap hm = new HashMap();
		for(String i : str){
		      if(hm.containsKey(i)){
		    	  System.out.println("found"+ i);
		    	  break;
		      }
		      else hm.put(i, i);
		      System.out.println(i +" is not there");
		}
	}

}
