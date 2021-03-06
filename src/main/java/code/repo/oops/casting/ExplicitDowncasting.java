package code.repo.oops.casting;

public class ExplicitDowncasting {

	public static void main(String[] args)
    {
        A a = new A();
        B b = (B) a;   //A type is explicitly downcasted to B type
        C c = (C) a;   //A type is explicitly downcasted to C type
        D d = (D) a;   //A type is explicitly downcasted to D type
        B b1 = new B();
        D d1 = (D) b1;  //B type is explicitly downcasted to D type
        d1 = (D) new C();  //C type is explicitly downcasted to D type
    }
}
