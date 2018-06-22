package trie;

import java.util.HashMap;
import java.util.Map;

class tnode{
	Map<Character, tnode> children;
	Map<Character, Integer> val;
	boolean endofnode;
   	};

public class MaxXorInArray {

static tnode getnode(){
    	tnode t= new tnode();
    	t.endofnode= false;
    	t.children= new HashMap<Character, tnode>();
    	t.val= new HashMap<Character, Integer>();
    	return t;
    }
      public final static tnode head= getnode();
       
      static void insert(int n){
    	  String s=String.format("%4s", Integer.toBinaryString(1)).replace(" ", "0");
    	  tnode current= head;
    	  for(int i=0;i<s.length();i++){
    		  char ch= s.charAt(i);
    		  tnode t= current.children.get(ch);
    		  if(t==null){
    			  t=  getnode();
    			  current.children.put(ch,t);
    		  }
    		  current=t;
    	  }
    	  current.endofnode=true;
    	  current.val.put(s.charAt(s.length()-1), n);
      }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,4,5,6};
		for(int i=0; i<a.length;i++)
			insert(a[i]);
		int[] m ={0,0,0};
		int res=0;
		int n1=0;int n2=0;
		
		for(int i=0;i<a.length;i++){
			m = xor(a[i],res);
			if(m[0] > res){
				res= m[0];
				n1= m[1];
				n2= m[2];
			}
		}
		//String s=String.format("%4s", Integer.toBinaryString(1)).replace(" ", "0");
		//System.out.println(Integer.parseInt("1001", 2));
		//System.out.println(n1 +" " + n2 + " " + res);
	}

	private static int[] xor(int n, int m) {
		// TODO Auto-generated method stub
		int ret[] = {0,0,0};
		tnode  current=head;
		String str="";
		String s=String.format("%4s", Integer.toBinaryString(n)).replace(" ", "0");
	     for(int i=0;i<s.length();i++){
	    	 char ch= s.charAt(i);
	    	 int  v=0;
	    	 if(current.children.containsKey('1') &&  current.children.containsKey('0'))
	    	 v = Math.max(0^(int)ch, 1^(int)ch);
	    	 else if(current.children.containsKey('0'))
	    		 v=0^(int)ch;
	    	 else v= 1^(int)ch;
	    	 str= str+ Integer.toString(v);
	    	 //decide where to jump.
	    	 //if both 0 and 1 , only o, only 1 all cases///////
	    	 
	    	 
	     }
		
		
		return ret;
	}
}









