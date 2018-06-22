
package string;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sen= "my name is ram and i am an computer engineer";
		System.out.println(sen);
		System.out.println(rev(sen));

	}

	private static String rev(String line) {
		 StringBuilder reverse = new StringBuilder();
		  String[] sa = line.trim().split("\\s");
		 l
		  for (int i = sa.length - 1; i >= 0; i--) {
		  reverse.append(sa[i]);
		  reverse.append(' ');
		  }
		  return reverse.toString().trim();
		  }
				
	}


