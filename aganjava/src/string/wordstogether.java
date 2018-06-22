package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class wordstogether {

	public static void main(String[] args) {
		String[] words = {"may", "student", "students", "dog",
            "studentssess", "god", "cat", "act", "tab",
            "bat", "flow", "wolf", "lambs", "amy", "yam",
            "balms", "looped", "poodle", "kkkkkk"};
		HashMap<Integer, ArrayList<String>>  hm = fun(words);
		for(Map.Entry<Integer, ArrayList<String>> e : hm.entrySet()){
			if(e.getValue().size()>1)System.out.println(e.getValue());
		}
	}

	private static HashMap<Integer, ArrayList<String>> fun(String[] words) {
		HashMap<Integer, ArrayList<String>>  hm = new HashMap<>();
		for(String s : words){
			int[] a = new int[26];
			for(int i=0; i<s.length();i++){
				if(a[s.charAt(i)-'a']==0)a[s.charAt(i)-'a']++;
			}
			int code = Arrays.toString(a).hashCode();
			ArrayList<String> str;
			if(hm.containsKey(code)){
				str = hm.get(code);
				str.add(s);
			}
			else {
				str = new ArrayList<String>();
				str.add(s);
				}
			hm.put(code, str);
		}
		
		return hm;
	}

}
