package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class getAllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer , Integer> hm = new HashMap<Integer, Integer>();
hm.put(1, 2);
hm.put(2, 1);
hm.put(3, 4);
hm.put(4, 2);
hm.put(5, 1);
hm.put(6, 2);
hm.put(7, 3);

ArrayList a= new ArrayList();
a.addAll(hm.values());
a.sort(null);

int i=0;
while(i<a.size())
	System.out.print(a.get(i++)+" ");
	
  int[] num = {5,4,3,2,1};

  Arrays.sort(num);
  System.out.println();
  for(int j:num)
	  System.out.print(j+" ");
  
  
  String[] s= {"ram" , "kam" , "bam" , "cham" , "nam"};
  System.out.println();
  Arrays.sort(s);
  for(String j:s)
	  System.out.print(j+" ");
  
  char[] c= s[0].toCharArray();
  System.out.println();
  Arrays.sort(c);
  for(char j:c)
	  System.out.print(j+" ");
	}
}
