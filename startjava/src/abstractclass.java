
    interface A{
	abstract void print();
}
public class abstractclass implements A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A o = new abstractclass();
		o.print();
	    o.main();//not possible

}
     void dis(){
    	 System.out.println("main");
     }
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("instance");
		
	}
}