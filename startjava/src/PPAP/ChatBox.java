package PPAP;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ChatBox extends JFrame implements KeyListener{

	JPanel p = new JPanel();
	JTextArea dialog = new JTextArea(30,50);
	JTextArea input = new JTextArea(1,50);
	JScrollPane scroll = new JScrollPane(
			dialog, 
			JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
			);
	
	
	String[][] chatbox = {
			//greetings
			{"hi" , " hello" ,"hey", "hay", "hii" ,"hy" , "hlo"},
			{"hi" ,"hey" ,"hello"},
			
			//Question greetings
			{"ka haal ba","ka haal chal" ,"kaise ho","how are you","how r u","hw are you","hw r you","hw r u","whats up","wts up","how u doing"},
			{"good" , "doing well" ,"mast"},
			
			//default
			{"shut up", "chup ho jaa be","dude , u r bad"," stop talking"}			
	};
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatBox();
	}
	
	public ChatBox(){
		super("Chat Box");
		setSize(600, 400);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		dialog.setEditable(false);
		input.addKeyListener(this);
		p.add(scroll);
		p.add(input);
		p.setBackground(new Color(255,200,0));
		add(p);
		setVisible(true);
	}
	
	//impementation of interface
	public void keyTyped(KeyEvent e) {
		
	}
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode()== KeyEvent.VK_ENTER){
			input.setEditable(false);
			String quote = input.getText();
			input.setText("");
			addText("-->You:\t"+ quote);
			quote=quote.trim();
			/* if Punchuation ,take away */
			while(quote.charAt(quote.length()-1)=='!'
				||	quote.charAt(quote.length()-1)=='.'
				|| quote.charAt(quote.length()-1)=='?'
					){
				quote= quote.substring(0, quote.length()-1);
			}
				quote=quote.trim();
				byte responce=0;
				//0:searching for match
				//1:didn't find
				//2:found match in chatbox
				
				int j=0;
				while(responce==0){
					if(inArray(quote.toLowerCase(), chatbox[j*2]))//j*2 beacouse 0,2,4,6,... are question from user in 2D arrre of string
					{
						responce = 2;
						int r = (int)Math.floor(Math.random() * chatbox[(j*2) +1].length);
						addText("\n-->Obama\t"+chatbox[(j*2)+1][r]);
					}
					j++;
					if(j*2==chatbox.length-1 && responce ==0)
						responce =1;
				}
				if(responce==1){
					int r= (int)Math.floor( Math.random() * chatbox[chatbox.length-1].length);
					addText("\n-->Obama\t"+chatbox[chatbox.length-1][r]);
				}
				addText("\n");
		}
	}
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_ENTER){
			input.setEditable(true);
		}
	}
	
	public void addText(String str){
		dialog.setText(dialog.getText()+str);
	}
	
	public boolean inArray(String in , String[] str ){
		boolean match = false;
		for(int i=0;i<str.length;i++){
			if(str[i].equals(in)) match = true;
		}
		return match;
	}
}
