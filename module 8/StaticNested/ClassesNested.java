package StaticNested;
class OuterClass
  {
	private static String msg= "Welcome to nested classes";   //mv
	 // static nested class
	public static class NestedStaticClass 
	{
		public void printMessage()   // it is a method print message
		{
			   // can access only static mv
			System.out.println("Message from nes"
					+ "ted static class:" +msg);
		}
	}
	
	// non static nested class /called Inner class
	public class InnerClass 
	{
		 // both static and non static members of outer class are accessible here 
		public void display()
		{
			System.out.println("Message from non-static nested class:" +msg);
		}
	}
}
public class ClassesNested {

	
	public static void main(String[] args) {
		// 1 object is creatd to call method of StaticClass
		OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
		printer.printMessage();
		
		
		// 2 objects is created to call method of non StaticClass
		OuterClass outer =new OuterClass();
		OuterClass.InnerClass inner =outer.new InnerClass();
		inner.display();
	}

}
