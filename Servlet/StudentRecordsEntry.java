import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;
import java.sql.*;

public class StudentRecordsEntry extends HttpServlet
{
		ResultSet rs;
		Connection con;
		Statement st;
		String sql;
		String RollNo,Name,Department,Semester,SPI,CPI;
		public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
		{
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			RollNo=request.getParameter("T1");
			Name=request.getParameter("T2");
			Department=request.getParameter("D1");
			Semester=request.getParameter("D2");
			SPI=request.getParameter("T3");
			CPI=request.getParameter("T4");

			try
			{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:StudentRecords");
			st= con.createStatement();
			
			}
			catch(Exception ex)
			{
				pw.println(""+ex);
			}
			
			sql = "INSERT INTO StudentRecords VALUES ('"+RollNo+"', '"+Name+"', '"+Department+"', '"+Semester+"',"+SPI+","+CPI+")";
			
			try
			{
				st.executeUpdate(sql);
				pw.println("<html>");
				pw.println("<body>");
				pw.println("<b>Record Submitted Successfully");
				pw.println("</body>");
				pw.println("</html>");

			}
			catch(Exception e)
			{
				pw.println("<html>");
				pw.println("<body>");
				pw.println("<b>Record Submitted Not Successfully");
				pw.println("</body>");
				pw.println("</html>");
			}
		}
}
			
			













