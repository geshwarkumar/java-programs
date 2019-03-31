class clsB{
	synchronized void bar(clsA objA){
		String name = Thread.currentThread().getName();
		System.out.println(name + "Entered objB.bar().");
		
		try{
			Thread.sleep(1000);
		}
		catch(Exception ex){}
		
		System.out.println(name + "Trying to call objA.last().");
		objA.last();
	}	
	synchronized void last(){
		System.out.println("Inside objB.last().");
	}
}