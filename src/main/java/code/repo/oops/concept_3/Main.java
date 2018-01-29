package code.repo.oops.concept_3;

public class Main {

	public static void var(Integer x, int y) {  
        System.out.println("Integer int");  
    }  


    public static void var(int... x) {  
        System.out.println("int... x");  
    }  

    public static void var(Integer... x) {  
        System.out.println("Integer...");  
    }  

    public static void main(String... args) {   
        byte i = 0;  
        Integer i2 = 127;  
        var(i, i2);  
    }  
}
