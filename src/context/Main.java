package context;

public class Main {

    public static void main(String[] args) {
        // Variables
        int num = 8;
        int multiplo = 0;

        // Ciclo
        for (int i = 0; i <= 10; i++) {
            multiplo = (num * i);
            System.out.println(num + " x " + i + " = " + multiplo);
        }
    }
}