package string;

import java.util.Scanner;

public class deleteChar {

	public static void main(String[] args) {
		
		String str= "jjhfhsheuiifjfdfjsn";
		Scanner sc=new Scanner(System.in);
		
		char ch=sc.next().charAt(0);
		String res = null;
		
		/*int i=0;
		for(;;){
		 i=str.indexOf(ch);
		if(i!=-1){
		 System.out.println(i);
		
		res=(str.substring(0,i));
		System.out.println(res);
		
		res=res+(str.substring(i+1));
		str=res.toString();
		
		}
		else break;
	  }
		System.out.println(res);
		*/

       res=str.replaceAll(Character.toString(ch),"");
       System.out.println(res);
       
       
       char[] ch2=str.toCharArray();
System.out.println(ch2[0] +" " + ch2[2]);

String s1=("abc");
String s2=("abc");
//if(s1==s2)
System.out.println(s1 == s2);


String t1=new String("ac");
String t2=new String("ac");
//if(t1==t2)
System.out.println(t1 == t2);


String q1=new String("abc");
String q2=new String("abc");
//if()
System.out.println(q1.equals(q2));

	}
}