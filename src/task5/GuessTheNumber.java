package task5;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Podaj liczbę:");
            number = scanner.nextInt();
            if(number<100){
                System.out.println("Podana liczba jest za mała");
            } else if (number>200) {
                System.out.println("Podana liczba jest za duża");
            } else if (number%3!=0) {
                System.out.println("Liczba nie jest podzielna przez 3");
            } else {
                //nic nie robimy
            }
        } while(number<100 || number>200 || number%3!=0); //
        System.out.println("Twoja liczba jest ok");
    }
}
