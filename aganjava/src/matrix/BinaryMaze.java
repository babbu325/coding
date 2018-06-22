package matrix;
import java.util.*;

class point{
	int x,y;
	point(int a,int b){
		x=a;
		y=b;
	}
}

class val{
	point pnt;
	int dis;
	val(point P, int D){
		pnt=P;
		dis=D;
	}
}
public class BinaryMaze {
	

static int[] row = {-1, 0, 1, 0};
static int[] col = { 0, 1, 0,-1};

	static boolean isValid(int r,int c, int x, int y){
		return(x>=0&& x<r && y>=0&&y<c);
	}

	static int calculateD(int[][] m, int r, int c, point src, point dst){
	if(m[src.x][src.y]!=1 && m[dst.x][dst.y]!=1)return -1;
	
	boolean vis[][] = new boolean[r][c];
	vis[src.x][src.y]=true;
	Queue<val> q = new LinkedList<val>();;
	val v = new val(src, 0);
	q.add(v);
	
		while(!q.isEmpty()){
			val val = q.poll();
			point p = val.pnt;
			if(p.x==dst.x && p.y==dst.y)return val.dis;
			
			for(int i=0;i<4;i++){
				int X = p.x+row[i];
				int Y = p.y+col[i];
				if(isValid(r,c,X,Y) && m[X][Y]==1 && !vis[X][Y]){
					vis[X][Y] =true;
					point P = new point(X,Y);
					val next =new val(P, val.dis+1);
					q.add(next);
				}
			}
		}
	return -1;
}
	
	public static void main(String[] args) {
		int[][] mat =
		    {
		        { 1, 1, 1, 0, 1, 1, 0, 1, 1, 1 },
		        { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
		        { 1, 0, 1, 0, 1, 1, 0, 1, 0, 1 },
		        { 1, 0, 1, 0, 1, 0, 0, 0, 0, 1 },
		        { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
		        { 0, 0, 0, 1, 1, 1, 0, 1, 0, 0 },
		        { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
		        { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
		        { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }
		    };
		int r = mat.length;
		int c = mat[0].length;
		point src = new point(0,2);
		point dst = new point(0,0);
		int res = calculateD(mat,r,c, src, dst);
		System.out.println(res);
	}
}
