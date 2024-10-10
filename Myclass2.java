package lambda;
interface Interface2 { // 1 step create interface
	void absfun(int x); // abstract method

	default void fun1() // non abstract method , default keyword is imp otherwise it will give error
	{
		System.out.println("this is fun1");
	}

	default void fun2() {
		System.out.println("this is fun2");
	}
}
public class Myclass2 {

	public static void main(String[] args) {
		Interface2 fobj=(int x) -> System.out.println(x*x*x);
		fobj.absfun(3);
		fobj.absfun(4);
		
		
		System.out.println("=============================");
		fobj.fun1();
		fobj.fun2();
		
	}

	}


