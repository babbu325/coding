//http://www.geeksforgeeks.org/mobile-numeric-keypad-problem/
package dynemicPrograming;
public class MobileNumericKeyPadProlem {
	public static void main(String[] args) {
		char[][] c = 
			{
					{'1','2','3'},
					{'4','5','6'},
					{'7','8','9'},
					{'#','0','*'}
			};
		int res=cal(c,4);		
		System.out.println(res);
	}
	private static int cal(char[][] m, int n) {
		if(n==0)return 0;
		if (n==1) return 10;
		int[] r={0 ,0,-1,0,1};
		int[] c={0,-1, 0,1,0};
		int[][] l= new int[10][n+1];
		for(int i=0;i<10;i++){
			l[i][0]=0;
			l[i][1]=1;
		}
		for(int k=2;k<=n;k++){
			for(int i=0;i<4;i++){
				for(int j=0;j<3;j++){
					int num= m[i][j]-'0';
					if(num != '#'-'0' && num != '*'-'0'){
						for(int move=0;move<5;move++){
							int row=i+r[move];
							int col=j+c[move];
							if(row >=0 && row <4 && col >=0 && col <3){
								int nextNum=m[row][col]-'0';
								if(nextNum != '#'-'0' && nextNum != '*'-'0'){
								l[num][k] += l[nextNum][k-1];	
							}	
						  }
						}	
					}	
				}	
			}		
		}
		int res=0;
		for(int i=0;i<10;i++){
			res+=l[i][n];	
		}
		return res;
	}
}