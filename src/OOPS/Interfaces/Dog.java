package OOPS.Interfaces;

/**
 * @author Sahil on 08/11/2024
 */
public interface Dog extends Animal{
    String color(String color);
    int legs(int legs);
    default void eyes(){
        System.out.println("all Dog Have 2 eyes");
        Animal.super.eyes();
    }
}
