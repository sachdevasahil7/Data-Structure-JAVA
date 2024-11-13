package OOPS.Interfaces;

/**
 * @author Sahil on 08/11/2024
 */
public class Main implements Dog, Cat {
    @Override
    public String typeOfAnimal(String type) {
        return "dog";
    }

    @Override
    public String color(String color) {
        return "black";
    }



    @Override
    public int legs(int legs) {
        return 4;
    }

    @Override
    public void eyes() {
        System.out.println("main class eys");
    }


    public static void main(String[] args) {
        Main animal= new Main();
        System.out.println(animal.typeOfAnimal("dog"));
        animal.eyes();

    }
}
