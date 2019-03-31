/*JAVA CLASS FOR FIRST CLASS
-GESHWAR KUMAR
-24/07/2017*/

class cls_A
{
	cls_B obj_B ;
	int a,b ;
	cls_A(){
		System.out.println("...THIS IS 1ST CLASS...");
	}
	void getSum()
	{
		System.out.println("Sum  = "+(a+b));
	}
	void getRef(cls_B obj_B)
	{
		this.obj_B = obj_B ;
		obj_B.a = 100 ; obj_B.b = 200 ;
		obj_B.getSub();
	}	
}