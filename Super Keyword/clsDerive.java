/*JAVA CLASS FOR DERIVE
-GESHWAR KUMAR
-17/01/2017*/
/*DERIVED CLASS*/
class clsDerive extends clsBase
{
	int c,d ;
	clsDerive(int a,int b)
	{
		super(a,b) ;
		c = a*10 ;
		d = b*10 ;
	}
	void DispDerive()
	{
		System.out.println("Addition of two no: "+(c+d));
	}
}//END DERIVED CLASS
