import java.util.Scanner;
public class ClasificaciondeNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("ingrese un número para determinar: ");
        int numero = entrada.nextInt ();
        if (numero > 0){
            System.out.println("el numero " + numero +" es positivo");
        }
        if (numero == 0){
            System.out.println("el numero es " + numero);
        }
        if (numero < 0){
            System.out.println("el numero " + numero +" es negativo");
        }
        if (numero % 2 == 0){
            System.out.println("el numero " + numero +" es par");
        }
        if (numero % 2 != 0) {
            System.out.println("el numero " + numero +" es impar");
        }
    }
}