/*JAVA CODE TO DEMONSTRATE MULTIPLE THREAD BY EXTENDING THREAD CLASS
-GESHWAR KUMAR
-07/02/2017*/

class EvenGen extends Thread{
	EvenGen(){
		try{
			start();
		}
		catch(Exception ex){
			System.out.println("Error: " + ex);
		}
	}
	
	public void run(){
		for(int iter=0 ; iter<=100 ; iter += 2){
			System.out.println("Even Number: " + iter);
		}
	}
}