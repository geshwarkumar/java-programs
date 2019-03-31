/*JAVA CODE TO DEMONSTRATE JOIN METHOD IN MULTIPLE THREAD
-GESHWAR KUMAR
-11/02/2017*/

class ThreadDemo3
{
	public static void main(String[] argv)
	{
		EvenGen objE = new EvenGen();
		OddGen objO = new OddGen();
	
		Thread th1 = new Thread(objE);
		Thread th2 = new Thread(objO);
	
		try
		{
			th1.start();
			th1.join();
			System.out.println("Completed thread1...");
		
			th2.start();
			th2.join();
			System.out.println("Completed thread2");
		}
		catch(Exception ex)
		{
			System.out.println("Error: " + ex);
		}
	}
}