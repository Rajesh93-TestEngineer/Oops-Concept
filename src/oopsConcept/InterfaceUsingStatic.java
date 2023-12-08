package oopsConcept;

interface Draw1{
	void triangle();
	static int cube(int x) {
		return(x*x*x);
	}
}
public class InterfaceUsingStatic implements Draw1{
public void triangle() {
	System.out.println("draw the triangle");
}
	public static void main(String[] args) {
Draw1 d=new InterfaceUsingStatic();
d.triangle();
System.out.println(Draw1.cube(9));
	}
}
