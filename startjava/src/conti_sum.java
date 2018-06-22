import java.util.Scanner;

public class conti_sum {


    static boolean allNeg(int[] a){
        for(int i=0;i<a.length;i++)
            if(a[i]>=0) return false;
        return true;
    }
    static int max(int[] a){
        int m=a[0];
        for(int i=0;i<a.length;i++)
            {
            if(a[i]>m) m=a[i];
        }
        return m;
    }
    
    static int cont(int[] a){
        int m=0;
        if(a[0]>=0) m=a[0];
        for(int i=1;i<a.length;i++)
            {
        	if(a[i]<m)
            a[i]+=a[i-1];
            if(a[i]>m) m=a[i];
        }
        return m;
    }
    static int non_cont(int[] a){
        int m=0;
        for(int i=0;i<a.length;i++)
            {
            if(a[i]>0) 
                m += a[i];
        }
        return m;
    }
    public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
            {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            
            if(allNeg(a))
                {
                int m=max(a);
                System.out.println(m+" "+m);
            }
            else{
                int r2 = non_cont(a);
                int r1 = cont(a);
            
                System.out.println(r1+" "+r2);
            }
        }
    }
}
