import java.util.*;
public class javalab13a {

	public static void main(String[] args) {
   	Scanner obj=new Scanner(System.in);	
    System.out.println("enter the string:");
    String s=obj.next();
    System.out.println("length is:"+s.length()+"\n");
    int i,c=0;
    for(i=0;i<s.length();i++)
    {
    	if(s.charAt(i)=='a')
    	{
    		c++;
    		 System.out.println("a is present at:"+i);	
    	}
    }
    System.out.println("\n" +c+"times" );
    
    
    
    
	}

}