import java.util.Arrays;

public class a1 {

	static void fun1(){
		String s = "a2b2c3";
		String res="";
		int st=0;
		int k=5;
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				int d = (int)s.charAt(i)-48;
				while(d -- >0)res+=s.substring(st,i);
				st = i+1;
			}
		}
		System.out.println(res+" "+res.charAt(k));
	}
	
	public static void main(String[] args) {
		
//		fun1();
//		fun2();
//		fun3();
		fun4();
	}

	private static void fun4() {
		int n =11;
		System.out.println(Integer.toBinaryString(n));
		
		
	}

	private static void fun3() {
		int a[] = {0,0,1,2,3,4};
		System.out.println(Arrays.toString(a).hashCode());
		
		
	}

	private static void fun2() {
		// TODO Auto-generated method stub
		String s = "ABcED";
		s = s.toLowerCase();
		int c=0;
		for(int i=0;i<s.length();i++){
			if(i == s.charAt(i)-97)c++;
		}
		System.out.println(c);
	}

}
