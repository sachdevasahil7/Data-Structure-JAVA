package OOPS.Interfaces;

/**
 * @author Sahil on 08/11/2024
 */
public interface Cat extends Animal{
    String color(String color);
    int legs(int legs);
    default void eyes(){
        System.out.println("all Cat Have 2 eyes");
    }
}
