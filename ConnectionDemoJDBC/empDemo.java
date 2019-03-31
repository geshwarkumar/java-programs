import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class empDemo extends JFrame implements ActionListener,ItemListener
{
	Object data[][];
	Connection con;
	JButton btnInsert,btnExit,btnClear;
	JLabel lblEmpId,lblName,lblFName,lblCompany,lblAddress,lblGender,lblContact,lblSalary;
	JTextField txtEmpID,txtName,txtFName,txtContact,txtSalary;
	JTextArea txtAddress;
	JComboBox cmbCompany;
	Font font;
	Container c;
	ButtonGroup bg;
	JRadioButton rbMale,rbFemale;
	empDemo()
	{
		/*****CONNECTION STABLISMENT*****/
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con = DriverManager.getConnection("jdbc:odbc:DemoJDBC");	
		/******FORM LAYOUT******/
		c = getContentPane();
		setSize(500,500);
		font = new Font("",Font.BOLD,10);
		setFont(font);
		setTitle("Connectivity Demo With JDBC");
		c.setLayout(null);
		
		/**********EMPID*********/
		lblEmpId = new JLabel("Empployee Id:");
		lblEmpId.reshape(10,30,150,20);
		c.add(lblEmpId);
		
		txtEmpID = new JTextField();
		txtEmpID.reshape(100,30,100,20);
		txtEmpID.setEditable(false);
		c.add(txtEmpID);
		
		/**********EMP NAME*********/
		lblName = new JLabel("Name:");
		lblName.reshape(10,60,150,20);
		c.add(lblName);
		
		txtName = new JTextField();
		txtName.reshape(100,60,100,20);
		c.add(txtName);
		
		/**********EMP FATHER NAME*********/
		lblFName = new JLabel("Father Name:");
		lblFName.reshape(10,90,150,20);
		c.add(lblFName);
		
		txtFName = new JTextField();
		txtFName.reshape(100,90,100,20);
		c.add(txtFName);
		
		/**********EMP COMPANY*********/
		lblCompany = new JLabel("Company:");
		lblCompany.reshape(10,120,150,20);
		c.add(lblCompany);
		
		cmbCompany = new JComboBox();
		cmbCompany.addItem("IBM");
		cmbCompany.addItem("TCS");
		cmbCompany.addItem("INFOSYS");
		cmbCompany.addItem("WIPRO");
		cmbCompany.reshape(100,120,100,20);
		c.add(cmbCompany);
		//c.add(lblEmpId);
		
		/*************EMP GENDER*****************/	
		lblGender = new JLabel("Gender:");
		lblGender.reshape(10,150,150,20);
		c.add(lblGender);
		
		rbMale = new JRadioButton("Male");
		rbMale.reshape(100,150,60,20);
		c.add(rbMale);
		rbFemale = new JRadioButton("Female");
		rbFemale.reshape(160,150,100,20);
		c.add(rbFemale);
		
		bg = new ButtonGroup();
		bg.add(rbMale);
		bg.add(rbFemale);
		
		/*************EMP ADDRESS*****************/	
		lblGender = new JLabel("Address:");
		lblGender.reshape(10,180,150,20);
		c.add(lblGender);
		
		txtAddress = new JTextArea();
		txtAddress.reshape(100,180,100,20);
		//a.setText("Iam DataBase Manager of pre student information \nU can select one name from the list to modify information.\n After selecting Name U can click OK button to go Next");
		JScrollPane js = new JScrollPane(txtAddress);
		js.reshape(100,180,100,20);
		c.add(js);
		
		/**********EMP CONTACT*********/
		lblContact = new JLabel("Contact:");
		lblContact.reshape(10,210,150,20);
		c.add(lblContact);
		
		txtContact = new JTextField();
		txtContact.reshape(100,210,100,20);
		c.add(txtContact);
		
		/**********EMP SALARY*********/
		lblSalary = new JLabel("Salary:");
		lblSalary.reshape(10,240,150,20);
		c.add(lblSalary);
		
		txtSalary = new JTextField();
		txtSalary.reshape(100,240,100,20);
		c.add(txtSalary);
		
		/****************BUTTON******************/		
		btnInsert = new JButton("Insert",new ImageIcon(""));
		btnInsert.reshape(10,270,100,20);
		c.add(btnInsert);
		btnClear = new JButton("Clear",new ImageIcon(""));
		btnClear.reshape(105,270,100,20);
        c.add(btnClear);
		btnExit = new JButton("Exit",new ImageIcon(""));
		btnExit.reshape(205,270,100,20);
		c.add(btnExit);
				
		show();
		btnInsert.addActionListener(this);
		btnClear.addActionListener(this);
		btnExit.addActionListener(this);
		
		rbMale.addActionListener(this);
		rbFemale.addActionListener(this);
		
		cmbCompany.addItemListener(this);
		
	}
		
		public void itemStateChanged(ItemEvent ie)
		{
			
			//t3.setText(""+cmbCompany.getSelectedItem());
		}
		public void actionPerformed(ActionEvent e)
		{
			Object s= e.getSource();
			if(s==btnInsert)
			{
				
				try
				{
					String sql = "Insert Into demoJDBC (Name,FatherName,Address,Telephone,Salary) " +
					"Values ('"+txtName.getText().trim()+"','"+txtFName.getText().trim()+"','"+txtAddress.getText().trim()+"','"+txtContact.getText().trim()+"','"+txtSalary.getText().trim()+"')";
					Statement statement = con.createStatement();
					statement.execute(sql);
					System.out.println("Inserted Successfully.");
				}
				catch(Exception ex)
				{
					System.out.println("Error: "+ ex);
				}
			}
			if(s==btnExit)
			{
				dispose();
			}
			if(s==btnClear)
			{
				
			}
			if(e.getSource()==rbMale)
			{
			}
			if(e.getSource()==rbFemale)
			{
			}
		}
		public static void main(String a[])
		{
			new empDemo();
		}
}	