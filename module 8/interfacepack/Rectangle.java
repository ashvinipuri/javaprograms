package interfacepack;
 
public class Rectangle implements Graphic
{
private float width;
private float height;
public Rectangle(float width, float height) {
	super();
	this.width = width;
	this.height = height;
}
@Override
public float area() {
	return(width*height);
}
@Override
public float perimeter() {
	return(2*width*height);
}


}
