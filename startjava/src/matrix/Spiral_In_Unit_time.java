//
package matrix;

public class Spiral_In_Unit_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int c=1;
		int d=0;
		int r=0;
		int loop = n*n;
		while(c <= loop){
			if(d==0){
				for(int i=1;i<=n;++i)
					System.out.printf("%d\t",++r);
				d = ++d%n;
				c += n;
			}
			else if(d==1){
				for(int i=1;i<=n-1;i++){
				r+=n;
					System.out.printf("%d\t",r);
				}
				d=++d%n;
				c+=n-1;
			}
			else if(d==2){
				for(int i=1;i<=n-1;i++)
					System.out.printf("%d\t", --r);
				d=++d%n;
				c+=n-1;
			}
			else {
				for(int i=1;i<=n-2;i++){
					r=r-n;
					System.out.printf("%d\t",r);
				}
					d=++d%n;
					c+=n-2;
			}
			n=n-2;
		}//while
	}
}