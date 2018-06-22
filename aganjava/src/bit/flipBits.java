package bit;

public class flipBits {

	static int fun(int a, int b){
		int res=0;
		int c=1;
		int x = a ^ b;
		for(int i=0;i<32;i++){
			if((c & x)>0) res++;
			c = c << 1;
		}
		return res;
	}
	public static void main(String[] args) {
		int a=20, b=10;
		System.out.println(fun(a,b));

	}

}
