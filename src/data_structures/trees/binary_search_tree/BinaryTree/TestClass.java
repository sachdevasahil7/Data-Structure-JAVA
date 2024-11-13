package data_structures.trees.binary_search_tree.BinaryTree;

import java.lang.reflect.InvocationTargetException;


/**
 * @author Sahil on 23/07/2024
 */
public class TestClass  extends absTract implements Testinterface {


    public static void main(String[] args) {
        TestClass test= new TestClass();
        test.useMe();
    }

    @Override
    public void useMe() {
      super.useMe();
      System.out.println("calling from test Class");
    }
}
