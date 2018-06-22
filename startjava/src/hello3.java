
public class hello3 {

	private int month;
	private int day;
	private int year;
	
	public  hello3(int d,int m, int y)
	{
	   	day=d; 
		month =m;
	   	year=y;
	   	
	   	//System.out.printf("we r here : \t %s",this);
	}

	 public String toString()
	 {
		 return String.format("%d/%d/%d",day,month,year);
		 
	 }
	 
	
	
	
}



