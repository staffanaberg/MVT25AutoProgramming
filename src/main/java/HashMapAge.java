import java.util.HashMap;
import java.util.Scanner;

public class HashMapAge {

    //Skapa en HashMap för att lagra namn och ålder.
    // Lägg till några namn och derasmotsvarande ålder.
    //Uppdatera programmet så att det skriver ut åldern
    // på det namn man har läst in med Scanner och som
    // matchar namn lagrade i din HashMap
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("A", ".-");
        map.put("B", "-...");

        String myText = "AB";

        //String[] text = {"A", "A"};
        String[] text = myText.split("");

        for(int i=0;i<text.length;i++) {
            System.out.println(map.get(text[i]));
        }


/*
        Scanner scan = new Scanner(System.in);
        //String name = scan.nextLine();
        System.out.println(map.get("Jane"));

        NameAge bar = new NameAge();
        System.out.println(bar.getAge("Jane"));
*/

    }




}


//Skapa en ny klass som innehåller en metod
// med en HashMap för att lagra namn och ålder.
// Lägg till några namn och deras motsvarande ålder.
// Metoden ska returnera en ålder beroende på vilket
// namn man har som inparameter. Skapa metoden med TDD