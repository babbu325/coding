//http://www.geeksforgeeks.org/find-longest-palindrome-formed-by-removing-or-shuffling-chars-from-string/
package string;

public class LongestPalindromByREplacingOrSuffling {

	public static void main(String[] args) {
		String s= "abcdeabbcabeedjff";
		int[] a= new int[26];
		int max=0;
		int ind =0;
		for(int i=0;i<s.length();i++)
			a[s.charAt(i)-'a']++;
		for(int i:a)
			System.out.print(i+" ");
			String s1="";
			String s2="";
			for(int i=0;i<26;i++){
				if(a[i]%2==0 && i!=0){
					for(int j=1;j<=a[i]/2;j++){
						s1 = s1 + Character.toString((char) ('a'+i));
						s2 =  Character.toString((char) ('a'+i)) + s2; 
					}
				}
				else {
					max = Math.max(max, a[i]);
					ind = i;
				}
				
			}
			System.out.println();
			if(max!=0){
				for(int j=1; j<=max; j++)
					s1 = s1 + Character.toString((char)('a'+ind));
				   s1 = s1 + s2;
			}
System.out.println(s1+" ");
	}
}
