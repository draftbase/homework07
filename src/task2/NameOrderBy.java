package task2;

import java.util.Scanner;

public class NameOrderBy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tab = new String[5];
        int i = 0;
        System.out.println("Podaj 5 imion:");
        while (i < 5) {
            tab[i] = scanner.nextLine();
            i++;
        }
        scanner.close();

        for(;i>0;i--){
            System.out.println("Cześć " + tab[i-1]);
        }

    }
}
