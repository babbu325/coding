import java.util.*;
import java.io.*;
class left_rec
{
   static String g[][] = new String[30][30];
   static String alpha[][] = new String[30][30];
   static String beta[][] = new String[30][30];
   static int ad[] = new int[30];
   static int bd[] = new int[30];
   static int deg[] = new int[30]; // no. of productions for non terminal
   static int n; // no. of non terminals

   public static void eliminateLR()
   {
   	  int N = n;
      for(int i=0;i<N;i++)
      {

      	if(ad[i]>0)
      	{
      		char c = (char)(n+'A');
      		deg[n] = 0;
      		for(int j=0;j<ad[i];j++)
                g[n][deg[n]++] = alpha[i][j] + c;

      		g[n][deg[n]++] = "#";

      		deg[i] = bd[i];
      		for(int j=0;j<deg[i];j++)
      			g[i][j] = beta[i][j] + c;
      		++n;
      	}
      }
   }

   public static void showGrammar()
   {
     System.out.println("Grammar:");
     for(int i=0;i<n;i++)
     {
     	System.out.println((char)('A'+i)+"->");
     	for(int j=0;j<deg[i];j++)
     		System.out.println(g[i][j]);
     }

   }

   public static void eliminateLF()
   {

   }
   public static void main(String args[])
   {
   	 System.out.println("No. of non terminals:\t");
   	 Scanner sc = new Scanner(System.in);
   	 n = sc.nextInt();

     for(int i=0;i<30;i++)
     {
        ad[i] = 0;
        bd[i] = 0;
     }

     for(int i=0;i<n;i++)
     {
     	System.out.println("no. of productions for non terminal: "+(char)('A'+i));
        deg[i] = sc.nextInt();
        System.out.println("enter productions for: "+(char)('A'+i));
        for(int j=0;j<deg[i];j++)
        {
        	g[i][j] = sc.next();
        	if(g[i][j].charAt(0)==((char)('A'+i))) // alpha
            {
            	alpha[i][ad[i]] = "";
            	int l = g[i][j].length();
            	for(int k=1;k<l;k++)
            		alpha[i][ad[i]] = alpha[i][ad[i]] + g[i][j].charAt(k);
            	ad[i]++;
            }
            else
              beta[i][bd[i]++] = g[i][j];
        }

     }


    showGrammar();
    System.out.println("alpha matrix..");
    for(int i=0;i<n;i++)
    {
    	System.out.println((char)('A'+i)+"->");
    	for(int j=0;j<ad[i];j++)
    		System.out.println(alpha[i][j]);
    }

    System.out.println("beta matrix..");
    for(int i=0;i<n;i++)
    {
    	System.out.println((char)('A'+i)+"->");
    	for(int j=0;j<bd[i];j++)
    		System.out.println(beta[i][j]);
    }

    eliminateLR();
    showGrammar();

    eliminateLF();
    showGrammar();
   }

}
