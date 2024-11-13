package OOPS.polymorphism;

/**
 * @author Sahil on 10/11/2024
 */
public class Car extends Automobile{

    public Car(){
        System.out.println("car constructor");
    }

    @Override
    public void cost() {

    }
    //Overriding --->access modifier same ya higher
    //override Number---> child integer

    @Override
    public Double brand() {
        System.out.println("car brand name is skoda");
        return 0.00;
    }

    public Number brand(Integer price) {
        System.out.println("car brand name is skoda");
        return 0;
    }

    public Integer brand(Double price) {
        System.out.println("car brand name is skoda");
        return 0;
    }


    @Override
    public void brandName() {
        System.out.println("brand name is skoda");
    }


    public static void main(String[] args) {
        Car car= new Car();
        car.brandName();
        car.brand();
    }
}
