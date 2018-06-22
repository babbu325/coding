package dynemicPrograming;

import java.util.Scanner;

public class matrixChainMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            StringBuffer sb=new StringBuffer(s);
            char[] c=s.toCharArray();
            int count=0;
            
            
            for(int i=0;i<s.length(); i++)
                {     
                    if(s.charAt(i)!= '\0'){
                         count++;
                    s= s.replace(s.charAt(i),'\0');     
                    }
            }
            System.out.println(count);
        }
    }
}
