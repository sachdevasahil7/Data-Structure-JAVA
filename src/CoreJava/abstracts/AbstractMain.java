package CoreJava.abstracts;

/**
 * @author Sahil on 22/02/2024
 */
 abstract class test {

    public abstract void m1();
}
abstract class subtest extends test{

     public  void m1(){
        System.out.println("subtest m1");
    }

 }
public class AbstractMain extends subtest{

    @Override
    public void m1() {
        System.out.println("M1 testing!!!");
    }

    public static void main(String[] args) {
        AbstractMain abstractMain= new AbstractMain();
        abstractMain.m1();

    }
}
