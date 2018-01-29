package code.repo.oops.inheritence_2;

public class B extends A{

	int j;
	
	void display(){
		super.i = j+1;
		System.out.println(j+" "+i);
	}
}
