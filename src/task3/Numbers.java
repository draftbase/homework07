package task3;

public class Numbers {
    public static void main(String[] args) {

        //wersja1
        double n = 0;
        while (n<=3.1) {
            System.out.printf("%1.1f, ", n);
            n += 0.1;
        }
        System.out.println(""); //to tylko po to aby nie wycinać wersji 1
        //wersja2
        double m = 0;
        do {
            System.out.printf("%1.1f, ", m);
            m += 0.1;
        } while (m<=3.1);

    }
}
