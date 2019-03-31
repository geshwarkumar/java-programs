import java.net.*;
import java.io.*;

class clsServer{
	String str;
	ServerSocket s;
	Socket s1;
	InputStream in;
	OutputStream out;
	
	clsServer(){
		try{
			int c;
			s = new ServerSocket(50);
			System.out.println("Server is ready to accept request...");
			s1 = s.accept();
			in = s1.getInputStream();
			out = s1.getOutputStream();
			
			while((c = in.read())!= -1){
				System.out.print(""+(char)c);
			}
			
			String str = "OK";
			byte buf[] = str.getBytes();
			out.write(buf);
			System.out.println("Here");
		}
		catch(Exception ex){
			System.out.println(""+ex);
		}
	}
	public static void main(String args[]){
		new clsServer();
	}
}