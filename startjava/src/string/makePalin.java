package string;

import java.util.Scanner;

public class makePalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
            {
            String s=sc.next();
            StringBuffer sb=new StringBuffer(s);
            
            int res=get(sb);
            System.out.println(res);
            
        }
        
        
    }
    
    static int get(StringBuffer s)
        {
        int c=ispali(s);
        if(c==0) return -1;
        else 
            {
            int i=0;
            int j=s.length()-1;
            while(i<=j){
                if(s.charAt(i) !=s.charAt(j)){
                	
                	StringBuffer s1=new StringBuffer(s);
                	StringBuffer s2=new StringBuffer(s); 
                	
                	
                	if(ispali(s1.deleteCharAt(i)) ==0)return i;
                	else if(ispali(s2.deleteCharAt(j)) ==0)return j;
                    
                    return -1;
                   }
            i++;
            j--;
            }
           }
    return 0;
    }

    static  int  ispali(StringBuffer s)
        { 
        int c=0;
     int i=0;
        int j=s.length()-1;
        while(i<=j)
            {
            if(s.charAt(i++) != s.charAt(j--))
                c=1;
            break;
        }
        return c;
    }
}