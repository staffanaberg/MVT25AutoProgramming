import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {
        HashMap<String, Address> map = new HashMap();

        //Datatyp variabelnamn = new konstuktor(parametrar, parametrar);

        //Address home =
        map.put("Staffan", new Address("hemma", 12345));
        map.put("Ada", new Address("borta", 23623));
        map.put("Lenny", new Address("nästan hemma", 67677));

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        Address adasAddress = map.get(name);
        System.out.println(map.get(scan.nextLine()).getNumber());
        System.out.println(adasAddress.getAddress());



    }

}
