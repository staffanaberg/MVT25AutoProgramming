import java.util.HashMap;

public class NameAge {

    //Skapa en ny klass som innehåller en metod
// med en HashMap för att lagra namn och ålder.
// Lägg till några namn och deras motsvarande ålder.
// Metoden ska returnera en ålder beroende på vilket
// namn man har som inparameter. Skapa metoden med TDD

    private HashMap<String, Integer> map;

    public NameAge() {
        map = new HashMap<>();

        map.put("Staffan",43);
        map.put("Jane", 73);
        map.put("Sven", 12);
    }


    public int getAge(String name) {
        return map.get(name);
    }

}
