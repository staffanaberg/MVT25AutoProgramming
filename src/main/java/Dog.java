public class Dog extends Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("This dogs name is: " +name);
    }

    public void bark() {
        System.out.println("the dog barks!");
    }


}
