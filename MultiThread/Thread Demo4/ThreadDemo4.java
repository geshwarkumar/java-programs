/*JAVA CODE TO DEMONSTRATE SUSPEND() AND RESUME() METHOD IN MULTIPLE THREAD
-GESHWAR KUMAR
-11/02/2017*/

class ThreadDemo4
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
			th2.start();
			
			if(objE.count1 == 2)
			{
				th1.suspend();
				th2.join();
				th1.resume();
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error: " + ex);
		}
	}
}