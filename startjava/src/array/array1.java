package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class array1 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		//System.out.println(a1);
		
		ListIterator<Integer> ite=  a1.listIterator();
		
		//while(ite.hasPrevious())
			System.out.println(ite.hasNext());
		
	}

}
