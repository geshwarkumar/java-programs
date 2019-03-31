import java.net.*;
import java.io.*;

class clsClient{
	
	public static void main(String args[]) throws Exception{
		int c;
		String str = "";
		Socket s = new Socket("localhost",50);
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		while(true){
			while(true){
				c = System.in.read();
				switch(c){
					case -1:
							System.out.println("Your session is end.");
							return;
					case '\r':
							break;
					case '\n':
							byte buf[] = str.getBytes();
							str = "";
							out.write(buf);
					default:
							str = str+(char)c;
				}
			}
		}
	}
}