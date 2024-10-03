package interfacepack;

public class TestGraphics {

	public static void main(String[] args) {
		Circle circle =new Circle(11.6f);
		System.out.println("Area  of circle is"+circle.area());
		System.out.println("Perimeter  of circle is"+circle.perimeter());
		
		System.out.println("=============================================");
		
		Rectangle rect =new Rectangle(12.4f,11.2f);
		System.out.println("Area  of rectangle is"+rect.area());
		System.out.println("Perimeter of rectangle  is"+rect.perimeter());
		
	}

}
