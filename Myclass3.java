package lambda;
interface Interface3
{
	
	void absfun(int x, int y, int z);
	
}
public class Myclass3 {

	public static void main(String[] args) 
	{
		Interface3 obj=(int x, int y, int z) ->{
			System.out.println("x square is " + (x*x));
			System.out.println("multiplication is " + (x*y*z));
			System.out.println("addition is " + (x+y+z));
			System.out.println("mul is " + (z*66));
		};
		
		obj.absfun(2, 4, 5);
	}

}
