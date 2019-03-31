/*JAVA CODE TO DEMONSTRATE HOW TO CREATE OWN EXCEPTION
-GESHWAR KUMAR
-04/02/2017*/
class putAge
{
	int age ;
	
	putAge(int age)
	{
		this.age = age;
	}
	void showAge() throws MyAgeExpection
	{
		if(age<0)
		{
			throw new MyAgeExpection(age);
		}
		else
		{
			System.out.println("Your Age Is: "+age);
		}
	}
}