import java.math.BigInteger;

public class FindPrimeInEasyWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =11;
		System.out.println(fun(n));
		System.out.println(fun2(n));

	}

	private static int fun2(int n) {
		BigInteger b= new BigInteger(String.valueOf(n));
		
		return  Integer.parseInt(b.nextProbablePrime().toString());
	}

	private static boolean fun(int n) {
		BigInteger b= new BigInteger(String.valueOf(n));
		return b.isProbablePrime(1);
	}
}