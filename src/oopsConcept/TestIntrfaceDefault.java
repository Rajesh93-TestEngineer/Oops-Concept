package oopsConcept;

interface Draw{
	void print();
	default void copy() {
		System.out.println("default copy");
	}
}
public class TestIntrfaceDefault implements Draw {
	public void print() {
		System.out.println("copy");
	}
	public static void main(String[] args) {
Draw d= new TestIntrfaceDefault();
d.copy();
d.print();
	}

}
