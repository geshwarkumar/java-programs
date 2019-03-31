class DeadlockDemo implements Runnable{
	clsA objA = new clsA();
	clsB objB = new clsB();
	
	DeadlockDemo(){
		Thread.currentThread().setName("Main Thread.");
		Thread th1 = new Thread(this,"Racing Thread.");
		th1.start();
		
		objA.foo(objB);
		System.out.println("Back in Main Thread.");
	}
	public void run(){
		objB.bar(objA);
		System.out.println("Back in Other Thread.");
	}
	public static void main(String[] argv){
		new DeadlockDemo();
	}
}