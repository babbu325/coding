package dp;

import java.util.Scanner;

public class lcs {

	static String LCS(String X, String Y, int m, int n)
    {
        int[][] L = new int[m+1][n+1];
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X.charAt(i-1) == Y.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }

        int index = L[m][n];
        int temp = index;
  
        char[] lcs = new char[index+1];
        lcs[index]= ' ' ;
        int i = m, j = n;
        while (i > 0 && j > 0)
        {
            if (X.charAt(i-1) == Y.charAt(j-1))
            {
                lcs[index-1] = X.charAt(i-1); 
                i--; 
                j--; 
                index--;     
            }
            else if (L[i-1][j] > L[i][j-1])
                i--;
            else
                j--;
        }
        String res = "";
        for(int k=0;k<=temp;k++){
         res +=lcs[k];
         }
        return res;
    }
	
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       long[] a = new long[n];
       String[] s = new String[n];
       
       for(int i=0;i<n;i++){
    	   s[i] = Long.toString(sc.nextLong());
       }
       
       int res =1;
       int begin =0;
       int end =0;
       for(int i=0; i< n-1; i++){
    	   String s1 = s[i];
    	   String s2 = s[i+1];
    	   if(incommon(s1,s2)){
    		   end++;
    	   }
    	   else {
    		   begin = end = i+1;
    	   }
    	if(end-begin+1 >res) res = end-begin+1;
       }
       System.out.println(res);
	}

	private static boolean incommon(String s1, String s2) {
		for(int i=0; i<s1.length();i++){
			if((s2.indexOf(s1.charAt(i))) !=-1) return true;
		}
		return false;
	}
}










