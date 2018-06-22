import java.util.Scanner;

public class deleteMe {

    static int util(int[] a, long s){
        if(s%2!=0 || a.length==1) return 0;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
                if(sum==s/2){
                   int[] l = new int[i+1];
                    int[] r = new int[a.length-i-1];
                    for(int j=0;j<=i;j++)
                        l[j]= a[j];
                    for(int j=i+1;j<a.length;j++)
                        r[j-i-1]=a[j];
                    return 1 + Math.max(util(l,s/2), util(r,s/2));
                }
        }
       return 0;
}
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            int n= sc.nextInt();
            int[] a= //new int[n];
            	{
            			21211 ,21211, 21211, 21211 ,21211 ,21211 ,21211, 21211, 21211, 21211, 21211, 21211, 21211, 21211, 21211		
            	};
            //for(int i=0;i<n;i++)
              // a[i]=sc.nextInt();
            long s=0;
            long sum=0;
            for(int i=0;i<n;i++)
                sum += a[i];
            if(sum %2 !=0)
                System.out.println("0");
            else{
            for(int i=0;i<n;i++){
                s += a[i];
                if(s==sum/2) {
                    int[] l = new int[i+1];
                    int[] r = new int[a.length-i-1];
                    for(int j=0;j<=i;j++)
                        l[j]= a[j];
                    for(int j=i+1;j<a.length;j++)
                        r[j-i-1]=a[j];
                    System.out.println(1+Math.max(util(l,sum/2), util(r,sum/2)));
                    break;
                }
                else if(n-1==i)
                    System.out.println("0");
            }
          }   
        }//while
    }//main
}//class
