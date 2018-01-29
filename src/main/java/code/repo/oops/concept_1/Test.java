package code.repo.oops.concept_1;



public class Test {

	public static void main(String[] args){
		try {
			Class<?> c = Class.forName("code.repo.oops.concept_1.Simple");
			Simple s = (Simple)c.newInstance();
			s.message();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
