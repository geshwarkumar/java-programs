/*JAVA PROGRAM TO ADDITION OF TWO NUMBER
-GESHWAR KUMAR
-17/01/2017*/

class GetSum
{
	int num1,num2 ;
	GetSum()
	{
		num1 = 10 ;
		num2 = 20 ;
	}
	void getSum()
	{
		System.out.println("ADDITION OF GIVEN NUMBER IS = "+(num1+num2));
	}
	public static void main(String[] argv)
	{
		GetSum gs = new GetSum() ;//REFERENCE VARIABLE FOR CLASS
		gs.getSum();
		/*	GetSum gs ; //OBJECT FOR CLASS
			gs.getSum();
		*/
	}
}