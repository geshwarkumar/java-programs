/*JAVA PROGRAM TO DEMONSTRATE TWO WAY COMMUNICATION BETWEEN TWO DIFFERENT OBJECTS
-GESHWAR KUMAR
-24/01/2017*/

class clsTwoWayDemo
{
	public static void main(String[] args)
	{
		cls_A obj_A = new cls_A() ;
		cls_B obj_B = new cls_B(obj_A) ;
	}
}