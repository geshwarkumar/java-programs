/*JAVA CODE TO DEMONSTRATE MULTIPLE THREAD BY EXTENDING THREAD CLASS
-GESHWAR KUMAR
-07/02/2017*/

class ThreadDemo1{
	
	public static void main(String[] argv){
		EvenGen objE = new EvenGen();
		OddGen objO = new OddGen();
		System.out.println("Waiting main Thread...");
	}
}