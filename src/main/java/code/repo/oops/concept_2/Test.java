package code.repo.oops.concept_2;

public class Test {

	public static void main(String[] args){
		Object o = new A();
	    A a1 = new A();
	    A a2 = new AX();
	    AX ax = new AX();

	    System.out.println(a1.method(o));
	    System.out.println(a2.method(a1));
	    System.out.println(a2.method(o));
	    System.out.println(a2.method(ax));
	}
}
