package tree;

class tr{
	tr l;
	tr r;
	char data;
}
public class ExpresionTree {

	static tr getnode(char d){
		tr t=new tr();
		t.data=d;
		t.l=null;
		t.r=null;
		return t;
	}
	
	public static void main(String[] args){
		tr root=getnode('*');
		root.l=getnode('*');
		root.l.l=getnode('2');
		root.l.r=getnode('7');
		root.r=getnode('*');
		root.r.l=getnode('1');
		root.r.r=getnode('*');
		root.r.r.l=getnode('1');
		root.r.r.r=getnode('1');
		pre(root);
		System.out.println();
		System.out.println(evaluate(root));
	}

	private static void pre(tr root) {
		// TODO Auto-generated method stub
		if(root==null)return;
		pre(root.l);
		System.out.print(root.data+" ");
		pre(root.r);
	}
	static int[] st = new  int[100];
	static int op1=0, op2=0;
	static int k=-1;
	
	private static int evaluate(tr root) {
		if(root==null) return 0;
		evaluate(root.l);
		evaluate(root.r);
		if(root.data =='+' || root.data=='-' || root.data=='*' ||root.data=='/'){
			op2 = (int) st[k--];
			op1 = (int) st[k--];
			op1=getres(op1,op2,root.data);	
			st[++k]=op1;
		}
		else{
			
			st[++k]=root.data-'0';
			}	
		return op1;
	}

	private static int getres(int op1, int op2, char data) {
		switch(data){
		case '+' : return op1 + op2;
		case '-' : return op1 - op2;
		case '*' : return op1 * op2;
		case '/' : return op1 / op2;
		}
		return 0;
	}
}