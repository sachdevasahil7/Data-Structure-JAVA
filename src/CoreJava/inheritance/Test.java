package CoreJava.inheritance;

/**
 * @author Sahil on 25/02/2024
 */
public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.m1();
        Child child = new Child();
        child.m2();
        child.m1();
    }
}
