/*JAVA PROGRAM TO DEMONSTRATE SINGLE INHERITANCE
-GESHWAR KUMAR
-17/01/2017*/
/*BASE CLASS*/
/*class clsBase
{
	void DispBase()
	{
		System.out.println("This is Base Class.");
	}
}//END BASE CLASS*/
/*DERIVED CLASS*/
/*class clsDerive extends clsBase
{
	void DispDerive()
	{
		System.out.println("This is Derived Class.Derived from Base.");
	}
}//END DERIVED CLASS*/
/*MAIN CLASS*/
class InheritSingle
{
	public static void main(String[] argv)
	{
		clsDerive is = new clsDerive(); 
		is.DispBase() ; 
		is.DispDerive() ;
	}
}
