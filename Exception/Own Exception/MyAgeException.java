/*JAVA CODE TO DEMONSTRATE HOW TO CREATE OWN EXCEPTION
-GESHWAR KUMAR
-04/02/2017*/
/***************************************

***************************************/
class MyAgeExpection extends Exception
{
	int age ;
	
	MyAgeExpection(int age)
	{
		this.age = age;
	}
	public String toString()
	{
		return "Exception MyAgeExpection:-ve age = " + age ;
	}
}