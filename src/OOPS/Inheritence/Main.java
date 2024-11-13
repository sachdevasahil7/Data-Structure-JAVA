package OOPS.Inheritence;

import java.util.ArrayList;
import java.util.List;


class Dog extends Animal {

    public Dog() {
        System.out.println("Dog constructor with no parameters called"); //-->3
    }
    public  Dog(String name ){

        System.out.println("dog param my dog name is : "+name);
    }
    @Override
    public String name(){
        return "hello my pet name is bruno";
    }

    @Override
    public void getAnimalName() {
        System.out.println("animal name is ----> ");
    }
}

public class Main {
    public static void main(String[] args) {
    Animal animal= new Dog();
    animal.getAnimalName();
        }
}
