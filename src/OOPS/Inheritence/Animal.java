package OOPS.Inheritence;

class   Animal {
    private String animalName;

    public Animal() {
        this("candy");
        System.out.println("Animal constructor with no arguments"); //--2
    }

    public Animal(String name) {
        this.animalName = name;
        System.out.println("Animal constructor with name: " + name);  //-->1
    }

    public String name(){
        return "hello my pet name is candy ";
    }

    public void getAnimalName() {
        System.out.println("Animal name is: " + animalName);  //---> 4 (candy)
    }
}
