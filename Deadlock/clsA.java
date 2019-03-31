class clsA{
	synchronized void foo(clsB objB){
		String name = Thread.currentThread().getName();
		System.out.println(name + "Entered objA.foo().");
		
		try{
			Thread.sleep(1000);
		}
		catch(Exception ex){}
		
		System.out.println(name + "Trying to call objB.last().");
		objB.last();
	}
	synchronized void last(){
		System.out.println("Inside objA.last().");
	}
}