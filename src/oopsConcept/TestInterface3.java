package oopsConcept;

interface Printable{
	void print();
interface Showable extends Printable{
	void show();
}
}
public class TestInterface3 implements Printable {
public void print() {
	System.out.println("hello");
}
public void show() {
	System.out.println("welcome");
}
	public static void main(String[] args) {
		TestInterface3 ti= new TestInterface3();
		ti.show();
		ti.print();
	}

}
