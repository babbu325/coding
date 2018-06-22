//http://www.geeksforgeeks.org/directi-interview-experience-set-14-on-campus/
package tree;

import java.util.ArrayList;
import java.util.Iterator;

class A{
	 int max=0;
}

public class MaximumLengthBtnTwoLeafs {

	static tree getnode(int d){
		
		tree t= new tree();
		t.l=null;
		t.r=null;
		t.data=d;
		return t;
	}
	 static int max=0;
	public static void main(String[] args) {
		tree root =  getnode(10);
		 root.l =  getnode(15);
		 root.l.l =  getnode(14);
		root.l.r =  getnode(18);
		 root.r =  getnode(1);
		root.r.r =  getnode(1);
		root.r.l =  getnode(1);
		A a = new A();
		post(root, a);
		System.out.println(a.max);
}
	
 private static  int post(tree root, A a){
		if(root==null) return 0;
		
		int l = post(root.l,a);
		int r = post(root.r,a);
		int c= l+r+root.data;
		if(a.max<c) a.max=c;
		return root.data + Math.max(l, r);
	}
}