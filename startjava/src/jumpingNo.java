import java.util.LinkedList;
import java.util.Queue;

public class jumpingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x= 140;
		for(int i=1;i<=9;i++)
		fun(x, i);
		
	}

	private static void fun(int x, int i) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new LinkedList();
		q.add(i);
		
		while(!q.isEmpty()){
			
			i = q.poll();
			if(i <= x){
				System.out.print(i+" ");
				
				if(i%10 == 0)q.add(i*10 + i%10+1);
				else if(i%10==9)q.add(i*10 + i%10 - 1);
				else {
					q.add(i*10 + i%10 - 1);
					q.add(i*10 + i%10 + 1);
				}
			}
		}
	}
}