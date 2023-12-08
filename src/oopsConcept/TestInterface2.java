package oopsConcept;
interface Bank12{
	public float rateOfInterest();
}
class SBI1 implements Bank12{
	public float rateOfInterest() {
		return 9.7f;
	}
}
class PNB1 implements Bank12{
	public float rateOfInterest() {
		return 9.7f;
		}	
}

public class TestInterface2 {

	public static void main(String[] args) {
    Bank12 b=new SBI1();
    System.out.println("rateOfInterest"+b.rateOfInterest());
	}

}
