import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javalab14a extends Applet implements ActionListener {

	Button red,yellow,green,blue;
	
 public void init()
 {
	 
	 red=new Button("RED");
	 yellow=new Button("YELLOW");
	 green=new Button("GREEN");
	 blue=new Button("BLUE");

add(red);
add(yellow);
add(green);
add(blue);
      
              red.addActionListener(this);
              yellow.addActionListener(this);
              green.addActionListener(this);
              blue.addActionListener(this);
	 
 }
	
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		String s=e.getActionCommand();
		if(s.equals("RED"))
			setBackground(Color.red);
		if(s.equals("YELLOW"))
			setBackground(Color.yellow);
		if(s.equals("GREEN"))
			setBackground(Color.green);
		if(s.equals("BLUE"))
			setBackground(Color.blue);
		
	}

}
