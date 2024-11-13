package Design_Patterns.Strategy;

/**
 * @author Sahil on 29/10/2024
 */
// The interface is implemented by many other
// subclasses that allow for many types of flying
// without effecting Animal, or Flys.

// Classes that implement new Flys interface
// subclasses can allow other classes to use
// that code eliminating code duplication

// I'm decoupling : encapsulating the concept that varies

public interface Flys {

    String fly();

}

// Class used if the Animal can fly



//Class used if the Animal can't fly

