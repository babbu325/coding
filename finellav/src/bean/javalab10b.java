package bean;

public class javalab10b implements java.io.Serializable{
	double val;
	public javalab10b()
	{
	}
	public double getVal() {
		return val;
	}
	public void setVal(double val) {
		this.val = val;
	}
	
	public double conv(){
		return (val*1.6);
	}
}
