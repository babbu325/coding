package string;

class pal{
	String palin = "";
	int l=0;
}

public class longestPalindrom {
static int i=0;
	public static void main(String[] args) {
		String s = "forgeeksskeegfor";
		pal m = new pal();
		fun(s,m);
		System.out.println(m.palin);
	}

	private static void fun(String s, pal m) {
		System.out.println(i++);
		if(isPalin(s)){
			if(s.length()> m.l) {
				m.l=s.length();
				m.palin = s;
			}
			return;
		}
		fun(s.substring(0,s.length()-1),m);
		fun(s.substring(1,s.length()),m);
		
		return;
	}

	private static boolean isPalin(String s) {
		
		int st =0;
		int e = s.length()-1;
		while(st<=e){
			if(s.charAt(st++)!=s.charAt(e--)) return false;
		}
		return true;
	}

}
