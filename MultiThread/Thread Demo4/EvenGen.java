/*JAVA CODE TO DEMONSTRATE SUSPEND() AND RESUME() MENTHOD IN MULTIPLE THREAD
-GESHWAR KUMAR
-11/02/2017*/

class EvenGen implements Runnable{
	int count1;
	EvenGen(){
		count1 = 0 ;
	}
	
	public void run(){
		for(int iter=0 ; iter<=100 ; iter += 2){
			System.out.println("Even Number: " + iter);
			count1 = iter ;
			try{
				Thread.sleep(100);
			}
			catch(Exception ex){
				System.out.println("Error: " + ex);
			}
		}
	}
}