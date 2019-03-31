import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.applet.*;

class ArithmeticCal extends JFrame implements ActionListener{
	/*DECLARATION*/
	JLabel lbl1,lbl2,lbl3;
	JTextField txt1,txt2,txt3;
	JButton btn1,btn2;
	Container cont;
	
	ArithmeticCal(){
		/*CONTAINER AREA*/
		cont = getContentPane();
		cont.setLayout(null);
		
		setSize(1000,500);
		setLocation(100,100);
		setTitle("Arithmetical Operation");
		setResizable(true);
		/*LABEL AND TEXT AREA*/
		lbl1 = new JLabel("Enter value for num1: ");
		lbl1.reshape(20,20,100,20);
		cont.add(lbl1);
		
		txt1 = new JTextField();
		txt1.reshape(160,20,100,20);
		cont.add(txt1);
		
		lbl2 = new JLabel("Enter value for num2: ");
		lbl2.reshape(20,40,100,20);
		cont.add(lbl2);
		
		txt2 = new JTextField();
		txt2.reshape(160,40,100,20);
		cont.add(txt2);
		
		lbl3 = new JLabel("Result: ");
		lbl3.reshape(20,60,100,20);
		cont.add(lbl3);
		
		txt3 = new JTextField();
		txt3.reshape(160,60,100,20);
		cont.add(txt3);		
				
		btn1 = new JButton("Add");
		btn1.reshape(140,100,100,20);
		cont.add(btn1);
		
		btn2 = new JButton("Cancel");
		btn2.reshape(260,100,100,20);
		cont.add(btn2);
		
		show();
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btn1){
			int num1 = Integer.parseInt(txt1.getText());
			int num2 = Integer.parseInt(txt2.getText());
			int num3 = num1 + num2 ;
			txt3.setText("" + num3);
		}
		if(e.getSource() == btn2){
			this.dispose();
		}
	}
	public static void main(String[] argv){
		new ArithmeticCal();
	}
}