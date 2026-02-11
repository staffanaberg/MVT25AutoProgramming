import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProblems {

    /*Använd ArrayList för att göra följande:

Spara namn som man läser in

Avsluta sparandet när man skriver stop

Skriva ut alla namnen som har sparats

Skriva över med ett nytt namn på första platsen i ArrayList

Byta plats på första och sista namnet
*/

    public static void main(String[] args) {

        //läs in text
        Scanner scan = new Scanner(System.in);

        //skapa en arraylist med texter (String)
        ArrayList<String> list = new ArrayList();

        //spara texten i en variabel som tillhör en arraylist
        /*for(int i=0;i<5;i++) {
            String text = scan.nextLine();
            list.add(text);
        }*/

        String text = scan.nextLine();

        while(!text.equals("stop")){
            list.add(text);
            text = scan.nextLine();
        }

        //loopa så att jag fortsätter att spara till min arraylist
        //om jag skriver stop, avsluta loopen


        System.out.println("Det här är sparat i min lista:");
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        //Skriva över med ett nytt namn på första platsen i ArrayList
        //elementet med index 0 ska få ett nytt värde

        System.out.println(list.get(0));
        //String myText = scan.nextLine();
        list.set(0, scan.nextLine());


        System.out.println(list.get(0));


        //Byta plats på första och sista namnet


        //skriv över sista index med det sparade värdet

        // 1, 7, 3, 9, 5
        // 5, 7, 3, 9,
        // 5, 7, 3, 9, 1
        //hitta värdet på index 0 och spara det
        String first = list.get(0);
        //String last = list.getLast();
        //skriv över index 0 med sista indexet
        list.set(0, list.getLast());
        //skriv över sista index med det sparade värdet
        list.set(list.size()-1, first);
        System.out.println("Det här är sparat i min lista:");
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }


}
