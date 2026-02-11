import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class NumbersHashMap {

    public static void main(String[] args) {




        HashMap<String, Double> list = new HashMap();
        list.put("pi", 3.1415926535);
        list.put("e", 2.7182818284);
        list.put("sqrt2", 1.4142135623);
        list.put("phi", 1.6180339887);
        list.put("ln10", 2.3025850929);


        System.out.println(list);

        for(double element : list.values()) {
            System.out.println(element);
        }

    }

}
