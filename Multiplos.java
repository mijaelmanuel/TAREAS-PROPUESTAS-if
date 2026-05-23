import java.util.Scanner;
public class Multiplos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = teclado.nextInt();
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        if (numero % 3 == 0 && numero % 5 != 0) {
            System.out.println("Fizz");
        }
        if (numero % 5 == 0 && numero % 3 != 0) {
            System.out.println("Buzz");
        }
    }
}