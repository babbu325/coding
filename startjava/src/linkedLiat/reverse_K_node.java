package linkedLiat;

public class reverse_K_node{

	static  list  getlist(int d){
		list n= new list();
		n.next=null;
		n.data=d;
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		list root= getlist(1);
		root.next= getlist(2);
		root.next= getlist(3);
		root.next= getlist(4);
		root.next= getlist(5);
		root.next= getlist(6);
		root.next= getlist(7);
		root.next= getlist(8);
		root.next= getlist(9);
		root.next= getlist(10);
		root.next= getlist(11);
		root.next= getlist(12);
		root.next= getlist(13);
		list l=root;
		System.out.print(l.data+" kkkk");
		rev(root);
		
		while(l!=null)
			System.out.print(l.data+" ");
	}

	private static void rev(list root) {
		// TODO Auto-generated method stub
		list root1=root;
		
		while(root!= null){
			int a[] = new int[3];
			for(int i=0;i<3;i++){
				if(root!= null){
					a[i++]= root.data;
					root=root.next;
				}
			}
			for(int i=2; i>=0; i--){
				if(root1!=null){
				root1.data=a[i];
				root1= root1.next;
				}
			}
		}	
	}
}
