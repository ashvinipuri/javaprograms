package lambda;
import java.util.ArrayList;
public class MyclassArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		arrList.add(40);
		arrList.add(50);
		
		//to display:1st use of lambda expression
		arrList.forEach(n-> System.out.println(n
				));
		System.out.println("==============================");
		
		//2nd use of lambda expression
		//display the even number
		System.out.println("Displaying the even numbers");
		arrList.forEach(n -> {
			if (n%2==0)
				System.out.println("" + n);
		});
	}

};
