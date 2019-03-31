
//wap to read data from user and insert a record into a DB

import java.sql.*;
import java.util.*;

public class prog12
{
public static void main(String az[])
{ 
try
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Emp ID:");
int id=sc.nextInt();
System.out.println("Enter Emp Name:");
String name=sc.next();
System.out.println("Enter Emp Salary:");
int sal=sc.nextInt();

DriverManager.registerDriver(new com.mysql.jdbc.Driver());
Connection con=DriverManager.getConnection("jdbc:mysql://10.0.16.172:3306/mydb?user=root&password=");
Statement st=con.createStatement();
int a=st.executeUpdate("insert into mydb values("+ id +",'"+ name +"',"+ sal +")");
con.close();
System.out.println(a+"Record Successfully Inserted...");
}
catch(SQLException e)
{
System.out.println(e);
}
}
}