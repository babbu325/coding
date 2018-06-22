package bit;

public class bitRotated {

	public static void main(String[] args) {
		int a = 13; //1101
		int b = 14; //1110
		String s1 = Integer.toBinaryString(a)+ Integer.toBinaryString(a);
		String s2 = Integer.toBinaryString(b);
		System.out.println(s1.lastIndexOf(s2));
		
	}

}
