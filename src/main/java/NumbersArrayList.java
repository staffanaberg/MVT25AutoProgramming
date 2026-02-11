import java.util.ArrayList;

public class NumbersArrayList {


    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();
        list.add(3.1415926535);
        list.add(2.7182818284);
        list.add(1.4142135623);
        list.add(1.6180339887);
        list.add(2.3025850929);


        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
/*
        for(double element : list) {
            System.out.println(element);
        }


        pi		3.1415926535
        e		2.7182818284
        sqrt2	1.4142135623
        phi		1.6180339887
        ln10		2.3025850929
*/

        /*
        int[] myList = new int[3];
        myList[0] = 5;
        myList[1] = 9;
        myList[2] = 12;

        System.out.println(myList[2]);
        */
    }

}
