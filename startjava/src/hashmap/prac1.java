package hashmap;

import java.util.HashMap;

public class prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		m.put(1,"ram");
		m.put(2,"tam");
		m.put(3,"yam");
		m.put(4,"uam");
		m.put(5,"iam");
		m.put(6,"oam");
		System.out.println(m.size());
		System.out.println(m);
		m.remove(6);
		System.out.println(m);
		System.out.println(m.isEmpty());
		
		for(int i:m.keySet())
			System.out.println(i + "->" + m.get(i));
		
		m.put(1,"RAM");
		System.out.println( m.get(1));
		
		m.put(null,"hi");//index 0
		
		for(Integer i:m.keySet())
			System.out.println(i + "->" + m.get(i));

	}

}
