
public enum  hello2{
    
    ram1("name1", "age1","sex1"),
    ram2("name2","age2","sex2"),
    ram3("name3","age3","sex3"),
	ram4("name4","age4","sex4"),
    ram5("name5","age5","sex5"),
	 ram6("name6","age6","sex6"),
	 ram7("name7","age7","sex7"),
	 ram8("name8","age8","sex8"),
	 ram9("name9","age9","sex9");
	
	private String name;
	private String age;
	private String sex;
	
     hello2(String n,String a,String s) {
	 name=n;
	 age=a;
	 sex=s;
	}
	
	 public String getname()
	 {
		 return name;
	 }
     
	 public String getage()
	 {
	 return age;
	 }
	 
	 public String getsex()
	 {
		 return sex;
	 }
}