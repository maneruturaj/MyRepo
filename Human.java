package Automobile_Industry;

public class Human 
{
	void work()
	{
		System.out.println("Hard  work is Good work");
	}
}
class Engineer extends Human 
{
	void eat()
	{
	System.out.println("Engineer can eat");
	}
}
	public class Student extends Engineer
{
	public static void main(String[]args)
	{
	Student S=new Student();
	S. work();
	S.eat();
	}
}
	 
	