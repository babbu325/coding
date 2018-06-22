package array;
import java.util.*;

public class oneTwoThree {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {123,321,231,1223,22133,453,2,54321};
        fun(a);
	}

	private static void fun(int[] a){
		ArrayList<Integer> arr = new ArrayList<>();
		for(int n : a){
			if(check(n)){
				arr.add(n);
			}
		}
		Collections.sort(arr);
		Iterator it = arr.iterator();
		while(it.hasNext())	
		System.out.println(it.next());
	}	
  	private static boolean check(int n){
  		String str = Integer.toString(n);
  		return (str.contains("1") && str.contains("2") && str.contains("3"));
  	}
}
