package lambda;

  //import java.util.Scanner;

interface Interface4{
	void absfun(int x);
}
public class Myclass4 {

	public static void main(String[] args)

	{
		  //Scanner sc= new Scanner(System.in);
		Interface4 obj=(int x) ->{
			if(x%2==0) {
			System.out.println("number is even");
		}
			else 
			{
				System.out.println("number is odd");
			}
		};
	obj.absfun(232);
	obj.absfun(237);
	
//	System.out.println("enter the number");
	//int x=sc.nextInt();
	//obj.absfun(x);

}
}
