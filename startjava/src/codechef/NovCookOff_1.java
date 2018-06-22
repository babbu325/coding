package codechef;

import java.util.Scanner;

 class NovCookOff_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- >0){
			
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c= sc.nextInt();
			int n= sc.nextInt();
			int x=0;
			int y=0;
			for(int i=0;i<=n;i++){
				for(int j=i; j<=n; j++){
					
					if(a==b ){
						if(i * j == (i | j) * (i & j) + a * i + b * j + c)
					{x+=i+j;
					y+=j+i;}
				}
					else {
						x+=i;
						y+=j;
					}
			}
			}
			System.out.println(x+" "+y);
		}
	}
}