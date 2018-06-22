
public class functionOverloading {

	void fun(Integer i)
	{
		System.out.println(i);
	}
	
	void fun(String i)
	{
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {

		functionOverloading f=new functionOverloading();
		Integer i=null;
		f.fun(i);
	}

}
