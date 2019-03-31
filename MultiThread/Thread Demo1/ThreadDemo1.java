/*JAVA CODE TO DEMONSTRATE MULTIPLE THREAD BY IMPLEMENTING RUNNABLE
-GESHWAR KUMAR
-07/02/2017*/

class ThreadDemo1{
	
	public static void main(String[] argv){
		EvenGen objE = new EvenGen();
		OddGen objO = new OddGen();
		
		Thread th1 = new Thread(objE);
		Thread th2 = new Thread(objO);
		
		try{
			th1.start();
			th2.start();
		}
		catch(Exception ex){
			System.out.println("Waiting main Thread...");
		}
	}
}