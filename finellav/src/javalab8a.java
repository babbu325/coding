
import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javalab8a extends Applet implements ActionListener {

	
	Button b;
	TextField t;
	
	public void init()
	{
	b=new Button("B");	
	t=new TextField(10);	
	
	add(b);
	add(t);
	
	b.addActionListener(this);
	t.addActionListener(this);
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String s=t.getText();
		int n=Integer.parseInt(s);
		
		int r=0,n1=0;
		while(n>0)
		{
			
			r=n%10;
			n=n/10;
			n1=n1*10+r;
		}
		
		//System.out.println("reversed:"+n1);
		
		
	
	
	
	showStatus(String.valueOf(n1));

}
}
