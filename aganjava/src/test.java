
public class test {
	public static int solution(int K, int L, int M, int N, int P, int Q, int R, int S) {
        long x = 2147483647;
        long a1 = Math.abs(M-K)*Math.abs(L-N);
        long a2 = Math.abs(P-R)* Math.abs(Q-S);
        long i_c = (Math.min(M, R)- Math.max(K, P)) * (Math.min(N,S)-Math.max(L, Q));
        return (int) ((a1+a2-i_c > x)? -1 : a1+a2-i_c);
    }
	
	public static void main(String[] args) {
		System.out.println(solution(-4,1,2,6,0,-1,4,3));
	}
}
