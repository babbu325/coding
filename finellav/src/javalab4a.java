import java.util.Scanner;

public class javalab4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);

System.out.println("enter the string");
String s=obj.next();
int l=s.length();
char s1=s.charAt(0);
char s2=s.charAt(l-1);

StringBuffer str=new StringBuffer(s);
		str=str.deleteCharAt(0);
		str=str.deleteCharAt(str.length()-1);
		

s=s2+str.toString()+s1;
System.out.println("new strng="+s);
		
		
		
	}

} 
