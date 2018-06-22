package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {

	public static void main(String[] args) {
		String s1="i am a youtuber. my hobies are.<h1> playing 12345 cricket.1234567</h1>";
        
		String pat=  "((\\<h>)[a-z](\\</h>)";
		
		getpattern(pat,s1);
	}

	private static void getpattern(String pat, String s1) {
		Pattern p=Pattern.compile(pat);
		Matcher m=p.matcher(s1);
		
		if(m.find())
		{
			System.out.println(m.pattern());
		}
		else System.out.println("burrrrrrrrrrrhhhhhhhhhhhhha");
		
	}

}
