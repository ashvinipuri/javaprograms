package lambda;

interface Interface1 { // 1 step create interface
	void absfun(int x, int y, int z); // abstract method

	default void fun1() // non abstract method , default keyword is imp otherwise it will give error
	{
		System.out.println("this is fun1");
	}

	default void fun2() {
		System.out.println("this is fun2");
	}
}

public class Myclass {

	public static void main(String[] args) {
		Interface1 fobj=(int x, int y, int z) -> System.out.println(10*20*30);
		fobj.absfun(3,4,5);
		fobj.absfun(4,3,2);
		fobj.absfun(5,2,3);
		
		System.out.println("=============================");
		fobj.fun1();
		fobj.fun2();
		
	}

}
