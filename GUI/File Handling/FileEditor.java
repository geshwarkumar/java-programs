import java.io.*;
import java.awt.*;
import java.awt.event.*;

class FileEditor extends Frame implements ActionListener, WindowListener
{
	MenuItem mnuItem1,mnuItem2,mnuItem3,mnuItem4,mnuItem5;
	MenuBar mnuBar;
	Label lbl1,lblMs;
	String str,strName,strTitle;
	int iter;
	Button btn;
	TextArea txtArea;
	Font font1,font2;
	InputStream in;
	OutputStream out;
	FileEditor()
	{
		font1 = new Font("str",Font.BOLD,10);
		setFont(font1);
		
		setSize(600,400);
		setLocation(50,50);
		
		setLayout(null);
		setResizable(false);
		
		font1 = new Font("fr",Font.BOLD,10);
		setFont(font1);
		
		setTitle("File Editor Demo");
		setForeground(Color.black);
		setBackground(Color.lightGray);
		
		mnuBar = new MenuBar();
		setMenuBar(mnuBar);
		
		Menu file = new Menu("File");
		file.add(mnuItem1 = new MenuItem("New"));
		
		file.add(mnuItem2 = new MenuItem("Open"));
		
		file.add(mnuItem3 = new MenuItem("Save"));
		
		file.add(mnuItem4 = new MenuItem("Close"));
		mnuBar.add(file);
		
		Menu help = new Menu("Help");
		file.add(mnuItem5 = new MenuItem("About Editor"));
		mnuBar.add(help);
		
		txtArea = new TextArea();
		txtArea.reshape(20,50,560,340);
		add(txtArea);
		
		addWindowListner(this);
		mnuItem1.addActionListner(this);
		mnuItem2.addActionListner(this);
		mnuItem3.addActionListner(this);
		mnuItem4.addActionListner(this);
		mnuItem5.addActionListner(this);
		
		show();
	}
	public void windowClosing(WindowEvent w){
		System.exit(0);
	}
	public void windowActivated(WindowEvent w){
		
	}
	public void windowClosed(WindowEvent w){
		
	}
	public void windowDeactivated(WindowEvent w){
		
	}
	public void windowDeiconified(WindowEvent w){
		
	}
	public void windowOpened(WindowEvent w){
		
	}
	
	public void windowPerformed(ActionEvent e)
	{
		if(e.getSource() == mnuItem1){
			txtArea.setText("");
		}
		if(e.getSource() == mnuItem2){
			FileDialog ofd = new FileDialog(this,"Open",FileDialog.LOAD);
			ofd.setVisible(true);
			
			try{
				System.out.println(ofd.getDirectory()+ofd.getFile());
				
				in = new FileInputStream(ofd.getDirectory()+ofd.getFile());
				int count;
				
				String str = "";
				
				while(count = in.read() != -1){
					str = str+(char)count;
					
					txtArea.setText(str);
				}
			}
			catch(Exception ex){
				txtArea.setText("Error for Opening " + ex);
			}
			
		}
		if(e.getSource() == mnuItem3){
			FileDialog sfd = new FileDialog(this,"Save",FileDialog.SAVE);
			ofd.setVisible(true);
			
			try{
				String data = txtArea.getText().trim();
				byte buf[] = data.getBytes();
				
				out = new FileInputStream(sfd.getDirectory()+sfd.getFile());
				out.write(buf);
				
			}
			catch(Exception ex){
				txtArea.setText("Error for Opening " + ex);
			}
			
		}
		if(e.getSource() == mnuItem4){
			
			try{
				in.close();
				out.close();
				dispose();
				
			}
			catch(Exception ex){
				txtArea.setText("Error for Opening " + ex);
			}
			
		}
		if(e.getSource() == mnuItem5){
			
		}
	}
		public static void main(String a[])
		{
			FileEditor obj = new FileEditor();
		}
}	
