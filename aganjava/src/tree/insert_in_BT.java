package tree;

public class insert_in_BT {

	static Node root;
	public static void main(String[] args) {
		insert_in_BT tree = new insert_in_BT();
		tree.root = new Node(1);
		tree.root.l = new Node(2);
		tree.root.r = new Node(3);
		tree.root.l.l = new Node(4);
//		tree.root.l.r = new Node(5);
		tree.root.r.l = new Node(6);
		tree.root.r.r = new Node(7);
		System.out.println("before:");
		inorder(root);
		System.out.println();
		insert(8, root);
		System.out.println();
		System.out.println("after:");
		inorder(root);
		
	}
	
	private static void inorder(Node root) {
		if(root==null)return;
		inorder(root.l);
		System.out.print(root.d+" ");
		inorder(root.r);
	}
	private static void insert(int v, Node root) {
		if(root==null) {
			System.out.println("root is null");
			return;
		}
		Node[] a = new Node[20];
		int s=0, e=0;
		a[s]=root;
		while(s<=e){
			Node n = a[s++];
			if(n!=null){
				if(n.l != null){
					e= (s-1)*2+1;
					a[e] = n.l;
				}
				if(n.r != null){
					e = (s-1)*2+2;
					a[e] = n.r;
				}
			}
		}
		
		int i=0;
		System.out.println("before adding");
		System.out.println(e);
		while(i<=e){
			if(a[i]!=null)
				System.out.print(a[i].d+" ");
			i++;
		}
		i=0;
		while(i<=e){
			Node n = a[i];
			if(n.l==null){
				n.l = new Node(v);
				if(2*i+1 > e)e = 2*i+1;
				a[2*i+1]=n.l;
				break;
			}
			if(n.r==null){
				n.r = new Node(v);
				if(2*i+2 > e)e = 2*i+2;
				a[2*i+2]=n.r;
				break;
			}
			i++;
		}
		
		i=0;
		System.out.println("after adding:");
		System.out.println(e);
		while(i<=e){
			if(a[i]!=null)
				System.out.print(a[i].d+" ");
			i++;
		}
	}
	
}
