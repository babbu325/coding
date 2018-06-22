package thread;

public class thread_main {

	public static void main(String[] args) {
    
	   thread1 t1= new	thread1();
	   
	   try{
	   for(int i=0; i<5;i++){
		   System.out.println("main thread :" +i );
	       Thread.sleep(1000);
	       }}

	   catch( InterruptedException e){
		   System.out.printf("\n  main thread is interrupted:");
	   }
     
	   System.out.printf("\n  i m main and i m done ");
	}
	

}
