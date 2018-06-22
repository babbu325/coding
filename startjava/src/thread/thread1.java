package thread;

public class thread1 implements Runnable {
       
	Thread t;
	thread1()
	{
		t= new Thread(this, "thread1");
		System.out.println("Thread 1 is " + t);
		t.start();
	}
	
	@Override
	public void run() {
		try
		{
			for(int i=0; i< 5; i++)
				{System.out.println("child thrad :" + i);
			Thread.sleep(500);}
		}
		catch(InterruptedException e)
		{
			System.out.printf("thread is interrupted:");
		}
		System.out.printf("\n  i m thread1 and i m done ");
	}

}






