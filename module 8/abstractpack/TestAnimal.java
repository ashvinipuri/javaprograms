package abstractpack;
abstract class Animal
{
	final int legs=4;
	abstract public void sound();
	abstract public void fun1();
	abstract public void fun2();
	public void ClassInfo(String type) {
		System.out.println(" I belongs to "+ type+" has "+ legs + " leg ");
	}
}
 
 //child class    parent class
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("The dog Barks...");
	}
	public void fun1()
	{
		System.out.println("this is fun1");
	}
	public void fun2()
	{
		System.out.println("this is fun2");
	}
}

class Lion extends Animal
{
	public void sound()
	{
		System.out.println("The Lion roars...");
	}
	public void fun1()
	{
		System.out.println("this is fun1");
	}
	public void fun2()
	{
		System.out.println("this is fun2");
	}
}

public class TestAnimal {

	public static void main(String[] args) {
		
Dog tuffy=new Dog();
tuffy.ClassInfo("Dog");
tuffy.sound();
tuffy.fun1();
tuffy.fun2();
System.out.println("=================================");
Lion simba=new Lion();
simba.ClassInfo("Lion");
simba.sound();
simba.fun1();
simba.fun2();
	}

}
