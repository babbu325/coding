package stack;

import java.util.ArrayList;
import java.util.Scanner;

public class brackets {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            String str = in.next();
            int n= str.length();
            char[] s = new char[str.length()];
            String ans="YES";
            int top=-1;
            for(int i=0;i<n;i++){
                char c= str.charAt(i);
                
                if(c=='[' || c=='{' || c=='(')
                s[++top] = c;
                else if(top>=0){
                	if( (s[top]=='[' &&c==']') || (s[top]=='{' &&c=='}') || (s[top]=='(' &&c==')'))
                		top--;
                }
                else { ans="NO";break;}
            }
            if(top==-1) 
                System.out.println(ans);
            else System.out.println("NO");
        }
    
    ArrayList a = new ArrayList();
    a.add(1);
    a.add(1);
    a.add(1);
    a.add(1);
    a.add(1);
    ArrayList b = new ArrayList();
    System.out.println(a.size());
    a.removeAll(a);
    System.out.println(a.size());
    }
    
}
