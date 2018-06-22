import java.util.Scanner;

public class xor {

    static long twoPower( long  n)
              {
             int r=1;
            long res=0;
        while(res < n)
            {
            res=(int)Math.pow(2,r++);
            if(res==n)
                return n/2;
        }
        return res/2;
    }
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          long  n;
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();    
       while(t-- >0)
            {
               n=sc.nextInt();
                int w=0;
           
           while(n!=1)
               {
                 long  r=twoPower(n);
                System.out.println(r);
               n=n-r;
               w= ++w%2;
           }
           if(w==1)
        	   System.out.print("Louise");
           else System.out.print("Richard");
           
        }//while
    }
}