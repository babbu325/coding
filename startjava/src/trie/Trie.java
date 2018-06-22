package trie;
import java.util.HashMap;
import java.util.Map;

 class trienode{
	Map<Character, trienode> children;
	boolean endofnode;
   	}

public class Trie {
	
	static trienode getnode(){
		trienode t= new trienode();
		t.children= new HashMap<Character, trienode>();
		t.endofnode=false;
		return t;
	}
	
 private final static trienode root = getnode();
	 public static  void insert(String s){
		 trienode current=root;
		 for(int i=0;i<s.length();i++){
			 char ch=s.charAt(i);
			 trienode n= current.children.get(ch);
			 if(n==null){
				 n = getnode();
				 current.children.put(ch, n);
			 } 
			 current=n;
		 }
		 current.endofnode=true;
	}
	 
	public static void main(String[] args) { 
		insert("abcd");
		insert("abcde");
		insert("aqwet");
		insert("abcef");
		insert("aqwcd");
		System.out.println( search("aq"));	
	}
	private static boolean search(String s) {
		trienode current= root;
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i); 
			trienode n= current.children.get(ch);
			if(n==null)
				return false;
			current=n;
		}
		return  current.endofnode ;
	}
}
	