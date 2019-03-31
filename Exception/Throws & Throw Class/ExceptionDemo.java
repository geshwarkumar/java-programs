/*JAVA CODE TO DEMONSTRATE THROW AND THROWS CLASS
-GESHWAR KUMAR
-04/02/2017*/
/***********************************
NOTE: if we main function declared as throws exception then we not use try...catch
************************************/
class ExceptionDemo
{
	public static void main(String[] argv) throws Exception
	{
		DivExpGen obj = new DivExpGen() ;
		
		/*try
		{*/
			int res1 = obj.getDiv(10,5);
			System.out.println("Result:10/5 = " + res1);
			System.out.print("Result:10/0 = ");
			int res2 = obj.getDiv(10,0);
		/*}
		catch(Exception ex)
		{
			System.out.print("Error: Divide by zero." + ex);
		}*/
	}
}