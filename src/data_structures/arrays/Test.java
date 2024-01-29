package data_structures.arrays;

/**
 * @author Sahil on 28/01/2024
 */
public class Test {

    public static void main(String[] args) {
       StringBuffer db= new StringBuffer("hello");
       StringBuffer db1= new StringBuffer("hello");
       StringBuffer db4= new StringBuffer("hello");
       db4.append("sa");
       String db2="hello";
       String db3="hello";
        System.out.println(db1.equals(db));
        System.out.println(db4.equals(db1));
        System.out.println(db2==db3);
    }
}
