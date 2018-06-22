package string;

public class PatternSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "this is my pen it means i have a pen and i also have penapple";
		String pat=" ";
		String s1=s;
        int i=s.indexOf(pat);
        System.out.println(i);
        
		while(true){
			i=s.substring(i+1).indexOf(pat)+1+i;
			System.out.println(i);
			if(s.substring(i+1).indexOf(pat)==-1)break;
		}
	}
}