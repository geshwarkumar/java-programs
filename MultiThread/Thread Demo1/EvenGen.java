/*JAVA CODE TO DEMONSTRATE MULTIPLE THREAD BY IMPLEMENTING RUNNABLE
-GESHWAR KUMAR
-07/02/2017*/

class EvenGen implements Runnable{
	EvenGen(){}
	
	public void run(){
		for(int iter=0 ; iter<=100 ; iter += 2){
			System.out.println("Even Number: " + iter);
		}
	}
}