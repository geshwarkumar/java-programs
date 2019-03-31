/*JAVA CLASS FOR SECOND CLASS
-GESHWAR KUMAR
-24/07/2017*/

class cls_B
{
	cls_A obj_A ;
	int a,b ;
	cls_B(cls_A obj_A){
		System.out.println("...THIS IS 2ND CLASS...");
		this.obj_A = obj_A ;
		obj_A.a = 200 ;
		obj_A.b = 100 ;
		obj_A.getSum();
		obj_A.getRef(this);
	}
	void getSub()
	{
		System.out.println("Sub  = "+(a-b));
	}	
}