/*JAVA CODE TO DEMONSTRATE SUSPEND() AND RESUME() METHOD IN MULTIPLE THREAD
-GESHWAR KUMAR
-11/02/2017*/

class OddGen extends Thread{
	int count2;
	OddGen(){
		count2 = 0 ;
	}
	
	public void run(){
		for(int iter=1 ; iter<=100 ; iter += 2){
			System.out.println("Odd Number: " + iter);
			count2 = iter ;
			try{
				Thread.sleep(100);
			}
			catch(Exception ex){
				System.out.println("Error: " + ex);
			}
		}
	}
}