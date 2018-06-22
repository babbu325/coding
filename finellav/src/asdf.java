class t implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("-----------");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("buraaaaaaaaah");
	}
	
}

class t2 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("asdfghjhgfdsasdfgh");
	}
	


}


public class asdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	Thread tt1=new Thread(new t());
	Thread tt2=new Thread(new t2());	
		tt1.setPriority(Thread.MAX_PRIORITY);
		tt1.start();
		tt2.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
