//https://www.geeksforgeeks.org/count-strings-can-formed-using-b-c-given-constraints/
package string;

public class allStringwithBC {

	public static void main(String[] args) {
		int n = 3;
		int res = 1+ 2*n + n*(n*n-1)/2;
		System.out.println(res);
	}
}

// By solving all res values
// we will find res = 1 + 2n + n(n*n-1)/2

//int res = 0;
//
//// 0 'c's
//res += 1; // 0 'b's
//res += n; // 1 'b' in each position
//
//// 1 'c's
//res += 1 * n; // 0 'b's, 1 'c' in n pos
//res += (n - 1) * n; // 1 'b' in n-1 pos, 1 'c' in n pos
//
//// 2 'c's, (nk) pos
//res += 1 * ((n - 1) * n / 2); // 0 'b's, 2 'c's in (nk) pos
//res += (n - 2) * (n * (n - 1) /2); // 1 'b' in n-2 pos, 2 'c's in (nk) pos
//
//return res;

//--------

