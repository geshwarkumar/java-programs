/*JAVA CODE TO DEMONSTRATE HOW TO CREATE OWN EXCEPTION
-GESHWAR KUMAR
-04/02/2017*/
class MyAgeExceptionDemo
{
	public static void main(String[] argv)
	{
		putAge obj1 = new putAge(25);
		putAge obj2 = new putAge(-25);
		try
		{
			obj1.showAge();
			obj2.showAge();
		}
		catch(Exception ex)
		{
			System.out.println("Error: " + ex);
		}
	}
}