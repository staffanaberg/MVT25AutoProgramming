public class Car {
    private int a;

    public Car() {
        a = 3;
        for(int c=0; c<10; c++) {
            for(int b=0; b<3; b++) {
                System.out.println(c);
                System.out.println(b);
            }
            System.out.println(c);
        }
        System.out.println(a);

    }

    public void drive() {
        a++;
        System.out.println(a);
    }

    public void changeGear(int gear) {

    }


}
