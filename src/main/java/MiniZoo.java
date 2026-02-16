public class MiniZoo {

    public static void main(String[] args) {
        //Skapa en ny klass med main-metod. I denna klass skapar du två objekt av samma typ (t.ex. Frog) och ge dem olika namn
        //Anropa metoderna som skriver ut deras namn och utför deras beteende

        Animal grodan = new Frog("Grodan");
        Animal boll = new Dog("Boll");

        //WebbLäsare window = new Edge();
        //WebbLäsare window2 = new Chrome();

        grodan.printName();
        boll.printName();


    }

}
