//http://www.geeksforgeeks.org/perfect-reversible-string/
package string;

public class ReverseOfAllsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abab";
		System.out.println("945".toLowerCase()=="945".toUpperCase());
		
		for(int i=0; i<s.length(); i++){
			for(int j=i; j<s.length(); j++){
			util(s, s.substring(i, j+1));
			}
		}
	}

	private static void util(String s, String sub) {
		// TODO Auto-generated method stub
		//System.out.println(s+" "+sub);
		StringBuffer sb1= new StringBuffer(s);
		StringBuffer sb2= new StringBuffer(sub);
		if(!(s.contains(sb2.reverse())))
			System.out.println("Reverse of " + sub + " is not present ");
		//else System.out.println("Reverse of " + sub + " is  present ");
	}
}
