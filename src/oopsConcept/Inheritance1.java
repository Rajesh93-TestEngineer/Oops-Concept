package oopsConcept;

class Animals{
	public void cat() {
		System.out.println("cat is mehwammm");
	}
}
class Dog extends Animals{
	public void dog() {
		System.out.println("dog is bow bow");	
}
}
class BabyDog extends Dog{
	public void babydog() {
		System.out.println("babydog is bow bow");	
}
}
public class Inheritance1 {

	public static void main(String[] args) {
BabyDog bd=new BabyDog();
bd.babydog();
bd.cat();
bd.dog();
	}
}
