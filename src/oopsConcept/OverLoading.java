package oopsConcept;

public class OverLoading {
	
	/*public void  add(int a,int b) {
		int c=a+b;
	System.out.println("sum"+c);	
	}
	public void add(double x,double y) {
		double c=x+y;
	System.out.println("sum"+c);	
	}
	public void add(float a,float b) {
		float c=a+b;
	System.out.println("sum"+c);	
	}
	public static void main(String[] args) {
     OverLoading o=new OverLoading();
     o.add(5, 10);
     o.add(50, 30);
     o.add(25.2, 30.5);
	}
}*/
static int add(int a,int b) {
	return a+b;	
}
static int add(int a,int b,int c) {
	return a+b+c;
}
public static void main(String[] args) {
	System.out.println(OverLoading.add(11, 11));
	System.out.println(OverLoading.add(20,20,30));
}
}