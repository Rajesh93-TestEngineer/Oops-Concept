package oopsConcept;

interface Drawable{
	public void circle();
	public void triangle();
}
class Rectangle implements Drawable{
	public void circle() {
		System.out.println("Drawing circle");
	}
	public void triangle() {
		System.out.println("Drawing triangel");
	}
}
class Hetagonal implements Drawable{
	public void circle() {
		System.out.println("Drawing hetagonal");
	}
	public void triangle() {
		System.out.println("Drawing triangel and cricle");
	}
}
public class TestInterface {

	public static void main(String[] args) {
		Drawable d=new Rectangle ();
		d.circle();
		d.triangle();
		Drawable d1= new Hetagonal();
		d1.circle();
		d1.triangle();
	}

}
