//there are n men, and m topics
//we have to choose group of two men
//and print the max. no. of topics a group can know
// and how meny suh groups are there
//1->know
//0->don't know


package array;
import java.util.Scanner;

public class acm_icmp {

    
  static  int maximum(int a[],int k)
        {
        
        int m=a[0];
        for(int i=0;i<k;i++)
        {
            if(m < a[i])
                m=a[i];
        }
        
        return m;
    }
    
   static int number(int a[],int k,int m)
        {
        int no=0;
        for(int i=0;i<k;i++)
            {
            if(a[i]==m)
            no++;
        }
        return no;
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        String topic[] = new String[n];
        
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        
        int a[]=new int[n*m];
        int i,j,x,y;
        int c=0;
        int k=0;
        
        for(i=0; i<n-1; i++ )
            {
            for(j=i+1; j<n; j++)
                {
                for(x=0; x<m; x++)
                    {
                    if( topic[i].charAt(x)=='1' || topic[j].charAt(x)=='1' )
                    c++;
                }
                a[k++]=c;
                c=0;
            }
            
                       
        }
        
       // for(int p:a)
         //   System.out.println(p);
        
           // System.out.println();
        
        
         int max=maximum(a,k);
            int no = number(a,k,max);

        System.out.println(max);
            System.out.println(no);
    }
}
