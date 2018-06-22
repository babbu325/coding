package array;

public class partitionpoint {

	static int FindElement(int[] A, int n)
    {
        // Create an array 'SE[]' that will 
        // store smaller element on right side.
        int[] SE = new int[n];
 
        // Create an another array 'GE[]' that 
        // will store greatest element on left side.
        int[] GE = new int[n];
 
        // initalize first and last index of SE[], GE[]
        GE[0] = A[0];
        SE[n - 1] = A[n - 1];
 
        // store greatest element from left to right
        for (int i = 1; i < n; i++) 
        {
            if (GE[i - 1] < A[i])
                GE[i] = A[i];
            else
                GE[i] = GE[i - 1];
        }
 
        // store smallest element from right to left
        for (int i = n - 2; i >= 0; i--) 
        {
            if (A[i] < SE[i + 1])
                SE[i] = A[i];
            else
                SE[i] = SE[i + 1];
        }
        for(int i: GE)
        	System.out.print(i+" ");
        System.out.println();
        for(int i: SE)
        	System.out.print(i+" ");
        System.out.println();
        // Now find a number which is greater then all
        // elements at it's left and smaller the all
        // then elements to it's right
        for (int j = 0; j < n; j++) 
        {
            if ((j == 0 && A[j] < SE[j + 1]) || 
                (j == n - 1 && A[j] > GE[j - 1]) ||
                (A[j] < SE[j + 1] && A[j] > GE[j - 1]))
                return A[j];
        }
 
        return -1;
    }
 
    // Driver code
    static public void main(String[] args)
    {
        int[] A = {8, 16,32,3,55,112,110,117,119};
        int n = A.length;
        System.out.println(FindElement(A, n));
    }
    
}
