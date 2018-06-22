package linklist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linklist1 {

	public static void main(String[] args) {
		
		LinkedList<String> s1=new LinkedList<String>();
		s1.add("ram");
		s1.add("ffg");
		s1.add("dsd");
		s1.add("bbd");
		s1.add("dfd");
		s1.add("vvds");
		s1.add("bbd");
		
		//s1.addFirst("ssc");
		//s1.addLast("rrrr");
		//s1.add(3, "fucxss");
		//s1.remove("ram");
	//	s1.removeFirst();
		//s1.removeLast();	
		//s1.remove();
		//s1.removeFirstOccurrence("ram");

	//	s1.remove
		
		//for(String x:s1)
		//System.out.println(x);
		
		ListIterator<String> ite=  s1.listIterator();
		
		//while(ite.hasPrevious())
			System.out.println(ite.hasPrevious());
		

	}

}
