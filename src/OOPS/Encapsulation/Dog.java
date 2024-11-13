package OOPS.Encapsulation;

/**
 * @author Sahil on 08/11/2024
 */
public class Dog {
    private int legs;
    private String color;
    private String name;
    public final String breed="bull dog";

    public Dog() {

    }
    protected int getLegs() {
        return legs;
    }
    protected String getBreed() {
        return breed;
    }
    protected String getColor() {
        return color;
    }

    protected String getName() {
        return name;
    }

    protected String createDog(int legs,String color,String name){
        return "legs = "+legs+" color = "+color+" name = "+name;
    }

}
