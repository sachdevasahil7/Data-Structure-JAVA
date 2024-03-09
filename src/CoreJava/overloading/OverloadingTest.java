package CoreJava.overloading;

/**
 * @author Sahil on 25/02/2024
 */
public class OverloadingTest {
    public void m1(){
        System.out.println("NO-ARGS");
    }
    public void m1(int i){
        System.out.println("INT ARGS");
    }
    public void m1(double d){
        System.out.println("DOUBLE ARGS");
    }
    public void m1(float f){
        System.out.println("FLOAT ARGS");
    }

    public static void main(String[] args) {
        OverloadingTest overloadingTest= new OverloadingTest();
        overloadingTest.m1(10.4);
        overloadingTest.m1(10.3f);
    }
}
