package string;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "1.3.55";
		String s2= "1.3.45";
		String s11="";
		String s22="";
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)=='.'){
				s1 = s1.substring(0, i) + s1.substring(i+1);
			}
		}
		for(int i=0;i<s2.length();i++){
			if(s2.charAt(i)=='.'){
				s2 = s2.substring(0, i) + s2.substring(i+1);
			}
		}
		System.out.println(Math.max(Integer.parseInt(s1), Integer.parseInt(s2)));
		System.out.println(Integer.parseInt("1234"));
		String s= "abdfabdee";
		for(int i=0;i<s.length();i++){
			if(s.lastIndexOf(s.charAt(i))== s.indexOf(s.charAt(i))){
				System.out.println(s.charAt(i));
			break;	
			}
		}
				
		
	}
}
