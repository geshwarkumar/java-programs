/*JAVA CODE TO DEMONSTRATE THROW AND THROWS CLASS
-GESHWAR KUMAR
-04/02/2017*/
/***************************************
NOTE: if we declare Exception object then we need to throws getDiv method to exception
***************************************/
class DivExpGen
{
	int num1,num2 ;
	
	DivExpGen()
	{
		num1 = num2 = 0 ;
	}
	int getDiv(int num1,int num2)/*throws Exception*/
	{
		this.num1 = num1 ;
		this.num2 = num2 ;
		
		if(num2 == 0)
		{
			throw new /*Exception();*/ArithmeticException();
		}
		else
		{
			return(num1/num2);
		}
	}
}