/*JAVA CODE TO DEMONSTRATE MULTIPLE THREAD BY IMPLEMENTING RUNNABLE
-GESHWAR KUMAR
-07/02/2017*/

class OddGen implements Runnable{
	OddGen(){}
	
	public void run(){
		for(int iter=1 ; iter<=100 ; iter += 2){
			System.out.println("Odd Number: " + iter);
		}
	}
}