package string;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class longestpalindrom {

	public static void main(String[] args) {
		System.out.println(longestpalin("13454311"));
		System.out.println(longestpalin("54321"));
		System.out.println(longestpalin("121"));
		System.out.println(longestpalin("1341"));
		System.out.println(longestpalin("3223"));
		System.out.println(longestpalin("111111"));
		String s= "dfghdfhqg";
		for(int i=0; i<s.length(); i++){
			String c= s.substring(i,i+1);
			String ch= s.substring(0, i) + s.substring(i+1);
			if(!ch.contains(c)){
			System.out.println(c);
			break;
			}
	}
}

	private static String longestpalin(String string){
		if(string==null) return null;
		String palin=string.substring(0, 1);
		for(int i=0; i<string.length()-1;i++){
			String longest=getpali(string,i,i);
			if(longest.length() > palin.length())
				palin=longest;
			 longest=getpali(string,i,i+1);
			if(longest.length() > palin.length())
				palin=longest;
		}
		return palin;
	}
	
	 static String getpali(String string, int l, int r){
		 if(l>r)return null;
		while(l>=0 && r<string.length() && string.charAt(l)==string.charAt(r)){
			r++;
			l--;	
		}
		return string.substring(l+1,r);
	}
}