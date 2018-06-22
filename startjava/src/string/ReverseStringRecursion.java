package string;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun("ardnemar", 0);

	}

	private static void fun(String s, int i) {
		// TODO Auto-generated method stub
		if(s.length()>1)
			fun(s.substring(i+1, s.length()),i);
		System.out.print(s.charAt(i));	
	}

}
