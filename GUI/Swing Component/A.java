import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class empDemo extends JFrame implements ActionListener,ItemListener
{
	Object data[][];
	JLabel l;
	JButton b1,b2,b3;
	JLabel l1,l3,l4;
	JTextField t1,t2,t3;
	JTextArea a;
	JComboBox cb1,cb2;
	Font font;
	Container c;
	ButtonGroup bg;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
	empDemo()
	{
		c = getContentPane();
		setSize(600,480);
		font = new Font("",Font.BOLD,10);
		setFont(font);
		setTitle("JavaWindow");
		c.setLayout(null);
		
		l1 = new JLabel("FOR OFFICE USE ONLY",new ImageIcon("ra_tool_copy1.gif"),JLabel.LEFT);
		l1.reshape(0,30,150,20);
		c.add(l1);
		l1 = new JLabel("ADMISSION FORM",new ImageIcon("ra_tool_copy1.gif"),JLabel.LEFT);
		l1.reshape(300,30,150,20);
		c.add(l1);
		l1 = new JLabel("ADMISSION.NO",new ImageIcon("ra_tool_copy1.gif"),JLabel.LEFT);
		l1.reshape(0,50,100,20);
		c.add(l1);
		t1 = new JTextField();
		t1.reshape(120,50,100,20);
		c.add(t1);
		l1 = new JLabel("Rcpt.No",new ImageIcon("ra_tool_copy1.gif"),JLabel.LEFT);
		l1.reshape(250,50,100,20);
		c.add(l1);
		t2 = new JTextField();
		t2.reshape(350,50,100,20);
		c.add(t2);
		l1 = new JLabel("Session",new ImageIcon(""),JLabel.LEFT);
		l1.reshape(550,50,100,20);
		cb1 = new JComboBox();
		cb1.addItem("2001-2002");
		cb1.addItem("2002-2003");
		cb1.addItem("2003-2004");
		cb1.addItem("2004-2005");
		cb1.reshape(600,50,100,20);
		c.add(cb1);
		c.add(l1);
		t3 = new JTextField("Select list");
		t3.reshape(550,80,200,20);
		t3.setEditable(false);
		c.add(t3);
		cb2 = new JComboBox();
		cb2.addItem("Computer Science");
		cb2.addItem("IT");
		cb2.addItem("Mechnical Engg.");
		cb2.addItem("Electrical Engg.");
		cb2.addItem("Elex Engg.");
		cb2.reshape(300,120,150,20);
		c.add(cb2);
		b1 = new JButton("Save",new ImageIcon("ra_tool_newcard1.gif"));
		b1.reshape(200,500,150,30);
		c.add(b1);
		b2 = new JButton("Cancel",new ImageIcon("back.gif"));
		b2.reshape(350,500,150,30);
        c.add(b2);
		String[] colname = {"Adm_No","Rcpt_No","3.Session","4.BankSlip","5.No","Class","Subject","Name","F_Name","M_Name","Occupation","Work","Dob","Dob in word"};
		data = new Object[6][14];
		JTable table = new JTable(data,colname);
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp = new JScrollPane(table,v,h);
		jsp.reshape(10,200,780,150);
		c.add(jsp);
		
		a = new JTextArea();
		a.reshape(20,380,400,130);
		a.setText("Iam DataBase Manager of pre student information \nU can select one name from the list to modify information.\n After selecting Name U can click OK button to go Next");
		JScrollPane js = new JScrollPane(a);
		js.reshape(20,380,400,100);
		c.add(js);
		
		r1 = new JRadioButton("Searching only by Session");
		r1.reshape(500,350,300,20);
		c.add(r1);
		r2 = new JRadioButton("Searching by Session and class");
		r2.reshape(500,370,300,20);
		c.add(r2);
		r3 = new JRadioButton("Searching by student name and class");
		r3.reshape(500,390,300,20);
		c.add(r3);
		r4 = new JRadioButton("Searching Admission number");
		r4.reshape(500,410,300,20);
		c.add(r4);
		r5 = new JRadioButton("Listing students information by class");
		r5.reshape(500,430,300,20);
		c.add(r5);
		r6 = new JRadioButton("Number of student in class and Session");
		r6.reshape(500,450,300,20);
		c.add(r6);
		r7 = new JRadioButton("Listing Discontinued or TC Issued Stundents in Session");
		r7.reshape(500,470,300,20);
		c.add(r7);
		
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		bg.add(r5);
		bg.add(r6);
		bg.add(r7);
		
		show();
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);
		r5.addActionListener(this);
		r6.addActionListener(this);
		r7.addActionListener(this);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		}
		
		public void itemStateChanged(ItemEvent ie)
		{
			if(ie.getSource()==cb2)
			t3.setText(""+cb1.getSelectedItem());
		}
		public void actionPerformed(ActionEvent e)
		{
			Object s= e.getSource();
			if(s==b1)
			{
			}
			if(s==b2)
			{
				dispose();
			}
			if(s==b3)
			{
			}
			if(e.getSource()==r1)
			{
			}
			if(e.getSource()==r2)
			{
			}
			if(e.getSource()==r3)
			{
			}
			if(e.getSource()==r4)
			{
			}
			if(e.getSource()==r5)
			{
			}
			if(e.getSource()==r6)
			{
			}
			if(e.getSource()==r7)
			{
			}
		}
			public static void main(String a[])
			{
				new empDemo();
			}
}			
			
		
		