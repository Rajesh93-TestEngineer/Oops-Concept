package oopsConcept;

abstract class Bank{
abstract int getRateOfInterest();
}
class SBI extends Bank{
public  int getRateOfInterest() {
	return 7;	
}
}
class PNB extends Bank{
public int getRateOfInterest() {
	return 8;
}
}

public class BankAbstract {
    public static void main(String[] args) {
    Bank b;
    b=new SBI();
    System.out.println("rate of interest is "+b.getRateOfInterest()+"%");
    System.out.println("rate of interest is "+b.getRateOfInterest()+"%");

	}

}
