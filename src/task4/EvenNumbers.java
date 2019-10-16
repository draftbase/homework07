package task4;

public class EvenNumbers {
    public static void main(String[] args) {
        int suma = 0;
        for(int i = 0;i<=100;i++){
            if(i%2==0){
                System.out.print(i + ", ");
                suma += i;
            }
        }
        System.out.print("Suma to: " + suma);
    }
}
