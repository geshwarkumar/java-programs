//Write a program for demonstrate final class.
class A
{
	final void display()
	{
		System.out.println("\n Base class method called");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("\n Derived class method called");
	}
}
class TestFinal1
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.display();
	}
}