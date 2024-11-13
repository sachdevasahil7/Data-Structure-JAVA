package CoreJava.Interface;

/**
 * @author Sahil on 25/02/2024
 */
public interface Service {

    default void name(){
        System.out.println("TANNU");
    }
    public void interfaceService();
    public void cost();
}
