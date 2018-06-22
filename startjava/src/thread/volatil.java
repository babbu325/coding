package thread;

import java.util.Scanner;

class thrd extends Thread{
	int a=1;
	public void run(){
	while(a<10000){
		System.out.println("hello");
		try {
			sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	void set(){
		a=a*2;
	}
	
}

public class volatil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thrd t= new thrd();
		t.start();
		Scanner sc= new Scanner(System.in);
		sc.nextLine();
		t.set();

	}

}
