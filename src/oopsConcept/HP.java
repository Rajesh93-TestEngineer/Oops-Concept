package oopsConcept;

public class HP extends Levenova {

	public void add(int a,int b) {
		int sum=a-b;
		System.out.println("sum"+sum);
	}

public static void main(String[]args) {
	Levenova l=new Levenova() ;
	l.add(20, 30);
	l.add(30, 30);
	
}
}
