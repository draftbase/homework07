package task1;

import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) {
        int i = 0;
        int[] tab = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 5 liczb calkowitych:");

        while(i < 5) {
            tab[i] = scanner.nextInt();
            i++;
        }
        scanner.close();

        int suma = 0;
        for(int j = 0; j <= tab.length; j++) {
            if(j==0 || j==2 || j==4){
                suma += tab[j];
            }
        }

        System.out.println("Suma podanych liczb 1, 3 i 5 to: " + suma);


    }
}
