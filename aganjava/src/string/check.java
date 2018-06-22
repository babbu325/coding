package string;

public class check {

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3,4},
				     {2,3,4,1}};
		int[] ar = a[0];
		String s="";
		for(int i : ar) s+=Integer.toString(i);
		System.out.println(s);
	}

}
