package array;
import java.util.*;

public class RotateArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int q=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        int ind =a.length- k%n;
        while(q-- > 0)
            {
            
            int q1=sc.nextInt();
            System.out.println(  a[(ind+q1)%n] );
        }
        
    }
}