package CoreJava.Interface;

/**
 * @author Sahil on 25/02/2024
 */
public abstract class Car implements Service{
    @Override
    public void cost(){
        System.out.println("COST OF CAR IS :2000");
    }
}
