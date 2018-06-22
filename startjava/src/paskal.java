
public class paskal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8;
		for(int line=1 ; line<=n; line++){
			for(int k=1; k<= n-line ; k++)System.out.print(" ");
			int c=1;
			for(int i=1;i<=line;i++){
				if(c==0)break;
				System.out.print(c+" ");
				c=c*(line-i)/i;
			}
			System.out.println();
		}

		
		for(int line=1 ; line <= 2*n; line++){
			if(line<=n){
			for(int k=1; k<= n-line ; k++)System.out.print(" ");
			for(int i=1;i<=line;i++){
				System.out.print("* ");
			}
			}
			else {
				for(int k=1; k <=line-n ; k++)System.out.print(" ");
				for(int i=1;i<=2*n-line;i++){
					System.out.print("* ");
				}	
			}
			System.out.println();
		}
		
		System.out.printf("%d",  Integer.valueOf(Integer.toBinaryString(7)));
		System.out.println();
	}

}
