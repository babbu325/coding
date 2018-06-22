

package quad2java2a;

import quad1java2a.vehivle;

//import quad1java2a.vehivle;

class twovhiler {
	
	public int l;
	private int m;
	protected int n;
	 twovhiler(int x,int y,int z)
	 {
		 
	l=x;
	m=y;
	n=z;
	}
	
	
}

public class myvehical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		twovhiler t1=new twovhiler(1,2,3);
		vehivle t2=new vehivle();
		System.out.println("l-->public\n m-->private\nn--->protected"+t1.l +"/t" +t1.m+"\t"+t1.n);
		
	}

}
