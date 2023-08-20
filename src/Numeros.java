import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {

        int[] numeritos = new int[args.length];
        for (int i = 0; i < args.length; i++) {

            numeritos[i] = Integer.parseInt(args[i]);

        }
        int suma = 0;
        for (int i = 0; i < args.length; i++) {
            suma += numeritos[i];
            System.out.println(numeritos[i] + ", " + suma);
        }
    }
}