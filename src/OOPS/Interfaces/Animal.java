package OOPS.Interfaces;

/**
 * @author Sahil on 08/11/2024
 */
public interface Animal {
    String typeOfAnimal(String type);

    default void eyes(){
        System.out.println("all Animal Have 2 eyes");
    }
}
