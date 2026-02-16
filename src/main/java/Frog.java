public class Frog extends Animal {

    //Lägg till en konstruktor till klassen med en parameter för djurets namn
    //Spara djurets namn i ett attribut
    //Skapa en metod som skriver ut djurets namn
    //Lägg till en metod som representerar ett enkelt beteende (t.ex. Jump) för djuret som skrivs ut

    private String name;

    public Frog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("This frogs name is: " +name);
    }

    public void jump() {
        System.out.println("the frog jumps!");
    }

}
