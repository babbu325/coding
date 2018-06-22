todo
package tree;

class checkroot{
	boolean check = true;
}
public class distanceBetweenNodes {
	Node root;
	int fun(int n1, int n2){
		checkroot ch = new checkroot();
		return fun2(root, n1 ,n2, ch);
	}
	
	int fun2(Node node, int n1, int n2, checkroot ch){
		if(node==null) return 0;
		
		int lf = fun2(node.l, n1, n2, ch);
		int rt = fun2(node.r, n1, n2, ch);
		if(node.d==n1 || node.d==n2){
			 if(ch.check==true){
				 ch.check=false;
				 return (lf!= 0)? lf : rt;
			 }
			 else return 1; 
			}
		if(lf != 0 && rt != 0)return lf + rt;
		
		
		if(lf!= 0)return lf+1;
		else if(rt != 0) return rt+1;
		else return 0;
	}
	public static void main(String[] args) {
		distanceBetweenNodes tree = new distanceBetweenNodes();
		tree.root = new Node(1);
		tree.root.l = new Node(2);
		tree.root.l.l = new Node(3);
		tree.root.l.r = new Node(4);
		tree.root.r = new Node(5);
		tree.root.r.l = new Node(6);
		System.out.println(tree.fun(1,3));
				
	}
}
