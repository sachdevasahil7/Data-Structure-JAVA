package CoreJava.Interface;

/**
 * @author Sahil on 10/11/2024
 */
public interface Resources {

    default void name(){
        System.out.println("TANNU");
    }

//    static String name(){
//        System.out.println("pushpa");
//        return "chal be";
//    }

    public void cost();
}
