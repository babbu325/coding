package algorithms;
public class CycleInUndirrectedGraph {
	static boolean[] v = new boolean[10];
	public static void main(String[] args){	
		int[][] a={
				{0,1,1,1,0,0,0},
				{1,0,0,1,0,0,0},
				{1,0,0,0,1,0,1},
				{1,1,0,0,0,0,0},
				{0,0,1,0,0,1,1},
				{0,0,0,0,1,0,0},
				{0,0,1,0,1,0,0}
		};

		System.out.println(util(a));
	}
	private static boolean util(int[][] a) {
		boolean r=false;
		int c=0;
			for(int i=0;i<a.length;i++){
				
				for(int q=0;q<a.length;q++)v[q]=false;
				
				for(int j=i;j<a[0].length;j++){
					if(i==j && a[i][j]==1) return true;
					 if(a[i][j]==1){
						r = fun(a,i,j);
					}
				}
			}
			return r;
		}
	private static boolean fun(int[][] a,int I,int J) {
		// TODO Auto-generated method stub
		if(v[J])return true;
		v[J]=true;
		for(int i=J;i<a.length;i++){
			for(int j=0; j<a[0].length && j!=I; j++){
				if(a[i][j]==1){
					return fun(a,i,j);
				}
			}
		}
		return false;
	}
}