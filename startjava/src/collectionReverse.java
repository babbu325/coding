import java.awt.List;
import java.util.*;

public class collectionReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>  l = new ArrayList<String>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        
        System.out.println(l);
        Integer[] a= {1,2,3,4,5}; 
        Collections.reverse(l);;
       // Collections.reverse(Arrays.asList(a));
        System.out.println(l);
        System.out.println(Arrays.toString(a));
        
        ArrayList ar = new ArrayList();
        ar.add(4);
        ar.add(2);
        Collections.sort(ar);
        Collections.sort(l);
        System.out.println(ar);
        System.out.println(l);
        
	}

}
