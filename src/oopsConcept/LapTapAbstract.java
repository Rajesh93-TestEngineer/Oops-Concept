package oopsConcept;

abstract class Laptap123{
	 abstract void hp();
	abstract void lenova();
	abstract void dell();
	}
class Copy extends Laptap123{
public void hp() {
	System.out.println("hp text copy");
}
public void lenova() {
	System.out.println("lenova text copy not clear");
}
	public void dell() {
		System.out.println("dell text copy is very clear");
	}
}
class Print extends Laptap123{
	public void hp() {
		System.out.println("hp text print");
	}
	public void lenova() {
		System.out.println("lenova print not clear");
	}
		public void dell() {
			System.out.println("dell print is very clear");
		}
}
public class LapTapAbstract {

	public static void main(String[] args) {
		Copy c=new Copy();
		c.dell();
        c.lenova();
		c.hp();
		Print p=new Print();
		p.hp();
		p.lenova();p.dell();
		
	}
}
